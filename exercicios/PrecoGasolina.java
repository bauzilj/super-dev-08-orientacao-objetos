package exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrecoGasolina {
    public void executar() {
        precoGasolina();
    }
    // Exercicios
    /*
     * Ex.: 1 Criar um array List para guardar os precos da gasolina de 5 dias
     * Armazenar 5 precos da gasolina no array list
     * apresentar os valores
     * somar todos os valores
     * apresentar a soma
     * remover o preco da gasolina do quinto elemento
     * apresentar todos os elementos
     * apresentar o tamanho do array list
     */

    private void precoGasolina() {
        ArrayList<Double> precos = new ArrayList<>();
        precos.add(5.68);
        precos.add(5.79);
        precos.add(5.59);
        precos.add(7.50);
        precos.add(7.80);

        Double soma = precos.get(0) +
                precos.get(1) +
                precos.get(1) +
                precos.get(2) +
                precos.get(3) +
                precos.get(4);

        System.out.println("Primeiro preço: " + precos.get(0));
        System.out.println("Segundo preço: " + precos.get(1));
        System.out.println("Terceiro preco: " + precos.get(2));
        System.out.println("Quarto preco: " + precos.get(3));
        System.out.println("Quinto preco: " + precos.get(4));

        System.out.println("Soma total: " + soma + "\n\n");

        precos.remove(4);

        System.out.println("Primeiro preço: " + precos.get(0));
        System.out.println("Segundo preço: " + precos.get(1));
        System.out.println("Terceiro preco: " + precos.get(2));
        System.out.println("Quarto preco: " + precos.get(3));
        //System.out.println("Quinto preco: " + precos.get(4));

        int tamanhoLista = precos.size();

        System.out.println("Tamanho da lista: "+ tamanhoLista);

    }

    /*
     * Ex.: 2 Criar um Array List de números(Tem que utilizar varios fors)
     * Solicitar para o usuario 10 números armazenando no array list
     * Apresentar os numeros pares
     * Apresentar os numeros positivos
     * Apresentar a quantidade de números acima de 10
     * Apresentar a quantidade de numeros ímpares
     * Apresentar a soma de todos os numeros negativos
     */

    public void numeroList(){
        ArrayList <Integer>numeros = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 numeros: "));
            numeros.add(numero);
        }
    }
}
