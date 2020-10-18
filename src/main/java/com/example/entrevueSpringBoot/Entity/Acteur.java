package com.example.entrevueSpringBoot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "acteur")
public class Acteur {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
}
