package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }

}