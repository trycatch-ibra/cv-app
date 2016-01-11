package model;

public class Activity {
	private Integer year;
	private String nature;
	private String title;
	private String description;
	private String webAddress;

	public Activity() {
	}

	public String getDescription() {
		return description;
	}

	public String getNature() {
		return nature;
	}

	public String getTitle() {
		return title;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public Integer getYear() {
		return year;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
