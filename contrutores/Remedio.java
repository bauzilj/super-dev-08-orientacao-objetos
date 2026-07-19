package contrutores;

import java.time.LocalDate;

public class Remedio {

    private String nome; // Obrigatorio
    private int miligramagem; // Obrigatorio
    private boolean generico; // Obrigatorio
    private LocalDate dataVencimento; // Obrigatorio
    private String fabricante; // Opcional

    // Construtor: criar o objeto com informacoes que sao obrigatorios para o
    // correto funcionamento

    public Remedio(String none, int miligramagem, boolean generico, LocalDate dataVencimento) {
        this.nome = none;
        this.miligramagem = miligramagem;
        this.generico = generico;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    // Neste cenário n queremos permitir o usuário alterar o nome
    // public void setNome(String nome){
    // this.nome = nome;
    // }

    public int getMiligramagem() {
        return miligramagem;
    }

    // Neste cenário n queremos permitir o usuário alterar o miligramagem
    // public void setMiligramagem(int miligramagem){
    // this.miligramagem = miligramagem;
    // }

    public boolean isGenerico() {
        return generico;
    }

    // Neste cenário nao queremos permitir o usuário alterar o generico
    // public void setGenerico(boolean generico){
    // this.generico = generico;
    // }

    public LocalDate getdataVencimento() {
        return dataVencimento;
    }

    // Neste cenário nao queremos permitir o usuario alterar o datavencimento
    // public void setDataVencimento(LocalDate dataVencimento){
    // this.dataVencimento = dataVencimento;
    // }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
