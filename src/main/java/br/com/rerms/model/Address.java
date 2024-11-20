package br.com.rerms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "addresses")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 8)
	@Column(nullable = false)
	private String cep;

	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String state;

	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String city;
	
	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String street;
	
	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String neighborhood;
	
	@NotNull
	@Column(name = "HouseNumber", nullable = false)
	private String houseNumber;
	
	public Address(@Size(max = 8) String cep, @Size(max = 255) String state, @Size(max = 255) String city,
			@Size(max = 255) String street, @Size(max = 255) String neighborhood, String houseNumber) {
		this.cep = cep;
		this.state = state;	
		this.city = city;
		this.street = street;
		this.neighborhood = neighborhood;
		this.houseNumber = houseNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
}
