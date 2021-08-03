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
                new Profile(new Address("Yekaterinburg", "Malysheva", 110, 185)),
                new Profile(new Address("Yekaterinburg", "Soyuznaya", 6, 401)),
                new Profile(new Address("Yekaterinburg", "8 marta", 172, 407)),
                new Profile(new Address("Yekaterinburg", "Lenina", 51, 370))
        );
        List<Address> expected = new Profiles().collect(profiles);
        List<Address> addresses = List.of(
                        new Address("Yekaterinburg", "Studencheskaya", 51, 413),
                        new Address("Yekaterinburg", "Malysheva", 110, 185),
                        new Address("Yekaterinburg", "Soyuznaya", 6, 401),
                        new Address("Yekaterinburg", "8 marta", 172, 407),
                        new Address("Yekaterinburg", "Lenina", 51, 370)
                );
        assertThat(addresses, is(expected));
    }
}