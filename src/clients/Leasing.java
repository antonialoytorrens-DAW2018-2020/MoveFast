/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import java.util.ArrayList;

/**
 *
 * @author antonialoy
 */
public class Leasing extends Client {

    private ArrayList<Empresa_Client> infoEmpresa;

    public Leasing(String DNI, String nomComplet, String telefon, String email) {
        super(DNI, nomComplet, telefon, email);
        this.infoEmpresa = new ArrayList<>();
    }

    public ArrayList<Empresa_Client> getInfoEmpresa() {
        ArrayList<Empresa_Client> copy = (ArrayList<Empresa_Client>) infoEmpresa.clone();
        return copy;
    }
}
