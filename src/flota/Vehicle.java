/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota;

/**
 *
 * @author antonialoy
 */
public abstract class Vehicle {
    private String matricula;
    private int passatgers;
    private String marca;
    private String model;
    private String tipusCarnet;
    private double preuPerDia;
    private String comentari;

    public Vehicle(String matricula, int passatgers, String marca, String model, String tipusCarnet, double preuPerDia, String comentari) {
        this.matricula = matricula;
        this.passatgers = passatgers;
        this.marca = marca;
        this.model = model;
        this.tipusCarnet = tipusCarnet;
        this.preuPerDia = preuPerDia;
        this.comentari = comentari;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPassatgers() {
        return passatgers;
    }

    public void setPassatgers(int passatgers) {
        this.passatgers = passatgers;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipusCarnet() {
        return tipusCarnet;
    }

    public void setTipusCarnet(String tipusCarnet) {
        this.tipusCarnet = tipusCarnet;
    }

    public double getPreuPerDia() {
        return preuPerDia;
    }

    public void setPreuPerDia(double preuPerDia) {
        this.preuPerDia = preuPerDia;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }
    
}
