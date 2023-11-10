package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.beans.CustomerBean;
import com.example.demo.beans.ProductBean;
import com.example.demo.model.Bill;
import com.example.demo.model.ProductItem;
import com.example.demo.proxies.CustomerServiceProxy;
import com.example.demo.proxies.InventoryServiceProxy;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.ProductItemRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@AllArgsConstructor
public class BillServiceApplication implements CommandLineRunner {

	CustomerServiceProxy customerServiceProxy;
	BillRepository billRepository;
	InventoryServiceProxy inventoryServiceProxy;
	ProductItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(BillServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Question 1
		CustomerBean bean = customerServiceProxy.findCustomerById(1L);
		System.out.println(bean.getName());
		// Question 2 & 3
		Bill bill = new Bill();
		bill.setBillingdate(new Date());
		bill.setCustomerID(1L);
		bill.setCustomer(bean);
		billRepository.save(bill);

		// Question 4

		ProductBean p1 = inventoryServiceProxy.findProductById(1L);
		ProductBean p2 = inventoryServiceProxy.findProductById(1L);
		ProductBean p3 = inventoryServiceProxy.findProductById(1L);
		System.out.println(p1.getId() + "  " + p1.getName());
		System.out.println(p2.getId() + "  " + p2.getName());
		ProductItem pi1 = new ProductItem();
		pi1.setProductId(p1.getId());
		ProductItem pi2 = new ProductItem();
		pi1.setProductId(p2.getId());
		ProductItem pi3 = new ProductItem();
		pi1.setProductId(p3.getId());

		pi1.setBill(bill);
		pi2.setBill(bill);
		pi3.setBill(bill);

		itemRepository.save(pi1);
		itemRepository.save(pi2);
		itemRepository.save(pi3);
	}

}
