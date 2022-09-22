package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setImageUrl("bilmemne.jpg");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(6);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setImageUrl("bilmemne2.jpg");
		product2.setDiscount(2);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(3);

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setImageUrl("bilmemne3.jpg");
		product3.setDiscount(12);
		product3.setUnitPrice(9500);
		product3.setUnitsInStock(4);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12312345");
		individualCustomer.setPhone("745665213");
		individualCustomer.setFirstName("Medine");
		individualCustomer.setLastName("X");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("258645");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("5658845232");
		corporateCustomer.setTaxNumber("25756");
		
		Customer[] customers = { individualCustomer, corporateCustomer};
	}
}
