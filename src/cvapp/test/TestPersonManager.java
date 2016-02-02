package cvapp.test;

import static org.junit.Assert.*;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.Test;

import cvapp.business.PersonManager;
import cvapp.model.Person;
/**
 * 
 * @author Ibrahima SEYE
 * @author Kandel ACHIRAFI
 * 
 * This class is used to test PersonManager 
 */

public class TestPersonManager {

	@EJB
	PersonManager personManager;
	Person person = new Person();

	public TestPersonManager() throws Exception {
		EJBContainer.createEJBContainer().getContext().bind("inject", this);
		assertNotNull(personManager);
		person.setId(1000);
		person.setName("toto");
		person.setFirstName("tata");
		person.setEmail("toto@gmail.com");
		person.setPassword("totopass");
		person.setWebAddress("toto.com");
		person.setBirthday(new Date());
	}

	// test saving new person
	@Test
	public void testSaveNewPerson() throws Exception {
		personManager.savePerson(person);
		assertNotNull(personManager.showPersons());
		assertEquals(1, personManager.showPersons().size());
	}

	// test saving existing person
	@Test
	public void testSaveOldPerson() throws Exception {
		Person personToUpdate = personManager.showPerson(person);
		// updating person mail address
		personToUpdate.setEmail("toto@yahoo.fr");
		personManager.savePerson(personToUpdate);
		Person updatedPerson = personManager.showPerson(personToUpdate);
		assertEquals("toto@yahoo.fr", updatedPerson.getEmail());

	}

}
