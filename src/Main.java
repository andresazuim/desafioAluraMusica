import br.com.alura.musica.modelos.MinhasPreferidas;
import br.com.alura.musica.modelos.Musica;
import br.com.alura.musica.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica banda = new Musica();
        banda.setTitulo("Simple plan");
        banda.setArtista("simple plan");
        banda.setAlbum("perfect");
        banda.setGenero("emo");


        for (int i = 0; i < 1000; i++) {
            banda.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            banda.curte();
        }
        //banda.mostrarInformacoes();

        Podcast podcast = new Podcast();
        podcast.setTitulo("pode pah");
        podcast.setHost("igao e mitico");
        podcast.setDescricao("podcast mais bombado do momento");

        for (int i = 0; i < 50; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 24; i++) {
            podcast.curte();
        }
        //podcast.mostrarInformacoes();

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(banda);

    }
}