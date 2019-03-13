package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    boolean loopa;
	int m =  0; // antal män
	int k =  0; // antal kvinnor
	int mA = 0; // total ålder på män
	int kA = 0; // total ålder på kvinnor

	Scanner huvudInput = new Scanner(System.in);


	//detta skulle kunna implementeras med hjälp utav oop istället.
	do {
        System.out.println("(M)an eller (K)vinna? m/k:");
        String i = huvudInput.next(); // i får ett värde av användaren av m för man och k för kvinna.

        if (i.equals("m")) { //om det är en man öka totala antalet män med 1
            m++;
            System.out.println("Ålder på personen?:");
            int age = huvudInput.nextInt();
            mA = mA + age; // addera ålder på mannen till totala åldern för män
        }

            else if (i.equals("k")) { //om det är en kvinna öka totala antalet kvinnor med 1
                k++;
                System.out.println("Ålder på personen?:");
                int age = huvudInput.nextInt();
                kA = kA + age; // addera ålder på kvinnan till totala åldern för kvinnor
        }

                else {
                    System.out.println("Ogiltigt svar. Endast M eller K är giltiga svar.");
        }
                System.out.println("Lägga till fler personer? y/n");
                String loop = huvudInput.next();
        loopa = loop.equals("y");

        }

	while (loopa);

        int mM = mA/m; // medelålder på män
        int kM = kA/k; // medellder på kvinnor

	System.out.println("Antalet män: " + m + " och medelåldern för dessa är: " + mM + ". \nAntalet kvinnor är: " + k + " och medelåldern på dessa är: " + kM );


    }
}
