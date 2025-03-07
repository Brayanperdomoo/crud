package com.sena.crud_basic.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Para indicar que la clase es un modelo, se utiliza
 * la anotación bean @Entity
 * name=El nombre de la entidad en la base datos
 */
@Entity(name = "employee")
public class employeeDTO {
    /*
     * DTO= Data Transfer Object
     * las clases DTO contienen las entidades de la base
     * de datos
     */
    //id=PRIMARY KEY
    //GeneratedValue=Auto incremental
    //@Column=para indicar que el atributo es una columna
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_ID")
    private int Employee_ID;

    @Column(name="name",nullable = false,length = 100)
    private String name;
// agregar la n cantidad de columnas

    @Column(name="position",nullable = false,length = 100)
    private String position;

    
    @Column(name="phone",nullable = false,length = 15)
    private String phone;


    public int getEmployee_ID() {
        return Employee_ID;
    }


    public void setEmployee_ID(int employee_ID) {
        Employee_ID = employee_ID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    



}
