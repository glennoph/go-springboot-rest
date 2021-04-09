package go.springboot.rest.gospringbootrest.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Prod1Dto {

    private UUID uuid;
    private String name;
    private String type;
    private Long upc;

}
