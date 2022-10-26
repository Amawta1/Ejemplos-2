/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author amawt
 */
public class Seleccion {
    
    private String codigoFIFA;
    private String nombre;
    private int participacionesMundial;
    private Director seleccionador;



    public String obtienePais(){
        var retorno="Desconocido";

        switch (codigoFIFA) {
            case "ECU":
                retorno="ECUADOR";
                break;
            case "ARG":
                retorno="ARGENTINA";
                break;
            case "BRA":
                retorno="BRASIL";
                break;
            case "CHI":
                retorno="CHILE";
                break;

            default:
                throw new AssertionError();
        }

        return retorno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre(){
        return this.nombre;
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    public void setCodigoFIFA(String codigoFIFA) {
        this.codigoFIFA = codigoFIFA;
    }

    public int getParticipacionesMundial() {
        return participacionesMundial;
    }

    public void setParticipacionesMundial(int participacionesMundial) {
        this.participacionesMundial = participacionesMundial;
    }

    public Director getSeleccionador() {
        return seleccionador;
    }

    public void setSeleccionador(Director seleccionador) {
        this.seleccionador = seleccionador;
    }

    
}
