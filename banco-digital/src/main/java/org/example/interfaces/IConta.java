package org.example.interfaces;

import java.util.List;

public interface IConta {
    double sacar(double valor);

    double transferir(double valor, IConta conta);

    double depositar(double valor);

    String operacao(String descricao, Double valor);
    List<String> extrato();
}
