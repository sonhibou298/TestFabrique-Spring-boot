package sn.simplon.gestionfabrique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.simplon.gestionfabrique.entities.Apprenant;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
}
