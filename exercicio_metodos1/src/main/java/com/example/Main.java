package com.example;

public class Main {
    public static void main(String[] args) {

        ImprimirSaudacao saudacao = new ImprimirSaudacao();

        ImprimirMensagem mensagem = new ImprimirMensagem("A maça não cai longe da macieira");

        Somar soma = new Somar();
        int resultado = soma.Somar(10,5);
        System.out.println(resultado);

        Multiplicar multiplicar = new Multiplicar();
        int resultado1 = multiplicar.Multiplicar(3, 5);
        System.out.println(resultado1);

        MaiorNumero maior = new MaiorNumero();
        int maiorNumero = maior.MaiorNumero(1000, 80);
        System.out.println("O maior número é: "+ maiorNumero);

        Par par = new Par();
        String resultado2 = par.Par(12098320);
        System.out.println(resultado2);

        ObterData data = new ObterData();
        String dataAtual = data.ObterData();
        System.out.println("A data atual é: " + dataAtual);

        Fatorial fat = new Fatorial();
        int resultado3 = fat.Fatorial(5);
        System.out.println("O fatorial é: " + resultado3);

        ConcatenarStrings string = new ConcatenarStrings();
        String resultado4 = string.ConcatenarStrings("Olá, bem-vindo", " a aula de Java");
        System.out.println(resultado4);

        CalcularMedia media = new CalcularMedia();
        float resultado5 = media.CalcularMedia(10, 10, 8);
        System.out.println("O resultado é de: " + resultado5);
    }
}