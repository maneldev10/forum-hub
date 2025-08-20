package com.emanuel.forumhub;

import java.util.Scanner;

public class ForumHubApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ForumService service = new ForumService();
        int opcao;

        do {
            System.out.println("\n=== Fórum Hub ===");
            System.out.println("1 - Listar tópicos");
            System.out.println("2 - Criar comentário");
            System.out.println("3 - Listar comentários de um tópico");
            System.out.println("4 - Pesquisar tópicos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir Enter

            switch (opcao) {
                case 1:
                    service.listarTopicos();
                    break;
                case 2:
                    service.criarComentario(scanner);
                    break;
                case 3:
                    service.listarComentarios(scanner);
                    break;
                case 4:
                    service.pesquisarTopicos(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
