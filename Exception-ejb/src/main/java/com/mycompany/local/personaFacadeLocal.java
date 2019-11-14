/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.local;

import com.mycompany.entitys.empresa;
import com.mycompany.entitys.persona;
import com.mycompany.exception.Eceptionuno;
import com.mycompany.exception.Exceptiondos;
import java.io.IOException;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface personaFacadeLocal {

    void create(persona persona,empresa empresa)throws Eceptionuno ;
   
    void agregar1(persona persona,int numero1,int numero2,int numero3)throws Exceptiondos;
    
    void agregar2(persona persona,int numero1,int numero2,int numero3)throws ArithmeticException;
    
    void agregar3(persona persona) throws IOException;
    
    void agregar4(persona persona,int numero1)throws IllegalArgumentException ;
    
    void agregar5(persona persona,String nombre)throws NullPointerException ;
    
//    void agregar6(persona persona,String nombre)throws  ClassCastException;
}
