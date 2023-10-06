package ch.zhaw.babynames.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Name {
    private String name;
    private String geschlecht;
    private int anzahl;
}