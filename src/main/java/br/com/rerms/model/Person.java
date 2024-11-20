package br.com.rerms.model;

import br.com.rerms.enumerator.person.MaritalStatus;
import br.com.rerms.enumerator.person.PersonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long person_id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String name;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PersonType type;

	@NotNull
	@Size(max = 255)
	@Column(unique = true, nullable = false)
	private String document;

	@NotNull
	@Size(max = 255)
	@Column(nullable = false)
	private String occupation;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Size(max = 255)
	@Column(nullable = false)
	private MaritalStatus maritalStatus;

	public Person(@NotNull Address address, @NotNull @Size(max = 255) String name, @NotNull PersonType type,
			@NotNull @Size(max = 255) String document, @NotNull @Size(max = 255) String occupation,
			@NotNull @Size(max = 255) MaritalStatus maritalStatus) {
		super();
		this.address = address;
		this.name = name;
		this.type = type;
		this.document = document;
		this.occupation = occupation;
		this.maritalStatus = maritalStatus;
	}

	public Long getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonType getType() {
		return type;
	}

	public void setType(PersonType type) {
		this.type = type;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}
