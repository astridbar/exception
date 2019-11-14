/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.local;

import com.mycompany.entitys.empresa;
import com.mycompany.entitys.persona;
import com.mycompany.exception.Excepciones;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface TransaccionLocal {
    //transaccionales
    
    void crearTransaccionalR(persona persona,empresa empresa)throws Excepciones ;
    void crearTransaccionalRN(persona persona,empresa empresa,int numero1,int numero2,int numero3)throws Excepciones;
    void crearTransaccionalSN(persona persona,empresa empresa,int numero1,int numero2,int numero3)throws Excepciones;
    void crearTransaccionalS(persona persona,empresa empresa)throws Excepciones;
    void crearTransaccionall(persona persona,empresa empresa,int numero1)throws Excepciones;
     void crearTransaccionalp(persona persona,empresa empresa,String nombre)throws Excepciones;
}


