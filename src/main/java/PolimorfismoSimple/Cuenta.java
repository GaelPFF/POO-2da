package PolimorfismoSimple;

import Interfaces.CuentaBancaria;

public abstract class Cuenta implements CuentaBancaria {
protected String titular;
protected String numeroCuenta;
protected double saldo;


public Cuenta(String titular, String numeroCuenta, double saldo) {
this.titular = titular;
this.numeroCuenta = numeroCuenta;
this.saldo = saldo;
}

public void depositar(double monto) {
if (monto > 0) {
saldo += monto;
System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
} else {
System.out.println("El monto debe ser positivo.");
}
}


public boolean retirar(double monto) {
if (monto <= saldo) {
saldo -= monto;
System.out.println("Retiro exitoso. Saldo restante: " + saldo);
return true;
} else {
System.out.println("Saldo insuficiente para retirar: " + monto);
return false;
}
}


public double consultarSaldo() {
return saldo;
}


public void mostrarDatos() {
System.out.println("Titular: " + titular);
System.out.println("Cuenta: " + numeroCuenta);
System.out.println("Saldo: " + saldo);
}


// Método abstracto
public abstract void aplicarBeneficios();
}