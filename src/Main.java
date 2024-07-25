public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Venilton Silva");
        Cliente cliente2 = new Cliente("Gleyson Oliveira");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco("Banco DIO");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(200, contaPoupanca);
        contaPoupanca.sacar(50);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
