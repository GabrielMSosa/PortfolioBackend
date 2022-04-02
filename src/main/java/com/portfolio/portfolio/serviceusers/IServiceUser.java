/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.serviceusers;

import com.portfolio.portfolio.model.User;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IServiceUser {


  public List<User> traerTodo();
  
  
  public void borrarExpe(Long id);
  
  public void crearExpe(User dato);
  
  public User traerPorId(Long id);



    
}
