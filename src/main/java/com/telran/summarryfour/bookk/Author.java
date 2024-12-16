package com.telran.summarryfour.bookk;


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
//        int authorNameResult = o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
//        int authorSurnameResult = o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
//        if (authorNameResult == 0) {
//            return authorSurnameResult;
//        }
//        return authorNameResult;
    }

}

