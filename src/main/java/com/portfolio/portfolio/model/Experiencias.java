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
public class Experiencias {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String trabajo ;
    private String empresa;
    private Long FechaIni;
    private Long FechaFin;
    private String deltaanio;
    private String Localidad;
    private String Provincias;
    private String Pais;
    private String UriImg;

    public Experiencias() {
    }

    public Experiencias(Long id, String trabajo, String empresa, Long FechaIni, Long FechaFin, String deltaanio, String Localidad, String Provincias, String Pais, String UriImg) {
        this.id = id;
        this.trabajo = trabajo;
        this.empresa = empresa;
        this.FechaIni = FechaIni;
        this.FechaFin = FechaFin;
        this.deltaanio = deltaanio;
        this.Localidad = Localidad;
        this.Provincias = Provincias;
        this.Pais = Pais;
        this.UriImg = UriImg;
    }

    @Override
    public String toString() {
        return "Experiencias{" + "id=" + id + ", trabajo=" + trabajo + ", empresa=" + empresa + ", FechaIni=" + FechaIni + ", FechaFin=" + FechaFin + ", deltaanio=" + deltaanio + ", Localidad=" + Localidad + ", Provincias=" + Provincias + ", Pais=" + Pais + ", UriImg=" + UriImg + '}';
    }
    
    
    
}
