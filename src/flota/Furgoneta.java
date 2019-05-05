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
    private int portes;

    public Furgoneta(String tipusFurgoneta, int portes, String matricula, int passatgers, String marca, String model, int cavalls, String tipusCarnet, double preuPerDia, String comentari) {
        super(matricula, passatgers, marca, model, cavalls, tipusCarnet, preuPerDia, comentari);
        this.tipusFurgoneta = tipusFurgoneta;
        this.portes = portes;
    }

    public String getTipusFurgoneta() {
        return tipusFurgoneta;
    }

    public void setTipusFurgoneta(String tipusFurgoneta) {
        this.tipusFurgoneta = tipusFurgoneta;
    }
    
    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }
    
}
