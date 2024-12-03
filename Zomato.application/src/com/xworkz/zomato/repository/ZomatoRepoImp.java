package com.xworkz.zomato.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.util.ZomatoDetails;


public class ZomatoRepoImp implements ZomatoRepo {

	@Override
	public boolean save(ZomatoDto dto) {
		
		try {
			Connection connection = DriverManager.getConnection(ZomatoDetails.JDBCURL,ZomatoDetails.USERNAME,ZomatoDetails.PASSWORD);
			System.out.println(connection);
			String query = "insert into zomato_details (foodName,price,deliveryLocation) values (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
		
			statement.setString(1, dto.getFoodName());
			statement.setFloat(2, dto.getPrice());
			statement.setString(3, dto.getDeliveryLocation());
			
			boolean result = statement.execute();
			if(!result) {
				System.out.println("Result is:"+result);
			}else {
				System.out.println("Not provide any query");
			}
			
		
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	@Override
	public List<ZomatoDto> read() {
		
		List<ZomatoDto> list = new ArrayList<>();
		try {
			Connection connection = DriverManager.getConnection(ZomatoDetails.JDBCURL,ZomatoDetails.USERNAME,ZomatoDetails.PASSWORD);
			String readQuery = "select * from zomato_details";
			Statement select = connection.createStatement();
			ResultSet result = select.executeQuery(readQuery);
			while(result.next())
			{
				
				ZomatoDto dto= new ZomatoDto();
				dto.setId(result.getInt(1));
				dto.setFoodName(result.getString(2));
				dto.setPrice(result.getFloat(3));;
				dto.setDeliveryLocation(result.getString(4));
				
				list.add(dto);
			}
			
			
		}catch(SQLException e){
			return Collections.emptyList();
		}
		return list;
		
	}

}
