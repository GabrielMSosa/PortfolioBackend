/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Entity
@Setter @Getter 
public class User {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
              private Long  id;
             
                
              private String nombre;
              private String apellido;
              private String telefono;
              private String email;
              private String edad;
              private String acercademi;
              private String urlImg;

    public User() {
    }

    public User(Long id, String nombre, String apellido, String telefono, String email, String edad, String acercademi, String urlImg) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.acercademi = acercademi;
        this.urlImg = urlImg;
    }



    
}
