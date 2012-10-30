import java.util.Scanner;
/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
*@author Aurelien Brisseau et Hippolyte Gandon
*@version 1.0
*@date 12/10/2012
*/

// Déclaration de la classe joueur et ses fonctions associées
public class Ping{
	Scanner sc= new Scanner(System.in);
	public class Joueur{
		private String nom;
		private String prenom;
		private String club;
		private int pts;
		private int ptsavant;
	
		public Joueur(String nom,String prenom,String club,int pts){
			this.nom=nom;
			this.prenom=prenom;
			this.club=club;
			this.pts=pts;
			this.ptsavant=pts;
			}

		public void affich(){
			System.out.println(nom+prenom);
			System.out.println("Club : "+club);
			System.out.println("Nombre de points avant la compétition : "+ptsavant);
			System.out.println("Nombre de points après la compétition : "+pts);
			System.out.println("---------------");
			}
	}
	public class Classement{
		private Joueur[] j= new Joueur[16];

		public Classement(){
			for (int i=1; i<17; ++i){
				System.out.println("Entrez les nom, prénom, club et nombre de points du joueur "+i);
				String nom=sc.next();
				String prenom=sc.next();
				String club=sc.next();
				int pts=sc.nextInt();
				j[i-1]= new Joueur(nom,prenom,club,pts);
				}
			}
		
		public void tri(){
			int i;
			int k;
			int p;
			for (k=0;k<16;k++){
				Joueur elt=j[k];
				p = k;
				while(p>=0&&j[p].pts>elt.pts){
					p--;
				}
				for(i=0; i<k-p;++i){
					j[k-i+1]=j[k-i];
				}
				j[p+1]=elt;
			}
			
		}
	}


	public class Poule{
		private int num;
		private Joueur j1;
		private Joueur j2;
		private Joueur j3;
		private Joueur j4;
	
		public Poule(int num, Classement c){
			this.num=num;
			j1=c.j[num-1];
			j2=c.j[num+3];
			j3=c.j[num+7];
			j4=c.j[num+11];
			}
	}	
	public static void main (String[] args){
		Ping pong = new Ping();
		Classement bloup= pong.new Classement();
		bloup.tri();
	}
}