/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ahmed.app.dal.repository.impl;

import net.ahmed.app.dal.entity.Student;
import net.ahmed.app.dal.repository.AbstractRepo;

/**
 *
 * @author Ahmed Hafez
 */
public class StudentRepo extends AbstractRepo<Student>{
    
    public StudentRepo() {
        super(Student.class);
    }
    
}