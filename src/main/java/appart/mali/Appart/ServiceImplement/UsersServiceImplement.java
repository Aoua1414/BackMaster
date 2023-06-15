package appart.mali.Appart.ServiceImplement;

import appart.mali.Appart.Model.Users;
import appart.mali.Appart.Repository.UsersRepository;
import appart.mali.Appart.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
  public class UsersServiceImplement  implements UsersService {
    public Users users;

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public Users ajouter(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users modifier(Long id, Users users) {
        return usersRepository.findById(id)
                .map(users1 -> {
                    users1.setNumero(users.getNumero());
                    users1.setNom_renom(users.getNom_renom());
                    users1.setPassword(users.getPassword());
                    return usersRepository.save(users1);
                }).orElseThrow(()->new RuntimeException("User inexistant")
                );

    }

    @Override
    public String supprimer(Long id) {
        usersRepository.deleteById(id);
        return "supprime avec succes";
    }

    @Override
    public List<Users> afficher() {
        return usersRepository.findAll();
    }
}

