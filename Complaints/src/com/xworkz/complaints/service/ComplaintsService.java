package com.xworkz.complaints.service;

import java.util.List;

import com.xworkz.complaints.dto.ComplaintsDto;

public interface ComplaintsService 
{
	String Validate(ComplaintsDto complaintDto);
	
	List<ComplaintsDto> getAll();
	
	String updateById(int complaintId, ComplaintsDto complaintDto);
	
	String deleteById(int complaintId, ComplaintsDto complaintDto);

}
