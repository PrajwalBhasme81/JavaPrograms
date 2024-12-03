package com.xworkz.farmer.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.farmer.dto.FarmerDto;
import com.xworkz.farmer.util.FarmerDetails;

public class FarmerRepoImp implements FarmerRepo {

	@Override
	public boolean save(FarmerDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(FarmerDetails.JDBCURL, FarmerDetails.USERNAME,
					FarmerDetails.PASSWORD);
			System.out.println(connection);
			String query = "insert into farmerdetails (name,cNumber,address,area,soilType) values (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getName());
			statement.setLong(2, dto.getContactNumber());
			statement.setString(3, dto.getAddress());
			statement.setDouble(4, dto.getArea());
			statement.setString(5, dto.getSoilType());

			boolean result = statement.execute();
			if (!result) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<FarmerDto> read() {
		List<FarmerDto> list = new ArrayList<>();
		try {
			Connection connection = DriverManager.getConnection(FarmerDetails.JDBCURL, FarmerDetails.USERNAME,
					FarmerDetails.PASSWORD);
			String readQuery = "select * from farmerdetails";
			Statement select = connection.createStatement();
			ResultSet result = select.executeQuery(readQuery);
			while (result.next()) {

				FarmerDto dto = new FarmerDto();
				dto.setId(result.getInt(1));
				dto.setName(result.getString(2));
				dto.setContactNumber(result.getLong(3));
				dto.setAddress(result.getString(4));
				dto.setArea(result.getDouble(5));
				dto.setSoilType(result.getString(6));

				list.add(dto);
			}

		} catch (SQLException e) {
			return Collections.emptyList();
		}
		return list;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			Connection connection = DriverManager.getConnection(FarmerDetails.JDBCURL, FarmerDetails.USERNAME,
					FarmerDetails.PASSWORD);
			String deletequery = "DELETE FROM farmerdetails WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(deletequery);
			statement.setInt(1, id);
			if (!statement.execute()) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return false;
	}

	@Override
	public FarmerDto searchById(int id) {
		try {
			Connection connection = DriverManager.getConnection(FarmerDetails.JDBCURL, FarmerDetails.USERNAME,
					FarmerDetails.PASSWORD);
			String searchquery = "SELECT * FROM farmerdetails WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(searchquery);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				FarmerDto dto = new FarmerDto();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setContactNumber(resultSet.getLong(3));
				dto.setAddress(resultSet.getString(4));
				dto.setArea(resultSet.getDouble(5));
				dto.setSoilType(resultSet.getString(6));
				return dto;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return new FarmerDto();

	}

	@Override
	public boolean updateById(int id, FarmerDto dto) {
		
		try {
		Connection connection =	DriverManager.getConnection(FarmerDetails.JDBCURL, FarmerDetails.USERNAME, FarmerDetails.PASSWORD);
		
		String updateQuery = "update farmerdetails set Name = ?,CNumber = ?,Address = ?,Area=?,SoilType=? where id=? ";
		
		PreparedStatement statement = connection.prepareStatement(updateQuery);
		
		statement.setString(1, dto.getName());
		statement.setLong(2, dto.getContactNumber());
		statement.setString(3, dto.getAddress());
		statement.setDouble(4, dto.getArea());
		statement.setString(5, dto.getSoilType());
		
		statement.setInt(6, id);

		int updatedRows = statement.executeUpdate();
		
		return true;
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
}
