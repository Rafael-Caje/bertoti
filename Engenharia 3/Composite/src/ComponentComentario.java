public interface ComponentComentario {
    default void add(ComponentComentario componentComentario){
        throw new UnsupportedOperationException();
    }

    //REMOVENDO COMPONENTS
    private void remove(ComponentComentario newComponentComentario){
        throw new UnsupportedOperationException();
    }

    //PEGANDO COMPONENTS
    private ComponentComentario getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    //RETORNA COMENTARIO
    private String getComentario(){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME DA PESSOA
    private String getNomePessoa(){
        throw new UnsupportedOperationException();
    }

    //RETORNA DATA DO COMENTARIO
    private int getDadaEnvio(){
        throw new UnsupportedOperationException();
    }

    default void displayInfoComentario(){
        throw new UnsupportedOperationException();
    }
}
