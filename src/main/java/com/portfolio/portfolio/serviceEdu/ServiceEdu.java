/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.serviceEdu;

import com.portfolio.portfolio.model.Educacion;
import com.portfolio.portfolio.repository.IrepoEdu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiceEdu implements IServiceEdu{

    @Autowired
    private IrepoEdu repo;

    @Override
    public List<Educacion> traerTodo() {
     return repo.findAll();
    }

    @Override
    public void borrarEdu(Long id) {
       repo.deleteById(id);
    }

    @Override
    public void crearEdu(Educacion dato) {
       repo.save(dato);
    }

    @Override
    public Educacion traerPorId(Long id) {
        return repo.getById(id);       
    }
    
    
}
