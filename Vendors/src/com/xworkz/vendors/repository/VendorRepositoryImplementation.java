package com.xworkz.vendors.repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.vendors.dto.VendorDto;

public class VendorRepositoryImplementation implements VendorRepository
{
	LinkedList<VendorDto> linkedList = new LinkedList<VendorDto>();

	@Override
	public boolean save(VendorDto vendorDto) {
		System.out.println("save method running");
		return linkedList.add(vendorDto);
	}

	@Override
	public List<VendorDto> getAll() {

		return linkedList;
	}

	@Override
	public boolean updateById(int vendorId, VendorDto vendorDto) {
		if (!linkedList.isEmpty()) {
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i).getVendorId() == vendorId) {
					linkedList.set(i, vendorDto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int vendorId, VendorDto vendorDto) {
		if (!linkedList.isEmpty()) {
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i).getVendorId() == vendorId) {
					linkedList.remove();
					return true;
				}
			}
		}
		return false;
	}

}
