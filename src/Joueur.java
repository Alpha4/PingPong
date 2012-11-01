import java.util.Scanner;
import java.util.Random;

/*	Classe : Joueur
*	Méthodes :
*		Constructeur avec copie du nombre de points indiqués dans la variable ptsavant
*		Méthode d'affichage de la fiche du joueur i.e. toutes ses infos
*		Méthode de mise à jour du nombre de points
*		getPts : retourne le nombre de points du joueur
*		getNom : retourne le nom du joueur
*		Méthode affichant les nom et prénom du joueur
*/
public class Joueur
	{
		private String nom;
		private String prenom;
		private String club;
		private int pts;
		private int ptsavant;
	
		/*	Constructeur
		*	avec copie du nombre de points indiqués dans la variable ptsavant
		*/
		public Joueur(String nom,String prenom,String club,int pts)
		{
			this.nom=nom;
			this.prenom=prenom;
			this.club=club;
			this.pts=pts;
			this.ptsavant=pts;
		}
		
		// Méthode d'affichage de la fiche du joueur i.e. toutes ses infos
		public void affich()
		{
			System.out.println("Joueur : "+nom+" "+prenom);
			System.out.println("Club : "+club);
			System.out.println("Nombre de points avant la compétition : "+ptsavant);
			System.out.println("Nombre de points après la compétition : "+pts);
			System.out.println("----------------------");
		}
		
		// Méthode de mise à jour du nombre de points
		public void addPts(int pts){
			this.pts+=pts; //ajout du nombre de points passé en paramètre à la variable pts
		}
		
		// getPts : retourne le nombre de points du joueur
		public int getPts()
		{
			return this.pts;
		}
		
		// getNom : retourne le nom du joueur
		public String getNom()
		{
			return this.nom;
		}
		
		// Méthode affichant les nom et prénom du joueur
		public void affichNomPrenom()
		{
			System.out.print(nom+" "+prenom);
		}
	}