package gomes.filipe.exceptions;

public class TestStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Uma frase aleatória");

        sb.append(", realmente ");
        sb.append("aleatória");
        sb.append(".");

        String frase = sb.toString();

        System.out.println(frase);

        String nome = "filipe";
        CharSequence cs = new StringBuilder("F");

        nome = nome.replace("f", cs);

        System.out.println(nome);
    }
}
