import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        System.out.println("************ TU Y YO GX **********");
        System.out.println("Username 1:");
        nome = scan.nextLine();
        Jogador p1 = new Jogador(nome);

        System.out.println("Username 2:");
        nome = scan.nextLine();
        Jogador p2 = new Jogador(nome);

        Inicializacao inicio = new Inicializacao();
        inicio.inserirPersonagem();
        inicio.inserirCartas();

        List<Personagem> personagens = inicio.getPersonagens();
        List<Carta> cartas = inicio.getTodasCartas();

        Partida partida = new Partida(p1, p2);
        partida.distribuirCartas(cartas);
        partida.iniciarPartida();


    }
}
