/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import clients.*;
import flota.*;
import lloguers.*;

/**
 *
 * @author antonialoy
 */
public class mainEmpresa {
    public static void main(String[] args) {
        Leasing Joan = new Leasing("12345678W", "Joan Fuster Torres", "971511930", "jft29@gmail.com");
        Empresa moveFastInca = new Empresa("MoveFast");
        moveFastInca.afegirClient(Joan);
        System.out.println(moveFastInca.getClients());
    }
}
