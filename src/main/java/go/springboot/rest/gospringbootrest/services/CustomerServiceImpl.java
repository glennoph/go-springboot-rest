package go.springboot.rest.gospringbootrest.services;

import go.springboot.rest.gospringbootrest.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService  {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .name("customer name")
                .uuid(customerId)
                .build();
    }
}
