package Modulo7.tarefa_classes;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Sandero", "Renault", "Prata");

        System.out.println("O objeto carro Modelo: " + carro.getModelo());
        System.out.println("da Marca: " + carro.getMarca());
        System.out.println("da Cor:  " + carro.getCor());
        System.out.println("está: " + carro.getEstado());

        carro.ligarCarro();
        System.out.println("Agora o carro está: " + carro.getEstado());

        carro.desligarCarro();
        System.out.println("Agora o carro está: " + carro.getEstado());
    }
}
