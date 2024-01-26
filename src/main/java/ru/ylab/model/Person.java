package ru.ylab.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    long id;
    String name;
    String lastName;
    String login;
    String password;
}
