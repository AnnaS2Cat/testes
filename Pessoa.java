public class Pessoa {
    String nome;
    int idade;

    void falar() {
        System.out.println("Olá!");
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.falar();
    }
}