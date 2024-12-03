package com.xworkz.farmer.service;

import java.util.List;

import com.xworkz.farmer.dto.FarmerDto;
import com.xworkz.farmer.repository.FarmerRepo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class FarmerServiceImp implements FarmerService {

	private FarmerRepo repo;

	@Override
	public String validateandsave(FarmerDto dto) {
		if (dto != null) {

			if (repo.save(dto)) {
				System.out.println("Saved to Database");
			}
		}
		return "Not Saved";
	}

	@Override
	public List<FarmerDto> read() {

		return repo.read();
	}

	@Override
	public FarmerDto searchById(int id) {

		return repo.searchById(id);
	}

	@Override
	public String deleteById(int id) {
		if (repo.deleteById(id)) {
			return "Deleted successfully";
		}
		return "Delete failed";
	}

	@Override
	public String updateById(int id,FarmerDto dto) {
		if(repo.updateById(id, dto)) {
			return "Updated Successfully";
		}
		return "Updated not Successfully";
	}

}
