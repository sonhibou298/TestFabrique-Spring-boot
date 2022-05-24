package sn.simplon.gestionfabrique;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import sn.simplon.gestionfabrique.entities.Apprenant;
import sn.simplon.gestionfabrique.repositories.ApprenantRepository;

import java.util.Date;

@SpringBootTest
class GestionFabriqueApplicationTests {
    @Autowired
    private ApprenantRepository apprenantRepository;
    @Test
    void contextLoads() {
    }

   @Test
    public void testAjout(){
       apprenantRepository.save(new Apprenant(null, "Ap-004", "Sougou", "Malick", new Date()));
       apprenantRepository.save(new Apprenant(null, "Ap-002", "Gueye", "Mansour", new Date()));
       apprenantRepository.save(new Apprenant(null, "Ap-003", "Cisse", "Fatou", new Date()));
       apprenantRepository.save(new Apprenant(null, "Ap-005", "Sall", "Oumy", new Date()));

   }
}
