package dao;

import domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {

    List<Person> findAll();

    Optional<Person> findById(int id);

    int create(Person student);

    int update(Person student);

    void delete(int id);

    void deleteAll();
}
