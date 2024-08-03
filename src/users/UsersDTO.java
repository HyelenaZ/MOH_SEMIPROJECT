package users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsersDTO {
    private String user_id;
    private String password;
    private int age;
}
