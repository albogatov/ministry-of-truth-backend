package itmo.abogatov.ministryoftruthbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseMessageEntity implements Serializable {
    private String message;
    private Integer accessLevel;
    private String authToken;


    public ResponseMessageEntity(String message) {
        this.message = message;
    }

    public ResponseMessageEntity(String message, Integer accessLevel) {
        this.message = message;
        if (accessLevel != null)
        this.accessLevel = accessLevel;
        else this.accessLevel = 1;
    }
}