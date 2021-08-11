import java.util.List;
import java.util.Random;

public class Partida {
    private Jogador p1;
    private Jogador p2;

    public Partida(Jogador p1, Jogador p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void distribuirCartas(List<Carta> cartas){
        Random gerador = new Random();
        int aleatorio;
        for(int i = 0; i<4; i++){
            aleatorio = gerador.nextInt(7);
            if(p1.getCartas().contains(cartas.get(aleatorio))){
                i--;
            }
            else {
                p1.getCartas().add(cartas.get(aleatorio));
            }
        }
        int i = 0;
        for(i=0; i<4; i++){
            aleatorio = gerador.nextInt(7);
            if(p2.getCartas().contains(cartas.get(aleatorio))){
                i--;
            }
            else {
                p2.getCartas().add(cartas.get(aleatorio));
            }
        }
        // ---- fins de testes ----
//        System.out.println("Carta 1 p1: " + p1.getCartas().get(0).getPersonagem().getNome());
//        System.out.println("Carta 2 p1: " + p1.getCartas().get(1).getPersonagem().getNome());
//        System.out.println("Carta 3 p1: " + p1.getCartas().get(2).getPersonagem().getNome());
//        System.out.println("Carta 4 p1: " + p1.getCartas().get(3).getPersonagem().getNome());
//
//        System.out.println("************************");
//
//        System.out.println("Carta 1 p2: " + p2.getCartas().get(0).getPersonagem().getNome());
//        System.out.println("Carta 2 p2: " + p2.getCartas().get(1).getPersonagem().getNome());
//        System.out.println("Carta 3 p2: " + p2.getCartas().get(2).getPersonagem().getNome());
//        System.out.println("Carta 4 p2: " + p2.getCartas().get(3).getPersonagem().getNome());

    }
    public void iniciarPartida(){
        boolean vez = true;

        while(p1.getCartas().size()>0 && p2.getCartas().size()>0){
            if(vez){
                Carta c1 = p1.jogar();
                vez = false;
            }
            else {
                p2.jogar();
                Carta c2 = p2.jogar();
                vez = true;
            }


        }
    }
}

