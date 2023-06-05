package pl.wszib.pizzamarket.web.models;

import jakarta.persistence.Column;

public class OpinionModel {

    public Long id;


    public String name;


    public String opinion;

    public OpinionModel(Long id, String name, String opinion) {
        this.id = id;
        this.name = name;
        this.opinion = opinion;
    }

    public OpinionModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
