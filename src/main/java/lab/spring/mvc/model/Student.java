package lab.spring.mvc.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	private String firstName;
	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String lastName;
	private String country;
	private String zone;
	private LinkedHashMap<String, String> zoneOptions;
	private String favouriteLanguage;
	private String[] operatingSystem;

	public Student() {
		zoneOptions = new LinkedHashMap<String, String>();
		zoneOptions.put("Est", "East");
		zoneOptions.put("Wst", "West");
		zoneOptions.put("Nrt", "North");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public LinkedHashMap<String, String> getZoneOptions() {
		return zoneOptions;
	}

	public void setZoneOptions(LinkedHashMap<String, String> zoneOptions) {
		this.zoneOptions = zoneOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
