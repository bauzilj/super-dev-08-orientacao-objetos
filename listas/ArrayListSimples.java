package listas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListSimples {
    public void executar() {
        exemploListaString();
    }

    private void exemploListaString() {
        // Vetor
        // String[] nomes = new String[3];
        // nomes[0] = "Lorenzo";
        // nomes[1] = "Gustavo";
        // nomes[2] = "Judity";
        // nomes[3] = "ËROOOOO"; Acontece erro pq vetor n tem 4 posiçoes

        // CRUD
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lorenzo");
        nomes.add("Gustavo");
        nomes.add("Judity");
        nomes.add("EROOOO");
        nomes.add("Aroldo"); // indice 4, quinta posicao

        // Lorenzo casou, vamos alterar o nome dele no array list
        nomes.set(0, "Lorenzo da Silva"); // Update

        nomes.remove("Aroldo");// Delete

        // Para poder acessar o elemento do array list
        String primeiroNome = nomes.get(0);

        // Descobrir a qtd de elementos do ArrayList
        int quantidadeNomes = nomes.size();

        System.out.println("Quantidade de nomes: " + quantidadeNomes);
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Segundo nome : " + nomes.get(1));
        System.out.println("Terceiro nome: " + nomes.get(2));
        System.out.println("Quarto nome: " + nomes.get(3));
    }

    public void exemploListComFor(){
        ArrayList <String>palavras = new ArrayList<>();

        for(int i = 0; i<5; i++){
            String palavra = JOptionPane.showInputDialog("Digite a palavra");
            palavras.add(palavra);
        }

        String menorPalavra = "";
        int quantidadeCaracteresMenorPalavra = 9999999;

        for (int i= 0; i< palavras.size(); i++){
            String palavra = palavras.get(i);

            if(palavra.length() < quantidadeCaracteresMenorPalavra){
                quantidadeCaracteresMenorPalavra = palavra.length();
                menorPalavra = palavra;
            }
        }

        JOptionPane.showConfirmDialog(null, "Menor palavra: " +  menorPalavra);
    }
}
