package branches01;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tatig
 */
public class Partitura {
    private String nombre; 
    private boolean solista; 
    private String voz; 
    private String arreglista; 
    private int tempo; 
    private String clave; 
    private String armadura;
    private String compas; 

    public Partitura() {
    }
    
    public Partitura(String nombre, boolean solista, String voz, String arreglista, int tempo, String clave, String armadura, String compas) {
        this.nombre = nombre;
        this.solista = solista;
        this.voz = voz;
        this.arreglista = arreglista;
        this.tempo = tempo;
        this.clave = clave;
        this.armadura = armadura;
        this.compas = compas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSolista() {
        return solista;
    }

    public void setSolista(boolean solista) {
        this.solista = solista;
    }

    public String getVoz() {
        return voz;
    }

    public void setVoz(String voz) {
        this.voz = voz;
    }

    public String getArreglista() {
        return arreglista;
    }

    public void setArreglista(String arreglista) {
        this.arreglista = arreglista;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getCompas() {
        return compas;
    }

    public void setCompas(String compas) {
        this.compas = compas;
    }
    
    

    @Override
    public String toString() {
        if (solista) {
            return "Nombre: " + nombre + " - Voz: " + voz + " - Arreglista: " + arreglista + " - Tempo: " + tempo + " - Clave: " + clave + " - Armadura: " + armadura +  " - Compas: " + compas ;
        }
        return "Nombre: " + nombre +" - Arreglista: " + arreglista + " - Tempo: " + tempo + " - Clave: " + clave + " - Armadura: " + armadura + " - Compas: " + compas;
    }
    
}
