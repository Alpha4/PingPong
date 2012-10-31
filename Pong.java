import java.util.Scanner;
/**
*Projet de TP : Gestion d'un tournoi de tennis de table 
*@author Aurelien Brisseau et Hippolyte Gandon
*@version 1.0
*@date 12/10/2012
*/
public class Pong
{
/* Programme principal*/
	public static void main (String[] args)
	{
		/*initialisation*/
		Scanner sc= new Scanner(System.in);
		System.out.print("Voulez vous entrez manuellement les joueurs ?(oui/non) ");
		String auto=sc.next();
		Classement c= new Classement(auto);
		c.tri();
		

		/*Menu*/
		int choix=1;
		do
		{
			System.out.println("*****MENU*****");
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
						int i=0;
						while (nom.equals(c.j[i].nom)==false)
						{
							i++;
						}
						c.j[i].affich();
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