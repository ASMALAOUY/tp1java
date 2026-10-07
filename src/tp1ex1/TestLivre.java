package tp1ex1;

import java.util.Arrays;

public class TestLivre {
    public static void main(String[] args) {
    	/*
    	Livre l1=new Livre();
    	Livre l2 = new Livre("Mon histoire", "Ali Baba", 100);
    	Livre l3 = new Livre("java", "hassan", 400,300);
    	  
    	
    	System.out.println("affiche des livres ");
    	l1.afficheToi();
    	l2.afficheToi();
    	l3.afficheToi();
    	System.out.println("test des setters");
    	l3.setTitre("programmation java");
    	l3.setAuteur("Ahmed");
    	l3.setPrix(250);
    	l3.setNbPage(350);
    	
    	l3.afficheToi();
    	
    	System.out.println("test de ToString");
    	 
    	System.out.println(l3.toString());
    	
    	System.out.println("test de equals()");
    	
    	Livre l4 =new Livre("Programmation Java", "Ahmed", 250, 350);
    	System.out.println("l3 est equal l4 :"+l3.equals(l4));
    	
    	System.out.println("test de hashCode()");
    	
    	System.out.println("hachCode de l3 : "+ l3.hashCode());
    	
    	*/
    	Livre[] livres = new Livre[150];

        for (int i = 0; i < livres.length; i++) {
            livres[i] = new Livre(
                    "Titre " + i,
                    "Auteur " + i,
                    100 + i,
                    50 + i
            );
        }

        Arrays.sort(livres);

        for (Livre livre : livres) {
            System.out.println(livre);
        }
    	
    }
}
