package ZUT.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/roles"})
public class RoleController {
    private final RoleService roleService;
    @Autowired
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping({"/{id}"})
    public Role getRole(@PathVariable Long id) {
        return roleService.getById(id);
    }

    @PostMapping("/add")
    public Role addRole(@RequestBody Role role) {
        return this.roleService.addRole(role);
    }

    @PutMapping({"/{id}"})
    public Role updateRole(@PathVariable Long id, @RequestBody Role roleDetails) {
        return this.roleService.updateRole(id, roleDetails);
    }

    @DeleteMapping({"/{id}"})
    public  ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        if(roleService.delete(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
