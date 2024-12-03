package com.xworkz.ad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "findAll" , query = "SELECT x FROM AdAgencyEntity x")
@NamedQuery(name = "authentication" , query = "SELECT e FROM AdAgencyEntity e WHERE e.email=:email AND e.password=:password")
public class AdAgencyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_person")
	private String personName;
	@Column(name = "a_company")
	private String companyName;
	@Column(name = "a_email")
	private String email;
	@Column(name = "a_password")
	private String password;
	@Column(name = "a_contact")
	private long contact;
	@Column(name = "a_product")
	private String productName;
	@Column(name = "a_description")
	private String description;

}
