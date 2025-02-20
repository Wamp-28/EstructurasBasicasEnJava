package org.example;

public class Main {
    public static void main(String[] args) {

        // Variables ENTERAS

        byte numero1= 120;

        System.out.println("VARIABLE DE TIPO BYTE: " + numero1);

        short numero2= 30400;
        System.out.println("VARIABLE DE TIPO SHORT: " + numero2);

        int numero3 = 235;
        System.out.println("VARIABLE DE TIPO INT: " + numero3);

        long numero4= 5623L;

        System.out.println("VARIABLE DE TIPO LONG: " + numero4);


        // VARIABLES DECIMALES

        float decimal1 = 32.5f;
        System.out.println("VARIABLE DE TIPO FLOAT: " + decimal1);

        double decimal2 = 125.6;
        System.out.println("VARIABLE DE TIPO DOUBLE: " + decimal1);

        // VARIABLES DE TIPO CADENA DE CARACTER

        String nombre= "William Alexander Matallana";
        System.out.println("VARIABLE DE TIPO CADENA DE CARACTER: " + nombre);

        // VARIABLE DE TIPO CARACTER

        char letra = 'a';
        char letra1 = 65;

        System.out.println("VARIABLE DE TIPO CARACTER: " + letra);
        System.out.println("VARIABLE DE TIPO CARACTER: " + letra1);

        // VARIABLE DE TIPO BOOLEAN

        boolean estado = true;
        System.out.println("VARIABLE DE TIPO BOOLEAN: " + estado);

        // Condicionales if -else

        double peso=90;
        double estatura=1.72;
        double IMC;

        IMC = peso /(estatura*estatura);

        System.out.println("EL IMC ES: " + IMC);

        if(IMC < 18.49){
            System.out.println("PESO BAJO");
        }else if(IMC >18.50 && IMC< 24.99){
            System.out.println("PESO NORMAL");
        }else if(IMC >25 && IMC >29.99){
            System.out.println("SOBREPESO");
        }else if(IMC >30 && IMC < 34.99){
            System.out.println("OBESIDAD LEVE");
        }else if(IMC > 35 && IMC < 39.99){
            System.out.println("OBESIDAD MEDIA");
        }else{
            System.out.println("OBESIDAD MORBIDA");
        }





    }
}