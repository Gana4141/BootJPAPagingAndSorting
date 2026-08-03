///FlightDetais.java
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name="FLIGHT_DETAILS")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class FlightDetails {
	@Column(name="FNO")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer fno;
	
	@Column(length = 30,name = "FNAME")
	@NonNull
	private  String  fname;
	@Column(length = 30,name="COMPANY")
	@NonNull
	private  String company;
	@Column(length = 30, name="TYPE")
	@NonNull
	private   String type;
	
	@Column(name="CAPACITY")
	@NonNull
	private   Long capacity;
	@NonNull
	private   Integer  flightAge;
	
	@NonNull
	//@Transient
	private  Boolean  govtCompany;
}
