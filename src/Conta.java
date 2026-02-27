public class Conta {
    private double saldo;
    private Cliente[] clientes = new Cliente[2];
    public String numAgencia;
    public String numeroConta;

//    public Conta(String numAgencia, String numeroConta) {
//        this.numAgencia = numAgencia;
//        this.numeroConta = numeroConta;
//    }
    public Conta(String numAgencia, String numeroConta, Cliente titular) {
        this.numAgencia = numAgencia;
        this.numeroConta = numeroConta;
        //posicao 0 de vetor será o titular
        this.clientes[0] = titular;
    }
    public Conta(String numAgencia, String numeroConta, Cliente titular,Cliente dependente) {
        this.numAgencia = numAgencia;
        this.numeroConta = numeroConta;
        //posicao 1 de vetor será o dependente
        this.clientes[1] = dependente;
    }
    public Conta(Cliente titular) {
        this(null, null, titular);
    }

    public void trocarTitular(Cliente cliente){
        this.clientes[0] = cliente;
    }

    public void trocarDependente(Cliente cliente){
        this.clientes[1] = cliente;
    }

    public Cliente titular(){
        return clientes[0];
    }
    public Cliente dependente(){
        return clientes[1];
    }














    public void depositar(double valor) {
        saldo += valor;
    }
    public boolean sacar(double valor) {
        if (verificaSaldo(valor)) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    private boolean verificaSaldo(double valor) {
        return saldo >= valor;
    }
    public void tranferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.saldo += valor;
        }
    }
    public double retornaSaldo() {
        return saldo;
    }

    public String resumoConta() {
        return String.format("Agencia:%s%nNum:%s%nCliente:%s%nSaldo:R$%6.2f", numAgencia, numeroConta, clientes[0].resumoCliente(), saldo);
    }
}
