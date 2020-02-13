package Package01;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro= new Cachorro( "Tob","cinza", 3);
        Gato gato= new Gato("Ted","Branco",4);
        Leao leao= new Leao("rei","marrom",10);

        cachorro.latindo();
        cachorro.suaCor();
        gato.arranhando();
        gato.correu();
    }

}
