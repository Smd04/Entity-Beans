package org.example;

import org.example.Adress;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="etudiant")
public class Etudiant implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToOne(cascade = CascadeType.ALL)
    private Adress adresse;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adress getAdresse() {
        return adresse;
    }

    public void setAdresse(Adress adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
