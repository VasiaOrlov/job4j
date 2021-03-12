package ru.job4j.tream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity).
                        thenComparing(Address::getStreet).
                        thenComparing(Address::getHome).
                        thenComparing(Address::getApartment))
                .distinct()
                .collect(Collectors.toList());
    }
}