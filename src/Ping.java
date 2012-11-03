import java.util.Scanner;
import java.util.Random;

/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
*@author Aurelien Brisseau et Hippolyte Gandon
*@version 1.0
*@date 12/10/2012
*/

public class Ping
{

	/* Programme principal*/
	public static void main (String[] args)
	{
		/*initialisation*/
		Scanner sc= new Scanner(System.in);
		System.out.print("Voulez vous entrez manuellement les joueurs ?(oui/non) ");
		String auto=sc.next();
		//Création du classement
		Classement c;
		if (auto.equals("non"))
		{
			c=new Classement(auto);
		}
		else
		{
			c=new Classement();
		}
		// Création des poules (avec déroulement des matchs)
		Poule p1= new Poule(1,c,1);
		Poule p2= new Poule(2,c,3);
		Poule p3= new Poule(3,c,5);
		Poule p4= new Poule(4,c,7);
		// Création des match de quarts de finale
		Match q1=new Match(p1.getJoueur(0),p4.getJoueur(1),"15:00",1);
		Match q2=new Match(p3.getJoueur(0),p2.getJoueur(1),"15:00",2);
		Match q3=new Match(p4.getJoueur(0),p1.getJoueur(1),"15:00",3);
		Match q4=new Match(p2.getJoueur(0),p3.getJoueur(1),"15:00",4);
		// Création des matchs de demi finale
		
		//Création des matchs de finale et petite finale

		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("*********MENU*********");
			System.out.println("1) Fiches des joueurs");
			System.out.println("2) Poules");
			System.out.println("3) Quarts de finale");
			System.out.println("4) Demi finales");
			System.out.println("5) Finales");
			System.out.println("6) Podium");
			System.out.println("7) Sortie du programme");
			System.out.print("Choix : ");
			choix=sc.nextInt();
			System.out.println("----------------------");
			switch(choix)
			{				
				case	1 :
					System.out.println("Entrer le nom d'un joueur pour voir sa fiche ou 'tous' pour toutes les fiches :");
					String nom=sc.next();
					System.out.println("----------------------");
					c.affich(nom);
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
							System.out.println("3) Affichage des résultats");
							System.out.println("4) Affichage du classement");
							System.out.println("5) Retour");
							System.out.print("Choix : ");
							ch=sc.nextInt();
							System.out.println("----------------------");
							switch(ch)
							{
								case 1:
									switch(poule)
									{
										case 1:
											p1.affichJoueurs();
											break;
								
										case 2:
											p2.affichJoueurs();
											break;
								
										case 3:
											p3.affichJoueurs();
											break;
											
										case 4:
											p4.affichJoueurs();
											break;
									}
									break;
								
								case 2:
									switch(poule)
									{
										case 1:
											p1.affichMatchs();
											break;
								
										case 2:
											p2.affichMatchs();
											break;
								
										case 3:
											p3.affichMatchs();
											break;
											
										case 4:
											p4.affichMatchs();
											break;
									}
									break;
								
								case 3:
									switch(poule)
									{
										case 1:
											p1.affichResultats();
											break;
								
										case 2:
											p2.affichResultats();
											break;
								
										case 3:
											p3.affichResultats();
											break;
											
										case 4:
											p4.affichResultats();
											break;
									}
									break;
								
								case 4:
									switch(poule)
									{
										case 1:
											p1.affichClassement();
											break;
								
										case 2:
											p2.affichClassement();
											break;
								
										case 3:
											p3.affichClassement();
											break;
											
										case 4:
											p4.affichClassement();
											break;
									}
									break;
							}
						}
						else
						{
							System.out.println("Entrer un numéro de poule valide : 1, 2, 3 ou 4.");
							System.out.println("----------------------");
						}
					}
					while (ch>0 && ch <5);
					break;
					
				case 3:
					q1.affichResultat();
					q2.affichResultat();
					q3.affichResultat();
					q4.affichResultat();	
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