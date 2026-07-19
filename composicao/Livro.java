package composicao;

public class Livro {
    private String nome;
    private String descricao;
    private String autor;
    private String isbn;
    private String resumo;
    private String dataLancameto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAutor(String author) {
        this.autor = author;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancameto = dataLancamento;
    }

    public String getDataLancamento(){
        return dataLancameto;
    }
}
