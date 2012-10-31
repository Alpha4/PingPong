import java.util.Scanner;
/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
*@author Aurelien Brisseau et Hippolyte Gandon
*@version 1.0
*@date 12/10/2012
*/

public class Ping{
	Scanner sc= new Scanner(System.in);
	
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
		private Joueur j1;
		private Joueur j2;
		private Joueur j3;
		private Joueur j4;
	
		public Poule(int num, Classement c)
		{
			this.num=num;
			j1=c.j[num-1];
			j2=c.j[num+3];
			j3=c.j[num+7];
			j4=c.j[num+11];
		}
	}
	/* Classe : Match
	Méthodes : Constructeur, affichage, resultat, affichageScore
	*/
	public class Match
	{
	
	}
	
	/* Programme principal*/
	public static void main (String[] args)
	{
		/*initialisation*/
		Ping pong = new Ping();
		Classement c= pong.new Classement();
		c.tri();
		

		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("1) Fiches des joueurs");
			System.out.println("2) Poules");
			System.out.println("3) Quarts de finale");
			System.out.println("4) Demi finales");
			System.out.println("5) Finales");
			System.out.println("6) Podium");
			System.out.println("7) Sortie du programme");
			System.out.print("Choix : ");
			choix=sc.nextInt();
			System.out.println("---------------");
			switch(choix)
			{				
				case	1 :
					System.out.println("Entrer le nom de joueur pour voir sa fiche ou 'tous' pour toutes les fiches");
					String nom=sc.next();
					if (nom.equals("tous"))
					{
						for(int i=0;i<16;i++)
						{
							c.j[i].affich();
						}
					}
					else
					{
					
					}
					break;
				case 2 :
					int ch=1;
					do
					{
						System.out.print("Choix d'une poule : ");
						int poule=sc.nextInt();
						if (poule>0 && poule <5)
						{
							System.out.println("----------------------");
							System.out.println("1) Affichage des joueurs");
							System.out.println("2) Affichage des matchs");
							System.out.println("3) Affichage du classement");
							System.out.println("4) Affichage des résultats");
							System.out.println("5) Retour");
							ch=sc.nextInt();
							switch(ch)
							{
								case 1:
									System.out.println("1!");
									break;
								
								case 2:
									System.out.println("2!");
									break;
								
								case 3:
									System.out.println("3!");
									break;
								
								case 4:
									System.out.println("4!");
									break;
							}
						}
						else
						{
							System.out.println("Entrer un numéro de poule valide : 1, 2, 3 ou 4.");
						}
					}
					while (ch>0 && ch <5);
					break;
					
				case 3:
					System.out.println("3!");		
					break;
							
				case 4:
					System.out.println("4!");	
					break;
							
				case 5:
					System.out.println("5!");		
					break;
					
				case 6:
					System.out.println("6!");		
					break;
			}
		}
		while(choix>0 && choix<7);
	}
}