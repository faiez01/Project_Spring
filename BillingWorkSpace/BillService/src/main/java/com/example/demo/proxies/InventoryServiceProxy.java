package com.example.demo.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.beans.ProductBean;

@FeignClient(name = "PRODUCT-SERVICE")
public interface InventoryServiceProxy {
	@GetMapping("/products/{id}")
	public ProductBean findProductById(@PathVariable(name = "id") Long id);
}
