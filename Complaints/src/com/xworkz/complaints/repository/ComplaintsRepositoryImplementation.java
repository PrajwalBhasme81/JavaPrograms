package com.xworkz.complaints.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.complaints.dto.ComplaintsDto;

public class ComplaintsRepositoryImplementation implements ComplaintsRepository 
{
	ArrayList<ComplaintsDto> arrayList = new ArrayList<ComplaintsDto>();

	@Override
	public boolean save(ComplaintsDto complaintDto) 
	{
		System.out.println("Save Method is Running");
		return arrayList.add(complaintDto);
	}

	@Override
	public List<ComplaintsDto> getAll() {
		
		return arrayList;
	}

	@Override
	public boolean updateById(int complaintId, ComplaintsDto complaintDto) {
		if(!arrayList.isEmpty())
		{
			for(int i=0;i<arrayList.size();i++)
			{
				if(arrayList.get(i).getComplaintId()==complaintId)
				{
					arrayList.set(i, complaintDto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int complaintId, ComplaintsDto complaintDto) {
		if(!arrayList.isEmpty())
		{
			for(int i=0;i<arrayList.size();i++)
			{
				if(arrayList.get(i).getComplaintId()==complaintId)
				{
					arrayList.remove(i);
					return true;
				}
			}
		}
		return false;
	}

}
