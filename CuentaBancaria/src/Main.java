public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1, 500);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana", 2, 1000);

        System.out.println("Cliente: " + cuenta1.getNombre());
        System.out.println("Cuenta: " + cuenta1.getNumero());

        System.out.println("Cliente: " + cuenta2.getNombre());
        System.out.println("Cuenta: " + cuenta2.getNumero());

        cuenta1.depositar(200);
        cuenta2.depositar(300);

        if (cuenta1.retirar(100)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        if (cuenta2.retirar(2000)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Saldo insuficiente");
        }

        for (int i = 0; i < 3; i++) {
            cuenta1.depositar(50);
        }

        System.out.println("Saldo cuenta 1: " + cuenta1.consultarSaldo());
        System.out.println("Saldo cuenta 2: " + cuenta2.consultarSaldo());
    }
}


