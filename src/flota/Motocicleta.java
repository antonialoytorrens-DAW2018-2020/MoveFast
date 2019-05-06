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
    private int numeroRodes;

    public Motocicleta(String tipusMotocicleta, int numeroRodes, String matricula, int passatgers, String marca, String model, int cavalls, String tipusCarnet, double preuPerDia, String comentari) {
        super(matricula, passatgers, marca, model, cavalls, tipusCarnet, preuPerDia, comentari);
        this.tipusMotocicleta = tipusMotocicleta;
        this.numeroRodes = numeroRodes;
    }

    public String getTipusMotocicleta() {
        return tipusMotocicleta;
    }

    public void setTipusMotocicleta(String tipusMotocicleta) {
        this.tipusMotocicleta = tipusMotocicleta;
    }

    public int getNumeroRodes() {
        return numeroRodes;
    }

    public void setNumeroRodes(int numeroRodes) {
        this.numeroRodes = numeroRodes;
    }
    
}
