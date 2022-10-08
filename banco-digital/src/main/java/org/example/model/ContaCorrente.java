package org.example.model;

import org.example.interfaces.IConta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta implements IConta {
    private List<String> logs = new ArrayList<>();

    public double sacar(double valor) {
        logs.add(operacao("sacar",valor));
        double resultado = 0;
        if (getSaldo() >= valor) {
            resultado = getSaldo() - valor;
            setSaldo(resultado);
            return getSaldo();
        }
        return resultado;
    }

    public double transferir(double valor, IConta iConta) {
        logs.add(operacao("transferir",valor));
        double valorTransferred = sacar(valor);
        iConta.depositar(valorTransferred);
        return valorTransferred;
    }

    public double depositar(double valor) {
        logs.add(operacao("depositar",valor));
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }

    @Override
    public String operacao(String descricao, Double valor) {
        return String.format("%s - OP: %s - Valor: %d", LocalDateTime.now().toString(), descricao, valor);
    }

    @Override
    public List<String> extrato() {
        return logs;
    }
}
