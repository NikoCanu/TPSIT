import java.util.Random;

public class Cavallo implements Runnable{
    private String nome;
    private int metriPercorsi = 0;
    private int metriTotali;
    private Random rand;

    public Cavallo(String nome, int metriTotali) {
        this.nome = nome;
        this.metriTotali = metriTotali;
        this.rand = new Random();
    }

    @Override
    public void run() {
        while (metriPercorsi < metriTotali) {
            int metri = rand.nextInt(10) + 1;
            metriPercorsi += metri;
            if (metriPercorsi > metriTotali) {
                metriPercorsi = metriTotali;
            }
            System.out.println(nome + " sta al metro " + metriPercorsi + " su " + metriTotali);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
        }
        System.out.println(nome + " ha finito!");

    }
}
