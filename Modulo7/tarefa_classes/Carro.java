package Modulo7.tarefa_classes;

/**
 * @author denis-donda
 * Esta classe define o objeto Carro com as suas propriedades modelo, marca, cor e seu estado atual.
 * Define também um método simples que liga e outro que desliga o carro trocando seu estado entre
 * LIGADO e DESLIGADO.
 */
public class Carro {

    private String modelo;
    private String marca;
    private String cor;
    private EstadoDoCarro estado;

    public Carro(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.estado = EstadoDoCarro.DESLIGADO;
    }

    public enum EstadoDoCarro {
        LIGADO,
        DESLIGADO
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    // Método para ligar o carro
    public void ligarCarro() {
        System.out.println("\nLigando o carro.");
        this.estado = EstadoDoCarro.LIGADO;
        System.out.println("O carro está ligado.");
    }

    // Método para desligar o carro
    public void desligarCarro() {
        System.out.println("\nDesligando o carro.");
        this.estado = EstadoDoCarro.DESLIGADO;
        System.out.println("O carro está desligado.");
    }

    public EstadoDoCarro getEstado() {
        return this.estado;
    }

}
