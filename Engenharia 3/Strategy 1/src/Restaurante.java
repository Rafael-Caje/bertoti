public class Restaurante {
    private Comida comida;
    public void setComida(Comida scomida){
        comida = scomida;
    }

    public void utilizarComida(){
        comida.comer();

    }


}