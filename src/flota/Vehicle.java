/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota;

import java.time.LocalDate;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.min;
import lloguers.Lloguer;

/**
 *
 * @author antonialoy
 */
public abstract class Vehicle {
    private ArrayList<Lloguer> lloguers;
    private String matricula;
    private int passatgers;
    private String marca;
    private String model;
    private int cavalls;
    private String tipusCarnet;
    private double preuPerDia;
    private String comentari;

    public Vehicle(String matricula, int passatgers, String marca, String model, int cavalls, String tipusCarnet, double preuPerDia, String comentari) {
        this.matricula = matricula;
        this.passatgers = passatgers;
        this.marca = marca;
        this.model = model;
        this.cavalls = cavalls;
        this.tipusCarnet = tipusCarnet;
        this.preuPerDia = preuPerDia;
        this.comentari = comentari;
        this.lloguers = new ArrayList<>();
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

    public boolean isDisponible(LocalDate inici, LocalDate fi) {
        boolean disponible = true;
        for (Lloguer x : lloguers) {
            if(solapen(inici, fi, x.getLliuramentVehicles(), x.getRecollidaVehicles())) {
                disponible = false;
                break;
            }
        }
        return disponible;
    }

    public ArrayList<Lloguer> getLloguers() {
        ArrayList<Lloguer> copy = (ArrayList<Lloguer>) lloguers.clone();
        return copy;
    }
    
    /**Comprova si les dates es solapen (two date ranges for overlap)**/
    public boolean solapen(LocalDate x1, LocalDate x2, LocalDate y1, LocalDate y2) {
       return max(x1,y1) <= min(x2,y2);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "lloguers=" + lloguers + ", matricula=" + matricula + ", passatgers=" + passatgers + ", marca=" + marca + ", model=" + model + ", cavalls=" + cavalls + ", tipusCarnet=" + tipusCarnet + ", preuPerDia=" + preuPerDia + ", comentari=" + comentari + '}';
    }
    
}
