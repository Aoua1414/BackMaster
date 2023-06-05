package appart.mali.Appart.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Appartements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;
    private String ville;
    private String quartier;
    private Integer nbreChambre;
    private Integer nreSalon;
    private Integer nbreToilette;
    private Float prixParJour;
    private Float prixParMois;
    private Float prixParAn;
    private String autreInfo;
    private String nomProprio;
    private Integer numProprio;
    private String adresseProprio;

  @ManyToOne
    private Users user;

}
