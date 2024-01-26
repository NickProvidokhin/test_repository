package ru.ylab.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ylab.model.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryImplTest {
    private PersonRepository personRepository = new PersonRepositoryImpl();

    @Test
    public void testCreateMethod() {
        Person testPerson = new Person(0, "Vasya", "Pupkin", "vasya.pupkin", "password1", false);
        testPerson = personRepository.create(testPerson);
        Person expectedPerson = new Person(2, "Vasya", "Pupkin", "vasya.pupkin", "password1", false);
        Assertions.assertTrue(testPerson.equals(expectedPerson));
    }

}