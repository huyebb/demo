package edu.poly.shopp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.shopp.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

}
