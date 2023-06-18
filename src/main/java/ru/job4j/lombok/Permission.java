package ru.job4j.lombok;

import lombok.*;

import java.util.List;

@Builder(builderMethodName = "builder")
@Getter
@ToString
public class Permission {
    private int id;
    private String name;
    @Singular("accessBy")
    private List<String> rules;
}
