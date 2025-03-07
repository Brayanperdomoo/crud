package com.sena.crud_basic.model;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name = "client")
public class clientDTO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_ID")
    private int client_ID;

    @Column(name="name",nullable = false,length = 100)
    private String name;
// agregar la n cantidad de columnas

    @Column(name="phone",nullable = false,length = 15)
    private String phone;

    
    @Column(name="address",nullable = false,length = 255)
    private String address;

    @ManyToMany
    @JoinTable(name = "client_service",
    joinColumns=@JoinColumn(name = "client_ID"),
    inverseJoinColumns=@JoinColumn(name = "service_ID"))
    private Set<servicieDTO> service;


    
    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<servicieDTO> getService() {
        return service;
    }

    public void setService(Set<servicieDTO> service) {
        this.service = service;
    }

}
