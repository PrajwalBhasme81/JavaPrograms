package com.xworkz.product.service;

import java.util.List;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepositoryImplementation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImplementation implements ProductService {
  private ProductRepositoryImplementation repoImp;
	@Override
	public String validate(ProductDto productDto) {
		System.out.println("Validate is Running");
		if(productDto != null)
		{
			//ProductRepositoryImplementation repoImp = null;
			if(repoImp.save(productDto))
			{
				return "Saved Successfully";
			}
			return "Not Saved";
		}
		return "Not Validate Null";
	}

	@Override
	public List<ProductDto> getAll() {
		
		//ProductServiceImplementation repoImp = null;
		return repoImp.getAll();
	}

	@Override
	public String updateById(int productId, ProductDto productDto) {
		if(productId > 0)
		{
			//ProductServiceImplementation repoImp = null;
			if(repoImp.updateById(productId,productDto))
			{
				return "Updated Successfully";
			}
		}
		return "Not Updated";
	}

	@Override
	public String deleteById(int productId, ProductDto productDto) {
		if(productId > 0) {
			//ProductServiceImplementation repoImp = null;
			if(repoImp.deleteById(productId,productDto))
			{
				return "Deleted Successfully";
			}
		}
		return "Not Deleted";
	}

}
