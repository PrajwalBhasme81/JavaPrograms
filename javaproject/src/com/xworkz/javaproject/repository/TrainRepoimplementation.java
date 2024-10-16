package com.xworkz.javaproject.repository;

import com.xworkz.javaproject.dto.TrainDetailsDto;

public class TrainRepoimplementation implements TrainRepository{

	TrainDetailsDto listOfBooking[];
	int index = 0;
	
	@Override
	public boolean setArraySize(int arraySize) {
		listOfBooking = new TrainDetailsDto[arraySize];
		if(listOfBooking.length == arraySize) {
			System.out.println("Array is given");
		}else {
			System.out.println("Array is not given");
		}
			return false;
	}

	@Override
	public boolean onSave(TrainDetailsDto bookingDto) {
		if(listOfBooking != null) {
			if(this.index < this.listOfBooking.length) {
				listOfBooking[index] = bookingDto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public TrainDetailsDto[] read() {
		
		return listOfBooking;
	}


	

}
