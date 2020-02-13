package Package01;

import Package01.Animal;

public class Leao extends Animal {

    public Leao(String nome, String cor, double idade) {
        super(nome, cor, idade);
    }

    public void cacando(){
        System.out.println("Leao está caçando");

    }
    public void suaIdade(){
        System.out.println(getCor()+ " a cor desse leão e única");

    }
}
