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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
        p.inicialitzarSistemaComplet(moveFastInca);
        //Creació del client
        Leasing joan = new Leasing("12345678W", "Joan Fuster Torres", "971511930", "jft29@gmail.com");
        //Afegir el client a la base de dades de l'empresa
        moveFastInca.afegirClient(joan);
        System.out.println(moveFastInca.getClients());
        System.out.println(moveFastInca.getVehicles());
        ArrayList catalogue = new ArrayList<String>();
        /*
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
        }*/
    }
    public void inicialitzarSistemaComplet(Empresa empresa) {
        int nombre = 1;
        //Definim els tipus de vehicles
        String[] tipusCotxe = {"Monovolum", "Berlina", "Sedan", "Coupé"};
        String[] marcaCotxe = {"Chevrolet", "Lotus", "Lexus", "Land Rover"};
        String[] modelCotxe = {"Volt", "Aveo", "Captiva", "Kalos", "Elise"};
        String[] tipusMotocicletes = {"Ciclomotor", "Scooter", "Megascooter"};
        String[] marcaMotocicletes = {"BMW", "Ducati", "Yamaha", "Harley-Davidson"};
        String[] modelMotocicletes = {"K1200 R Sport", "R 1250 GS", "R1200 RT", "Multistrada 1260"};
        String[] tipusFurgonetes = {"Camper", "Petita combi", "Mitjana", "Furgó", "Mixt adaptable"};
        String[] tipusCamions = {"Rígid", "Articulat", "Tràiler", "Tren de carretera", "Megacamió"};
        String[] marcaCamions = {"Scania", "Iveco", "Renault Trucks", "Volvo", "Man", "Daf"};
        String[] modelCamions = {"Serie N", "Eurocargo", "Fuso Canter", "R500", "Magnum"};
        //Cream els vehicles i els afegim a l'empresa
        for (int index = 0; index < nombre; index++) {
            int cavalls = 1 + (int) (Math.random() * ((350 - 60) + 1));
            int portes = 1 + (int) (Math.random() * ((6 - 3) + 1));
            int passatgers = 1 + (int) (Math.random() * ((7 - 4) + 1));
            int preu = 1 + (int) (Math.random() * ((100 - 20) + 1));
            int rodes = 1 + (int) (Math.random() * ((4 - 2) + 1));
            int rodesCamions = 1 + (int) (Math.random() * ((8 - 4) + 1));
            double tara = 1 + (double) (Math.random() * ((2500 - 250) + 1));
            String tipusDeCotxe = (tipusCotxe[new Random().nextInt(tipusCotxe.length)]);
            String marcaDeCotxe = (marcaCotxe[new Random().nextInt(marcaCotxe.length)]);
            String modelDeCotxe = (modelCotxe[new Random().nextInt(modelCotxe.length)]);
            String tipusDeMotocicleta = (tipusMotocicletes[new Random().nextInt(tipusMotocicletes.length)]);
            String marcaDeMotocicleta = (marcaMotocicletes[new Random().nextInt(marcaMotocicletes.length)]);
            String modelDeMotocicleta = (modelMotocicletes[new Random().nextInt(modelMotocicletes.length)]);
            String tipusDeFurgoneta = (tipusFurgonetes[new Random().nextInt(tipusFurgonetes.length)]);
            String tipusDeCamio = (tipusCamions[new Random().nextInt(tipusCamions.length)]);
            String marcaDeCamio = (marcaCamions[new Random().nextInt(marcaCamions.length)]);
            String modelDeCamio = (modelCamions[new Random().nextInt(modelCamions.length)]);
            String matricula = generarMatricula();
            String dimensions = generarDimensions();
            Vehicle x = new Cotxe(tipusDeCotxe, portes, matricula, passatgers, marcaDeCotxe, modelDeCotxe, cavalls, "Carnet de cotxe", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(x);
            Vehicle y = new Motocicleta(tipusDeMotocicleta, rodes, matricula, passatgers, marcaDeMotocicleta, modelDeMotocicleta, cavalls, "Carnet de motocicleta", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(y);
            Vehicle z = new Furgoneta(tipusDeCotxe, portes, matricula, passatgers, marcaDeCotxe, modelDeCotxe, cavalls, "Carnet de cotxe", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(z);
            Vehicle w = new Camio(tipusDeCamio, tara, rodesCamions, dimensions, matricula, passatgers, marcaDeCamio, modelDeCamio, cavalls, "Carnet de camió", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(w);
        }

    }

    //Genera aleatòriament matrícules de vehicles
    public String generarMatricula() {
        String resultant = "";
        for (int i = 0; i < 4; i++) {
            char numeros = (char) (Math.random() * 10 + '0');
            resultant = resultant + numeros;
        }

        for (int i = 0; i < 3; i++) {
            char lletres = (char) (Math.random() * 26 + 'A');
            resultant = resultant + lletres;
        }
        return resultant;
    }
    //Genera unes dimensions aleatòries (zzz x yyy)
    public String generarDimensions() {
        String resultant = "";
        for (int i = 0; i < 3; i++) {
            char numeros = (char) (Math.random() * 10 + '0');
            resultant = resultant + numeros;
        }
        resultant = resultant+'x';
        for (int i = 0; i < 3; i++) {
            char numeros = (char) (Math.random() * 10 + '0');
            resultant = resultant + numeros;
        }
        return resultant;
    }
    public void givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat() {
    Random rand = new Random();
    List<String> givenList = Arrays.asList("one", "two", "three", "four");
 
    int numberOfElements = 2;
 
    for (int i = 0; i < numberOfElements; i++) {
        int randomIndex = rand.nextInt(givenList.size());
        String randomElement = givenList.get(randomIndex);
        System.out.println(randomElement);
    }
}
}
