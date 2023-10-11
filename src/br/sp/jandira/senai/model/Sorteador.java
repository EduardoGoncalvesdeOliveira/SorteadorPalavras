package br.sp.jandira.senai.model;
import java.util.Random;

public class Sorteador {
    public void SorteadorPalavrasPreDefinidas(){
        String[] palavras = {
                "Rosa", "Projetor", "Fogo", "Luz", "Fazer", "Amar", "Ande", "Esta",
                "potável", "ressaca", "piscar", "coiote", "pasto", "involuntário",
                "sapatos", "negativo", "graduado", "livre", "rifle", "sobrenome",
                "gasolina", "zero", "dado", "turistas", "jato", "sorte", "nascimento",
                "lagosta", "diariamente", "ponta", "rato", "sofá", "consoantes",
                "morcego", "gorila", "documentos", "marca", "morder", "evaporar",
                "calabouço", "doces", "dez", "gesso", "fonte", "emboscada", "vazamento",
                "internacional", "anão", "submergir", "amor"
        };

        Random random = new Random();
        int indiceSorteado = random.nextInt(palavras.length);

        String palavraSorteada = palavras[indiceSorteado];

        System.out.println("Palavra sorteada: " + palavraSorteada);
    }
}