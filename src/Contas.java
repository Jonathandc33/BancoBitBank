public class Contas {
    private String titular;
    private String tipoConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Contas(String titular, String tipoConta, double saldo) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    double transferencia(double valorTransferencia){
        return saldo - valorTransferencia;
    }

    void menu() {


                                  


    }

// "\n" pula linha. Só funciona dentro da String ou seja entre parenteses.
    @Override
    public String toString() {
        return

                " Titular da conta = " + titular + '\n' +
                " Tipo de Conta = " + tipoConta + '\n' +
                " Saldo Disponivel = " + saldo
                ;
    }
}
