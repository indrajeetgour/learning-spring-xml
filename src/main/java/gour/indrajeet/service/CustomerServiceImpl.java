package gour.indrajeet.service;

import gour.indrajeet.model.Customer;
import gour.indrajeet.repository.CustomerRepository;
import gour.indrajeet.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    // here we will have all the service logic on service tier

    //    custoomer repo implementation
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    //    simple pass through method
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
