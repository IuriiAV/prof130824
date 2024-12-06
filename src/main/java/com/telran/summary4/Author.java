package com.telran.summary4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
@AllArgsConstructor
public class Author implements Comparable<Author> {

    private String name;

    private String surname;


    @Override
    public int compareTo(Author o) {
       int result = this.name.compareTo(o.getName());
       return result == 0 ? this.surname.compareTo(o.getSurname()) : result;
    }
}
