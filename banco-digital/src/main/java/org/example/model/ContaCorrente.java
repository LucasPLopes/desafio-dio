package org.example.model;

import org.example.interfaces.IConta;

public class ContaCorrente extends Conta implements IConta {
    public double sacar(double valor) {
        double resultado =0;
        if(getSaldo() >= valor){
            resultado = getSaldo() - valor;
            setSaldo(resultado);
            return getSaldo();
        }
        return resultado;
    }

    public double transferir(double valor, IConta iConta) {
        double valorTransferred = sacar(valor);
        iConta.depositar(valorTransferred);
        return valorTransferred;
    }

    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }
}
