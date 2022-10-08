package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.interfaces.IConta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class Conta implements IConta {
    private int agencia;
    private int conta;
    private double saldo;
    private List<String> logs = new ArrayList<>();

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }

    public double sacar(double valor) {
        logs.add(operacao("sacar", valor));
        double resultado = 0;
        if (getSaldo() >= valor) {
            resultado = getSaldo() - valor;
            setSaldo(resultado);
            return getSaldo();
        }
        return resultado;
    }

    public double transferir(double valor, IConta iConta) {
        logs.add(operacao("transferir", valor));
        double valorTransferred = sacar(valor);
        iConta.depositar(valorTransferred);
        return valorTransferred;
    }

    public double depositar(double valor) {
        logs.add(operacao("depositar", valor));
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }

    @Override
    public String operacao(String descricao, Double valor) {
        return String.format("%s - OP: %s - Valor: %.2f", LocalDateTime.now(), descricao, valor);
    }

    @Override
    public List<String> extrato() {
        return logs;
    }


}
