public class Update {
    public static void main(String[] args) {

        Placar p = new Placar();
        TV tela = new TV();
        Estadio telao = new Estadio();

        p.addObserver(tela);
        p.addObserver(telao);
        Comando comando = new Comando("São Paulo", "Palmeiras", "São Paulo x Palmeiras");
        p.addComando1(comando);
        p.removeObserver(tela);
        p.removeObserver(telao);
        p.addObserver(tela);
        p.addObserver(telao);
        p.addComando2(comando);
        p.removeObserver(tela);
        p.removeObserver(telao);

    }

}
