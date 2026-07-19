package contrutores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executor {
    public void executar() {
        executarRemedio();
    }

    private void executarRemedio() {
        Remedio paracetamol = new Remedio("paracetamol", 500, true, LocalDate.of(2026, 12, 31));
        // Paracetamol.setFabricante("Eurofarma");
        // String remedioGenerico = "";
        // if (paracetamol.isGenerico() == true){
        // remedioGenerico = "Sim";
        // { else{
        // remedioGenerico = "Nao";
        // }
        // Operador ternário
        // Ex.: Variável = condicao ? parte verdade : parte falsa
        String remedioGenerico = paracetamol.isGenerico() == true ? "Sim" : "Nao";

        String nomeFabricante = paracetamol.getFabricante() != null ? paracetamol.getFabricante() : "Sem fabricante";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatador.format(paracetamol.getdataVencimento());

        System.out.println(String.format("""
                Remedio: %s
                Miligramagem: %s
                Generico: %s
                Data de validade: %s
                Fabricante: %s

                """, paracetamol.getNome(), paracetamol.getMiligramagem(), remedioGenerico, dataFormatada,
                nomeFabricante));
    }
}
