/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.herenciaobject.equals;

/**
 *
 * @author alumnot
 */
public class Coche {
	
	private String marca;
	private String modelo;
	private String motorizacion;
	
	
	public Coche(String marca, String modelo, String motorizacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacion = motorizacion;
	}

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMotorizacion() {
        return this.motorizacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotorizacion(String motorizacion) {
        this.motorizacion = motorizacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


	
	
	
	

}