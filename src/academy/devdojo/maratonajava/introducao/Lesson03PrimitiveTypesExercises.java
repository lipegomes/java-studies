package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensgem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Lesson03PrimitiveTypesExercises {
    public static void main(String[] args) {
        String name = "Josh";
        String address = "1090 Lincoln Avenue, 23 apartment";
        double salary = 12754.21;
        String receivingDate = "03/10/2021";
        String message = "I " + name + " living at the address " + address + ", I confirm that I received the salary of " + "$" + salary + " on date " + receivingDate + ".";
        System.out.println(message);
    }
}
