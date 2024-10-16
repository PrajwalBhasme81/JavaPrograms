package com.xworkz.javaproject.service;

import com.xworkz.javaproject.dto.PassengerDetailsDto;
import com.xworkz.javaproject.dto.TrainDetailsDto;

public interface TrainService {
	
	boolean setArraySize(int arraySize);
	String onSave(TrainDetailsDto bookingDto);
	void read();
	

}
