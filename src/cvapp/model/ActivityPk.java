package cvapp.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class ActivityPk implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer year;

	@Id
	private String nature;

	public ActivityPk() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActivityPk) {
			ActivityPk apk = (ActivityPk) obj;
			return this.getYear().equals(apk.getYear()) && this.getNature().equals(apk.getNature());
		}

		return false;
	}

	@Override
	public int hashCode() {
		return this.getYear().hashCode() * this.getNature().hashCode() * 1585;
	}

	public String getNature() {
		return nature;
	}

	public Integer getYear() {
		return year;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
