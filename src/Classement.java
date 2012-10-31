/* Classe : Classement
	Méthodes : Constructeur et tri
	*/
import java.util.Scanner;
public class Classement
{
	Scanner sc= new Scanner(System.in);
	private Joueur[] j= new Joueur[16];
		public Classement()
	{
		for (int i=1; i<17; ++i)
		{
			System.out.println("Entrez les nom, prénom, club et nombre de points du joueur "+i);
			String nom=sc.next();
			String prenom=sc.next();
			String club=sc.next();
			int pts=sc.nextInt();
			j[i-1]= new Joueur(nom,prenom,club,pts);
		}
	}
	
	public Classement(String auto)
	{
		j[0]= new Joueur("Dark","Vador","Côté Obscur",600);
		j[1]= new Joueur("Darth","Sidious","Côté Obscur",612);
		j[2]= new Joueur("Skywalker","Luke","Côté Clair",555);
		j[3]= new Joueur("Kenobi","Obiwan","Côté Clair",599);
		j[4]= new Joueur("Jin","Qui-Gon","Côté Clair",613);
		j[5]= new Joueur("Maître","Yoda","Côté Clair",620);
		j[6]= new Joueur("C3","PO","Droïde",500);
		j[7]= new Joueur("R2","D2","Droïde",512);
		j[8]= new Joueur("Bros","Mario","Nintendo",520);
		j[9]= new Joueur("Bros","Luigi","Nintendo",519);
		j[10]= new Joueur("Princesse","Peach","Nintendo",510);
		j[11]= new Joueur("Papy","Champi","Nintendo",513);
		j[12]= new Joueur("Yoshi","vert","Nintendo",518);
		j[13]= new Joueur("Donkey","Kong","Nintendo",515);
		j[14]= new Joueur("The Hedgehog","Sonic","SEGA",517);
		j[15]= new Joueur("Miles","'Tails' Prower","SEGA",516);
	}
	public void tri(){
		boolean permut;
		do
		{
			permut= false;
			for (int i=0; i<15;i++)
			{
				if (j[i].getPts()<j[i+1].getPts())
				{
					Joueur tmp=j[i+1];
					j[i+1]=j[i];
					j[i]=tmp;
					permut=true;
				}
			}
		}while (permut ==true);
	}
}
