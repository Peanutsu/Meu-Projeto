package Projeto_p2;
import java.util.Scanner;
public class Capitulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;

    public Capitulo(String nome, String texto, String[] escolhas, int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void mostrar() {
        System.out.println(texto);
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i+1 + " - " + escolhas[i]);
        }
    }

    public int escolher() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();
            for (int i = 0; i < escolhas.length; i++) {
                if (escolhas[i].equals(escolha)) {
                    return i;
                }
            }
            System.out.println("Opção inválida, tente novamente.");
        scanner.close();
        }
    }
}