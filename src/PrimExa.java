//María de Jesús Silva Hernández 160808
///////////////////////////////////////
import java.util.Scanner;
import java.util.*;
public class PrimExa {
	//1
	public static String Prima(String primayu) {
		String cha = primayu.substring(0,1);
		System.out.println("cha: "+cha);
		String chan = primayu.substring(1);
		System.out.println("chan: "+chan);
		cha = cha.toUpperCase();
		String chang=cha+chan;
		return chang;
	}
	//////////
	//2 
    //private static String alrev(String segal) {
    	//if (segal == null || segal.equals("")) { 
          //  return segal;
        //}
        //return segal.charAt(segal.length() - 1) + alrev(segal.substring(0, segal.length() - 1));
    	//}
    public static String alrev (String segal) {
    	String scand="";
    	char cao;
    	for(int t=segal.length()-1; t>=0; t-- ) {
    		cao=segal.charAt(t);
    		scand+=cao;
    		//scand = scand+=segal.charAt(t);
    	}
    	return scand;
    }
    /////////
    //3
    public static String vocma (String tercer) {
		String scant="";
    	String vocmayu= tercer.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
		return vocmayu;
    }
    
    /////////
    //4
    public static String fibu(String mul) {
    	int j;
    	j = Integer.parseInt(mul);
    	String mulc = "";
    	//int j=100;
    	for(int k=0; k<=j; k++) {
    		if(k%3==0 && (!(k%5==0))) {
    			mulc=mulc.concat("Fizz\n");
    		continue;
    		}
    		if(k%5==0 && (!(k%5==0))) {
    			mulc=mulc.concat("Buzz\n");
    		continue;
    		}
    		if(k%3==0 && k%5==0) {
    			mulc=mulc.concat("FizzBuzz\n");
    		continue;
    		}
    		else {
				if(!(k%3==0 || k%5==0)) {
					mulc=mulc.concat(""+k+"\n");
				continue;
				}
			}
    	}
    	return mulc;
    }
    /////////
    //5
	public static String palincade(String p) {
	   p=p.toLowerCase();
	   String pali ="";
	   //
	   char car;
	   for(int g=p.length()-1; g>=0; g--) {
		   car = p.charAt(g);
		   pali +=car;
	   }
	   return pali; 
	}
	
    //Separarlo
	public static void main(String[]args) {
		while(true) {
			System.out.println("Si quieres poner en mayuscula la primera letra de una cadena, ingresa 1.\n"
					+ "Si quieres poner al reves una cadena, ingresa 2.\nSi quieres poner en mayuscula las vocales letra de una cadena, ingresa 3.\n"
					+ "Si quieres ver a lo multiplos de 3 y 5 como strings, ingresa 4.\nSi quieres saber si una frase es palindromo, ingresa 5.\n\n"
					+ "Si quieres salir del programa, ingresa 7");
			Scanner re = new Scanner (System.in);
			int res = re.nextInt();
			switch(res) {
			case 1:
			//1 Separo la primera letra (caracter) de toda la cadena y luego la pingo en mayuscula y luego las junto
				Scanner scan = new Scanner (System.in);
				System.out.println("Ingresa la cadena");
				String primayu=scan.nextLine();
				System.out.println("Elegiste: "+primayu);
				String chang = Prima(primayu);
				System.out.println("Queda asi:"+chang+"\n");
			break;
			case 2:
			//2 Uso chartAt	    	
				Scanner scand = new Scanner (System.in);
				System.out.println("Ingresa la cadena para ponerla al revés");
				String segal=scand.nextLine();
				System.out.println("Elegiste: "+segal);
				String lye = alrev(segal);
				System.out.println("Alreves es: "+lye+"\n");
			break;
			case 3:
			//3
				Scanner scant = new Scanner (System.in);
				System.out.println("Ingresa la cadena para poner todas las vocales en mayuscula");
				String tercer=scant.nextLine().toLowerCase();
				System.out.println("Elegiste: "+tercer);
				//String tercer = "Hasta luego cocodrilo";
				String vocmayu =vocma(tercer);
				System.out.println("vocales: "+vocmayu+"\n");
			break;
			case 4:
			//4
				System.out.println("Ingrese el numero limite");
				Scanner scanp = new Scanner (System.in);
				String mul = scanp.nextLine();
				String mulc=fibu(mul);
				System.out.println(""+mulc+"\n");
			break;
			case 5:
			//5
				System.out.println("Ingresa y te digo si es plaindromo");
				Scanner pali = new Scanner (System.in);
				String p = pali.nextLine().toLowerCase().replaceAll(" ", "");
				String palin = palincade(p);
				if(p.equals(palin)) {
					System.out.println("Es palindromo\n");
				}
				else {
					System.out.println("No es palindromo\n");
				}
			break;
			case 7:
				System.out.println("Saliendo");
				System.exit(0);
			break;
			}
		}	
	}
}
	
