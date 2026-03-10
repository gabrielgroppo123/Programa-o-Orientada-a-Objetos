public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int i = 1; i <= 10 ; i++) {
            pilha.empilha(i);
        }
        System.out.println("Pilha esta vazia: " + pilha.estaVazia());
        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Qttd de Dados na Pilha: " + pilha.tamanho());
        System.out.println("Topo da pilha: " + pilha.topo());
        pilha.desempilha();
        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Qttd de Dados na Pilha: " + pilha.tamanho());
        System.out.println("Topo da pilha: " + pilha.topo());
    }
}
