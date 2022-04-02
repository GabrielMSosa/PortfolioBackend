
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.serviceSkill;

import com.portfolio.portfolio.model.Skills;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IServiSkill {
    
    
  public List<Skills> traerTodo();
  
  
  public void borrarSkill(Long id);
  
  public void crearSkill(Skills dato);
  
  public Skills traerPorId(Long id);
  
    
    
}
