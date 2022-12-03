import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Bem vindo ao jogo de escolhas 'Labirinto Mental'\n" + 
    "Seu objetivo é sobreviver e evitar sua perca de >Sanidade< durante o jogo, mas como?\n"+
    "Suas escolhas colocarão o receptaculo em segurança, ou em situações perturbadoras que questionarão sua >Sanidade<"+
    "essas escolhas serão feitas a partir de opções, digite:\n"+
    "----------------------------------------------------------------------------\n"+
    " A)\n B)\n C)\n D)\n"+
    "----------------------------------------------------------------------------\n"+
    "Boa Sorte e que o Jogo Comece!\n"+ 
    "----------------------------------------------------------------------------");
    System.out.println("Nossa História começa com um Zé ninguém, Liwbert Danis, escritor, homem solteiro, sem família, nunca foi amado por ninguém" +
    "nos seus 30 e poucos anos de vida, ele se encontra em uma viagem desesperada a uma ilha isolada tentando encontrar"+
    " inspirações para que seja lembrado um dia por suas obras mediocres, dias se passam desde sua estadia no complexo de apartamentos"+
    " que ele encontrou como estadia na ilha, mas nem uma palavra sequer saíram para as páginas de seu livro, ele decide "+
    "fazer algo para desocupar a mente, o que ele irá fazer?\n");
    System.out.println("A)Dormir \nB)Tomar um ar\nC)Afogar suas magoas em bebidas\nD)Acabar com o sofrimento");
    String r1 = scan.next();
    if (r1.equals("A")) {
        System.out.println("Liwbert deita para descansar e em alguns minutos adormece e entra em sono profundo.\n"
        +"De repente, ele se encontra em uma caverna escura, não consegue ver ou sentir nada além do odor podre de peixe e a água\n"+
        "que chega aos seus tornozelos, tentando seguir uma fraca luz ao longe, ele encontra dois grandes buracos, talvez um deles\n"+
        "levasse ele para fora deste pesadelo, qual caminho seguir?");
        System.out.println("A)Passagem para baixo \nB)Passagem por onde vem a água");
        String ra1 = scan.next();
        if (ra1.equals("A")) {
            System.out.println("Liwbert decide seguir pela passagem para baixo, ele se encontra em uma sala com uma porta, a porta está trancada, mas ele consegue ver\n"+
            "uma chave no chão, ele pega a chave e abre a porta, ele se encontra em uma sala com uma mesa e uma cadeira, iluminada por uma tocha, em cima da mesa há um livro\n"+
            "estava escrito Necronomicon, o livro tinha um rosto e a capa parecia feita com pele humana, Liwbert se sentia enojado, mas curioso, ele pegou o livro\n"+
            "o que Liwbert deve fazer?\n");
            System.out.println("A)Ler o livro\n B)Ignorar a curiosidade e devolver o Livro\n C)Queimar o Livro\n");
            }
        else if (ra1.equals("B")) {
            System.out.println("Liwbert decide seguir a passagem da água, após um tempo andando ele percebe que o caminho estava descendo mais e mais, e com isso\n"
            +"a água estava subindo, obestinado a encontrar o final ele segue em frente mais e mais, até que enfim, se depara com o fim da passagem, a água ja chegava\n"+
            "até seus ombros quando ele encontrou outra passagem, ao atrvessa-lá, ele da de cara com uma sala de pedra, como uma redoma, no centro dela, um cranio humano\n"+
            "seus 'olhos' jorravam toda a água que estava ao seu redor, do outro lado da sala, uma porta.\nO que Liwbert fara?");
            System.out.println("A)retirar o Crânio\nB)Ignorar o Crânio e seguir até a porta");
            String ra2 = scan.next();
            if (ra2.equals("A")) {
                System.out.println("Liwbert decide retirar o crânio, ele se aproxima e pega ele, logo Liwbert percebe que o crânio\n"+
                "Abre a boca, começando a jorrar mais e mais água, a passagem pela qual ele veio sumiu e a porta a frente também\n"+
                "logo, a sala se enche de água e Liwbert, apesar de seus esforços, se afoga, morrendo.\n-10 de Sanidade\nFIM DO JOGO!");
            }
            else if (ra2.equals("B")) {
                System.out.println("Liwbert decide ignorar o crânio e seguir até a porta");
                }
            }
        }
    else if (r1.equals("B")) {
        System.out.println("Liwbert sai do apartamento e vai dar uma volta para desparecer e respirar, para onde ele vai?\n");
        System.out.println("A)Floresta \nB)Pier \nC)Mercado");
        String r2 = scan.next();
        if (r2.equals(r2)){
            System.out.println("Liwbert decide ir para a floresta, ele se encontra em uma floresta densa, com árvores enormes e folhas que cobrem o chão\n"+
            "ele se perdeu, mas não se importa, ele está em paz longe de seus próprios pensamentos, até que ele escuta um barulho, e vê um homem, com uma faca\n"+
            "o homem se aproxima de Liwbert e o ataca, Liwbert consegue se defender e o homem some, mas ele não consegue se livrar da faca, ele se sente fraco\n"+
            "e desmaia, quando acorda, ele se encontra em um quarto, com uma cama e uma mesa, em cima da mesa, uma faca ensanguentada, Liwbert se sente estranho\n"+
            "o que ele deve fazer?");
            System.out.println("A)Pegar a faca\nB)Ignorar a faca e sair do quarto");
            String r3 = scan.next();
            if (r3.equals("A")) {
                
                }
            else if (r3.equals("B")) {
               
                }
            }
        }
    else if (r1.equals("C")) {
        System.out.println("Liwbert sai de sua moradia deixando seus tormentos de lado e parte para o bar mais próximo, tentando afogar seus demônios\n"
        +"com álcool, o que fazer agora que já está no bar?");
        System.out.println("A)Beber cerveja \nB)Beber Whisky\nC)Beber Vodka\nD)Acabar com o sofrimento");}
    else if (r1.equals("D")) {
        System.out.println("Liwbert não aguenta mais a tortura, ele pega uma cadeira para alcançar o teto e prende sua bela graváta\n"+
        "então ele empurra a cadeira e se enforca, acabando do jeito que ele pôde com o Sofrimento\n-9999 DE >SANIDADE<\n VOCÊ PERDEU");
        }
    else {System.out.println("escolha inválida");}
    }
}