import java.util.Scanner;
import java.util.Random;

/*	Classe : Poule
*	Méthodes :
*		Constructeur : Joueurs sélectionnés dans le classement c à partir du numéro de Poule ; table indique la première table utilisée par la poule ; puis tri par nombre de victoires
*		Méthode d'affichage de toutes les fiches de joueurs de la poule
*		getJoueur : retourne le joueur i(0,1,2,3) de la poule
*		Méthode d'affichage de tous les matchs de la poule
*		Méthode d'affichage de tous les matchs de la poule avec leur résultats !
*		Méthode d'affichage du classement de la poule
*		Méthode calculant le nombre de victoires pour chaque joueur puis triant le tableau par ordre décroissant du nombre de victoire des joueurs
*/

public class Poule
{
	private int num;
	private Joueur j[]= new Joueur[4];
	private Match m[]= new Match[6];
	
	/*	Constructeur
	*	Joueurs sélectionnés dans le classement c à partir du numéro de Poule
	*	table indique la première table utilisée par la poule
	*	puis tri par nombre de victoires
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
		tri();
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
			j[i].affich(); // Appel de la fonction d'affichage de la fiche d'un joueur
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
	
	// Méthode calculant le nombre de victoires pour chaque joueur puis triant le tableau par ordre décroissant du nombre de victoire des joueurs
	private void tri(){
		for (int i=0;i<6;i++)
		{
			if (m[i].getResult()==0) //j2 gagne --> nb de victoires+=1
			{
				m[i].getJoueur(1).victoire();
			}
			else //j1 gagne --> nb de victoires+=1
			{
				m[i].getJoueur(0).victoire();
			}		
		}
		boolean permut; //tri à bulles :D
		do
		{
			permut= false;
			for (int i=0; i<3;i++)
			{
				if (j[i].getVict()<j[i+1].getVict())
				{
					Joueur tmp=j[i+1];
					j[i+1]=j[i];
					j[i]=tmp;
					permut=true;
				}
				else if (j[i].getVict()==j[i+1].getVict())
				{
					if (j[i].getPts()<j[i+1].getPts())
					{
						Joueur tmp=j[i+1];
						j[i+1]=j[i];
						j[i]=tmp;
						permut=true;
					}
				}
			}
		}while (permut ==true);
	}
	//Méthode d'affichage du classement de la poule
	public void affichClassement()
	{
		j[0].affichNomPrenom();
		System.out.println(" est premier de la poule avec "+j[0].getVict()+" victoire(s).");
		j[1].affichNomPrenom();
		System.out.println(" est second de la poule avec "+j[1].getVict()+" victoire(s).");
		j[2].affichNomPrenom();
		System.out.println(" est troisième de la poule avec "+j[2].getVict()+" victoire(s).");
		j[3].affichNomPrenom();
		System.out.println(" est quatrième de la poule avec "+j[3].getVict()+" victoire(s).");
		System.out.println("----------------------");
	}
}
