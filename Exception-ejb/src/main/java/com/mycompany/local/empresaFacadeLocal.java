/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.local;

import com.mycompany.entitys.empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface empresaFacadeLocal {

    void create(empresa empresa);

    void edit(empresa empresa);

    void remove(empresa empresa);

    empresa find(Object id);

    List<empresa> findAll();

    List<empresa> findRange(int[] range);

    int count();
    
}
