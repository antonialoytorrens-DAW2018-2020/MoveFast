/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import clients.Client;
import flota.Vehicle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import lloguers.Lloguer;

/**
 *
 * @author antonialoy
 */
public class Empresa {

    private String nom;
    private ArrayList<Client> clients;
    private ArrayList<Vehicle> vehicles;

    public Empresa(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void afegirClient(Client x) {
        clients.add(x);
    }

    public void borrarClient(Client x) {
        clients.remove(x);
    }

    public void afegirVehicle(Vehicle x) {
        vehicles.add(x);
    }

    public void borrarVehicle(Vehicle x) {
        vehicles.remove(x);
    }

    public void afegirLloguer(Vehicle v, Lloguer x) throws DataIncorrectaException, DuracioIncorrectaException, VehicleInexistentException {
        if (v.isDisponible(x.getLliuramentVehicles(), x.getRecollidaVehicles()) && x.getLliuramentVehicles().isBefore(x.getRecollidaVehicles()) && (ChronoUnit.DAYS.between(x.getLliuramentVehicles(), x.getRecollidaVehicles())) >= 1) {
            v.getLloguers().add(x);
        } else {
            if (x.getLliuramentVehicles().isAfter(x.getRecollidaVehicles()) || x.getLliuramentVehicles().isEqual(x.getRecollidaVehicles())) {
                throw new DataIncorrectaException("Les dates que s'han introduït són incorrectes");
            }
            if (ChronoUnit.DAYS.between(x.getLliuramentVehicles(), x.getRecollidaVehicles()) < 1) {
                throw new DuracioIncorrectaException("La duració mínima per llogar un vehicle és d'un dia");
            }
            if (v == null) {
                throw new VehicleInexistentException("La matrícula introduïda no existeix");
            }
        }
    }

    public void borrarLloguer(Vehicle v, Lloguer x) {
        v.getLloguers().remove(x);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Client> getClients() {
        ArrayList<Client> copy = (ArrayList<Client>) clients.clone();
        return copy;
    }

    public ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> copy = (ArrayList<Vehicle>) vehicles.clone();
        return copy;
    }

    public Vehicle obtenirCotxe(String matricula) {
        for (Vehicle x : vehicles) {
            if (x.getMatricula().equals(matricula)) {
                return x;
            }
        }
        return null;
    }
}
