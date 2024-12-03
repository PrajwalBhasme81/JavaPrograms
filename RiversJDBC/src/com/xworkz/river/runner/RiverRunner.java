package com.xworkz.river.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.util.RiverDetails;

public class RiverRunner {

		public static void main(String[] args) {
			
			try{
				Class.forName(RiverDetails.DRIVERNAME);
				Connection connection = DriverManager.getConnection(RiverDetails.JDBCURL,RiverDetails.USERNAME,RiverDetails.PASSWORD);
				System.out.println(connection);
				String query = "insert into river_details values  (2, 'Ganga',1500,2525,'Gaumukh',' Uttar Pradesh',16648)";
//					
//					(1, 'Tungabhadra',382,531,'Koodli','Karnataka',1631)
//					(3, 'Brahmaputra', 2900, 1500,'Tibetan Plateau', 'Arunachal Pradesh' 1100000)
//					(4, 'Indus',3180, 1200,'Tibetan Plateau', 'Ladakh', 1200000)
//					(5, 'Godavari', 1465, 1200,'Trimbak Plateau', 'Maharashtra', 700000)
//					(6, 'Narmada', 1312, 1000,'Amarkantak Plateau', 'Madhya Pradesh', 500000)
//					(7, 'Krishna',1400, 1100, 'Mahabaleshwar', 'Maharashtra', 800000)
//					(8, 'Mahanadi', 858, 800,'Chhattisgarh', 'Chhattisgarh',  400000)
//					(9, 'Sarasvati', 1500, 500,'Sarasvati River Basin', 'Haryana', 300000)
//					(10, 'Kaveri',805,600,'Talacauvery', 'Karnataka',300000)
				Statement statement = connection.createStatement();
				boolean result = statement.execute(query);
				if(!result) {
					System.out.println("Result is:"+result);
				}else {
					System.out.println("Not provide any query");
				}
			}catch(ClassNotFoundException|SQLException e){
				System.out.println(e.getMessage());
				
			}
		}
	}

