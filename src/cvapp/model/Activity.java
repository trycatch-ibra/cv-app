package cvapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ACTIVITIES", uniqueConstraints = {
		@UniqueConstraint(name = "annee_nature", columnNames = { "year", "nature" }) })
public class Activity {

	@Temporal(TemporalType.DATE)
	private Integer year;
	private String nature;
	private String title;
	private String description;
	private String webAddress;

	@ManyToOne
	private Person person;

	public Activity() {
	}

	public Integer getYear() {
		return year;
	}

	public String getNature() {
		return nature;
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

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setNature(String nature) {
		this.nature = nature;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
