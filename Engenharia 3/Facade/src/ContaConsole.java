public class ContaConsole {
    private String conta;
    private double pontos;

    public double somar(double valor){
        System.out.println("Somando...");
        return this.setPontos(this.getPontos() + valor);
    }

    public String obterIdConta(){
        System.out.println("Obtendo Id da conta...");
        return this.conta;
    }

    public double obterPontos(){
        System.out.println("Obtendo pontos...");
        return this.getPontos();
    }

    public ContaConsole(){}

    public ContaConsole(String conta){
        this.conta = conta;
    }

    public double getPontos() {
        return pontos;
    }

    public double setPontos(double pontos) {
        this.pontos = pontos;
        return pontos;
    }
}