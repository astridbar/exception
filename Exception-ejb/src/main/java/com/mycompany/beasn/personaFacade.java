/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beasn;

import com.mycompany.entitys.empresa;
import com.mycompany.local.personaFacadeLocal;
import com.mycompany.entitys.persona;
import com.mycompany.exception.Eceptionuno;
import com.mycompany.exception.Exceptiondos;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class personaFacade extends AbstractFacade<persona> implements personaFacadeLocal {
    @PersistenceContext(unitName = "universidad_Exception-ejb_ejb_1.0.10-SNAPSHOTPU")
    private EntityManager em;
    private int respuesta;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public personaFacade() {
        super(persona.class);
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void create(persona persona,empresa empresa)throws Eceptionuno {
      create(persona,empresa);
      
             if(persona.getNombre().contains("@"+","+"."+"1,2,3,4,5,6,7")){
            throw new Eceptionuno("El campo nombre no puede contener el caracteres y numeros");
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar1(persona persona,int numero1,int numero2,int numero3) throws Exceptiondos{
        create(persona);
        
        if(numero3 == 0){
            throw new Exceptiondos("el numero ingresados no puede ser 0.");
        }else{
            System.out.println("Resultado: "+ ((numero1+numero2)*numero3));
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar2(persona persona,int numero1,int numero2,int numero3) throws ArithmeticException {
        create(persona);
        if((numero1 != numero2)&&(numero1 != numero3)&&(numero3 != numero2))
            throw new ArithmeticException();
        else
            System.out.println("Resultado: "+((numero1*numero2) / numero3));
    }
    
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar3(persona persona) throws IOException {
        create(persona);
        try{
        Desktop archivo = Desktop.getDesktop();
        archivo.open(new File("archivo.txt"));
        }catch(Exception e){
            try {
                throw new Exception("Archivo no existe.");
            } catch (Exception ex) {
                Logger.getLogger(personaFacade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar4(persona persona,int numero1) throws IllegalArgumentException {
        create(persona);
        if(numero1 < 0 || numero1 > 100)
         throw new IllegalArgumentException(Integer.toString(numero1));
      else
         respuesta = numero1;
         System.out.println("Resultado: "+(respuesta));
    }
   
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregar5(persona persona, String nombre) throws NullPointerException{
        create(persona);
        if(nombre.equals(""))
            throw new NullPointerException("El nombre de la persona no puede ir vacio");
    }
    
//    @Override
//    @TransactionAttribute(TransactionAttributeType.REQUIRED)
//    public void agregar6(persona persona, String nombre) throws  ClassCastException{
//        create(persona);
//    }
}
