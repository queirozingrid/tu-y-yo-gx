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

    }
    public void iniciarPartida(){

        while(p1.getCartas().size()>0 && p2.getCartas().size()>0){
            Carta c1 = p1.jogar();
            Carta c2 = p2.jogar();
            calcularPontucao(c1, c2);
        }
        if(p1.getCartas().size() == 0){
            System.out.println(p2.getNome() + " venceu!!!");
            System.exit(0);
        }
        if(p2.getCartas().size() == 0){
            System.out.println(p1.getNome() + " venceu!!!");
            System.exit(0);
        }
    }
    public void calcularPontucao(Carta c1, Carta c2){
        if(c1.getPersonagem().getForca() > c2.getPersonagem().getForca()){
            p1.getCartas().add(c2);
            p2.getCartas().remove(c2);
            System.out.println("\n\n\n!!!!!!!! Jogador 1 venceu essa partida !!!!!!!!");
            System.out.println("A carta " + c2.getPersonagem().getNome() + " agora pertence a: " + p1.getNome());
        }
        else if(c2.getPersonagem().getForca() > c1.getPersonagem().getForca()){
            p2.getCartas().add(c1);
            p1.getCartas().remove(c1);
            System.out.println("\n\n\n!!!!!!!! Jogador 2 venceu essa partida !!!!!!!!");
            System.out.println("A carta " + c2.getPersonagem().getNome() + " agora pertence a: " + p2.getNome());
        }
        else{
            System.out.println("Empaaaaate, vamos para a próxima partida");
        }
    }
}

