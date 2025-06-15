import model.Conta;

public class Exercise2{
    public static void main(String[] args) {
        Conta conta1 =  new Conta();
        conta1.setTitular("Pedro");
        conta1.setSaldo(500);
        conta1.setNumeroConta(1);

        Conta conta2 = new Conta();
        conta2.setTitular("Maria");
        conta2.setSaldo(1000);
        conta2.setNumeroConta(2);

        conta1.depositar(200);
        conta2.sacar(200);
    }
}
