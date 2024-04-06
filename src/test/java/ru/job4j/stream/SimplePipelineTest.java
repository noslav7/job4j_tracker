package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SimplePipelineTest {

    @Test
    public void whenNotPipes() {
        assertThat(SimplePipeline.of(1).collect(),
                is(List.of(1)));
    }

    @Test
    public void whenFilter() {
        assertThat(SimplePipeline.of(1, 10)
                        .filter(el -> el > 1).collect(),
                is(List.of(10)));
    }

    @Test
    public void whenMap() {
        assertThat(SimplePipeline.of(1, 10)
                        .map(el -> el * el).collect(),
                is(List.of(1, 100)));
    }

    @Test
    public void whenFilterMap() {
        assertThat(SimplePipeline.of(1, 10)
                        .filter(el -> el > 1).map(el -> el * el).collect(),
                is(List.of(100)));
    }

    @Test
    public void whenMapFilter() {
        assertThat(SimplePipeline.of(1, 10)
                        .map(el -> el * el)
                        .filter(el -> el < 10).collect(),
                is(List.of(1)));
    }

    @Test
    public void whenFilterMapFilter() {
        assertThat(SimplePipeline.of(1, 2, 3, 4)
                        .filter(el -> el > 2)
                        .map(el -> el * el)
                        .filter(el -> el < 10).collect(),
                is(List.of(9)));
    }
}