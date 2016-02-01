package cvapp.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public void savePerson(Person person) {
		if (em.find(Person.class, person.getId()) == null) {
			em.persist(person);
		} else {
			em.merge(person);
		}

	}

	public List<Person> showPersons() {
		Query query = em.createQuery("SELECT p FROM PERSONS p");
		return (List<Person>) query.getResultList();
	}

}
