public class Fachada {
    private JogadorDoConsole jogador;
    private ContaConsole conta;

    public Fachada() {
        this.jogador = new JogadorDoConsole();
        this.conta = new ContaConsole();
    }

    public void somarPontos(int quantidade, JogadorDoConsole jogador, ContaConsole conta){
        System.out.printf("Pontos adicionados ao jogador %s\n",jogador.obterNomeDoJogador());
        System.out.printf("Você escolheu a conta %s\n", conta.obterIdConta());
        System.out.printf("O saldo de pontos desta conta é: %s\n", conta.obterPontos());
        System.out.printf("Você está somando %s pontos\n", quantidade);
        conta.setPontos(conta.getPontos() + quantidade);
        System.out.printf("Somado %d na conta de %s\n",quantidade, jogador.obterNomeDoJogador());
        System.out.printf("O saldo desta conta é: %s pontos\n", conta.obterPontos());
    }

    public JogadorDoConsole getJogador() {
        return jogador;
    }

    public void setJogador(JogadorDoConsole jogador) {
        this.jogador = jogador;
    }

    public ContaConsole getConta() {
        return conta;
    }

    public void setConta(ContaConsole conta) {
        this.conta = conta;
    }
}
