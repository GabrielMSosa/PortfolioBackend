/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.serviceIdioma;

import com.portfolio.portfolio.model.Idioma;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IServiceIdioma {
    
  

  public List<Idioma> traerTodo();
  
  
  public void borrarIdiom(Long id);
  
  public void crearIdio(Idioma dato);
  
  public Idioma traerPorId(Long id);
  
    
    
    
    
    
}
