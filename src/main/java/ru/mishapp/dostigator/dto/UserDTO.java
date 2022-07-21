package ru.mishapp.dostigator.dto;

import java.util.List;

public class UserDTO {
    private Long id;
    private String name;
    private List<String> achievkas;


    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getAchievkas() {
        return this.achievkas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAchievkas(List<String> achievkas) {
        this.achievkas = achievkas;
    }
}
