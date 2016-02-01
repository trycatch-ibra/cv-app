package cvapp.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cvapp.business.PersonManager;
import cvapp.model.Person;

@ManagedBean(name = "person")
@SessionScoped
public class PersonController {
	@EJB
	PersonManager pm;

	@PostConstruct
	public void init() {
		System.out.println("Create " + this);
	}

	public List<Person> persons() {
		return null;

	}

}
