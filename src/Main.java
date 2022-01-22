public class Main {

    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme");

        Conta contaCorrente = new ContaCorrente(guilherme);
        Conta poupanca = new ContaPoupanca(guilherme);

        contaCorrente.depositar(100);
        poupanca.depositar(50);
        contaCorrente.transferir(30, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
