/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.serviceEdu;

import com.portfolio.portfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IServiceEdu {
    
    
  public List <Educacion> traerTodo();
  
  
  public void borrarEdu(Long id);
  
  public void crearEdu(Educacion dato);
  
  public Educacion traerPorId(Long id);

    
    
    
}
