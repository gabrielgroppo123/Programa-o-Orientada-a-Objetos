package poo.senac.estatico;

public class TestaEstatico {
    public static void main(String[] args) {
        ClasseTesteEstatico obj1 = new ClasseTesteEstatico();
        ClasseTesteEstatico obj2 = new ClasseTesteEstatico();
        ClasseTesteEstatico obj3 = new ClasseTesteEstatico();
        obj1.atributo = 10;
        obj2.atributo = 20;
        obj3.atributo = 30;
        ClasseTesteEstatico obj4 = new ClasseTesteEstatico();
        ClasseTesteEstatico.testar();
        System.out.println(obj1.atributo);
        System.out.println(obj2.atributo);
        System.out.println(obj3.atributo);
        System.out.println(obj4.atributo);
    }
}
