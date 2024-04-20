package br.com.alura.musica.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println(this.getArtista());
        System.out.println(this.getAlbum());
        System.out.println(this.getGenero());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 200){
            return 10;
        }else{
            return 7;
        }
    }
}
