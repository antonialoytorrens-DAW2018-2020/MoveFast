/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lloguers;

import flota.Vehicle;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author antonialoy
 */
public class Lloguer {
    private ArrayList<Vehicle> infoVehicles;
    private boolean disponible;
    private LocalDate lliuramentVehicles;
    private LocalDate recollidaVehicles;

    public Lloguer(ArrayList<Vehicle> infoVehicles, boolean disponible, LocalDate lliuramentVehicles, LocalDate recollidaVehicles) {
        this.infoVehicles = infoVehicles;
        this.disponible = disponible;
        this.lliuramentVehicles = lliuramentVehicles;
        this.recollidaVehicles = recollidaVehicles;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getLliuramentVehicles() {
        return lliuramentVehicles;
    }

    public void setLliuramentVehicles(LocalDate lliuramentVehicles) {
        this.lliuramentVehicles = lliuramentVehicles;
    }

    public LocalDate getRecollidaVehicles() {
        return recollidaVehicles;
    }

    public void setRecollidaVehicles(LocalDate recollidaVehicles) {
        this.recollidaVehicles = recollidaVehicles;
    }
    
}
