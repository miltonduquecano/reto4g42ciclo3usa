/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.Repositorio;

import com.usa.Interface.CategoryInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.Modelo.Category;
import java.util.Optional;

/**
 *
 * @author USUARIO
 */

@Repository

public class CategoryRepository {
    @Autowired
    private CategoryInterface extencionesCrud;
    
    public List<Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }
    
    public Category save(Category category){
        return extencionesCrud.save(category);
    }
    
    public void delete(Category category){
        extencionesCrud.delete(category);
    }
    
    
}
