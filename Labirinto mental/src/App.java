import java.util.Scanner;
import Person.Person;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner(System.in);
    Person p1 = new Person("Liwbert", 100);
    Person p2 = new Person("Homem desconhecido", 100);
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
        System.out.println( p1.nome + " deita para descansar e em alguns minutos adormece e entra em sono profundo.\n"
        +"De repente, ele se encontra em uma caverna escura, não consegue ver ou sentir nada além do odor podre de peixe e a água\n"+
        "que chega aos seus tornozelos, tentando seguir uma fraca luz ao longe, ele encontra dois grandes buracos, talvez um deles\n"+
        "levasse ele para fora deste pesadelo, qual caminho seguir?");
        System.out.println("A)Passagem para baixo \nB)Passagem por onde vem a água");
        String ra1 = scan.next();
        if (ra1.equals("A")) {
            System.out.println( p1.nome + " decide seguir pela passagem para baixo, ele se encontra em uma sala com uma porta, a porta está trancada, mas ele consegue ver\n"+
            "uma chave no chão, ele pega a chave e abre a porta, ele se encontra em uma sala com uma mesa e uma cadeira, iluminada por uma tocha, em cima da mesa há um livro\n"+
            "estava escrito Necronomicon, o livro tinha um rosto e a capa parecia feita com pele humana," + p1.nome + "se sentia enojado, mas curioso, ele pegou o livro\n"+
            "o que" + p1.nome + " deve fazer?\n");
            System.out.println(" A)Ler o livro\n B)Ignorar a curiosidade e devolver o Livro\n C)Queimar o Livro\n");
            String raa1 = scan.next();
            if (raa1.equals("A")) {
                System.out.println("Ao ler o Necronomicon" + p1.nome  + " encontra passagens sobre demonios antigos 'Candarianos' e seres\n"+
                "divinos com nomes impronunciaveis 'Yog Sothoth', 'Cthulhu', 'Azathoth', ao pronunciar esses nomes ele sentiu calafrios\n"+
                "Mas apesar do medo,"+ p1.nome + " não conseguia parar de ler, ao encontrar um desenho que descrevia precisamente\n"+
                "sua aparencia no livro maldito, ele entra em choque e então.... ele acorda");
//-------------------------------------------------------------------------------------------------------------
                }
            }
        else if (ra1.equals("B")) {
            System.out.println( p1.nome + " decide seguir a passagem da água, após um tempo andando ele percebe que o caminho estava descendo mais e mais, e com isso\n"
            +"a água estava subindo, obestinado a encontrar o final ele segue em frente mais e mais, até que enfim, se depara com o fim da passagem, a água ja chegava\n"+
            "até seus ombros quando ele encontrou outra passagem, ao atrvessa-lá, ele da de cara com uma sala de pedra, como uma redoma, no centro dela, um cranio humano\n"+
            "seus 'olhos' jorravam toda a água que estava ao seu redor, do outro lado da sala, uma porta.\nO que"+ p1.nome+  " fara?");
            System.out.println("A)retirar o Crânio\nB)Ignorar o Crânio e seguir até a porta");
            String ra2 = scan.next();
            if (ra2.equals("A")) {
                System.out.println( p1.nome + " decide retirar o crânio, ele se aproxima e pega ele, logo" + p1.nome + " percebe que o crânio\n"+
                "Abre a boca, começando a jorrar mais e mais água, a passagem pela qual ele veio sumiu e a porta a frente também\n"+
                "logo, a sala se enche de água e" + p1.nome +  "  apesar de seus esforços, se afoga, morrendo.\n-10 de Sanidade");
                p1.Dsanidade(20,p1);
            }
            else if (ra2.equals("B")) {
                System.out.println( p1.nome + " decide ignorar o crânio e segue até a porta");
                }
            }
        }
    else if (r1.equals("B")) {
        System.out.println( p1.nome +  " sai do apartamento e vai dar uma volta para desparecer e respirar, para onde ele vai?\n");
        System.out.println("A)Floresta \nB)Pier \nC)Mercado");
        String r2 = scan.next();
        if (r2.equals(r2)){
            System.out.println( p1.nome  +" decide ir para a floresta, ele se encontra em uma floresta densa, com árvores enormes e folhas que cobrem o chão\n"+
            "ele se perdeu, mas não se importa, ele está em paz longe de seus próprios pensamentos, até que ele escuta um barulho, e vê um homem, com uma faca\n"+
            "o homem se aproxima de "+ p1.nome + " e o ataca," + p1.nome +  " consegue se defender e o homem some, perdendo 20 de >Sanidade<, mas ele não consegue se livrar da faca, ele se sente fraco\n"+
            "e desmaia, quando acorda, ele se encontra em um quarto, com uma cama e uma mesa, em cima da mesa, uma faca ensanguentada, " + p1.nome + "se sente estranho perndendo -20 de >Sanidade\n"+
            "o que ele deve fazer?");
            p1.Dsanidade(20,p1);
            p2.Dsanidade(20,p2);

            System.out.println("A)Pegar a faca\nB)Ignorar a faca e sair do quarto");
            String r3 = scan.next();
            if (r3.equals("A")) {
                System.out.println( p1.nome + " pega a faca e sai do quarto, por uma escada que ele encontra buscando uma saída\n"+
                "ele decide ir pela escada, ao chegar no topo, ele se depara com uma sala escura com um telefone vermelho antigo, de repente, o telefone toca\n"+
                "ele atende e escuta uma voz, que diz: 'Você não pode sair daqui, você não pode sair daqui, você não pode sair daqui, você não pode sair daqui'\n -10 de >Sanidade<\n"+
                "o que ele deve fazer?");
                p1.Dsanidade(10,p1);

                System.out.println("A)Ignorar a voz\nB)Responder a voz");
                String r4 = scan.next();
                if(r4.equals("A")) {
                System.out.println();
                }
                
                }
            else if (r3.equals("B")) {
               
                }
            }
        }
    else if (r1.equals("C")) {
        System.out.println( p1.nome + " sai de sua moradia deixando seus tormentos de lado e parte para o bar mais próximo, tentando afogar seus demônios\n"
        +"com álcool, o que fazer agora que já está no bar?");
        System.out.println("A)Beber cerveja \nB)Beber Whisky\nC)Beber Vodka\nD)Acabar com o sofrimento");}
    else if (r1.equals("D")) {
        System.out.println( p1.nome + " não aguenta mais a tortura, ele pega uma cadeira para alcançar o teto e prende sua bela graváta\n"+
        "então ele empurra a cadeira e se enforca, acabando do jeito que ele pôde com o Sofrimento\n-9999 DE >SANIDADE<");
        p1.Dsanidade(9999,p1);
        }
    else {System.out.println("escolha inválida");
}
    if (p1.sanidade <= 0) {
        System.out.println("VOCÊ PERDEU TODA A SUA SANIDADE, VOCÊ ENLOUQUECEU");
        }
        }
}