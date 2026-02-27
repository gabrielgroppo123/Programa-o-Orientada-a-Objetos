package poo.senac.estatico;

public class ClasseTesteEstatico {

    public static int atributo;
    public int atributo2;

    public ClasseTesteEstatico(){
        atributo++;
    }

    public void testar2(){
        atributo = 10;
    }

    public static void testar(){
        System.out.println("Teste");
    }
}
