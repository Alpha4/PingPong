import java.util.Scanner;
/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
*@author Aurelien Brisseau et Hippolyte Gandon
*@version 1.0
*@date 12/10/2012
*/

public class Ping{	
	static Scanner sc= new Scanner(System.in);
	/* Classe : Joueur
	Méthodes : Constructeur, affichage, setPts
	*/
	public class Joueur
	{
		private String nom;
		private String prenom;
		private String club;
		private int pts;
		private int ptsavant;
	
		public Joueur(String nom,String prenom,String club,int pts)
		{
			this.nom=nom;
			this.prenom=prenom;
			this.club=club;
			this.pts=pts;
			this.ptsavant=pts;
		}

		public void affich()
		{
			System.out.println("Joueur : "+nom+" "+prenom);
			System.out.println("Club : "+club);
			System.out.println("Nombre de points avant la compétition : "+ptsavant);
			System.out.println("Nombre de points après la compétition : "+pts);
			System.out.println("---------------");
		}
		
		public void setPts(int pts){
			this.pts=pts;
		}
	}
	
	/* Classe : Classement
	Méthodes : Constructeur et tri
	*/
	public class Classement
	{
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
			if (auto.equals("non"))
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
			else
			{
				this(); //java:88: call to this must be first statement in constructor
			}
		}
		public void tri(){
			boolean permut;
			do
			{
				permut= false;
				for (int i=0; i<15;i++)
				{
					if (j[i].pts<j[i+1].pts)
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

	/* Classe : Poule
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
	
	
	/* Classe : Match
	Méthodes : Constructeur, affichage, resultat, affichageScore
	*/
	
	public class Match
	{
		private Joueur j[]= new Joueur[2];
		private String heure;
		private int table;
		private int result;
		
		public Match(Joueur j1,Joueur j2)
		{
		
		}
	}
}