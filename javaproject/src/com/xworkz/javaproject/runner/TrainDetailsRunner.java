package com.xworkz.javaproject.runner;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

import com.xworkz.javaproject.constant.Location;
import com.xworkz.javaproject.dto.PassengerDetailsDto;
import com.xworkz.javaproject.dto.TrainDetailsDto;
import com.xworkz.javaproject.service.TrainService;
import com.xworkz.javaproject.service.TrainServiceimplementation;

public class TrainDetailsRunner {

	public static void main(String[] args) {
		TrainDetailsDto booking = new TrainDetailsDto();
		PassengerDetailsDto details = new PassengerDetailsDto();
		booking.setRailwayStationName("Gadag");
		booking.setTrainNumber(2324);
		booking.setPlatformNumber(2);
		booking.setLocation(Location.MYSORE);
		booking.setDepartureTime(Time.valueOf(LocalTime.now()));
		booking.setPincode(582101);
		booking.setPassengerDetails(details);
		details.setName("Ganesh");
		details.setAge(22);
		details.setMobileNumber(8309809043L);
		details.setAadharNumber(706089522219L);
		details.setTotalAmount(450);
		
		
		TrainDetailsDto booking1 = new TrainDetailsDto();
		PassengerDetailsDto details1 = new PassengerDetailsDto();
		booking1.setRailwayStationName("Haveri");
		booking1.setTrainNumber(1234);
		booking1.setPlatformNumber(3);
		booking1.setLocation(Location.BANGALURU);
		booking1.setDepartureTime(Time.valueOf(LocalTime.now()));
		booking1.setPincode(560233);
		booking1.setPassengerDetails(details);
		details1.setName("Raju");
		details1.setAge(23);
		details1.setMobileNumber(7998964520L);
		details1.setAadharNumber(645388122345L);
		details1.setTotalAmount(220);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arraySize = scanner.nextInt();
		
		TrainService service = new TrainServiceimplementation();
		service.setArraySize(arraySize);
		String result = service.onSave(booking);
		String result1 = service.onSave(booking1);
		
		System.out.println(result);
		System.out.println(result1);
		
		service.read();
		

	}

}
