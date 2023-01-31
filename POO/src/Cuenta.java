import java.util.Random;
public class Cuenta {
    public double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    Cuenta(){
    }
    Cuenta(String nombreDelTitular, double saldoDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = new Random().nextLong();
    }

    public void setIngreso(double ingreso){
        this.saldoDeCuenta+=ingreso;
    }
    public void setRetiro(double retiro){
        this.saldoDeCuenta-=retiro;
    }
    public double getSaldoCuenta(){
        return this.saldoDeCuenta;
    }
    public void getDatosCuenta(){
        System.out.println("Su nombre es: "+this.nombreDelTitular);
        System.out.println("Su numero de cuenta es: "+this.numeroDeCuenta);
        System.out.println("Su saldo actual es: "+this.saldoDeCuenta);
    }


}
