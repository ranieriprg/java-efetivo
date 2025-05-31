package ITEM01;

/**
 * Implementação da classe Carro seguindo o Item 1 do livro Java Efetivo
 * que recomenda o uso de métodos estáticos de fábrica em vez de construtores.
 */
public class Carro {
    private final String modelo;
    private final int ano;
    private final String cor;
    private final String categoria;

    // Construtor privado - não pode ser acessado diretamente
    private Carro(String modelo, int ano, String cor, String categoria) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.categoria = categoria;
    }

    /**
     * Método estático de fábrica básico
     * Vantagem 1: Tem nome descritivo, ao contrário dos construtores
     */
    public static Carro of(String modelo, int ano) {
        return new Carro(modelo, ano, "Não especificada", "Padrão");
    }

    /**
     * Método estático de fábrica com mais parâmetros
     * Vantagem 2: Não precisa criar um novo construtor para cada variação
     */
    public static Carro completo(String modelo, int ano, String cor, String categoria) {
        return new Carro(modelo, ano, cor, categoria);
    }

    /**
     * Método estático de fábrica para criar um carro popular
     * Vantagem 3: Pode retornar instâncias pré-configuradas
     */
    public static Carro popular(String modelo, int ano) {
        return new Carro(modelo, ano, "Branco", "Popular");
    }

    /**
     * Método estático de fábrica para criar um carro de luxo
     * Vantagem 4: Permite agrupar objetos relacionados por função
     */
    public static Carro luxo(String modelo, int ano, String cor) {
        return new Carro(modelo, ano, cor, "Luxo");
    }

    /**
     * Método estático de fábrica para carros antigos
     * Vantagem 5: O objeto retornado pode variar com base em parâmetros
     */
    public static Carro antigo(String modelo, int ano) {
        if (ano < 1950) {
            return new Carro(modelo, ano, "Original", "Antiguidade");
        } else {
            return new Carro(modelo, ano, "Restaurado", "Clássico");
        }
    }

    // Métodos getters
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
