import java.util.Scanner;
import java.util.Random;

/*	Classe : Poule
*	Méthodes :
*		Constructeur avec copie du nombre de points indiqués dans la variable ptsavant
*		Méthode d'affichage de toutes les fiches de joueurs de la poule
*		getJoueur : retourne le joueur i(0,1,2,3) de la poule
*		Méthode d'affichage de tous les matchs de la poule
*		 Méthode d'affichage de tous les matchs de la poule avec leur résultats !
*/

public class Poule
{
	private int num;
	private Joueur j[]= new Joueur[4];
	private Match m[]= new Match[6];
	
	/*	Constructeur
	*	Joueurs sélectionnés dans le classement c à partir du numéro de Poule
	*	table indique la première table utilisée par la poule
	*/
	public Poule(int num, Classement c,int table)
	{
		this.num=num;
		j[0]=c.getJoueur(num-1);
		j[1]=c.getJoueur(num+3);
		j[2]=c.getJoueur(num+7);
		j[3]=c.getJoueur(num+11);
		m[0]= new Match(j[0],j[1],"9:00",table);
		m[1]= new Match(j[2],j[3],"9:00",(table+1));
		m[2]= new Match(j[0],j[2],"9:45",table);
		m[3]= new Match(j[1],j[3],"9:45",(table+1));
		m[4]= new Match(j[0],j[3],"10:30",table);
		m[5]= new Match(j[1],j[2],"10:30",(table+1));
	}
	
	// getJoueur : retourne le joueur i(0,1,2,3) de la poule
	public Joueur getJoueur(int i)
	{
		return j[i];
	}
	
	// Méthode d'affichage de toutes les fiches de joueurs de la poule
	public void affichJoueurs()
	{
		for(int i=0;i<4;i++)
		{
			j[i].affich(); // Appel de la fonction d'affichage de la fiche du'n joueur
		}
	}
	
	// Méthode d'affichage de tous les matchs de la poule
	public void affichMatchs()
	{
		for(int i=0;i<6;i++)
		{
			m[i].affich(); //Appel de la fonction d'affichage de la classe Match
		}
	}
	
	// Méthode d'affichage de tous les matchs de la poule avec leur résultats !
	public void affichResultats()
	{
		for(int i=0;i<6;i++)
		{
			m[i].affichResultat(); //Appel de la fonction d'affichage de résultat de la la classe match 
		}
	}
}
