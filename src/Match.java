import java.util.Scanner;
import java.util.Random;

/*	Classe : Match
*	Méthodes :
*		Constructeur avec modification du nombre de points global des joueurs
*		Méthode d'affichage des fiches des joueurs
*		Méthode affichant les informations sur le match : Joueurs, table, heure
*		Méthode affichant les informations sur le match : Joueurs, table, heure ainsi que l'issue de celui-ci
*		getJoueur : retourne le joueur i(0,1) du match
*/
	
public class Match
{
	static Random rand=new Random();
	private Joueur j[]= new Joueur[2];
	private String heure;
	private int table;
	private int result; // 0 si j[0] perd le match ; 1 si j[0] gagne le match
	
	/*	Constructeur
	*	avec modification du nombre de point global des joueurs
	*/	
	public Match(Joueur j1,Joueur j2, String heure, int table)
	{
		j[0]=j1;
		j[1]=j2;
		this.heure=heure;
		this.table=table;
		result=rand.nextInt(2); 
		if (result==0) //j2 gagne --> +4pts pour j2 -4pts pour j1
		{
			j[1].addPts(4);
			j[0].addPts(-4);
		}
		else //j1 gagne --> +2pts pour j1 -2pts pour j2
		{
			j[0].addPts(2);
			j[1].addPts(-2);
		}		
	}
	// Méthode d'affichage des fiches des joueurs
	public void affichJoueurs()
	{
		j[0].affich();
		j[1].affich();
	}
	
	// Méthode affichant les informations sur le match : Joueurs, table, heure
	public void affich()
	{
		System.out.println("Match");
		j[0].affichNomPrenom();
		System.out.print(" versus ");
		j[1].affichNomPrenom();
		System.out.println("\nÀ "+heure+" à la table n°"+table);
		System.out.println("----------------------");
	}
	
	// Méthode affichant les informations sur le match : Joueurs, table, heure
	//	ainsi que l'issue de celui-ci
	public void affichResultat()
	{
		System.out.println("Match");
		j[0].affichNomPrenom();
		System.out.print(" versus ");
		j[1].affichNomPrenom();
		System.out.println("\nÀ "+heure+" à la table n°"+table);
		if (result==0)
		{
			j[1].affichNomPrenom();
			System.out.print(" a gagné ! ");
		}
		else
		{
			j[0].affichNomPrenom();
			System.out.print(" a gagné ! ");
		}
		System.out.println("\n----------------------");
	}
	
	// getJoueur : retourne le joueur i(0,1) du match
	public Joueur getJoueur(int i)
	{
		return j[i];
	}

}