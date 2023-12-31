package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.proxies.CustomerServiceProxy;
import com.example.demo.proxies.InventoryServiceProxy;
import com.example.demo.repository.BillRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BillController {
	BillRepository billrepo;
	CustomerServiceProxy customerproxy;
	InventoryServiceProxy inventoryproxy;

	@GetMapping("/bills/full/{id}")
	Bill getBill(@PathVariable Long id) {
		Bill bill = billrepo.findById(id).get();
		bill.setCustomer(customerproxy.findCustomerById(bill.getCustomerID()));
		bill.getItems().forEach(pi -> {
			pi.setBean(inventoryproxy.findProductById(pi.getProductId()));
		});
		return bill;
	}
}
