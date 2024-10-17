package com.xworkz.complaints.service;

import java.util.List;

import com.xworkz.complaints.dto.ComplaintsDto;
import com.xworkz.complaints.repository.ComplaintsRepositoryImplementation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintsServiceImplementation implements ComplaintsService {

	private ComplaintsRepositoryImplementation repoImp;
	@Override
	public String Validate(ComplaintsDto complaintDto) 
	{
		System.out.println("Validate is Running");
		if(complaintDto != null)
		{
			
			if(repoImp.save(complaintDto))
			{
				return "Saved Successfully";
			}
			return "Not Saved";
		}
		
		return "Not Validate Null";
	}
	
	@Override
	public List<ComplaintsDto> getAll() {
		
		return repoImp.getAll();
	}
	
	@Override
	public String updateById(int complaintId, ComplaintsDto complaintDto) {
		if(complaintId > 0)
		{
			if(repoImp.updateById(complaintId,complaintDto))
			{
				return "Update Successfully";
			}
		}
		return "not Updated";
	}
	
	@Override
	public String deleteById(int complaintId, ComplaintsDto complaintDto) {
		if(complaintId > 0)
		{
			if(repoImp.deleteById(complaintId,complaintDto))
			{
				return "Deleted Successfully";
			}
		}
		return "not Deleted";
	}

}
