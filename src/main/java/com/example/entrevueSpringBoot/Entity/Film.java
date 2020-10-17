package com.example.entrevueSpringBoot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Film {
    @Id @GeneratedValue
    private Long id;
    private String titre;
    private String description;
    @OneToMany(targetEntity = Acteur.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fa_fk", referencedColumnName = "id")
    private List<Acteur> acteurs;
}
