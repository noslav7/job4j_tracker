package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInputCorrectCode() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"9"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(9));
    }

    @Test
    public void whenValidInputMultiCorrectCode() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"4", "5", "6"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selectedMulti1 = input.askInt("Enter menu:");
        int selectedMulti2 = input.askInt("Enter menu:");
        int selectedMulti3 = input.askInt("Enter menu:");
        assertThat(selectedMulti1, is(4));
        assertThat(selectedMulti2, is(5));
        assertThat(selectedMulti3, is(6));
    }

    @Test
    public void whenInvalidInputNegativeNumber() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}