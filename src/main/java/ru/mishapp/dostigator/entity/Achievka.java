package ru.mishapp.dostigator.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "achievkas")
public class Achievka {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "achievka_seq")
    @SequenceGenerator(name = "achievka_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "achievkas")
    private List<User> users = new ArrayList<>();

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Achievka{" +
                "description='" + description + '\'' +
                '}';
    }
}