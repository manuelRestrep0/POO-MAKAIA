public class Banco {
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2){
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void realizarTransferenciaEntreCuentas(Cuenta cuenta1, Cuenta cuenta2, double monto){
        cuenta1.setRetiro(monto);
        cuenta2.setIngreso(monto);
    };

    public void imprimirNumeroCuentas(){
        System.out.println("cuenta#1 : "+cuenta1.getNumeroDeCuenta());
        System.out.println("cuenta#2 : "+cuenta2.getNumeroDeCuenta());
    };
}
