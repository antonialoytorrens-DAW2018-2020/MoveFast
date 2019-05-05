/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import clients.*;
import flota.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import lloguers.*;

/**
 *
 * @author antonialoy
 */
public class mainEmpresa {

    public static void main(String[] args) {
        mainEmpresa p = new mainEmpresa();
        //Creació de l'empresa
        Empresa moveFastInca = new Empresa("MoveFast");
        //Creació del client
        Leasing joan = new Leasing("12345678W", "Joan Fuster Torres", "971511930", "jft29@gmail.com");
        //Afegir el client a la base de dades de l'empresa
        moveFastInca.afegirClient(joan);
        System.out.println(moveFastInca.getClients());
        //Afegir un vehicle
        p.afegirCotxesProva(moveFastInca);
        Vehicle primerVehicle = moveFastInca.obtenirCotxe("233049I");
        //Afegir un lloguer
        Lloguer primerLloguer = new Lloguer(joan, LocalDate.of(2019, Month.JANUARY, 20), LocalDate.of(2019, Month.MARCH, 30));
        try {
            moveFastInca.afegirLloguer(primerVehicle, primerLloguer);
        } catch (DataIncorrectaException ex) {
            System.out.println("Les dates que s'han introduït són incorrectes");
            Logger.getLogger(mainEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DuracioIncorrectaException ex) {
            System.out.println("Duració incorrecta, no s'ha afegit");
            Logger.getLogger(mainEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void afegirCotxesProva(Empresa x) {
        Cotxe a = new Cotxe("Coupé", 235, 5, "23458GPU", 5, "Mercedes", "Benz", "Carnet de cotxe", 8.5, "asdf", "asd");
        x.afegirVehicle(a);
        Cotxe b = new Cotxe("Coupé", 235, 5, "23333GPT", 5, "Suzuki", "Benz", "Carnet de cotxe", 8.5, "asdf", "asd");
        x.afegirVehicle(b);
        Cotxe c = new Cotxe("Coupé", 235, 5, "23458GPU", 5, "Chevrolet", "Benz", "Carnet de cotxe", 8.5, "asdf", "asd");
        x.afegirVehicle(c);
        Cotxe d = new Cotxe("Coupé", 235, 5, "23458GPU", 5, "Citroën", "Benz", "Carnet de cotxe", 8.5, "asdf", "asd");
        x.afegirVehicle(d);
        Cotxe e = new Cotxe("Coupé", 235, 5, "233049I", 5, "Mercedes", "Benz", "Carnet de cotxe", 8.5, "asdf", "asd");
        x.afegirVehicle(e);
    }
}
