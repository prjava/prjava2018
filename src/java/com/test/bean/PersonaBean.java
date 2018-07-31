package com.test.bean;

import com.test.dao.PersonaDao;
import com.test.modelo.Persona;
//import javax.annotation.ManagedBean;
//import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//@Named(value = "personaBean")
@Dependent
@ViewScoped
@ManagedBean

public class PersonaBean {
    
private Persona persona = new Persona();

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void registrar() throws Exception {
        System.out.println("llego");
        System.out.println("Nombre: " + persona.getNombre());
        PersonaDao dao;
        
        try {
            dao = new PersonaDao();
            dao.registrar(persona);
        } catch (Exception e) {
            throw e;
        }
    }
   
    
}



