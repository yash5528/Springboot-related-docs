package demo.microservices.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.microservices.customer.intercomm.AccountClient;
import demo.microservices.customer.model.Account;
import demo.microservices.customer.model.Customer;
import demo.microservices.customer.model.CustomerType;

@RestController
public class Api {
	
	@Autowired
	private AccountClient accountClient;
	
	protected static Logger logger = LoggerFactory.getLogger(Api.class.getName());
	
	private List<Customer> customers;
	
	public Api() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "12345", "ravi", CustomerType.INDIVIDUAL));
		customers.add(new Customer(2, "12346", "mithra", CustomerType.INDIVIDUAL));
		customers.add(new Customer(3, "12347", "aditya", CustomerType.INDIVIDUAL));
		customers.add(new Customer(4, "12348", "surtya", CustomerType.INDIVIDUAL));
	}
	
	@RequestMapping("/customers/pesel/{pesel}")
	public Customer findByPesel(@PathVariable("pesel") String pesel) {
		logger.info(String.format("Customer.findByPesel(%s)", pesel));
		Customer c = customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();
		logger.info(String.format("Customer.findByPesel: %s", c));
		return c;
	}
	
	@RequestMapping("/customers")
	public List<Customer> findAll() {
		logger.info("Customer.findAll()");
		logger.info(String.format("Customer.findAll: %s", customers));
		return customers;
	}
	
	@RequestMapping("/customers/{id}")
	public Customer findById(@PathVariable("id") Integer id) {
		logger.info(String.format("Customer.findById(%s)", id));
		Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
		List<Account> accounts =  accountClient.getAccounts(id);
		customer.setAccounts(accounts);
		logger.info(String.format("Customer.findById: %s", customer));
		return customer;
	}
	
}
