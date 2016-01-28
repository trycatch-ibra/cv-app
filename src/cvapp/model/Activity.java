package cvapp.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACTIVITIES")
public class Activity {
	@EmbeddedId
	private ActivityPk apk;
	private String title;
	private String description;
	private String webAddress;

	@ManyToOne
	private Person person;

	public Activity() {
	}

	public String getDescription() {
		return description;
	}

	public String getTitle() {
		return title;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public ActivityPk getApk() {
		return apk;
	}

	public void setApk(ActivityPk apk) {
		this.apk = apk;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
