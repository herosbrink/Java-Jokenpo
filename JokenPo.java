package br.com.jokenpo;

import java.util.Random;
import java.util.Scanner;

/**
 * Aula - JokenPo (exercício)
 *
 * @author Vinicius Marins
 */
public class JokenPo {

    public static void main(String[] args) {

        // Parte lógica do jogador
        int jogador;
        Scanner mao = new Scanner(System.in);
        System.out.println("_____Jo-ken-Po!!!______");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("Digite a sua opção: ");
        jogador = mao.nextInt();

        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu Pedra!");
                break;
            case 2:
                System.out.println("Jogador escolheu Papel!");
                break;
            case 3:
                System.out.println("Jogador escolheu Tesoura!");
                break;
            default:
                System.out.println("Escolha uma opção válida...");

        }

        //Parte lógica do computador
        int computador = 0;

        // Esse if esta controlando se a maquina joga ou não.
        if ((jogador == 1) || (jogador == 2) || (jogador == 3)) {

            Random rdn = new Random();
            computador = rdn.nextInt(3) + 1;

            switch (computador) {
                case 1:
                    System.out.println("Computador escolheu Pedra!");
                    break;
                case 2:
                    System.out.println("Computador escolheu Papel!");
                    break;
                case 3:
                    System.out.println("Computador escolheu Tesoura!");
                    break;
            }
        } else {
            System.out.println("O Humano burro não jogou!");
            System.exit(0);

        }
        // lógica para determinar o vencedor.
        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2
                    && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("O Jogador Venceu!!!");
            } else {
                System.out.println("O Computador Venceu!!!");
            }
        } else {
            System.out.println("Empate!");
        }

    }
}
