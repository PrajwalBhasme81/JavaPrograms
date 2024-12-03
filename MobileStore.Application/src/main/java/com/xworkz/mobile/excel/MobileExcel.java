package com.xworkz.mobile.excel;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.mobile.dto.MobileStoreDto;

public class MobileExcel {
	
	public void excelSave(MobileStoreDto dto) {
		String filepath = "C:\\Users\\INFINIX\\Desktop\\JavaPrograms\\MobileStore.Application\\mobile.xlsx";
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Mobile_Details");
		
		Row headRow = sheet.createRow(0);
		headRow.createCell(0).setCellValue("Brand");
		headRow.createCell(1).setCellValue("Price");
		headRow.createCell(2).setCellValue("RAM");
		headRow.createCell(3).setCellValue("Storage");
		headRow.createCell(4).setCellValue("Warrenty");
		
		Row dataRow = sheet.createRow(1);
		dataRow.createCell(0).setCellValue(dto.getBrand());
		dataRow.createCell(1).setCellValue(dto.getPrice());
		dataRow.createCell(2).setCellValue(dto.getRam());
		dataRow.createCell(3).setCellValue(dto.getStorage());
		dataRow.createCell(4).setCellValue(dto.getWarranty());
		
		try {
			FileOutputStream fileOut = new FileOutputStream(new File(filepath));
			workbook.write(fileOut);
			workbook.close();
			System.out.println("Successfully created xlsx file");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
