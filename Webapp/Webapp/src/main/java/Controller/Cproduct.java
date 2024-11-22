package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Product;
import Service.PService;

@RestController // which allow to create an controller

public class Cproduct {
	
	@Autowired // which call of the object that created 
	private PService Ser;
	
	@GetMapping("/Product")
	public List<Product> getProduct() {
		return Ser.getProduct();
		
	}
	
	//get using post man
	@GetMapping("/Product/{pid}")// switching to getmapping to avoid the same mapping location error 
	public Product getProductById(@PathVariable int pid) { // which is used to extract values from the URI(uniform resource identifier )
		return Ser.getProductById(pid);
	}
	
	//put using postman
	
	@PostMapping("/Product")
	public void addProduct(@RequestBody Product prod) { // Requestbody used to match the request with the product.
		Ser.addProduct(prod);
	}
	
	@PutMapping("/Product")
	public void updateProduct(@RequestBody Product prod) {
		Ser.updateProduct(prod);
	}
	
	@DeleteMapping("/Product/{pid}")
	public void deleteProduct(@PathVariable int pid) {
		Ser.deletProduct(pid);
	}
}
