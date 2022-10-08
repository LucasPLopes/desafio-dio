package org.example.model;

public class ContaCorrente extends Conta {

    public void extratoPretty() {
        System.out.printf("Extract for CC: %d - AG: %d\n", super.getConta(), super.getAgencia());
        super.extrato().forEach(System.out::println);
    }
}