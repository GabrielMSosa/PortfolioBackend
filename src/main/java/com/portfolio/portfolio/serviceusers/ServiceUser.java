/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.serviceusers;

import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.repository.IrepoUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiceUser implements IServiceUser {

    @Autowired 
    IrepoUser repo;
    
    
    @Override
    public List<User> traerTodo() {
        return repo.findAll();
    }

    @Override
    public void borrarExpe(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void crearExpe(User dato) {
    repo.save(dato);
    }

    @Override
    public User traerPorId(Long id) {
    return repo.getById(id);    
    }
    
}
