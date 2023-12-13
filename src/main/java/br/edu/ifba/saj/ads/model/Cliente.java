package br.edu.ifba.saj.ads.model;
import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
@Entity
@NamedQuery(name = "Cliente.containsInName", 
            query = "from Cliente where nome like CONCAT('%', CONCAT(:nome, '%'))")
public class Cliente extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;
    public String nome;
}