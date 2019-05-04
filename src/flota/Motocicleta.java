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
public class Motocicleta extends Vehicle{
    private String tipusMotocicleta;
    private int cavalls;
    private int numeroRodes;

    public Motocicleta(String tipusMotocicleta, int cavalls, int numeroRodes, String matricula, int passatgers, String marca, String model, String tipusCarnet, double preuPerDia, String tipusVehicle, String comentari) {
        super(matricula, passatgers, marca, model, tipusCarnet, preuPerDia, tipusVehicle, comentari);
        this.tipusMotocicleta = tipusMotocicleta;
        this.cavalls = cavalls;
        this.numeroRodes = numeroRodes;
    }

    public String getTipusMotocicleta() {
        return tipusMotocicleta;
    }

    public void setTipusMotocicleta(String tipusMotocicleta) {
        this.tipusMotocicleta = tipusMotocicleta;
    }

    public int getCavalls() {
        return cavalls;
    }

    public void setCavalls(int cavalls) {
        this.cavalls = cavalls;
    }

    public int getNumeroRodes() {
        return numeroRodes;
    }

    public void setNumeroRodes(int numeroRodes) {
        this.numeroRodes = numeroRodes;
    }
    
}
