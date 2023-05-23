public class Comentario implements ComponentComentario{
    String comentario;
    String nomePessoa;
    int dataEnvio;

    public Comentario(String newComentario, String newNomePessoa, int newDataEnvio){

        comentario = newComentario;
        nomePessoa = newNomePessoa;
        dataEnvio = newDataEnvio;

    }

    public String getComentario(){
        return comentario;
    }

    public String getNomePessoa(){
        return nomePessoa;
    }

    public int getDataEnvio(){
        return dataEnvio;
    }
    public void displayInfoComentario(){
        System.out.println(getComentario() + " enviado por " +
                getNomePessoa() + " em " + getDataEnvio());

    }
}


