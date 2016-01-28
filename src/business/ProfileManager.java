package business;

import javax.ejb.Local;
import javax.ejb.Stateful;

import model.Person;

/**
 * 
 * @author Ibrahima SEYE
 * @author Kandel ACHIRAFI
 * 
 *         This interface is a service used to manage connected user
 */

@Local
@Stateful
public class ProfileManager {
	private Person connectedUser;

	public void login(String mail, String pasword) {
	};

	public void logout() {
	};

	public void updateProfile() {
	};

	public void addNewActivity() {
	};

	public void updateActivity() {
	};

	public void deleteActivity() {
	};

	public void showActivities() {
	}

	public Person getConnectedUser() {
		return connectedUser;
	}

	public void setConnectedUser(Person connectedUser) {
		this.connectedUser = connectedUser;
	};
}
