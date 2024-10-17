package com.xworkz.product.repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.product.dto.ProductDto;

public class ProductRepositoryImplementation implements ProductRepository {

	LinkedList<ProductDto> linkedList = new LinkedList<ProductDto>();
	@Override
	public boolean save(ProductDto productDto) {
		System.out.println("Saved Method is Running");
		return linkedList.add(productDto);
	}
	@Override
	public List<ProductDto> getAll() {
		
		return linkedList;
	}
	@Override
	public boolean updateById(int productId, ProductDto productDto) {
		if(!linkedList.isEmpty())
		{
			for(int i=0;i<linkedList.size();i++)
			{
				if(linkedList.get(i).getProductId()==productId)
				{
					linkedList.set(i, productDto);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean deleteById(int productId, ProductDto productDto) {
		if(!linkedList.isEmpty())
		{
			for(int i=0;i<linkedList.size();i++)
			{
				if(linkedList.get(i).getProductId()==productId)
				{
					linkedList.remove();
					return true;
				}
			}
		}
		return false;
		
	}
	

}
