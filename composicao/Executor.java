
package composicao;

public class Executor {
    public void executar(){
        executarCarro();
    
    }

    private void executarCarro(){
        Motor motorPalio = new Motor();

        motorPalio.setCilindradas(150);
        motorPalio.setCombustivel("Flex");

        Carro palio = new Carro();
        palio.setModelo("Palio com escada");
        palio.setCor("vermelho");
        palio.setMotor(motorPalio);
        palio.setEscada(true);

        System.out.println(palio.toString());
        System.out.println(motorPalio.toString());
        
    }

   
}
