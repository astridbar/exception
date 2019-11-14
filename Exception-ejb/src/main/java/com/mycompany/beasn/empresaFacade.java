/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beasn;

import com.mycompany.local.empresaFacadeLocal;
import com.mycompany.entitys.empresa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class empresaFacade extends AbstractFacade<empresa> implements empresaFacadeLocal {
    @PersistenceContext(unitName = "universidad_Exception-ejb_ejb_1.0.10-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public empresaFacade() {
        super(empresa.class);
    }
    
}
