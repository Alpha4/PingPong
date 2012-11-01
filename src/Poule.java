import java.util.Scanner;
import java.util.Random;

/*Classe : Poule
Méthodes : Constructeur, affichageResultats
*/
public class Poule
{
	private int num;
	private Joueur j[]= new Joueur[4];
	private Match m[]= new Match[6];

	public Poule(int num, Classement c)
	{
		this.num=num;
		j[0]=c.getJoueur(num-1);
		j[1]=c.getJoueur(num+3);
		j[2]=c.getJoueur(num+7);
		j[3]=c.getJoueur(num+11);
		m[0]= new Match(j[0],j[1],"9:00",1);
		m[1]= new Match(j[2],j[3],"9:00",2);
		m[2]= new Match(j[0],j[2],"9:45",1);
		m[3]= new Match(j[1],j[3],"9:45",2);
		m[4]= new Match(j[0],j[3],"10:30",1);
		m[5]= new Match(j[1],j[2],"10:30",2);
	}
}
