package com.xworkz.vendors.repository;

import java.util.List;

import com.xworkz.vendors.dto.VendorDto;

public interface VendorRepository 
{
	boolean save(VendorDto vendorDto);

	List<VendorDto> getAll();
	
	boolean updateById(int vendorId, VendorDto vendorDto);
	
	boolean deleteById(int vendorId, VendorDto vendorDto);

}
