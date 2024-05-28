package com.example.demo.ejercicios;

import java.util.List;

///https://sites.google.com/site/programacioniiuno/material/ejercicios-y-tps/ejercicios-recursividad
public class Ejercicios {

    public static void rangoHasta(int n, List<Integer> list) {
        if (n >= 0) {
            list.add(n);
            System.out.print(list);
            rangoHasta(n - 1, list);
        } else {
            System.out.print(list);
            System.out.print("SE CUMPLIO");
        }
    }

    public static void rango(int desde, int hasta, List<Integer> list) {
        if (desde <= hasta) {
            list.add(desde);
            System.out.println(list);
            rango(desde + 1, hasta, list);
        } else {
            System.out.print("SE CUMPLIO");
        }
    }

    public static int sumaHasta(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + sumaHasta(numero - 1);
        }
    }

    public static void removerTodos(List<Integer> list, int elemento) {
        if (list.contains(elemento)) {
            list.remove(list.indexOf(elemento));
            removerTodos(list, elemento);
        } else {
            System.out.print(list);
            System.out.print("SE CUMPLIO");
        }
    }

    public static String aMayusculas(String word, int index) {
        if (index == word.length()) {
            return "";
        } else {

            char current = Character.toUpperCase(word.charAt(index));
            return current + aMayusculas(word, index + 1);
        }
    }

    public static void esPar(int n) {
        if (n > 0) {
            if ((n % 2) == 0) {
                System.out.println("Es " + n + " Par");
                esPar(n - 1);
            } else {
                System.out.println("Es " + n + " Impar");
                esPar(n - 1);
            }
        } else {
            System.out.println("SE ACABO");
            System.out.println(n);
        }
    }

    static public int potencial(int K, int n) {
        if (n == 0) {
            return 1;
        } else {
            return K * potencial(K, n - 1);
        }
    }

    static public Boolean isPar(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }

    /*static public int decimalBinario(int dec) {

        int result = dec / 2;

        if(result == 1){
            return result;
        }
        else{
            return decimalBinario(result);
        }
        if (dec % 2 == 1) {
            return 1 + decimalBinario(dec / 2);
        } else {
            return dec;
        }
    }*/

}
