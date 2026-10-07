package tp1ex1;

import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {

        HashSet<Livre> livres = new HashSet<>();

        Livre l1 = new Livre("Java", "Ali", 200, 100);
        Livre l2 = new Livre("Java", "Ahmed", 200, 300);
        Livre l3 = new Livre("Python", "Sara", 300, 250);

        livres.add(l1);
        livres.add(l2);
        livres.add(l3);

        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}