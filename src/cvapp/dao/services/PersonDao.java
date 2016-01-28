package cvapp.dao.services;

import java.util.List;

import cvapp.dao.exception.DaoCreateException;
import cvapp.dao.exception.DaoDeleteException;
import cvapp.dao.exception.DaoFindException;
import cvapp.dao.exception.DaoUpdateException;
import model.Person;

public interface PersonDao {
	public void create(Person person) throws DaoCreateException;

	public void update(Person person) throws DaoUpdateException;

	public Person findById(Integer id) throws DaoFindException;

	public void delete(Person person) throws DaoDeleteException;

	public List<Person> findAll();

	public void deleteAll();
}
