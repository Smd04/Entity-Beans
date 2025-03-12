package org.example;

import org.example.Paper;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Paper> paper = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Paper> getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper.add(paper);
    }
}
