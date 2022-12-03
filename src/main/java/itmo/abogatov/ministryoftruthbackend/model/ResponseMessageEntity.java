package itmo.abogatov.ministryoftruthbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseMessageEntity implements Serializable {
    private String message;
}