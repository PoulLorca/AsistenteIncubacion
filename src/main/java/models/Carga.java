/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Poul
 */
public class Carga {

    private final IntegerProperty preSaldo = new SimpleIntegerProperty();
    private final IntegerProperty saldo = new SimpleIntegerProperty();
    private final IntegerProperty postSaldo = new SimpleIntegerProperty();
    private final IntegerProperty inutilizado = new SimpleIntegerProperty();
    private final IntegerProperty venta = new SimpleIntegerProperty();
    private final IntegerProperty trizado = new SimpleIntegerProperty();
    private BooleanProperty isLast = new SimpleBooleanProperty();

    // Crear la propiedad intermedia
    private StringProperty displaySaldo = new SimpleStringProperty();
    private final StringProperty differenceMessage = new SimpleStringProperty();

    public Carga() {
        isLast.set(false);

        // Actualizar displaySaldo cuando cambie preSaldo, postSaldo o isLast
        preSaldo.addListener((observable, oldValue, newValue) -> updateDisplaySaldo());
        postSaldo.addListener((observable, oldValue, newValue) -> updateDisplaySaldo());
        isLast.addListener((observable, oldValue, newValue) -> updateDisplaySaldo());

        // agrega el Runnable como un listener a cada propiedad
        preSaldo.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());
        postSaldo.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());
        inutilizado.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());
        venta.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());
        trizado.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());
        saldo.addListener((observable, oldValue, newValue) -> updateDifferenceMessage.run());

        // Llama al método inicialmente para establecer el valor correcto
        updateDisplaySaldo();
    }

    public final int getPreSaldo() {
        return preSaldo.get();
    }

    public void setPreSaldo(int value) {
        preSaldo.set(value);
    }

    public IntegerProperty preSaldoPropery() {
        return preSaldo;
    }

    public final int getSaldo() {
        return saldo.get();
    }

    public final void setSaldo(int value) {
        saldo.set(value);
    }

    public IntegerProperty saldoProperty() {
        return saldo;
    }

    public final int getPostSaldo() {
        return postSaldo.get();
    }

    public void setPostSaldo(int value) {
        postSaldo.set(value);
    }

    public IntegerProperty postSaldoProperty() {
        return postSaldo;
    }

    public final int getInutilizado() {
        return inutilizado.get();
    }

    public final void setInutilizado(int value) {
        inutilizado.set(value);
    }

    public IntegerProperty inutilizadoProperty() {
        return inutilizado;
    }

    public final int getVenta() {
        return venta.get();
    }

    public final void setVenta(int value) {
        venta.set(value);
    }

    public IntegerProperty ventaProperty() {
        return venta;
    }

    public final int getTrizado() {
        return trizado.get();
    }

    public final void setTrizado(int value) {
        trizado.set(value);
    }

    public IntegerProperty trizadoProperty() {
        return trizado;
    }

    public BooleanProperty isLastProperty() {
        return isLast;
    }

    public void setIsLast(boolean isLast) {
        this.isLast.set(isLast);
    }

    public boolean getIsLast() {
        return this.isLast.get();
    }

    public StringProperty differenceMessageProperty() {
        return differenceMessage;
    }

    public boolean isEmpty() {
        return saldo.get() == 0;
    }

    private void updateDisplaySaldo() {
        if (isLast.get()) {
            displaySaldo.set(String.valueOf(preSaldo.get()));
        } else {
            displaySaldo.set(String.valueOf(preSaldo.get() + postSaldo.get()));
        }
    }

    public StringProperty displaySaldoProperty() {
        return displaySaldo;
    }
    
    Runnable updateDifferenceMessage = () -> {
        int sum = preSaldo.get() + postSaldo.get() + inutilizado.get() + venta.get() + trizado.get();
        int difference = sum - saldo.get();

        if (difference < 0) {
            differenceMessage.set("Faltan " + Math.abs(difference));
        } else if (difference > 0) {
            differenceMessage.set("Sobran " + Math.abs(difference));
        } else {
            differenceMessage.set("");
        }
    };

}
