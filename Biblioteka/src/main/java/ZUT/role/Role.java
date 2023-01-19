package ZUT.role;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private int Id;
    private String name;
}
