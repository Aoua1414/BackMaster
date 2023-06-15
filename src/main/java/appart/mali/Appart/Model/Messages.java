package appart.mali.Appart.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Messages {
    private  String message;
    private  Boolean status;
    public  static Messages set(String message, Boolean status){

        return new Messages(message, status);
    }
}
