package cvapp.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
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
@Stateless(name = "pm")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonManager {

	@PersistenceContext(unitName = "cvapp")
	private EntityManager em;

	@PostConstruct()
	public void debut() {
		System.out.println("Starting " + this);
	}

	@PreDestroy
	public void fin() {
		System.out.println("Stopping " + this);
	}

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void savePerson(Person person) {
		if (em.find(Person.class, person.getId()) == null) {
			em.persist(person);
		} else {
			em.merge(person);
		}

	}

	public List<Person> showPersons() {
		Query query = em.createQuery("SELECT p FROM Person p");
		return (List<Person>) query.getResultList();
	}

	public Person showPerson(Person person) {
		return em.find(Person.class, person.getId());
	}

}
