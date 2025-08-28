package aula.dev.dojo.javacore.SobreCargaMetodos.test;

import aula.dev.dojo.javacore.SobreCargaMetodos.Dominio.Anime;

public class Test01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Shonen", 220, "Ação");
        anime.imprime();
    }
}
