package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenCollectClassA() {
        List<Profile> profiles = new ArrayList<>(
                new Profile(new Address("Yekaterinburg", "Studencheskaya", 51, 413)),
                new Profile(new Address("Yekaterinburg", "Malysheva", 110, 185)),
                new Profile(new Address("Yekaterinburg", "Soyuznaya", 6, 401)),
                new Profile(new Address("Yekaterinburg", "8 marta", 172, 407)),
                new Profile(new Address("Yekaterinburg", "Lenina", 51, 370))
        );
        List<Address> expected = profiles.stream().collect(List<Profile> profiles);
        List<Address> addresses = new ArrayList<>();
                addresses = List.of(
                        new Address("Yekaterinburg", "Studencheskaya", 51, 413),
                        new Address("Yekaterinburg", "Malysheva", 110, 185),
                        new Address("Yekaterinburg", "Soyuznaya", 6, 401),
                        new Address("Yekaterinburg", "8 marta", 172, 407),
                        new Address("Yekaterinburg", "Lenina", 51, 370)
                );
        assertThat(addresses, is(expected));
    }
}