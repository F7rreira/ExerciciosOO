package Package01;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor, double idade) {
        super(nome, cor, idade);
    }

    public void latindo (){

        System.out.println( getNome()+ " está Latindo");


    }

    public void suaCor(){
        System.out.println(getNome()+ " é a sua cor");
    }
}
