package ru.ylab.repository;

import ru.ylab.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepositoryImpl implements PersonRepository {
    private List<Person> people = new ArrayList<>();
    int nextId = 1;

    PersonRepositoryImpl() {
        people.add(new Person(nextId, "Ivan", "Ivanov", "admin", "admin", true));
        nextId++;
    }

    @Override
    public List<Person> getAll() {
        return people;
    }

    @Override
    public Optional<Person> getById(int id) {
        return people.stream().
                filter(context -> context.getId() == id).
                findFirst();
    }

    @Override
    public Person create(Person person) {
        person.setId(nextId++);
        people.add(person);
        return person;

    }
}
