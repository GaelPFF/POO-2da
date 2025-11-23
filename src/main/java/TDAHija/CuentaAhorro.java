package TDAHija;

import PolimorfismoSimple.Cuenta;

public abstract class CuentaAhorro extends Cuenta {
    
    public CuentaAhorro(String titular, String numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
    }

}