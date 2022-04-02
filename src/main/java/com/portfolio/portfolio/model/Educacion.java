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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String institucion;
    private String titulo;
    private String fechaIni;
    private String fechaFin;
    private String estado;
    private String uriImg;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String titulo, String fechaIni, String fechaFin, String estado, String uriImg) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.uriImg = uriImg;
    }
    
    
    
}
