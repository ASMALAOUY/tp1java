package tp1ex1;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<Livre> livres = new TreeSet<>();

        Livre l1 = new Livre("Java", "Ali", 200, 100);
        Livre l2 = new Livre("Python", "Sara", 300, 250);
        Livre l3 = new Livre("C++", "Ahmed", 150, 200);
        Livre l4 = new Livre("HTML", "Omar", 400, 120);

        livres.add(l1);
        livres.add(l2);
        livres.add(l3);
        livres.add(l4);

        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}