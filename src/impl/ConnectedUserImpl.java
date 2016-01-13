package impl;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import business.ConnectedUser;
import business.PersonManager;

/**
 * 
 * @author Ibrahima SEYE 
 * @author Kandel ACHIRAFI
 * 
 * This class is an implementation of the service ConnectedUser
 */

@Stateful
public class ConnectedUserImpl implements ConnectedUser {
	
	@EJB
	private PersonManager personManager;

	@Override
	public void login(String mail, String pasword) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

}
