/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiencias;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IserviExpe {


  public List<Experiencias> traerTodo();
  
  
  public void borrarExpe(Long id);
  
  public void crearExpe(Experiencias dato);
  
  public Experiencias traerPorId(Long id);
  
 





    
}

