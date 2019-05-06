/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lloguers;

import clients.Client;
import flota.Cotxe;
import flota.Vehicle;
import java.time.LocalDate;

/**
 *
 * @author antonialoy
 */
public class Lloguer {
    private Client client;
    private LocalDate lliuramentVehicles;
    private LocalDate recollidaVehicles;

    public Lloguer(Client client, LocalDate lliuramentVehicles, LocalDate recollidaVehicles) {
        this.client = client;
        this.lliuramentVehicles = lliuramentVehicles;
        this.recollidaVehicles = recollidaVehicles;
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
