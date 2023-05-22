import java.util.ArrayList;
import java.util.List;

public class Placar {
    private List<Observer> observers;
    private List<Comando> comandos;

    public Placar() {
        this.observers = new ArrayList<>();
        this.comandos = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void atualizarTudo(String gols) {
        this.observers.stream().forEach(item -> {
            System.out.println(gols);
        });
    }

    public void addComando1(Comando comando) {
        this.comandos.add(comando);
        atualizarTudo(String.format("GOOOOL do " + comando.getTime1() +
                " na partida " + comando.getPartida()));
    }

    public void addComando2(Comando comando) {
        this.comandos.remove(comando);
        atualizarTudo(String.format("GOOOOL do " + comando.getTime2() +
                " na partida " + comando.getPartida()));
    }

    public List<Comando> getComando() {
        return this.comandos;
    }

}
