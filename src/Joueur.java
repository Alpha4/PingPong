import java.util.Scanner;
import java.util.Random;

/* Classe : Joueur
Méthodes : Constructeur, affichage, setPts
*/
public class Joueur
	{
		private String nom;
		private String prenom;
		private String club;
		private int pts;
		private int ptsavant;
	
		public Joueur(String nom,String prenom,String club,int pts)
		{
			this.nom=nom;
			this.prenom=prenom;
			this.club=club;
			this.pts=pts;
			this.ptsavant=pts;
		}

		public void affich()
		{
			System.out.println("Joueur : "+nom+" "+prenom);
			System.out.println("Club : "+club);
			System.out.println("Nombre de points avant la compétition : "+ptsavant);
			System.out.println("Nombre de points après la compétition : "+pts);
			System.out.println("---------------");
		}
		
		public void addPts(int pts){
			this.pts+=pts;
		}
		public int getPts()
		{
			return this.pts;
		}
		public String getNom()
		{
			return this.nom;
		}
		public String getPrenom()
		{
			return this.prenom;
		}
	}