package com.xworkz.complaints.repository;

import java.util.List;

import com.xworkz.complaints.dto.ComplaintsDto;

public interface ComplaintsRepository 
{
	boolean save(ComplaintsDto complaintDto);
	
	List<ComplaintsDto> getAll();
	
	boolean updateById(int complaintId, ComplaintsDto complaintDto);
	
	boolean deleteById(int complaintId, ComplaintsDto complaintDto);

}
