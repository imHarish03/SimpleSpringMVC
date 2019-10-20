package lab.spring.mvc.model;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String zone;
	private LinkedHashMap<String, String> zoneOptions;

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

}
