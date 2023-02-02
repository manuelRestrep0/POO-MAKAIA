public class Main {
    public static void main(String[] args) {
    /*
        Persona manuel = new Persona("Manuel",  21,  1234);
        boolean esMayorEdad = manuel.esMayorDeEdad();
        System.out.println(esMayorEdad);
        String nombre = manuel.getNombre();
    */
        /*Cuenta account = new Cuenta("Juan Manuel", 99999);

        // muestra de los metodos.
        account.getDatosCuenta();
        System.out.println(account.getSaldoCuenta());
        account.setIngreso(1000);
        System.out.println("Ingresando dinero al saldo");
        System.out.println(account.getSaldoCuenta());
        account.setRetiro(1233);
        System.out.println("Retirando dinero del saldo");
        System.out.println(account.getSaldoCuenta());
        */

        /*
        Motor motorCarro = new Motor("china", "valvula");
        Carro miCarro = new Carro(motorCarro);

        Llanta llantaIzqUno = new Llanta("bmw", "17");
        Llanta llantaIzqDos = new Llanta("bmw", "17");
        Llanta llantaDerUno = new Llanta("bmw", "17");
        Llanta llantaDerDos = new Llanta("bmw", "17");

        miCarro.agregarLlanta(llantaIzqUno);
        miCarro.agregarLlanta(llantaDerUno);
        miCarro.agregarLlanta(llantaIzqDos);
        miCarro.agregarLlanta(llantaDerDos);
        */

        Cuenta cuenta1 = new Cuenta("Manuel", 400000);
        Cuenta cuenta2 = new Cuenta("Carlos", 200000);

        Banco banco = new Banco(cuenta1,cuenta2);

        banco.imprimirNumeroCuentas();
        banco.realizarTransferenciaEntreCuentas(cuenta1,cuenta2,200000);
        cuenta1.getDatosCuenta();
        cuenta2.getDatosCuenta();


    }
}