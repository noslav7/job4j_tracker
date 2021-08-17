package ru.job4j.lambda;
import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {

    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.empty();
        for (String string : strings) {
            if  (Optional.ofNullable(string).equals(Optional.empty())) {
                optional = Optional.empty();
            } else {
                optional = Optional.of(string);
            }
        }
        return optional;
    }
}
