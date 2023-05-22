public class Comando {
    private String time1;
    private String time2;
    private String partida;

    public Comando(String time1, String time2, String partida) {
        this.time1 = time1;
        this.time2 = time2;
        this.partida = partida;

    }

    public String getTime1() {
        return this.time1;
    }

    public String getTime2() {
        return this.time2;
    }

    public String getPartida() {

        return this.partida;
    }

}