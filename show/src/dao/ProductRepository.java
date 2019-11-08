package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository{
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository(){
		Product phone = new Product("P1234", "iPhone 6s", 80000);
		phone.setDescription("4-7-inch, 1234*750 Renina HD display,8-megapixel iSinght Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apply");
		phone.setUnitsInStock(1000);
		phone.setCondition("new");
		
		Product notebook = new Product("P1235", "LG PC ±×·¥ ", 150000);
		notebook.setDescription("4-7-inch, 1234*750 Renina HD display,8-megapixel iSinght Camera");
		notebook.setCategory("notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "galaxy Tab S", 90000);
		tablet.setDescription("4-7-inch, 1234*750 Renina HD display,8-megapixel iSinght Camera");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
}