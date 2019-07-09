package edu.mum.cs544.aop1.service;

import edu.mum.cs544.aop1.dao.ICustomerDAO;
import edu.mum.cs544.aop1.email.IEmailSender;
import edu.mum.cs544.aop1.domain.Address;
import edu.mum.cs544.aop1.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerDAO customerDAO;
    @Autowired
    private IEmailSender emailSender;

    public void setCustomerDAO(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void setEmailSender(IEmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addCustomer(String name, String email, String street,
                            String city, String zip) {
        Customer customer = new Customer(name, email);
        Address address = new Address(street, city, zip);
        customer.setAddress(address);
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
    }
}
