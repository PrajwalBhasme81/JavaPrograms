package com.xworkz.javaproject.service;

import com.xworkz.javaproject.dto.PassengerDetailsDto;
import com.xworkz.javaproject.dto.TrainDetailsDto;
import com.xworkz.javaproject.repository.TrainRepoimplementation;
import com.xworkz.javaproject.repository.TrainRepository;

public class TrainServiceimplementation implements TrainService{

	TrainRepository repo = new TrainRepoimplementation();
	@Override
	public boolean setArraySize(int arraySize) {
		if(arraySize > 0) {
			System.out.println("Array is Taken");
			repo.setArraySize(arraySize);
			return true;
		}
		else {
			System.out.println("Array is not Taken");
		}
		return false;
	}

	@Override
	public String onSave(TrainDetailsDto bookingDto) {
		if(bookingDto != null) {
			repo.onSave(bookingDto);
			return "saved";
		}
		return "Not saved";
	}

	@Override
	public void read() {
		TrainDetailsDto[] bookingdto = repo.read();
		for (TrainDetailsDto trainDetailsDto : bookingdto) {
			System.out.println("Details :"+trainDetailsDto);
			
			
			
		}
	}

	

	
}