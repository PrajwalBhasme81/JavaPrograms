package com.xworkz.vendors.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class VendorDto {
	private int vendorId;
	private String vendorName;
	private String productType;
	private String vendorEmail;
	private long vendorContactNumber;
	

}
