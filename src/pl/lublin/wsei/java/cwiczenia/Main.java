package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Arrays;
import java.util.Random;  //zaimporotwana klasa do generowania liczb losowych
import java.util.RandomAccess;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Main {


    public static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i=0; i<aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args) {
        // write your code here


        Scanner input = new Scanner(System.in);
        int liczba1, liczba2,liczba3;
        System.out.print("Podaj liczbę do konwersji na BIN i HEX: ");
        liczba1 = input.nextInt();


        System.out.printf("DEC\t\t BIN\t\t\t\t HEX\t\t\t\n");
        System.out.printf("%d\t",liczba1,"\t\t"); //System.out.printf("\t\t");
        System.out.printf(String.format("%16s", Integer.toBinaryString(liczba1)).replace(' ', '0'));  //zrobilem to inaczej uzywajac pomocy na stacku
        System.out.printf("\t\t");
        System.out.printf("0x"); System.out.printf(Integer.toHexString(liczba1).toUpperCase());
        //System.out.println("%d\t %d\t %d\t", liczba1, Integer.toBinaryString(liczba2),Integer.toHexString(liczba3));

        System.out.println("\n__________________________________________________________\n");

        System.out.printf("Tablica losowyh 30 liczb\n");
        Random rnd = new Random();  //nowy obiek Random
        int[] liczby = new int[30];

        for (int i = 0; i < liczby.length; i++)
        {
            liczby[i] = rnd.nextInt(); // storing random integers in an array
            System.out.println(liczby[i]);
        }

        System.out.printf("\nMIN I MAX SPOSOBEM SORTOWANIA\n");
        Arrays.sort(liczby);        //sortowanie liczb w tablicy - wymagało dodania zaimportowania klasy
        System.out.println("Minimum = " + liczby[0]);   //wyświetlenie 0 elementu tablicy czyli najmniejszego
        System.out.println("Maximum = " + liczby[liczby.length-1]); //wyświetlenie entego-1 (bo tablicę liczymy od 0) elementu tablicy czyli najmniejszego
        // używałem fukncji sorotowania

        System.out.printf("\nMIN I MAX SPOSOBEM PĘTLI\n");
        int minV = liczby[0];   // deklaracja minV jako 1 element tablicy liczby
        for(int i=1; i<liczby.length; i++)
        {
            if(liczby[i] < minV)   //jezeli jakas liczba w tablicy liczby bedzie mniejsza od 1 elementu tablicy
            {
                minV = liczby[i];  //to przypisz jej wartość do minV i tak w kółko aż do najmniejszej
            }
        }
        System.out.println(minV);

        int maxV = liczby[0];
        for(int i=1;i < liczby.length;i++)
        {
            if(liczby[i] > maxV)
            {
                maxV = liczby[i];
            }
        }
        System.out.println(maxV);
        // kod wykonałem wsłasym sposobem a nie tym z instrukcji bo był niezrozumiały

        System.out.println("\n__________________________________________________________\n");
        System.out.printf("Nowe klasa Account\n");

        Account acc = new Account();
        acc.setName("piotr gołabek"); // zmieniło imie na z wielkiej litery!!!!!
        System.out.println(acc.getName());


    }


}


        /*
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        long avg = 0;

        for (int l : liczby) // powinno być for (int 1 : liczby)  jak w intrukcji ale wtedy się nie kompiluje
        {
            System.out.println(1);
            if (1 < min) min =1;
            if (1 > max) max =1;
            avg +=1;

        }

         */