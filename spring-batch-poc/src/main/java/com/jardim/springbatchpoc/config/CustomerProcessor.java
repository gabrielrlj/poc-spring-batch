package com.jardim.springbatchpoc.config;

import com.jardim.springbatchpoc.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if (customer.getProfession().equals("worker")){
            return customer;
        }else{
            return null;
        }
    }
}
