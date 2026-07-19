package encapsulamento;

/* 
    encapsulamento: define a visibilidade da parada (atributo/metodo/construto/classe)
    - private (Acessivel somente dentro da mesma casse)
    - protected (acessivel somente dentro da propria package ou atraves da heranca)
    - public (acessivel em qualquer lugar)
*/

public class Imovel {
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int metragem;
    private boolean possuiGaragem;
    private String endereco;

    // Set: method que permite ou alterar o valor de um attributo
    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    // Get: método que permite obter a informacao
    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    //getter
    public void setQuantidadeBanheiros(int quantidadeBanheiros){
        this.quantidadeBanheiros = quantidadeBanheiros;
    }

    //setter
    public int getQuantidadeBanheiros(){
        return quantidadeBanheiros;
    }

    //getter
    public void setMetragem(int metragem){
        this.metragem = metragem;
    }

    //setter
    public int getMetragem(){
        return metragem;
    }

    public void setPossuiGaragem(boolean possuiGaragem){
        this.possuiGaragem = possuiGaragem;
    }

    public boolean getPossuiGaragem(){
        return possuiGaragem;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }
}
