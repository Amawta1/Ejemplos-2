/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author amawt
 */
public class Director extends Persona {
    
   private String nacionalidad;
    private int yearsTrayectoria;

    public String mostrarInfoDirectorTecnico(){
        return "Es de nacionalidad"
                +this.nacionalidad + " tiene "+this.yearsTrayectoria
                +" años de trayectoria";
    }



    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }



    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }
    
}
