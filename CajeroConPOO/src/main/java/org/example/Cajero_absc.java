package org.example;

public abstract class Cajero_absc {
    private Integer saldo=0;
    public abstract void operaciones();

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}

