package org.example.interfaces;

public interface IConta {
    double sacar(double valor);

    double transferir(double valor, IConta conta);

    double depositar(double valor);
}
