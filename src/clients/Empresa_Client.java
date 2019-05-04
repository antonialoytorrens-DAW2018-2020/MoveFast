/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

/**
 *
 * @author antonialoy
 */
public class Empresa_Client {
    private String codi;
    private String nom;
    private String ubicacio;
    private String telefon;

    public Empresa_Client(String codi, String nom, String ubicacio, String telefon) {
        this.codi = codi;
        this.nom = nom;
        this.ubicacio = ubicacio;
        this.telefon = telefon;
    }

    public String getCodi() {
        return codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
}
