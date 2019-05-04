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
public class Client {
    private String DNI;
    private String nomComplet;
    private String telefon;
    private String email;

    public Client(String DNI, String nomComplet, String telefon, String email) {
        this.DNI = DNI;
        this.nomComplet = nomComplet;
        this.telefon = telefon;
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
