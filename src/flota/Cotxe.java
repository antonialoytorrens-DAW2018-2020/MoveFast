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
public class Cotxe extends Vehicle{
    private String tipusCotxe;
    private int portes;

    public Cotxe(String tipusCotxe, int portes, String matricula, int passatgers, String marca, String model, int cavalls, String tipusCarnet, double preuPerDia, String comentari) {
        super(matricula, passatgers, marca, model, cavalls, tipusCarnet, preuPerDia, comentari);
        this.tipusCotxe = tipusCotxe;
        this.portes = portes;
    }

    public String getTipusCotxe() {
        return tipusCotxe;
    }

    public void setTipusCotxe(String tipusCotxe) {
        this.tipusCotxe = tipusCotxe;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }
    
}
