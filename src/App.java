import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String conta;
        int operacao = 0;
        boolean contaExistente;


        Contas fernanda = new Contas("Fernanda", "Corrente", 2550.56);
        Contas jonathan = new Contas("Jonathan", "Poupança", 2346.90);

        System.out.println("Digite o nome do titular para acessar a conta: ");
        conta = leitor.nextLine();

        if (conta.equalsIgnoreCase("fernanda")) {
            fernanda.menu();
            System.out.println("");
            contaExistente = true;

        } else if (conta.equalsIgnoreCase("jonathan")) {
            System.out.println(jonathan);
            System.out.println("");
            contaExistente = true;
        } else {
            System.out.println("Conta inesistente!");
            contaExistente = false;
        }

        if (contaExistente) {
            while (operacao != 4) {
                System.out.println("""
                                    \n Operações: \n
                                     1 Consultar Saldo
                                     2 Deposito
                                     3 Transferir
                                     4 Sair \\n
                """   );
                operacao = leitor.nextInt();
                double saldoAtual;
                switch (operacao) {
                    case 1 -> {
                        if (conta.equalsIgnoreCase("jonathan")) {
                            saldoAtual = fernanda.getSaldo();
                            System.out.println("Seu saldo é de R$: " + saldoAtual);
                        } else {
                             saldoAtual = fernanda.getSaldo();
                            System.out.println("Seu saldo é de R$: " + saldoAtual );
                        }
                    }
                    case 2 -> {
                        System.out.println("Valor do deposito R$: ");
                        double deposito = leitor.nextDouble();
                        ;
                        if (conta.equalsIgnoreCase("jonathan")) {
                            saldoAtual = jonathan.getSaldo() + deposito;
                            System.out.println(saldoAtual);
                        } else {
                            saldoAtual = fernanda.getSaldo() + deposito;
                            System.out.println(saldoAtual);
                        }
                    }
                    case 3 -> {

                        System.out.println("Valor do deposito R$: ");
                        double transf = leitor.nextDouble();
                        if (conta.equalsIgnoreCase("jonathan")) {
                            if (transf > fernanda.getSaldo()) {
                                System.out.println("Saldo insuficiente para a transação! ");
                            } else {
                                System.out.println(jonathan.transferencia(transf));
                            }
                        } else {
                            if (transf > fernanda.getSaldo()) {
                                System.out.println("Saldo insuficiente para a transação! ");
                            } else {
                                System.out.println(fernanda.transferencia(transf));
                            }
                        }
                    }

                }
            }
        }
    }
}


/*
A ideia é boa poré  precisa atualizar o saldo após a transação.

 */