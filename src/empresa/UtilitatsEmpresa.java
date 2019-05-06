/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import flota.Camio;
import flota.Cotxe;
import flota.Furgoneta;
import flota.Motocicleta;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author antonialoy
 */
public abstract class UtilitatsEmpresa {
    
    //Inicialitza el sistema de l'empresa

    /**
     *
     * @param empresa
     */
    public static void inicialitzarSistemaComplet(Empresa empresa) {
        int nombre = 1;
        //Definim els tipus de vehicles
        List<String> tipusCotxes = Arrays.asList("Monovolum", "Berlina", "Sedan", "Coupé");
        List<String> marcaCotxes = Arrays.asList("Chevrolet", "Lotus", "Lexus", "Land Rover");
        List<String> modelCotxes = Arrays.asList("Volt", "Aveo", "Captiva", "Kalos", "Elise");
        List<String> tipusMotocicletes = Arrays.asList("Ciclomotor", "Scooter", "Megascooter");
        List<String> marcaMotocicletes = Arrays.asList("BMW", "Ducati", "Yamaha", "Harley-Davidson");
        List<String> modelMotocicletes = Arrays.asList("K1200 R Sport", "R 1250 GS", "R1200 RT", "Multistrada 1260");
        List<String> tipusFurgonetes = Arrays.asList("Camper", "Petita combi", "Mitjana", "Furgó", "Mixt adaptable");
        List<String> tipusCamions = Arrays.asList("Rígid", "Articulat", "Tràiler", "Tren de carretera", "Megacamió");
        List<String> marcaCamions = Arrays.asList("Scania", "Iveco", "Renault Trucks", "Volvo", "Man", "Daf");
        List<String> modelCamions = Arrays.asList("Serie N", "Eurocargo", "Fuso Canter", "R500", "Magnum");
        //Cream els vehicles i els afegim a l'empresa
        for (int index = 0; index < nombre; index++) {
            int cavalls = 60 + (int) (Math.random() * ((350 - 60) + 1));
            int portes = 3 + (int) (Math.random() * ((6 - 3) + 1));
            int passatgers = 4 + (int) (Math.random() * ((7 - 4) + 1));
            int preu = 20 + (int) (Math.random() * ((100 - 20) + 1));
            int rodes = 2 + (int) (Math.random() * ((4 - 2) + 1));
            int rodesCamions = 4 + (int) (Math.random() * ((8 - 4) + 1));
            double tara = 250 + (double) (Math.random() * ((2500 - 250) + 1));
            String matricula = generarMatricula();
            String dimensions = generarDimensions();         
            Cotxe x = new Cotxe(retornarElementRandom(tipusCotxes), portes, "4444WWW", passatgers, retornarElementRandom(marcaCotxes), retornarElementRandom(modelCotxes), cavalls, "Carnet de cotxe", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(x);
            Motocicleta y = new Motocicleta(retornarElementRandom(tipusMotocicletes), rodes, "1234POL", passatgers, retornarElementRandom(marcaMotocicletes), retornarElementRandom(modelMotocicletes), cavalls, "Carnet de motocicleta", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(y);
            Furgoneta z = new Furgoneta(retornarElementRandom(tipusCotxes), portes, "9876DRK", passatgers, retornarElementRandom(marcaCotxes), retornarElementRandom(modelCotxes), cavalls, "Carnet de cotxe", preu, "");
            matricula = generarMatricula();
            empresa.afegirVehicle(z);
            Camio w = new Camio(retornarElementRandom(tipusCamions), tara, rodesCamions, dimensions, "7809BBB", passatgers, retornarElementRandom(marcaCamions), retornarElementRandom(modelCamions), cavalls, "Carnet de camió", preu, "");
            empresa.afegirVehicle(w);
        }

    }

    //Genera aleatòriament matrícules de vehicles
    private static String generarMatricula() {
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
    private static String generarDimensions() {
        String resultant = "";
        for (int i = 0; i < 3; i++) {
            char numeros = (char) (Math.random() * 10 + '0');
            resultant = resultant + numeros;
        }
        resultant = resultant + 'x';
        for (int i = 0; i < 3; i++) {
            char numeros = (char) (Math.random() * 10 + '0');
            resultant = resultant + numeros;
        }
        return resultant;
    }
    
    //Retorna un element qualsevol d'una llista
    private static String retornarElementRandom(List<String> x) {
        Random rand = new Random();
        String randomElement = x.get(rand.nextInt(x.size()));
        return randomElement;
    }
}
