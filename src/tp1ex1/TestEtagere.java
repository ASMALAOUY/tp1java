package tp1ex1;

public class TestEtagere {

    public static void main(String[] args) {

        try {

            
            Etagere e = new Etagere(3);

            
            Livre l1 = new Livre(
                    "Mon histoire",
                    "Ali Baba",
                    200,
                    100
            );

            Livre l2 = new Livre(
                    "Java",
                    "Mohamed",
                    300,
                    250
            );

            Livre l3 = new Livre(
                    "Python",
                    "Sara",
                    150
            );

           
            e.ajouter(l1);
            e.ajouter(l2);
            e.ajouter(l3);

            
            System.out.println(" ETAGERE ");
            System.out.println(e);

           
            System.out.println(" GET LIVRE ");
            System.out.println(e.getLivre(2));

            
            System.out.println(" RECHERCHE ");

            int position = e.chercherLivre(
                    "Java",
                    "Mohamed"
            );

            System.out.println(
                    "Position du livre : " + position
            );

            
            Livre l4 = new Livre(
                    "C++",
                    "Ahmed",
                    200,
                    120
            );

            e.ajouter(l4);

        } catch (EtagerePleineException e) {

            System.out.println(
                    "Exception : " + e.getMessage()
            );
        }
    }
}