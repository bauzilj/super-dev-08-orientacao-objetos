import javax.swing.JOptionPane;

public class FabricanteExecutor {
    
    public void executar() {

        Fabricante blusoft = new Fabricante();

        blusoft.nome = "BluSoft Tecnologia";
        blusoft.CNPJ = "223.545.0001-74";
        blusoft.faturamento = 85000.00;
        blusoft.percentualDeLucro = 0.05;
        blusoft.valorLucro = calcularValorDeLucro(blusoft);

        Fabricante digitalLab = new Fabricante();

        digitalLab.nome = "Digital Lab";
        digitalLab.CNPJ = "456.567.0001-87";
        digitalLab.faturamento = 120000.00;
        digitalLab.percentualDeLucro = 0.15;
        digitalLab.valorLucro = calcularValorDeLucro(digitalLab);

        JOptionPane.showMessageDialog(null,
                "=== Fabricante SC  ===\n" +
                        "Nome: " + blusoft.nome + "\n" +
                        "CNPJ:  " + blusoft.CNPJ + "\n" +
                        "Faturamento: " + blusoft.faturamento + "\n" +
                        "Percentual de lucro: " + blusoft.percentualDeLucro + "\n" +
                        "Valor de lucro: " + blusoft.valorLucro + "\n\n" +

                        "=== Fabricante RS  ===\n" +
                        "Nome: " + digitalLab.nome + "\n" +
                        "CNPJ:  " + digitalLab.CNPJ + "\n" +
                        "Faturamento: " + digitalLab.faturamento + "\n" +
                        "Percentual de lucro: " + digitalLab.percentualDeLucro + "\n" +
                        "Valor de lucro: " + digitalLab.valorLucro);

    }

    private double calcularValorDeLucro(Fabricante fabricante) {
        double valorLucro = fabricante.faturamento * fabricante.percentualDeLucro;
        return valorLucro;
    }
}
