package ru.job4j.tracker.model;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Item {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    @NonNull
    @Getter
    @Setter
    private int id;
    @EqualsAndHashCode.Include
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }
}
