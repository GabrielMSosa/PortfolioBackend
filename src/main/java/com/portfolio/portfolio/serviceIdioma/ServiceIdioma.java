/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.serviceIdioma;

import com.portfolio.portfolio.model.Idioma;
import com.portfolio.portfolio.repository.IrepoIdioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiceIdioma implements IServiceIdioma {

    @Autowired
    private IrepoIdioma repo;
    
    @Override
    public List<Idioma> traerTodo() {
      return repo.findAll();
    }

    @Override
    public void borrarIdiom(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void crearIdio(Idioma dato) {
        repo.save(dato);
    }

    @Override
    public Idioma traerPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
