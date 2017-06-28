package Peças;

import java.util.Random;

public final class Tabuleiro {

    static int i, j, x, y, x2, y2;
    public static Peças matriz[][] = new Peças[5][5];

    static Peças Jogador[] = new Peças[10];
    static Peças CPU[] = new Peças[10];

    public static void instanciaPeçasJogador() {

        Jogador[0] = new Soldado();
        Jogador[1] = new Soldado();
        Jogador[2] = new Soldado();
        Jogador[3] = new Marechal();
        Jogador[4] = new Bandeira();
        Jogador[5] = new Espião();
        Jogador[6] = new Cabo();
        Jogador[7] = new Cabo();
        Jogador[8] = new Bomba();
        Jogador[9] = new Bomba();

        for (int i = 0; i < 10; i++) {
            Jogador[i].setVisivel(true);
        }
        for (int i = 0; i < 10; i++) {
            Jogador[i].setCPU(false);
        }
        for (int i = 0; i < 10; i++) {
            Jogador[i].setTime(1);
        }
        for (int i = 0; i < 10; i++) {
            Jogador[i].setImagem(true, false);
        }

    }

    public static void instanciaPeçasCPU() {

        CPU[0] = new Soldado();
        CPU[1] = new Soldado();
        CPU[2] = new Soldado();
        CPU[3] = new Marechal();
        CPU[4] = new Bandeira();
        CPU[5] = new Espião();
        CPU[6] = new Cabo();
        CPU[7] = new Cabo();
        CPU[8] = new Bomba();
        CPU[9] = new Bomba();

        for (int i = 0; i < 10; i++) {
            CPU[i].setVisivel(false);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setCPU(true);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setTime(2);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setImagem(false, true);
        }

    }

    public static void esvaziaTabuleiro() {
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j] = new Vazio();
            }
        }
    }

    public static void posicionamentoCPU() {

        int i, l, c;

        Random Random = new Random();

        for (i = 0; i < 10; i++) {
            do {
                l = Random.nextInt(2);
                c = Random.nextInt(5);
            } while (matriz[l][c].getNivel() != 0);

            matriz[l][c] = CPU[i];
            matriz[l][c].setTime(2);
        }
    }

    public void posicionamentoDefinido() {

    }

    public static void posicionamentoAleatorio() {
        int i, l, c;

        Random Random = new Random();

        for (i = 0; i < 10; i++) {
            do {
                l = Random.nextInt(2) + 3;
                c = Random.nextInt(5);
            } while (matriz[l][c].getNivel() != 0);

            matriz[l][c] = Jogador[i];
            matriz[l][c].setTime(1);
        }
    }

    public static void posicionaLago() {

        Random aleatorio = new Random();
        i = aleatorio.nextInt(5);

        Tabuleiro.matriz[2][i] = new Lago();
        //return i;
    }

    public static void debug() {

        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (matriz[i][j].getTime() == 2) {
                    matriz[i][j].setVisivel(true);
                }
            }
        }
    }

    public static boolean MovimentoAI() {
        Random Random = new Random();
        boolean validate;
        int destino;

        do {
            validate = false;

            x = Random.nextInt(5);
            y = Random.nextInt(5);

            if (validaOrigem(x, y, 2)) {
                validate = true;
            }

            if (Tabuleiro.matriz[x][y].time != 2) {
                validate = false;
            }

        } while (!validate);

        do {
            validate = false;

            destino = Random.nextInt(4);

            System.out.println(destino);

            if (destino == 0) //cima
            {
                if (x - 1 > -1) {
                    if (Tabuleiro.matriz[x - 1][y].time != 2) {
                        x2 = x - 1;
                        y2 = y;
                        validate = true;
                    }
                }
            } else if (destino == 1) //direita
            {
                if (y + 1 < 5) {
                    if (Tabuleiro.matriz[x][y + 1].time != 2) {
                        x2 = x;
                        y2 = y + 1;
                        validate = true;
                    }
                }
            } else if (destino == 2) //baixo
            {
                if (x + 1 < 5) {
                    if (Tabuleiro.matriz[x + 1][y].time != 2) {
                        x2 = x + 1;
                        y2 = y;
                        validate = true;
                    }
                }
            } else if (destino == 3) //esquerda
            {
                if (y - 1 > -1) {
                    if (Tabuleiro.matriz[x][y - 1].time != 2) {
                        x2 = x;
                        y2 = y - 1;
                        validate = true;
                    }
                }
            }
            if (Tabuleiro.matriz[x2][y2].time == 3) {
                validate = false;
            }
        } while (!validate);

        System.out.println(x + " : " + y);
        System.out.println(x2 + " : " + y2);
        System.out.println(Tabuleiro.matriz[x][y].nome);

        return (Tabuleiro.matriz[x][y].Batalha(x, x2, y, y2));
    }

    public static boolean validaOrigem(int x, int y, int k) {

        if (Tabuleiro.matriz[x][y].nivel > 10) {
            return false;
        } else {
            if (x + 1 < 5) {
                if ((Tabuleiro.matriz[x + 1][y].time != k) && (Tabuleiro.matriz[x + 1][y].time != 3)) {
                    return true;
                }
            }
            if (x - 1 > -1) {
                if ((Tabuleiro.matriz[x - 1][y].time != k) && (Tabuleiro.matriz[x - 1][y].time != 3)) {
                    return true;
                }
            }
            if (y + 1 < 5) {
                if ((Tabuleiro.matriz[x][y + 1].time != k) && (Tabuleiro.matriz[x][y + 1].time != 3)) {
                    return true;
                }
            }
            if (y - 1 > -1) {
                if ((Tabuleiro.matriz[x][y - 1].time != k) && (Tabuleiro.matriz[x][y - 1].time != 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int fimdeJogo(int n) {
        int i, j, cont;

        cont = 0;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (Tabuleiro.matriz[i][j].time == n) {
                    if (Tabuleiro.matriz[i][j].nivel <= 10) {
                        if (validaOrigem(i, j, n)) {
                            cont++;
                        }
                    }
                }
            }
        }

        if (cont == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
