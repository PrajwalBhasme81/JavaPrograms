package com.xworkz.ott.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OttEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userNo;
	@Column(name = "o_name")
	private String name;
	@Id
	@Column(name = "o_email")
	private String email;

}
