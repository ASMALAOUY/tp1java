package tp1ex1;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        TreeMap<Livre, Integer> livres = new TreeMap<>();

        Livre l1 = new Livre(
                "Java",
                "Ali",
                200,
                100
        );

        Livre l2 = new Livre(
                "Python",
                "Sara",
                300,
                250
        );

        Livre l3 = new Livre(
                "C++",
                "Ahmed",
                150,
                200
        );

        Livre l4 = new Livre(
                "HTML",
                "Omar",
                400,
                120
        );

        livres.put(l1, l1.getNbPage());
        livres.put(l2, l2.getNbPage());
        livres.put(l3, l3.getNbPage());
        livres.put(l4, l4.getNbPage());

        
        for (Map.Entry<Livre, Integer> entry : livres.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " → "
                    + entry.getValue()
                    + " pages"
            );
        }
    }
}