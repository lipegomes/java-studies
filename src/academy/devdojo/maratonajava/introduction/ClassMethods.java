package academy.devdojo.maratonajava.introduction;

public class ClassMethods {
    // Método estático
    static void myStaticMethod() {
        System.out.println("Os métodos estáticos podem ser chamados sem criar objetos.");
        System.out.println("");
    }

    // Método público
    public void myPublicMethod() {
        System.out.println("Os métodos públicos devem ser chamados criando objetos.");
    }

    // Método principal
    public static void main(String[] args) {
        // Chama o método estático
        myStaticMethod();

        // Cria um objeto
        ClassMethods obj = new ClassMethods();
        // Chama o método público no objeto
        obj.myPublicMethod();
    }
}
