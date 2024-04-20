package br.com.alura.musica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo() + " é o sucesso absoluto");
        }else{
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo ta curtindo");
        }
    }

}
