package com.example.demo.repository;


	import com.example.demo.model.Product;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository // signals that this interface object is database related crud operations object
	public interface ProductRepository extends JpaRepository<Product, Integer> {

//		List<Student> findByName(String name);
	//
//		List<Student> findByPosition(String position);
	}



