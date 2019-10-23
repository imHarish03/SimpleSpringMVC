package lab.spring.mvc.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String lastName;

	@Min(value = 1, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to 10")
	private int phoneNumber;
	private String country;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
	private String postalCode;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
