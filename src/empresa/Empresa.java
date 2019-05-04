/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import clients.Client;
import flota.Vehicle;
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
    private ArrayList<Lloguer> lloguers;

    public Empresa(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.lloguers = new ArrayList<>();
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
    
    public void afegirLloguer(Lloguer x) {
        lloguers.add(x);
    }

    public void borrarLloguer(Lloguer x) {
        lloguers.remove(x);
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

    public ArrayList<Lloguer> getLloguers() {
        ArrayList<Lloguer> copy = (ArrayList<Lloguer>) lloguers.clone();
        return copy;
    }
}
