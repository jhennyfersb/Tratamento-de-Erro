package com.jhenny;

public class FluxoComErro {
    public static void main (String[] args){
        System.out.println("Ini do Main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException x){
            String msg = x.getMessage();
            System.out.println("Exception" + msg);
            x.printStackTrace();
        }
        System.out.println("Fim do Main");
    }
    private static void metodo1(){
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    private static void metodo2(){
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}
