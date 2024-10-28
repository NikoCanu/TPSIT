import java.util.LinkedList;

public class Maneggio {
    private LinkedList<Thread> cavalli;
    private int percorsoTotale;

    public Maneggio(int percorsoTotale) {
        this.percorsoTotale = percorsoTotale;
        this.cavalli = new LinkedList<>();
    }

    public void aggiungi(String nome) {
        Thread th = new Thread(new Cavallo(nome, percorsoTotale));
        cavalli.add(th);
    }

    public void go() {
        for (Thread cv : cavalli) {
            cv.run();
        }

        for (Thread cv : cavalli) {
            try{
                cv.join();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("La gara è terminata!!");
    }

}