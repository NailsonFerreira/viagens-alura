package br.com.alura.aluraviagens.util;

public class DiasUtil {

    public static final String DIA = "dia";

    public static String formataDias(int quantidadeDias){

        if(quantidadeDias == 1 || quantidadeDias == 0) {
            return quantidadeDias + " " + DIA;
        }
        return quantidadeDias + " " + DIA + "s";
    }
}
