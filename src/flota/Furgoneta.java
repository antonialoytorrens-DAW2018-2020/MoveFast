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
public class Furgoneta extends Vehicle {
    private String tipusFurgoneta;
    private int cavalls;
    private int portes;

    public Furgoneta(String tipusFurgoneta, int cavalls, int portes, String matricula, int passatgers, String marca, String model, String tipusCarnet, double preuPerDia, String tipusVehicle, String comentari) {
        super(matricula, passatgers, marca, model, tipusCarnet, preuPerDia, tipusVehicle, comentari);
        this.tipusFurgoneta = tipusFurgoneta;
        this.cavalls = cavalls;
        this.portes = portes;
    }

    public String getTipusFurgoneta() {
        return tipusFurgoneta;
    }

    public void setTipusFurgoneta(String tipusFurgoneta) {
        this.tipusFurgoneta = tipusFurgoneta;
    }

    public int getCavalls() {
        return cavalls;
    }

    public void setCavalls(int cavalls) {
        this.cavalls = cavalls;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }
    
}
