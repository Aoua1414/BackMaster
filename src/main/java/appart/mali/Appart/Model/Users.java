package appart.mali.Appart.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;
    private String nom_renom;
    private String numero;
    private String password;

    @ManyToOne
    private Statut statut;
    @ManyToOne
    private Role role;





}
