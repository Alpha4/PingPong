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
		j[0]=c.j[num-1];
		j[1]=c.j[num+3];
		j[2]=c.j[num+7];
		j[3]=c.j[num+11];
	}
}
