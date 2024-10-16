package com.xworkz.javaproject.dto;

import java.sql.Time;

import com.xworkz.javaproject.constant.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class TrainDetailsDto {
	private String railwayStationName;
	private int trainNumber;
	private int platformNumber;
	private Time departureTime;
	private Location location;
	private int pincode;
	private PassengerDetailsDto passengerDetails;
	

}
