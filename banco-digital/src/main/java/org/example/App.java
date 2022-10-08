package org.example;

import org.example.interfaces.IConta;
import org.example.model.ContaCorrente;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setConta(1);
        c1.setAgencia(1);
        IConta c2 = new ContaCorrente();

        c1.depositar(1000);
        c2.depositar(500);
        c1.sacar(25);
        c1.transferir(175, c2);
        System.out.println("C1 + " + c1);
        System.out.println("C2 + " + c2);
        c1.extratoPretty();

    }
}
