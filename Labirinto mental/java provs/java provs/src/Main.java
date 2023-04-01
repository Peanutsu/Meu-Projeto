import Projeto_p2.Capitulo;
import java.util.Scanner;
import Projeto_p2.Personagem;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Personagem p1 = new Personagem("Liwbert", 100);
        Personagem p2 = new Personagem("Homem desconhecido", 100);
        System.out.println("Bem vindo ao jogo de escolhas 'Labirinto Mental'\n" +
                "Seu objetivo é sobreviver e evitar sua perca de >Sanidade< durante o jogo, mas como?\n" +
                "Suas escolhas colocarão o receptaculo em segurança, ou em situações perturbadoras que questionarão sua >Sanidade<"
                +
                "essas escolhas serão feitas a partir de opções, digite:\n" +
                "----------------------------------------------------------------------------\n" +
                " 1)\n 2)\n 3)\n 4)\n" +
                "----------------------------------------------------------------------------\n" +
                "Boa Sorte e que o Jogo Comece!\n" +
                "----------------------------------------------------------------------------");
        Capitulo Capitulo1 = new Capitulo("Capitulo 1",
                "Nossa História começa com um Zé ninguém, Liwbert Danis, escritor, homem solteiro, sem família, nunca foi amado por ninguém"
                        +
                        "nos seus 30 e poucos anos de vida, ele se encontra em uma viagem desesperada a uma ilha isolada tentando encontrar"
                        +
                        " inspirações para que seja lembrado um dia por suas obras mediocres, dias se passam desde sua estadia no complexo de apartamentos"
                        +
                        " que ele encontrou como estadia na ilha, mas nem uma palavra sequer saíram para as páginas de seu livro, ele decide "
                        +
                        "fazer algo para desocupar a mente, o que ele irá fazer?\n",
                new String[] { "Dormir", "tomar um ar", "beber", "Acabar com sofrimento" }, 0);
        Capitulo1.mostrar();
        String r1 = scan.next();
        if (r1.equals("3")) {
            Capitulo Capitulo12 = new Capitulo("Capitulo 12", p1.getNome()
                    + " sai de sua moradia deixando seus tormentos de lado e parte para o bar mais próximo, tentando afogar seus demônios\n"
                    + "com álcool, o que fazer agora que já está no bar?\n",
                    new String[] { "Vodka", "Whisky", "Cerveja", "acabar com sofrimeto" }, 0);
            Capitulo12.mostrar();
        } else if (r1.equals("4")) {
            Capitulo Capitulo13 = new Capitulo("Capitulo 13", p1.getNome()
                    + " não aguenta mais a tortura, ele pega uma cadeira para alcançar o teto e prende sua bela graváta\n"
                    +
                    "então ele empurra a cadeira e se enforca, acabando do jeito que ele pôde com o Sofrimento\n-9999 DE >SANIDADE<",
                    new String[] {}, -9999);
            Capitulo13.mostrar();
            p1.Dsanidade(-9999, p1);
        } 
        else if (r1.equals("1")) {
            Capitulo Capitulo2 = new Capitulo("Capitulo 2", p1.getNome()
                    + " deita para descansar e em alguns minutos adormece e entra em sono profundo.\n"
                    + "De repente, ele se encontra em uma caverna escura, não consegue ver ou sentir nada além do odor podre de peixe e a água\n"
                    +
                    "que chega aos seus tornozelos, tentando seguir uma fraca luz ao longe, ele encontra dois grandes buracos, talvez um deles\n"
                    +
                    "levasse ele para fora deste pesadelo, qual caminho seguir?\n",
                    new String[] { "Passagem baixo", "Passagem agua" }, 0);
            Capitulo2.mostrar();
            String ra1 = scan.next();
            if (ra1.equals("1")) {
                Capitulo Capitulo3 = new Capitulo("Capitulo 3", p1.getNome()
                        + " decide seguir pela passagem para baixo, ele se encontra em uma sala com uma porta, a porta está trancada, mas ele consegue ver\n"
                        +
                        "uma chave no chão, ele pega a chave e abre a porta, ele se encontra em uma sala com uma mesa e uma cadeira, iluminada por uma tocha, em cima da mesa há um livro\n"
                        +
                        "estava escrito Necronomicon, o livro tinha um rosto e a capa parecia feita com pele humana,"
                        + p1.getNome() + "se sentia enojado, mas curioso, ele pegou o livro\n" +
                        "o que" + p1.getNome() + " deve fazer?\n",
                        new String[] { "ler o livro", "devolver o livro", "queimar o Livro" }, 0);
                Capitulo3.mostrar();
                String raa1 = scan.next();
                if (raa1.equals("1")) {
                    Capitulo Capitulo4 = new Capitulo("Capitulo 4", "Ao ler o Necronomicon" + p1.getNome()
                            + " encontra passagens sobre demonios antigos 'Candarianos' e seres\n" +
                            "divinos com nomes impronunciaveis 'Yog Sothoth', 'Cthulhu', 'Azathoth', ao pronunciar esses nomes ele sentiu calafrios\n"
                            +
                            "Mas apesar do medo," + p1.getNome()
                            + " não conseguia parar de ler, ao encontrar um desenho que descrevia precisamente\n" +
                            "sua aparencia no livro maldito, ele entra em choque e então.... ele acorda",
                            new String[] {}, 0);
                    Capitulo4.mostrar();
                    // -------------------------------------------------------------------------------------------------------------
                }
            } else if (ra1.equals("2")) {
                Capitulo Capitulo5 = new Capitulo("Capitulo 5", p1.getNome()
                        + " decide seguir a passagem da água, após um tempo andando ele percebe que o caminho estava descendo mais e mais, e com isso\n"
                        + "a água estava subindo, obestinado a encontrar o final ele segue em frente mais e mais, até que enfim, se depara com o fim da passagem, a água ja chegava\n"
                        +
                        "até seus ombros quando ele encontrou outra passagem, ao atrvessa-lá, ele da de cara com uma sala de pedra, como uma redoma, no centro dela, um cranio humano\n"
                        +
                        "seus 'olhos' jorravam toda a água que estava ao seu redor, do outro lado da sala, uma porta.\n"
                        + p1.getNome() + " fara?\n", new String[] { "tirar cranio", "porta" }, 0);
                Capitulo5.mostrar();
                String ra2 = scan.next();
                if (ra2.equals("1")) {
                    Capitulo Capitulo6 = new Capitulo("Capitulo 6", p1.getNome()
                            + " decide retirar o crânio, ele se aproxima e pega ele, logo" + p1.getNome()
                            + " percebe que o crânio\n" +
                            "Abre a boca, começando a jorrar mais e mais água, a passagem pela qual ele veio sumiu e a porta a frente também\n"
                            +
                            "logo, a sala se enche de água e" + p1.getNome()
                            + "  apesar de seus esforços, se afoga, morrendo.\n-9999 de Sanidade", new String[] {},
                            -9999);
                    Capitulo6.mostrar();
                    p1.Dsanidade(-9999, p1);

                } else if (ra2.equals("2")) {
                    Capitulo Capitulo7 = new Capitulo("Capitulo 7",
                            p1.getNome() + " decide ignorar o crânio e segue até a porta", new String[] {}, 0);
                    Capitulo7.mostrar();
                }
            }
        } else if (r1.equals("2")) {
            Capitulo Capitulo8 = new Capitulo("Capitulo 8",
                    p1.getNome()
                            + " sai do apartamento e vai dar uma volta para desparecer e respirar, para onde ele vai?\n",
                    new String[] { "floresta", "pier"}, 0);
            Capitulo8.mostrar();
            String r2 = scan.next();
            if (r2.equals("1")) {
                Capitulo Capitulo9 = new Capitulo("Capitulo 9", p1.getNome()
                        + " decide ir para a floresta, ele se encontra em uma floresta densa, com árvores enormes e folhas que cobrem o chão\n"
                        +
                        "ele se perdeu, mas não se importa, ele está em paz longe de seus próprios pensamentos, até que ele escuta um barulho, e vê um homem, com uma faca\n"
                        +
                        "o homem se aproxima de " + p1.getNome() + " e o ataca," + p1.getNome()
                        + " consegue se defender e o homem some, perdendo 20 de >Sanidade<, mas ele não consegue se livrar da faca, ele se sente fraco\n"
                        +
                        "e desmaia, quando acorda, ele se encontra em um quarto, com uma cama e uma mesa, em cima da mesa, uma faca ensanguentada, "
                        + p1.getNome() + "se sente estranho perndendo -20 de >Sanidade\n" +
                        "o que ele deve fazer?\n", new String[] { "sair", "ficar" }, 0);
                Capitulo9.mostrar();
                p1.Dsanidade(-20, p1);
                p2.Dsanidade(-20, p2);
            }
            else if (r2.equals("2")) {
                Capitulo Capitulo22 = new Capitulo("Capitulo 22", p1.getNome() + " se dirige ao pier e lá ele se depar com o mar\n" +
                "o mar está calmo, ele decide descer até a água para se refrescar, ao entrar na praia, " + p1.getNome() +
                "se depara com seu fim, o Deus ancestral Cthullu aparece, não há escapatória, você perdeu toda sanidade", new String[] {}, -9999);
                Capitulo22.mostrar();
                p1.Dsanidade(-9999, p1);
            }
                String r3 = scan.next();
                if (r3.equals("1")) {
                    Capitulo Capitulo10 = new Capitulo("Capitulo 10", p1.getNome()
                            + " decide ir embora, ele sai do quarto e se depara com o homem que o atacou, ele se aproxima e o homem\n"
                            +
                            "o esfaqueia, " + p1.getNome() + " morre, perdendo -9999 de >Sanidade<", new String[] {},
                            -9999);
                    Capitulo10.mostrar();
                    p1.Dsanidade(-9999, p1);
                } else if (r3.equals("2")) {
                    Capitulo Capitulo11 = new Capitulo("Capitulo 11", p1.getNome()
                            + " decide ficar, ele se senta na cama e começa a pensar, ele se lembra de um livro que ele tinha lido\n"
                            +
                            "quando era criança, ele se lembra de um capitulo que falava sobre um homem que se encontrava em um quarto, com uma faca ensanguentada\n"
                            +
                            "e que ele tinha que ficar ali, e que se ele saisse, ele morreria, mas se ele ficasse, ele poderia sobreviver",
                            new String[] {}, 0);
                    Capitulo11.mostrar();
                    System.out.println(
                            "Você está preso, porém, você pode sobreviver, parabéns, você venceu o jogo, ou quase?\n");
                } else {
                    System.out.println("escolha inválida");
                }
            } 
            
            else {
                System.out.println("escolha inválida");
            }
            if (p1.getSanidade() <= 0) {
                System.out.println("VOCÊ PERDEU TODA A SUA SANIDADE, VOCÊ ENLOUQUECEU");
            }
        scan.close();
    }
}