/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.serviceSkill;

import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.repository.IrepoSkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiceSkill implements IServiSkill {
        @Autowired
        private IrepoSkill repo;
        
    @Override
    public List<Skills> traerTodo() {
      return repo.findAll();
    }

    @Override
    public void borrarSkill(Long id) {
          repo.deleteById(id);
    }

    @Override
    public void crearSkill(Skills dato) {
    
        repo.save(dato);

    }

    @Override
    public Skills traerPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    
}
