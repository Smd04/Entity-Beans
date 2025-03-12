package org.example;

import org.example.Adress;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("simo");
        EntityManager em = emf.createEntityManager();

        //ONE TO ONE

//        Adress address = new Adress();
//        address.setCity("San Francisco");
//        address.setAdresse("zn9at lb3ab3");
//        Etudiant etudiant = new Etudiant();
//        etudiant.setAge(20);
//        etudiant.setNom("John Doe");
//        etudiant.setAdresse(address);
//        em.getTransaction().begin();
//        em.persist(etudiant);
//        em.persist(address);
//        em.getTransaction().commit();

        //ONE TO MANY

//        Book book = new Book();
//        book.setTitle("Java");
//        Paper paper = new Paper();
//        paper.setTitle("Paper");
//        book.setPaper(paper);
//        em.getTransaction().begin();
//        em.persist(book);
//        em.persist(paper);
//        em.getTransaction().commit();
//        em.close();
//        emf.close();

        //MANY TO MANY

        Cours cours = new Cours();
        Student student = new Student();
        cours.setName("Cours");
        cours.setStudent(student);
        student.setCours(cours);
        student.setName("Student");
        student.setAge(20);
        em.getTransaction().begin();
        em.persist(student);
        em.persist(cours);
        em.getTransaction().commit();
        em.close();
        emf.close();




//        em.getTransaction().begin();
//        em.remove(em.find(Student.class, 1));
//        em.getTransaction().commit();
//        em.close();
//        emf.close();



    }
}