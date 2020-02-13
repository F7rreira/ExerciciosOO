package Package01;

import Package01.Animal;

public class Gato extends Animal {

    public Gato(String nome, String cor, double idade) {
        super(nome, cor, idade);
    }

    public void arranhando() {
        System.out.println(getNome() + " está arranhando");
    }

    public void correu() {
        System.out.println(getNome()+" está correndo do seu dono");
    }
}