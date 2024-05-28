package com.kmss.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kmss.springboot.entity.Product;
import com.kmss.springboot.service.MyService;

//url: http://localhost:8080/api/v1/Product
@RestController
@RequestMapping("/api")
public class MyController 
{
   private final MyService myService;
   
   @Autowired
   public MyController(MyService myService)
   {
	   this.myService= myService;
   }
   
   // let us insert a row into product table from controller
   // data getting from browser so we use Post Request
   @PostMapping("/product")
    public Product createProduct(@RequestBody Product p)
    {
	   return myService.saveProduct(p);
    }
 //Read data....
 	@PutMapping("/read")
 	public List<Product>getAllProductsData()
 	{
 		return myService.getAllProducts();
 	}
 	
 	//Updating....
 	@PutMapping("/update/{id}")
 	public Product updateProductData(@PathVariable int id, @RequestBody Product e)
 	{
 		return myService.updateProduct(id, e);

 	}
 	
 	//Deleting....
 	@DeleteMapping("/delete/{id}")
 	public void deleteProductData(@PathVariable int id)
 	{
 		 myService.deleteProduct(id);
 		
 	}
  }

