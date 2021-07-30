package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MethodReferenceTest {
/*
    @Test
    public void whenByClass() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        MethodReference.applyByClass();
        assertEquals("From class: Hello", buffer.toString());
        System.setOut(before);
    }

    @Test
    public void whenByInstance() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        new MethodReference().applyByInstance();
        assertEquals("From instance: Hello", buffer.toString());
        System.setOut(before);
    }

 */

}