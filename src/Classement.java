import java.util.Scanner;
import java.util.Random;

/**	Classe : Classement
*	Méthodes :
*		Constructeur avec saisie
*		Constructeur avec données préenregistrées
*		Méthode de tri du tableau en fonction des points
*		Méthode d'affichage des fiches des joueurs (soit tous soit un par son nom)
*		getJoueur : retourne le joueur i(0,1,…,15) du classement
*/
public class Classement
{
	static Scanner sc= new Scanner(System.in);
	private Joueur[] j= new Joueur[16];
	
	/**	Constructeur
	* 	avec saisie des données
	* @see #tri
	* @see Joueur#Joueur(String nom,String prenom,String club,int pts)
	*/
	public Classement()
	{
		for (int i=0; i<16; ++i)
		{
			System.out.println("Entrez les nom, prénom, club et nombre de points du joueur "+(1+i));
			String nom=sc.next();
			String prenom=sc.next();
			String club=sc.next();
			int pts=sc.nextInt();
			j[i]= new Joueur(nom,prenom,club,pts);
		}
		tri();
	}
	
	/**	Constructeur
	*	 d'un classement préenregistré pour tester
	* @see Joueur#Joueur(String nom,String prenom,String club,int pts)
	* @see #tri
	*/
	public Classement(String auto)
	{
		j[0]= new Joueur("Dark","Vador","Côté Obscur",600);
		j[1]= new Joueur("Darth","Sidious","Côté Obscur",612);
		j[2]= new Joueur("Skywalker","Luke","Côté Clair",555);
		j[3]= new Joueur("Kenobi","Obi-Wan","Côté Clair",599);
		j[4]= new Joueur("Jin","Qui-Gon","Côté Clair",613);
		j[5]= new Joueur("Maître","Yoda","Côté Clair",620);
		j[6]= new Joueur("C3","PO","Droïde",500);
		j[7]= new Joueur("R2","D2","Droïde",512);
		j[8]= new Joueur("Mario","Mario","Nintendo",520);
		j[9]= new Joueur("Bros","Luigi","Nintendo",519);
		j[10]= new Joueur("Princesse","Peach","Nintendo",510);
		j[11]= new Joueur("Robbes","Didier","Java",513);
		j[12]= new Joueur("Granvilliers","Laurent","Java",518);
		j[13]= new Joueur("Donkey","Kong","Nintendo",515);
		j[14]= new Joueur("The Hedgehog","Sonic","SEGA",517);
		j[15]= new Joueur("Miles","'Tails' Prower","SEGA",516);
		tri();
	}
	
	/** Méthode triant le tableau par ordre décroissant des points(pts) des joueurs
	* @see Joueur#getPtsAvant()
	*/
	private void tri(){
		boolean permut; //tri à bulles :D
		do
		{
			permut= false;
			for (int i=0; i<15;i++)
			{
				if (j[i].getPtsAvant()<j[i+1].getPtsAvant())
				{
					Joueur tmp=j[i+1];
					j[i+1]=j[i];
					j[i]=tmp;
					permut=true;
				}
			}
		}while (permut ==true);
	}
	
	/** getJoueur : retourne le joueur i(0,1,…,15) du classement
	* @param i indice du joueur à retourner
	* @return j[i] Joueur désiré 
	*/
	public Joueur getJoueur(int i)
	{
		return j[i];
	}
	
	/** Affichage de fiches de Joueurs
	* @param nom nom du joueur dont on veut afficher la fiche ou "tous" pour toutes les fiches
	* @see Joueur#getNom()
	* @see Joueur#affich()
	*/
	public void affich(String nom)
	{
		if (nom.equals("tous")) //Affichage de toutes les fiches
		{
			for(int i=0;i<16;i++) 
			{
				j[i].affich(); // appel de la fonction d'affichage de la fiche d'un joueur pour tous les j[i] du classement
			}
		}
		else // Affichage de la fiche du joueur 
		{
			int i=0;
			while (nom.equals(j[i].getNom())==false && i<16) // Recherche de l'indice du joueur portant ce nom
			{
				i++;
			}
			if (nom.equals(j[i].getNom())==true)
			{
				j[i].affich();
			}
			else //Erreur si le joueur n'existe pas
			{
				System.out.println("Ce joueur n'existe pas");
				System.out.println("----------------------");
			}
		}
	}
}
