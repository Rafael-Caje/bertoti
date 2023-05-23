import java.util.ArrayList;
import java.util.Iterator;

public class Forum implements ComponentComentario {

    ArrayList componentsComentario = new ArrayList();

    String nomeForum;
    String descricaoForum;

    public Forum(String newNomeForum, String newDescricaoForum) {
        nomeForum = newNomeForum;
        descricaoForum = newDescricaoForum;
    }

    public String getNomeForum() {
        return nomeForum;
    }

    public String getDescricaoForum() {
        return descricaoForum;
    }

    public void add(ComponentComentario newComponentComentario) {

        componentsComentario.add(newComponentComentario);
    }

    public void remove(ComponentComentario newComponenComentario) {
        componentsComentario.remove(newComponenComentario);
    }

    public ComponentComentario getComponent(int componentIndex) {
        return (ComponentComentario) componentsComentario.get(componentIndex);

    }

    public void displayInfoComentario() {
        System.out.println(getNomeForum() + " " +
                getDescricaoForum() + "\n");

        Iterator comentarioIterator = componentsComentario.iterator();


        while(comentarioIterator.hasNext()){
            ComponentComentario infoComentario = (ComponentComentario) comentarioIterator.next();
            infoComentario.displayInfoComentario();

        }
    }

}
