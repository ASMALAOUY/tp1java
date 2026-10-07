package tp1ex1;

public class Etagere {

    private Livre[] livres;
    private int nombreLivres;

    public Etagere(int capacite) {
        livres = new Livre[capacite];
        nombreLivres = 0;
    }

    
    public void ajouter(Livre livre) throws EtagerePleineException {

        if (nombreLivres == livres.length) {
            throw new EtagerePleineException(
                    "L'étagère est pleine"
            );
        }

        livres[nombreLivres] = livre;
        nombreLivres++;
    }

    
    public Livre getLivre(int position) {

        if (position < 1 || position > nombreLivres) {
            return null;
        }

        return livres[position - 1];
    }

    // 
    public int chercherLivre(String titre, String auteur) {

        for (int i = 0; i < nombreLivres; i++) {

            if (livres[i].getTitre().equals(titre)
                    && livres[i].getAuteur().equals(auteur)) {

                return i + 1;
            }
        }

        return 0;
    }

    
    @Override
    public String toString() {

        String resultat = "";

        for (int i = 0; i < nombreLivres; i++) {

            resultat += (i + 1) + " : "
                    + livres[i].toString()
                    + "\n";
        }

        return resultat;
    }

   
    public Livre retirer() throws EtagereVideException {

        if (nombreLivres == 0) {
            throw new EtagereVideException(
                    "L'étagère est vide"
            );
        }

        Livre livre = livres[nombreLivres - 1];

        livres[nombreLivres - 1] = null;
        nombreLivres--;

        return livre;
    }
}