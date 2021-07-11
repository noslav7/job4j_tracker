package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("321", "Alexander Kovalenko", "eDer3432f"),
                new Account("321", "Alexander Kovalenko", "eDer3432f")
        );
        HashSet<Account> expect = new HashSet<>(
                Collections.singletonList(
                        new Account("321", "Alexander Kovalenko", "eDer3432f")
                ));
        assertTrue(NotifyAccount.sent(accounts).equals(expect));
    }

}