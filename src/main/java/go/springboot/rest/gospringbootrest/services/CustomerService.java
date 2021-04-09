package go.springboot.rest.gospringbootrest.services;

import go.springboot.rest.gospringbootrest.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
