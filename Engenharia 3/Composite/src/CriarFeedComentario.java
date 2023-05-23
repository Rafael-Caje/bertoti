public class CriarFeedComentario {
    public static void main(String[] args){
        ComponentComentario feedTotal = new Forum("Global", "Toda discussão que há no Forum.");

        ComponentComentario feedEngenharia = new Forum
                ("Engenharia",
                        "Forum dedicado a compartilhar conhecimento e curiosidade de Engenharia.");


        ComponentComentario feedFilosofia = new Forum
                ("\nFilosofia",
                        "Forum dedicado a compartilhar conhecimento e curiosidade de Filosofia.");


        ComponentComentario feedExatas = new Forum
                ("\nExatas",
                        "Forum dedicado a compartilhar conhecimento e curiosidade de Exatas.");

        feedTotal.add(feedEngenharia);

        feedEngenharia.add(new Comentario("Eu curso engenharia mecatrônica",
                "Paulo", 2020));
        feedEngenharia.add(new Comentario("Eu curso engenharia aeronáutica",
                "Fernando", 2020));


        feedEngenharia.add(feedFilosofia);

        feedFilosofia.add(new Comentario("Gosto de ler Adam Smith",
                "Claudia", 2019));
        feedFilosofia.add(new Comentario("Gosto de ler Cortella",
                "Fabio", 2021));


        feedTotal.add(feedExatas);

        feedExatas.add(new Comentario("Estou cursando física",
                "Luciana", 2020));
        feedExatas.add(new Comentario("Faço pós graduação em matemática financeira",
                "Francisco", 2022));

        FeedComment userAdmin = new FeedComment(feedTotal);

        userAdmin.getFeedComentario();



    }
}
