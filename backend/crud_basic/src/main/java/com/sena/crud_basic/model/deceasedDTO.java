package com.sena.crud_basic.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "deceased")
public class deceasedDTO {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deceased")
    private int deceased;

    @Column(name="name",nullable = false,length = 100)
    private String name;
// agregar la n cantidad de columnas

    @Column(name="death_date",nullable = false,length = 15)
    private Date death_date;

    @ManyToOne
    @JoinColumn(name= "client_ID")
    private clientDTO client_ID;

    public int getDeceased() {
        return deceased;
    }

    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeath_date() {
        return death_date;
    }

    public void setDeath_date(Date death_date) {
        this.death_date = death_date;
    }

    public clientDTO getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(clientDTO client_ID) {
        this.client_ID = client_ID;
    }

    



}
