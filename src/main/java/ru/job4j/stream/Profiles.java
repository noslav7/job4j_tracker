package ru.job4j.stream;

import java.util.List;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> addressList = profiles.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        return addressList;
    }
}
