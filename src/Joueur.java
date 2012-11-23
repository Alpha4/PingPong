import java.util.Scanner;
import java.util.Random;

/**	Classe : Joueur
*	Méthodes :
*		Constructeur avec copie du nombre de points indiqués dans la variable ptsavant et victoire initialisé à 0
*		Méthode d'affichage de la fiche du joueur i.e. toutes ses infos
*		Méthode de mise à jour du nombre de points
*		Méthode de mise à jour du nombre de victoires
*		getPtsAvant : retourne le nombre de points du joueur avant la compétition
*		getVict : retourne le nombre de victoires du joueur
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
		private int victoire;
	
		/** Constructeur
		*	avec copie du nombre de points indiqués dans la variable ptsavant
		*	victoire initialisé à 0
		*/
		public Joueur(String nom,String prenom,String club,int pts)
		{
			this.nom=nom;
			this.prenom=prenom;
			this.club=club;
			this.pts=pts;
			this.ptsavant=pts;
			this.victoire=0;
		}
		
		/** Méthode d'affichage de la fiche du joueur i.e. toutes ses infos
		*/
		public void affich()
		{
			System.out.println("Joueur : "+nom+" "+prenom);
			System.out.println("Club : "+club);
			System.out.println("Nombre de points avant la compétition : "+ptsavant);
			System.out.println("Nombre de points après la compétition : "+pts);
			System.out.println("----------------------");
		}
		
		/** Méthode de mise à jour du nombre de points*/
		public void addPts(int pts){
			this.pts+=pts; //ajout du nombre de points passé en paramètre à la variable pts
		}
		
		/** Méthode de mise à jour du nombre de victoires*/
		public void victoire(){
			this.victoire+=1;
		}
		
		/** getPtsAvant : retourne le nombre de points du joueur
		* @return pts points du joueur
		*/
		public int getPtsAvant()
		{
			return this.pts;
		}

		/** getVict : retourne le nombre de victoires du joueur
		* @return victoire nombre de victoire du joueur
		*/
		public int getVict()
		{
			return this.victoire;
		}
		
		/** getNom : retourne le nom du joueur
		* @return nom nom du joueur
		*/
		public String getNom()
		{
			return this.nom;
		}
		
		/** Méthode affichant les nom et prénom du joueur*/
		public void affichNomPrenom()
		{
			System.out.print(nom+" "+prenom);
		}
	}
