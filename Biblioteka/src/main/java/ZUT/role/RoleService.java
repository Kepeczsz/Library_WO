package ZUT.role;

import ZUT.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public Role addRole(Role role){
        return roleRepository.save(role);
    }
    public Role getById(Long id) {
        return roleRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Role not found with id " + id));
    }
    public Role updateRole(Long id, Role roleDetails) {
        Role role = this.getById(id);
        role.setName(roleDetails.getName());
        return roleRepository.save(role);
    }
    public String delete(Long id) {
            roleRepository.deleteById(id);
        return "(CODE 200)\n";
    }
}
