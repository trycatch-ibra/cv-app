package cvapp.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cvapp.dao.exception.DaoCreateException;
import cvapp.dao.exception.DaoFindException;
import cvapp.dao.exception.DaoUpdateException;
import cvapp.model.Person;

/**
 * 
 * @author Ibrahima SEYE
 * @author Kandel ACHIRAFI
 * 
 *         This class is used to manage persons
 */
@Stateless
public class PersonManager {

	@PersistenceContext(unitName = "cvapp")
	private EntityManager em;

	public void savePerson(Person person) throws DaoFindException, DaoCreateException, DaoUpdateException {

	}

	public void showPersons() {

	}

}
