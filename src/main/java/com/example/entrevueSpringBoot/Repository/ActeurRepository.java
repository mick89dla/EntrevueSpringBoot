package com.example.entrevueSpringBoot.Repository;

import com.example.entrevueSpringBoot.Entity.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<Acteur,Long> {
}
