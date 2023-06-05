package appart.mali.Appart.Repository;

import appart.mali.Appart.Model.Appartements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppartRepository extends JpaRepository <Appartements, Long> {
}
