import ITEM02.Pizza;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa usando o construtor
        Pessoa pessoa1 = new Pessoa("João", 30);
        System.out.println(pessoa1);

        // Criando uma instância de Pessoa usando o método estático of
        Pessoa pessoa2 = Pessoa.of("Maria", 25);
        System.out.println(pessoa2);

        // Acessando os atributos usando os métodos getters
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa2.getNome());

        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .bacon(true)
                .build();

        System.out.println("Pizza size: " + pizza.getSize());
    }
}
