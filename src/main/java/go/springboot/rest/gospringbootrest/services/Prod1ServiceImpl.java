package go.springboot.rest.gospringbootrest.services;

import go.springboot.rest.gospringbootrest.web.model.Prod1Dto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Prod1ServiceImpl implements Prod1Service {

    @Override
    public Prod1Dto getProd1ById(UUID prod1Id) {
        return Prod1Dto.builder()
                .name("prod1 name")
                .type("prod1 type")
                .upc(111L)
                .uuid(prod1Id)
                .build();
    }
}
