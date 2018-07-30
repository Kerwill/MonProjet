import java.lang.reflect.Array;
import java.util.Scanner;

public class PremiereClasse {

	public static void main(String[] args) {
		// Algo 11/07
		
//		 ecrire(puissance(120, 10));
//		 ecrire("Le nombre de caractères est " + nombreCarac(chaine("bonpcnfffdie")) +
//		 ".");
//		 ecrire("Le nombre de mots est " + nbMots(chaine("L'avion décolle !")) + ".");
//		 char[] tab = chaine("guillaume");
//		 trier(tab);
//		 ecrire(tab);

				// Exo 1

//		 int a;
//		 int n;
//		 ecrire("Saisir un nombre");
//		 a = lireEntier();
//		 ecrire("Saisir sa puissance");
//		 n = lireEntier();
//		 nouvelleLigne();
//		 ecrire("Le calcul que vous avez demandé a pour résultat : " + puissance(a,
//		 n));

				// Exo 2

		 char[] x;
		 char[] y;
		 char[] z;
		 int j = 0;
		 ecrire("Veuillez écrire un prénom");
		 x = lireChaine();
		 ecrire("Veuillez écrire un deuxième prénom");
		 y = lireChaine();
		 ecrire("Veuillez écrire un dernier prénom");
		 z = lireChaine();
		 
		 for(int i = 0; i < taille(x) && i < taille(y) && i < taille(z); i++) {
			 if (x[i]<y[i] && y[i]<z[i]) {
				 j = 0;
				 }
			 else {
			 j++;
			 }
		 }
			 if (j==0) {
			 ecrire("Ces noms sont classés alphabétiquement");
			 }
			 else {
			 ecrire("Ces noms ne sont pas classés");
			 }
				
				//Exo 3

//		int ca;
//		ecrire("Veuillez renseigner le C.A. du client");
//		ca = lireEntier();
//		nouvelleLigne();
//		if(ca<0) {
//			ecrire("Votre client ne l'est plus !");
//		}
//		if(ca>=0 && ca<=200) {
//			ecrire("Votre client est tout petit...");
//		}
//		if(ca>=201 && ca<= 10000) {
//			ecrire("Votre client est normal.");
//		}
//		if(ca>10000) {
//			ecrire("Votre client est énorme !");
//		}

				// On est en finale
				
//		 int f;
//		 int b;
//		 ecrire("Combien de but la France a t'elle marqué ?");
//		 f = lireEntier();
//		 ecrire("Combien de but la Belgique a t'elle marqué ?");
//		 b = lireEntier();
//		 nouvelleLigne();
//		 if (f==b) {
//		 ecrire("Match nul.");
//		 }
//		 else {
//		 if (f>b)
//		 ecrire("ON EST EN FINALE !");
//		 else {
//		 ecrire("Perdu =(...");
//		 }
//		}
				
				//Exo 4
//			saisirChiffre();

	}
	static void nouvelleLigne() {
		System.out.print("\r");
	}

	static char[] lireChaine() {
		Scanner myScanner = new Scanner(System.in);

		try {
			return myScanner.nextLine().toCharArray();
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return new char[1];
		}
	}

	static int lireEntier() {
		Scanner myScanner = new Scanner(System.in);

		try {
			return myScanner.nextInt();
		}

		catch (Exception ex) {
			return 0;
		}
	}

	static int taille(Object tab) {
		return Array.getLength(tab);
	}

	static char[] chaine(String s) {
		return s.toCharArray();
	}

	static void ecrire(char[] a) {
		System.out.println(a);
	}

	static void ecrire(int a) {
		System.out.println(a);
	}

	static void ecrire(String a) {
		System.out.println(a);
	}

	static int puissance(int a, int b) {
		int res = 1;

		if (a == 0) {
			return 0;
		}

		for (int i = 0; i < b; i++) {
			res = res * a;
		}

		return res;
	}

	static int nombreCarac(char[] tab) {
		int res = 0;
		for (int i = 0; i < taille(tab); i++) {
			if (tab[i] != 0) {
				res++;
			}
		}
		return res;
	}

	static int nbMots(char[] tab) {
		int res = 0;
		boolean isWord = false;

		for (int i = 0; i < taille(tab); i++) {
			if (tab[i] != ' ' && tab[i] != '!' && tab[i] != '\'') {
				if (!isWord) {
					res++;
					isWord = true;
				}
			}

			else {
				isWord = false;
			}
		}

		return res;
	}

	static void trier(char[] tab) {
		for (int i = taille(tab) - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (tab[i] < tab[j]) {
					char tmp = tab[i];
					tab[i] = tab[j];
					tab[j] = tmp;
				}
			}
		}
	}
	
	static void saisirChiffre() {
		int saisie = 0;
		int compteur = 1;
		int max = 0;
		int maxPos = 0;
		
		do {
			ecrire("Saisir un chiffre :");
			saisie = lireEntier();
			
			if (max < saisie) {
				max = saisie;
				maxPos = compteur;
			}
			
			compteur++;
			
		} while (saisie != 0);
		
		nouvelleLigne();
		ecrire("Chiffre plus grand =");
		ecrire(max);
		
		nouvelleLigne();
		ecrire("Position du chiffre plus grand =");
		ecrire(maxPos);
		}
}
