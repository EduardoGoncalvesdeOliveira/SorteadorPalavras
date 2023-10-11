package br.sp.jandira.senai;
import java.util.Scanner;

import br.sp.jandira.senai.model.PalavrasClient;
import br.sp.jandira.senai.model.Sorteador;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PalavrasClient referenciaPalavrasClient = new PalavrasClient();

        boolean continuar = true;

        while (continuar) {
            System.out.println("//-------  Menu  --------//");
            System.out.println("1 - Cadastrar Palavras para sorteio ");
            System.out.println("2 - Sortear Palavra Pré-Definida ");
            System.out.println("3 - Cadastrar Palavras às Pré-Definidas");
            System.out.println("4 - Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    PalavrasClient palavrasC = new PalavrasClient();
                    palavrasC.cadastrarPalavrasClient();
                    referenciaPalavrasClient.adicionarPalavrasC(palavrasC);
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    continuar = false;
                    break;
            }
        }
        Sorteador sorteador = new Sorteador();
        sorteador.SorteadorPalavrasPreDefinidas();

    }
}
