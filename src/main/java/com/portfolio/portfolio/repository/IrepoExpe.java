/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sosag
 */
public interface IrepoExpe extends JpaRepository<Experiencias, Long> {
    
}
