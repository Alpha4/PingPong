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

	public void affich(nom){
		System.out.println(nom,prenom);
		System.out.println("Club : ",club);
		System.out.println("Nombre de points avant la compétition : ",ptsavant);
		System.out.println("Nombre de points après la compétition : ",pts);
		}
}
public class Classement{
	private Joueur[16];

	
	public void tri(){
		int i;
		int k;
		int p;
		for (k=0;k<16;k++){
			Joueur elt=Joueur[i];
			p = k;
			while(p>=0&&Joueur[p].pts>elt.pts){
				p--;
			}
			for(i=0; i<k-p;++i){
				Joueur[k-i+1]=Joueur[k-i];
			}
			Joueur[p+1]=elt;
		}
		
	}


}


public class Poule{
	private int num;
	private Joueur j1;
	private Joueur j2;
	private Joueur j3;
	private Joueur j4;
	
	public Poule(num){
		this.num=num;
		j1=
		j2=
		j3=
		j4=
		}
}
public static void main (String[] args){
	
	
}
}
