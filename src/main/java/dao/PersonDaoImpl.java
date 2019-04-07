package dao;

import domain.Person;
import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.Optional;

public class PersonDaoImpl implements PersonDAO {

    @Override
    public List<Person> findAll() {

        throw new NotImplementedException("Not implemented");
    }

    @Override
    public Optional<Person> findById(int id) {

        throw new NotImplementedException("Not implemented");
    }

    @Override
    public int create(Person student) {

        throw new NotImplementedException("Not implemented");
    }

    @Override
    public int update(Person student) {

        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void delete(int id) {

        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void deleteAll() {

        throw new NotImplementedException("Not implemented");
    }
}
