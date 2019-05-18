package com.dxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dxc.model.Order;
import com.dxc.repos.OrderRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		repository.deleteAll();
//
//		// save a couple of customers
//		repository.save(new Products("_id”=01,”Men’s Shirt","Dress","Levis",750));
//		repository.save(new Products("_id”=02,”Speaker","electronics","jbl",1999));
//
//		repository.save(new Products("_id”=03,”Seagate 1TB Backup Plus Slim External Hard Drive ","electronics","Seagate",3899));
//		repository.save(new Products("_id”=04,”Men’s Watch","Accessories","Espoir",5000));
//		repository.save(new Products("_id”=05,”Hand Bag","Bags","NMH10",500));
//
//		repository.save(new Products("_id”=06,”Dress","Dress","TokyoTalkies",899));
//		repository.save(new Products("_id”=07,”Kid’s Wear","Dress","Shree",500));
//
//		repository.save(new Products("_id”=08,”White Gown","Dress","Biba",5000));
//
//		repository.save(new Products("_id”=09,”Kitchen Apron ","Kitchen","Home",300));
//		repository.save(new Products("_id”=10,”Gown","Dress","Inddus",5000));
//		repository.save(new Products("_id”=11,”Boys Shirt","Dress","US Polo",399));
//		repository.save(new Products("_id”=12,”Men’s Denim Shirt","Dress","Roadster",589));
//
//



		//repository.save(new Products("Bob", "Smith"));

//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
//
//	}

}
}
