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
@Getter @Setter
public class Idioma {
    

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String idioma;
        private String nivel_lectura;
        private String nivel_escritura;  

    public Idioma(Long id, String idioma, String nivel_lectura, String nivel_escritura) {
        this.id = id;
        this.idioma = idioma;
        this.nivel_lectura = nivel_lectura;
        this.nivel_escritura = nivel_escritura;
    }

    public Idioma() {
    }

    
    
    
    
    
    
    
}
