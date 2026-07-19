package composicao;

public class LivroExecutor {
    public void executar(){
        executarAutor();
        executarLivro();
    }

     private void executarAutor(){
        Autor authorHarryPotter = new Autor();

        autor.setNome("Harry");
        authorHarryPotter.setCidadeNascimento("Brockton");
    }

    private void executarLivro(){
        
        Livro scienfiction = new Livro();
        scienfiction.setNome("Terrarium");
        scienfiction.setDescricao("Esse e um descricao");
        scienfiction.setAutor("Frank Herbert");
        scienfiction.setIsbn("234-Bn");
        scienfiction.setDataLancamento("23/07/2026");
        scienfiction.setResumo("Esse e o resumo do ivro");

        System.out.println(executarAutor());
    }

    

}
