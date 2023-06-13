public class AplicacaoJogador {

    public static void main(String[] args) {
        JogadorDoConsole jogador = new JogadorDoConsole("Lucas Silva");
        ContaConsole conta = new ContaConsole("237987");

        Fachada facade = new Fachada();
        facade.somarPontos(150, jogador, conta);
    }
}