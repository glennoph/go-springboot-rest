package go.springboot.rest.gospringbootrest.web.controller;

import go.springboot.rest.gospringbootrest.services.Prod1Service;
import go.springboot.rest.gospringbootrest.web.model.Prod1Dto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/prod1")
@RestController
public class Prod1Controller {

    private final Prod1Service prod1Service;

    public Prod1Controller(Prod1Service prod1Service) {
        this.prod1Service = prod1Service;
    }

    @GetMapping({"/{prod1Id}"})
    public ResponseEntity<Prod1Dto> getProd1(@PathVariable("prod1Id")
                                                         UUID prod1Id) {

        return new ResponseEntity<>(prod1Service.getProd1ById(prod1Id), HttpStatus.OK);
    }
}
