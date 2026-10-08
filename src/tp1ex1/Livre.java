package tp1ex1;

import java.util.Objects;

public class Livre implements Comparable<Livre> {
	private String titre;
	private String auteur;
	private double prix;
	private int nbPage;
	
	//const par defaut
	public Livre() {
		titre="";
		auteur="";
		prix=0;
		nbPage=0;
	}
	//const parametres
	public Livre(String titre,String auteur,double prix ,int nbPage) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
		this.nbPage=nbPage;
	}
	public Livre(String titre,String auteur,int nbPage) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=0;
		this.nbPage=nbPage;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	
	public void afficheToi() {
		if(prix>0) {
			System.out.println("<< :"+auteur +">>"
					+", << :\"+titre +\">>" 
					+","+prix+ " DH"
					+ nbPage + " pages  "
					);
		}else {
			System.out.println("<< "+auteur+">>"
					+"<< :"+titre +">>"
					+",Prix pas encore donne"
					+ nbPage + " , pages  ");
		}
	}
	@Override
	public String toString() {
	    if (prix > 0) {
	        return "<< " + auteur + " >>"
	                + ", << " + titre + " >>"
	                + ", " + prix + " DH"
	                + ", " + nbPage + " pages";
	    } else {
	        return "<< " + auteur + " >>"
	                + ", << " + titre + " >>"
	                + ", Prix pas encore donne"
	                + ", " + nbPage + " pages";
	    }
	}
	  @Override
	    public int hashCode() {
	        return Objects.hash(titre, prix);
	    }

	@Override
	public boolean equals(Object obj) {

	    if (this == obj)
	        return true;

	    if (obj == null || getClass() != obj.getClass())
	        return false;

	    Livre autre = (Livre) obj;

	    return Objects.equals(titre, autre.titre)
	            && Double.doubleToLongBits(prix)
	               == Double.doubleToLongBits(autre.prix);
	}
	
	/*
	 * @Override
    public int compareTo1(Livre o) {

    int resultat = autre.auteur.compareTo(this.auteur);

    if (resultat == 0) {
        resultat = autre.titre.compareTo(this.titre);
    }

    return resultat;
}
*/
	@Override
    public int compareTo(Livre autre) {

        return Double.compare(this.prix, autre.prix);
    }
	
}
