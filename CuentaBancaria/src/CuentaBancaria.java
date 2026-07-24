public class CuentaBancaria {

    private String nombre;
    private int numero;
    private double saldo;

    public CuentaBancaria(String nombre, int numero, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

