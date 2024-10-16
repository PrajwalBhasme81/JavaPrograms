package com.xworkz.javaproject.repository;

import com.xworkz.javaproject.dto.TrainDetailsDto;

public interface TrainRepository {
	
	boolean setArraySize(int arraySize);
	boolean onSave(TrainDetailsDto bookingDto);
	TrainDetailsDto[] read();

}
