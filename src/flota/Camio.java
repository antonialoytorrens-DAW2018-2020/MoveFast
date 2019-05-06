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
public class Camio extends Vehicle {
    private String tipusCamio;
    private int cavalls;
    private double tara;
    private int numeroRodes;
    private String dimensions;

    public Camio(String tipusCamio, double tara, int numeroRodes, String dimensions, String matricula, int passatgers, String marca, String model, int cavalls, String tipusCarnet, double preuPerDia, String comentari) {
        super(matricula, passatgers, marca, model, cavalls, tipusCarnet, preuPerDia, comentari);
        this.tipusCamio = tipusCamio;
        this.tara = tara;
        this.numeroRodes = numeroRodes;
        this.dimensions = dimensions;
    }

    public String getTipusCamio() {
        return tipusCamio;
    }

    public void setTipusCamio(String tipusCamio) {
        this.tipusCamio = tipusCamio;
    }
    
    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public int getNumeroRodes() {
        return numeroRodes;
    }

    public void setNumeroRodes(int numeroRodes) {
        this.numeroRodes = numeroRodes;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    
}
