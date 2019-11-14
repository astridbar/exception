/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mycompany.entitys.empresa;
import com.mycompany.entitys.persona;
import com.mycompany.exception.Excepciones;
import com.mycompany.local.TransaccionLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author astrid
 */
@Named
@RequestScoped
public class index implements Serializable{
    private String nombre;
    private String empresa;
    private int numero1;
    private int numero2;
    private int numero3;
    
    @EJB
    TransaccionLocal transaccion;

    persona persona;
    private List<persona> listaA;

    empresa empres;
    private List<empresa> listaL;
    
 public void agregar(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
        try{
          transaccion.crearTransaccionalR(person, empresas);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregar1(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
        
        try{
          transaccion.crearTransaccionalRN(person, empresas, numero1, numero2, numero3);
          FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregar2(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
       try{
            transaccion.crearTransaccionalSN(person, empresas, numero1, numero2, numero3);
           FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregar3(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
       try{
          transaccion.crearTransaccionalS(person, empresas);
          FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
      public void agregar4(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
       try{
          transaccion.crearTransaccionall(person, empresas, numero1);
          FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
      public void agregar5(){
        persona person = new persona(nombre);
        empresa empresas= new empresa(empresa);
       try{
          transaccion.crearTransaccionalp(persona, empresas, nombre);
          FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(Excepciones ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public TransaccionLocal getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(TransaccionLocal transaccion) {
        this.transaccion = transaccion;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public List<persona> getListaA() {
        return listaA;
    }

    public void setListaA(List<persona> listaA) {
        this.listaA = listaA;
    }

    public empresa getEmpres() {
        return empres;
    }

    public void setEmpres(empresa empres) {
        this.empres = empres;
    }

    public List<empresa> getListaL() {
        return listaL;
    }

    public void setListaL(List<empresa> listaL) {
        this.listaL = listaL;
    }
      
      
      
    
}

