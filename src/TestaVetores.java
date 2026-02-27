import java.util.Date;

public class TestaVetores {
    public static void main(String[] args) {
        Conta[] conta = new Conta[10];
        criarContas(conta);
        exibirContas(conta);
    }
    public static void criarContas(Conta[] contas) {
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta(null,null, new Cliente());
        }
    }
    public static void exibirContas(Conta[] contas) {
        for(Conta c : contas){
            if (c != null){
                //verifica se é nulo para criar e nao gerar erro
                if(c.titular() == null) {
                    //cria um titular dentro da conta
                    c.trocarTitular(new Cliente());
                    c.titular().dataNascimento = new Date();
                }
                System.out.println(c.resumoConta());
            }
            else {
                System.out.println(c);
            }

        }
//        for (int i = 0; i < contas.length ; i++) {
//            if (contas[i] != null) {
//                System.out.println(contas[i].resumoConta());
//            }
//            else {
//                System.out.println(contas[i]);
//            }
//        }
    }
}
