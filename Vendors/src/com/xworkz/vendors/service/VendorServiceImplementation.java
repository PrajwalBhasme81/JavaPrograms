package com.xworkz.vendors.service;

import java.util.List;

import com.xworkz.vendors.dto.VendorDto;
import com.xworkz.vendors.repository.VendorRepositoryImplementation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class VendorServiceImplementation implements VendorService {

private VendorRepositoryImplementation repoImp;
	
	@Override
	public String validate(VendorDto vendorDto) {
		System.out.println("validate is running");
		if(vendorDto != null) {
			if(repoImp.save(vendorDto)) {
				return "saved successfully";
			}
			return "not saved";
		}
		return "Not validated.. null";
	}

	@Override
	public List<VendorDto> getAll() {
		
		return repoImp.getAll();
	}

	@Override
	public String updateById(int vendorId, VendorDto vendorDto) {
		if(vendorId > 0) {
			if(repoImp.updateById(vendorId, vendorDto)) {
				return "updated successfully";
			}
		}
		return "not updated";
	}

	@Override
	public String deleteById(int vendorId, VendorDto vendorDto) {
		if(vendorId > 0) {
			if(repoImp.deleteById(vendorId, vendorDto)) {
				return "deleted successfully";
			}
		}
		return "not deleted";
	}

}
