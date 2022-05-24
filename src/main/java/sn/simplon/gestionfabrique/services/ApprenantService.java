package sn.simplon.gestionfabrique.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.simplon.gestionfabrique.entities.Apprenant;
import sn.simplon.gestionfabrique.repositories.ApprenantRepository;

import java.util.List;
@Data
@Service
public class ApprenantService {
    @Autowired
    private ApprenantRepository apprenantRepository;

    public List<Apprenant> getAll(){
        return apprenantRepository.findAll();
    }
}
