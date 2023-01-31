public class Main {
    public static void main(String[] args) {
    /*
        Persona manuel = new Persona("Manuel",  21,  1234);
        boolean esMayorEdad = manuel.esMayorDeEdad();
        System.out.println(esMayorEdad);
        String nombre = manuel.getNombre();
    */
        Cuenta account = new Cuenta("Juan Manuel", 99999);

        // muestra de los metodos.
        account.getDatosCuenta();
        System.out.println(account.getSaldoCuenta());
        account.setIngreso(1000);
        System.out.println("Ingresando dinero al saldo");
        System.out.println(account.getSaldoCuenta());
        account.setRetiro(1233);
        System.out.println("Retirando dinero del saldo");
        System.out.println(account.getSaldoCuenta());





    }
}