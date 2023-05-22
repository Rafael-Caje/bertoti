public class Restaurante {
    private Comida comida;
    private Bebida bebida;
    public void setComida(Comida scomida){
        comida = scomida;
    }

    public void comerComida(){
        comida.comer();

    }

    public void setBebida(Bebida sbebida){
        bebida = sbebida;
    }

    public void beberBebida(){
        bebida.beber();
    }



}
