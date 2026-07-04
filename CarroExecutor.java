import javax.swing.JOptionPane;

public class CarroExecutor {

    public void executar() {
        // Criar os objetos (Criar os carros)

        Carro uno = new Carro();

        uno.motor = 3.5;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";
        uno.isElectrico = false;
        uno.marca = "Fiat";
        uno.aro = 14;

        // Carro foi modificado e preciso atualizar o modelo
        uno.modelo = "Uno com escada dupla";
        uno.motor = 7.0;
        uno.cor = "Relampago do marquinos";

        // Criar objeto para perguntar para usuario os dados
        Carro carro1 = new Carro();
        carro1.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        carro1.cor = JOptionPane.showInputDialog("Digite a cor");
        carro1.isElectrico = JOptionPane.showInputDialog("Carro eletrico?: [true/false]");
        carro1.motor = JOptionPane.showInputDialog("Digite a potencia do motor");
        carro1.marca = JOptionPane.showInputDialog("Digite o nome da marca");
        carro1.aro = JOptionPane.showInputDialog("Digite o aro do carro");

        JOptionPane.showConfirmDialog(null,

                "=== Dados do Uno ===\n" +
                        "Modelo: " + uno.modelo + "\n" +
                        "cor: " + uno.cor + "\n" +
                        "Eletrico: " + uno.isElectrico + "\n" +
                        "Motor: " + uno.motor + "\n" +
                        "Marca: " + uno.marca + "\n" +
                        "Aro: " + uno.aro + "\n\n" +

                        "=== Dados do carro 1 ===\n" +
                        "Modelo: " + carro1.modelo + "\n" +
                        "cor: " + carro1.cor + "\n" +
                        "Eletrico: " + carro1.isElectrico + "\n" +
                        "Motor: " + carro1.motor + "\n" +
                        "Marca: " + carro1.marca + "\n" +
                        "Aro: " + carro1.aro + "\n\n");

    }
}