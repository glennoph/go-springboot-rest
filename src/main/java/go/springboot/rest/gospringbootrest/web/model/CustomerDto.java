package go.springboot.rest.gospringbootrest.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomerDto {

    private UUID uuid;
    private String name;

}
