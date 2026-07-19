package encapsulamento;

import javax.swing.JOptionPane;

public class ImovelExecutor {
    public void executar() {
        Imovel imovelLoriLori = new Imovel();

        // imovelLoriLori.quantidadeQuartos = 2;
        imovelLoriLori.setQuantidadeQuartos(5);
        imovelLoriLori.setEndereco("Rua da macas");
        imovelLoriLori.setPossuiGaragem(true);
        imovelLoriLori.setQuantidadeBanheiros(3);
        imovelLoriLori.setMetragem(150);

        JOptionPane.showConfirmDialog(null,
                "Imovel: " + imovelLoriLori.getEndereco() +
                        "\n Quantidade Quartos: " + imovelLoriLori.getQuantidadeQuartos() +
                        "\nMetragem: " + imovelLoriLori.getMetragem() +
                        "\nQuantidade banheiros: " + imovelLoriLori.getQuantidadeBanheiros() +
                        "\n Pussui Garagem: " + imovelLoriLori.getPossuiGaragem());

    }

}
