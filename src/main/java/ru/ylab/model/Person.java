package ru.ylab.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private long id;
    private String name;
    private String lastName;
    private String login;
    private String password;
    private boolean isAdmin;
}
