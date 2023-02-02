public class Carro {
    private Motor motor;
    private Llanta[] llantas;
    private int contadorLlantas = 0;

    public Carro(Motor motor){
        this.llantas = new Llanta[4];
        this.motor = motor;
    }

    public void agregarLlanta(Llanta llanta){
        this.llantas[contadorLlantas] = llanta;
        this.contadorLlantas++;
    }

}
