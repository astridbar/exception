/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beasn;

import com.mycompany.local.TransaccionLocal;
import com.mycompany.entitys.empresa;
import com.mycompany.entitys.persona;
import com.mycompany.exception.Eceptionuno;
import com.mycompany.exception.Excepciones;
import com.mycompany.exception.Exceptiondos;
import com.mycompany.local.empresaFacadeLocal;
import com.mycompany.local.personaFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author astrid
 * 
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class Transaccion implements TransaccionLocal {
    
    @EJB
    private  empresaFacadeLocal empresafacade;   
    
    @EJB
    private personaFacadeLocal personafacade;
 
    
    /**
     *
     * @param persona
     * @param empresa
     * @throws Excepciones
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearTransaccionalR(persona persona,empresa empresa)throws Excepciones {
    try{
        personafacade.create(persona, empresa);
    }
    catch(Eceptionuno e){
    throw new Excepciones(e.getMessage());
    
    }
    
    
    }
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearTransaccionalRN(persona persona,empresa empresa,int numero1,int numero2,int numero3)throws Excepciones {
      try{
        personafacade.agregar1(persona, numero1, numero2, numero3);
        empresafacade.create(empresa);
    }
    catch(Exceptiondos e){
    throw new Excepciones(e.getMessage());
    
    }
    
    
    
    
    }
    @Override
     @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearTransaccionalSN(persona persona,empresa empresa,int numero1,int numero2,int numero3)throws Excepciones{
       try{
        personafacade.agregar2(persona,numero1, numero2, numero3);
        empresafacade.create(empresa);
    }
    catch(Exception e){
    throw new Excepciones(e.getMessage());
    
    }
    
    }
    
    /**
     *
     * @param persona
     * @param empresa
     * @throws Excepciones
     */
    @Override
     @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearTransaccionalS(persona persona,empresa empresa)throws Excepciones{
    try{    
     personafacade.agregar3(persona);
     empresafacade.create(empresa);
    }
    catch(Exception e){
    throw new Excepciones(e.getMessage());
    
    }}

    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void crearTransaccionall(persona persona,empresa empresa,int numero1)throws Excepciones{
    try{    
     personafacade.agregar4(persona, numero1);
     empresafacade.create(empresa);

    }
    catch(Exception e){
    throw new Excepciones(e.getMessage());
    
    }}
    
    public void crearTransaccionalp(persona persona,empresa empresa,String nombre)throws Excepciones{
        try{    
     personafacade.agregar5(persona, nombre);
     empresafacade.create(empresa);

    }
    catch(Exception e){
    throw new Excepciones(e.getMessage());
    
    }} 
  }
