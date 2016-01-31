package cvapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cvapp.dao.exception.DaoCreateException;
import cvapp.dao.exception.DaoDeleteException;
import cvapp.dao.exception.DaoFindException;
import cvapp.dao.exception.DaoUpdateException;
import cvapp.dao.services.PersonDao;
import cvapp.model.Person;

public class PersonDaoImpl implements PersonDao {

	@PersistenceContext(unitName = "cvapp")
	private EntityManager em;

	@Override
	public void create(Person person) throws DaoCreateException {
		em.persist(person);
	}

	@Override
	public void update(Person person) throws DaoUpdateException {
		// TODO Auto-generated method stub

	}

	@Override
	public Person findById(Integer id) throws DaoFindException {

		return em.find(Person.class, id);
	}

	@Override
	public void delete(Person person) throws DaoDeleteException {
		em.remove(person);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public EntityManager getEm() {
		return em;
	}

}
