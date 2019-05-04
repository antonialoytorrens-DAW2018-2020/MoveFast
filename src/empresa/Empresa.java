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

    public void mostrarClient() {
        for (Client x : clients) {
            System.out.println(x);
        }
    }

    public void afegirVehicle(Vehicle x) {
        vehicles.add(x);
    }

    public void borrarVehicle(Vehicle x) {
        vehicles.remove(x);
    }

    public void mostrarVehicle() {
        for (Vehicle x : vehicles) {
            System.out.println(x);
        }
    }

    public void afegirLloguer(Lloguer x) {
        lloguers.add(x);
    }

    public void borrarLloguer(Lloguer x) {
        lloguers.remove(x);
    }

    public void mostrarLloguer() {
        for (Lloguer x : lloguers) {
            System.out.println(x);
        }
    }
}
