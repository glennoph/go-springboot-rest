package go.springboot.rest.gospringbootrest.services;

import go.springboot.rest.gospringbootrest.web.model.Prod1Dto;

import java.util.UUID;

public interface Prod1Service {

    Prod1Dto getProd1ById(UUID prod1Id);

}
