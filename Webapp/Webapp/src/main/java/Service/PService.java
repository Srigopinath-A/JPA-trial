


package Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Product;
import repository.Productrepo;

@Service // which helps to create list using Spring
public class PService {
	
	//@Autowired// it is responsible for creating the object
	//Productrepo repo;
	

	@Autowired
    Productrepo repo;
	    
	// for now we just create an temp data
	//private final List<Product> product = new ArrayList<> (Arrays.asList(new Product(1,"Casio217w",1675), new Product(2,"CasioA500",2400),
			//new Product(3,"Casio M24",1200))); // we are creating it as new array due to immutable nature it cant be get into post method in post man

	public List<Product> getProduct() {
		return repo.findAll(); // it getting ALL the methods from jpa repository which we extended 

	}
	
	// for fetching the data using get and Stream API
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		
		return repo.findById((long) pid).orElse(new Product()); // fetch the id or it will create a blank product
//		return product.stream() // which allows to get stream of inputs.
//				.filter(p -> p.getPid() == pid)
//				.findFirst().orElse(new Product(0,"unknown",0));
	}
	
	//to put the data in the list
	public void addProduct(Product prod) {
		//product.add(prod);
		repo.save(prod);
	}
	
	public void updateProduct(Product prod) {
		
		repo.save(prod); // which will save the updated value in the db
//		int index = 0;
//		for (int i =0;i<product.size();i++) {
//			if(product.get(i).getPid() == prod.getPid()) {
//				index = i;
//				
//				product.set(index,prod);
//			}
//		}
	}

	public void deletProduct( int  pid) {
		// TODO Auto-generated method stub
		
		repo.deleteById((long) pid);
//		int index = 0;
//		for (int i=0;i<product.size();i++) {
//			if (product.get(i).getPid() == pid) {
//				
//				product.remove(i);
//			}
//		}
//	}
}
}
