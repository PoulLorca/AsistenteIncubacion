/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Eduardo
 */
public class Nacimiento {
    private final IntegerProperty hCargados = new SimpleIntegerProperty();
    private final IntegerProperty pPrimera = new SimpleIntegerProperty();
    private final IntegerProperty pSegunda = new SimpleIntegerProperty();
    private final IntegerProperty pDesecho = new SimpleIntegerProperty();

    public Nacimiento() {
    }

    public IntegerProperty getHCargados() {
        return hCargados;
    }
    
    public void setHCargados(int value){
        this.hCargados.set(value);
    }        

    public IntegerProperty getPPrimera() {
        return pPrimera;
    }
    
    public void setPPrimera(int value){
        this.pPrimera.set(value);
    }

    public IntegerProperty getPSegunda() {
        return pSegunda;
    }
    
    public void setPSegunda(int value){
        this.pSegunda.set(value);
    }

    public IntegerProperty getPDesecho() {
        return pDesecho;
    }
    
    public void setPDespachado(int value){
        this.pDesecho.set(value);
    }
    
    
    
}
