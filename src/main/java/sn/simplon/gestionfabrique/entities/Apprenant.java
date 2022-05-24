package sn.simplon.gestionfabrique.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@ToString
@Entity
public class Apprenant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "matricule")
    private String matricule;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
}
