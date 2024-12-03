package com.xworkz.river.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.util.RiverDetails;

public class RiverDetailsRead {
	
		public static void main(String[] args)
		{
			try{
				Connection connection = DriverManager.getConnection(RiverDetails.JDBCURL,RiverDetails.USERNAME,RiverDetails.PASSWORD);
				System.out.println(connection);
				String queryies = "select * from river_details;";
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery(queryies);
				while(result.next()) {
					Integer id = result.getInt(1);
					System.out.println("id is:" + id);
					String river_name = result.getString(2);
					System.out.println("names of river:" + river_name);
					String width = result.getString(3);
					System.out.println("width is:" + width);
					String length = result.getString(4);
					System.out.println("length is:" + length);
					String birth_place = result.getString(5);
					System.out.println("Birth Place is:" + birth_place);
					String state = result.getString(6);
					System.out.println("state is:" + state);
					String water_level = result.getString(7);
					System.out.println("Water Level is:" + water_level);
					System.out.println("-------------------------------");
				}
			}catch(SQLException e){
				System.out.println(e.getMessage());
				
		}
	}
		
	}

