/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rpl_pert6.repository;

import com.mycompany.rpl_pert6.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Muhammad Ferdy
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer>{
    
}
