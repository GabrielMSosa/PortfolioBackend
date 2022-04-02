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
public class Skills {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long  id;

        private String lenguaje;
        private String info;
        private String nivel;
        private String urlImg;

    public Skills() {
    }

    public Skills(Long id, String lenguaje, String info, String nivel, String urlImgString) {
        this.id = id;
        this.lenguaje = lenguaje;
        this.info = info;
        this.nivel = nivel;
        this.urlImg = urlImg;
    }
    
    
    
    
}
