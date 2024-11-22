package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Product;



@Repository  // Optional, Spring will automatically register it
public interface Productrepo extends JpaRepository<Product, Long> {
    // Custom query methods can be added here if needed
}
