public class main {
    public static void main(String[] args) {
        System.out.println("*** Escolha a Comida ***");
        System.out.println("#Comida");
        Restaurante restaurante = new Restaurante();
        restaurante.setComida(new Pratos());
        restaurante.utilizarComida();

        restaurante.setComida(new Lanche());
        restaurante.utilizarComida();
    }
}
