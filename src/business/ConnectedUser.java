package business;

import javax.ejb.Local;
/**
 * 
 * @author Ibrahima SEYE 
 * @author Kandel ACHIRAFI
 * 
 * This interface is a service used to manage connected user
 */

@Local
public interface ConnectedUser {

	public void login(String mail, String pasword);

	public void logout();

}
