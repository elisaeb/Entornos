/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.herenciaobject.equals;

/**
 *
 * @author alumnot
 */

import java.time.LocalDate;
import java.util.Objects;

public class Persona extends Object implements NUEVAINTERFAZ{

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
/**
 * devuelve un nombre
 * @return 
 */
    public String getNombre() {
        return nombre;
    }

/**
 * recibe el nombre
 * @param nombre 
 */    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
 * devuelve un apellido
 * @return 
 */
    @Override
    public String getApellidos() {
        return apellidos;
    }

/**
 * recibe un apellido
 * @param apellidos 
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

/**
 * devuelve fecha de nacimiento
 * @return 
 */
    @Override
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
/**
 * recibe fecha de nacimiento
 * @param fechaNacimiento 
 */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

/**
 * recibe un objeto, lo compara y devulve true/false
 * @param obj
 * @return 
 */    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        // casteamos a la clase correcta
        Persona p = (Persona) obj;

        /*return Objects.equals(nombre, p.nombre) && Objects.equals(apellidos, p.apellidos) 
            && Objects.equals(fechaNacimiento, p.fechaNacimiento);*/
        
        return this.nombre.equalsIgnoreCase(p.nombre) && this.apellidos.equalsIgnoreCase(p.apellidos) && this.fechaNacimiento.equals(p.fechaNacimiento);

    }
/**
 * devuelve la inforomacion de la persona
 * devuelve los datos de arriba
 * @return 
 */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    

}
