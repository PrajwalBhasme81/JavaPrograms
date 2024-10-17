package com.xworkz.complaints.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ComplaintsDto 
{
	private int complaintId;
	private String complaintType;
	private String complaintLocation;

}
