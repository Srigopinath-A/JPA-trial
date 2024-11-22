package Model;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

//import lombok.AllArgsConstructor;
//import lombok.Data;

@Data // which gives getter and setter 
@AllArgsConstructor // which create constructor for us 
@Component
@Entity
public class Product {

	public Product() {

	}

	// instead of using getter and setter and constructor we can we lambock function
	// which can be added into pom file.
	@Id
	private int Pid;
	private String Pname;
	private int Pprice;

	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pprice=" + Pprice + "]";
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getPprice() {
		return Pprice;
	}

	public void setPprice(int pprice) {
		Pprice = pprice;
	}

	public Product(int pid, String pname, int pprice) {
		super();
		Pid = pid;
		Pname = pname;
		Pprice = pprice;
	}

}
