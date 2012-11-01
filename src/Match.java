import java.util.Scanner;
import java.util.Random;

/*Classe : Match
Méthodes : Constructeur, affichage, resultat, affichageScore
*/	
public class Match
{
	static Random rand=new Random();
	private Joueur j[]= new Joueur[2];
	private String heure;
	private int table;
	private int result; // 0 si j[0] perd le match ; 1 si j[0] gagne le match
	
	public Match(Joueur j1,Joueur j2, String heure, int table)
	{
		j[0]=j1;
		j[1]=j2;
		this.heure=heure;
		this.table=table;
		result=rand.nextInt(2);
	}
}