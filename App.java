package main;

import java.util.ArrayList;
import java.util.Scanner;

/* Viikko 3 ohjelma
 CT60A2411 Olio-ohjelmointi
 Tekijä: Minh Pham 
 Opiskelijanumero: 001851216
 Päivämäärä: 28/01/2024 */


public class App
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        // Eläintarhaolio
        System.out.println("Anna eläintarhalle nimi:");
        String zooName = sc.nextLine();
        Zoo zoo = new Zoo(zooName);


        boolean exit = false;
        while(!exit){
            
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet,  3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if (sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);


            switch(i) {
                case 1:
                    System.out.println("Mikä laji?");
                    String species = sc.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String name = sc.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    int age = Integer.parseInt(sc.nextLine());
                    Animal newAnimal = new Animal(species, name, age);
                    zoo.addAnimal(newAnimal);
                    break; 
                case 2:
                    zoo.listAnimals();
                    break;
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int rounds = Integer.parseInt(sc.nextLine());
                    zoo.runAnimals(rounds);
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
            }
        }
    }
}
