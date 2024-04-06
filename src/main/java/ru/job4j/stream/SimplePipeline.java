package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimplePipeline {
    private final List<Integer> data;

    private final List<Pipe<Integer>> pipes = new ArrayList<>();

    private SimplePipeline(List<Integer> source) {
        data = source;
    }

    public static SimplePipeline of(Integer ... source) {
        return new SimplePipeline(List.of(source));
    }

    public SimplePipeline map(Function<Integer, Integer> fun) {
        pipes.add(new MapPipe<>(fun));
        return this;
    }

    public SimplePipeline filter(Predicate<Integer> fun) {
        pipes.add(new FilterPipe<>(fun));
        return this;
    }

    public List<Integer> collect() {
        var accumulate = new ArrayList<Integer>();
        for (var value: data) {
            boolean shouldAdd = true;
            Integer currentValue = value; // Keep track of the current value as Integer
            for (var pipe : pipes) {
                // Attempt to use a raw type to bypass type safety issues. This is not ideal but necessary given the current design constraints.
                State state = pipe.state(currentValue);
                if (!state.pass()) {
                    shouldAdd = false;
                    break; // Exit the loop as the current value does not pass the filter
                }
                // Since map operation always returns an Integer, it's safe to assign like this within the constraints of this task
                currentValue = (Integer) state.get();
            }
            if (shouldAdd) {
                accumulate.add(currentValue);
            }
        }
        return accumulate;
    }



    public interface Pipe<T> {
        <R> State<R> state(T value);
    }

    public static class MapPipe<T> implements Pipe<T> {
        private final Function<T, T> function;

        public MapPipe(Function<T, T> function) {
            this.function = function;
        }

        @Override
        public <R> State<R> state(T value) {
            return () -> (R) function.apply(value);
        }
    }

    public static class FilterPipe<T> implements Pipe<T> {
        private final Predicate<T> filter;

        public FilterPipe(Predicate<T> filter) {
            this.filter = filter;
        }

        @Override
        public <R> State<R> state(T value) {
            return new State<R>() {
                @Override
                public boolean pass() {
                    return filter.test(value);
                }

                @Override
                public R get() {
                    return (R) value;
                }
            };
        }
    }

    public interface State<T> {

        default boolean pass() {
            return true;
        }

        T get();
    }

    public static void main(String[] args) {
        SimplePipeline.of(1, 2, 3, 4)
                .filter(el -> el > 1)
                .map(el -> el * el)
                .filter(el -> el > 10)
                .collect()
                .forEach(System.out::println);
    }
}
