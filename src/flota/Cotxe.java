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
    private int cavalls;
    private int portes;

    public Cotxe(String tipusCotxe, int cavalls, int portes, String matricula, int passatgers, String marca, String model, String tipusCarnet, double preuPerDia, String tipusVehicle, String comentari) {
        super(matricula, passatgers, marca, model, tipusCarnet, preuPerDia, tipusVehicle, comentari);
        this.tipusCotxe = tipusCotxe;
        this.cavalls = cavalls;
        this.portes = portes;
    }

    public String getTipusCotxe() {
        return tipusCotxe;
    }

    public void setTipusCotxe(String tipusCotxe) {
        this.tipusCotxe = tipusCotxe;
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
