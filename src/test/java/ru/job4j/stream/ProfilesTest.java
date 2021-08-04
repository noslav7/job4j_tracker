package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void whenFiveProfiles() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Yekaterinburg", "Studencheskaya", 51, 413)),
                new Profile(new Address("Yekaterinburg", "Studencheskaya", 51, 413)),
                new Profile(new Address("Verkhnyaya Salda", "Lenina", 51, 370)),
                new Profile(new Address("Moscow", "8 marta", 172, 407)),
                new Profile(new Address("Verkhnyaya Salda", "Lenina", 51, 370))
        );
        List<Address> expected = new Profiles().collect(profiles);
        List<Address> addresses = List.of(
                        new Address("Moscow", "8 marta", 172, 407),
                        new Address("Verkhnyaya Salda", "Lenina", 51, 370),
                        new Address("Yekaterinburg", "Studencheskaya", 51, 413)
                );
        assertThat(expected, is(addresses));
    }
}