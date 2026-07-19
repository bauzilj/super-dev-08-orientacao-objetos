package composicao;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

    //Getter e Setter de nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

     //Getter e Setter de CPF
     public String getCpf(){
        return cpf;
     }
     public void setCpf(String cpf){
        this.cpf = cpf;
     }

      //Getter e Setter de Idade
     public int getIdade(){
        return idade;
     }
     public void setIdade(int idade){
        this.idade = idade;
     }

      //Getter e Setter de Endereco
      public Endereco getEndereco(){
        return endereco;
      }

      public void setEndereco(Endereco endereco){
        this.endereco = endereco;
      }
}
