package ru.ylab.repository;

import ru.ylab.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> getAll();

    public Optional<Person> getById(int id);

    Person create(Person person);

}
