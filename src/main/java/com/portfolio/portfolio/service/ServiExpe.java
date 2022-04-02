/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiencias;
import com.portfolio.portfolio.repository.IrepoExpe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiExpe implements IserviExpe {
    
    @Autowired
    private IrepoExpe repo;

    @Override
    public List<Experiencias> traerTodo() {
        return repo.findAll();
    }

    @Override
    public void borrarExpe(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void crearExpe(Experiencias dato) {
        repo.save(dato);
    }

    @Override
    public Experiencias traerPorId(Long id) {
    return repo.getById(id);
    }
    
    
    
}
