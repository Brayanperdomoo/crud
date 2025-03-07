package com.sena.crud_basic.model;
import java.util.Set;

import java.text.DecimalFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity(name = "service")
public class servicieDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicie_ID")
    private int servicie_ID;

    @Column(name="type",nullable = false,length = 100)
    private String type;
// agregar la n cantidad de columnas

    @Column(name="cost",nullable = false,length = 15)
    private DecimalFormat cost;

    @ManyToOne
    @JoinColumn(name= "employeed_ID")
    private employeeDTO employeed_ID;

    @ManyToMany(mappedBy = "service")
    private Set<clientDTO> client;

    public int getServicie_ID() {
        return servicie_ID;
    }

    public void setServicie_ID(int servicie_ID) {
        this.servicie_ID = servicie_ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DecimalFormat getCost() {
        return cost;
    }

    public void setCost(DecimalFormat cost) {
        this.cost = cost;
    }

    public employeeDTO getEmployeed_ID() {
        return employeed_ID;
    }

    public void setEmployeed_ID(employeeDTO employeed_ID) {
        this.employeed_ID = employeed_ID;
    }

    public Set<clientDTO> getClient() {
        return client;
    }

    public void setClient(Set<clientDTO> client) {
        this.client = client;
    }




}
