package exemplos;

import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new java.util.HashSet<>(); // Não permite elementos duplicados dentro da lista, não mantém a ordem de inserção
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9f, 0));
        mangas.add(new Manga(1L, "Naruto", 1.9f, 2));
        mangas.add(new Manga(4L, "Pokemon", 19f, 3));
        mangas.add(new Manga(3L, "One Piece", 29.9f, 4));
        mangas.add(new Manga(2L, "Drrr!!!", 2.9f, 1));
        mangas.add(new Manga(2L, "Drrr!!!", 2.9f, 1));
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}