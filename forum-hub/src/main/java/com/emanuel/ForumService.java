package com.emanuel.forumhub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForumService {

    private List<Topico> topicos;

    public ForumService() {
        topicos = new ArrayList<>();
        // Criando 3 tópicos iniciais
        topicos.add(new Topico(1, "Programação em Java"));
        topicos.add(new Topico(2, "Spring Boot dicas"));
        topicos.add(new Topico(3, "Projetos de estudo"));
    }

    public void listarTopicos() {
        System.out.println("\n=== Lista de Tópicos ===");
        for (Topico t : topicos) {
            System.out.println(t.getId() + " - " + t.getTitulo());
        }
    }

    public void criarComentario(Scanner scanner) {
        listarTopicos();
        System.out.print("Escolha o ID do tópico para comentar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consumir Enter

        Topico topico = buscarTopicoPorId(id);
        if (topico != null) {
            System.out.print("Digite seu nome: ");
            String autor = scanner.nextLine();
            System.out.print("Digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            topico.addComentario(new Comentario(autor, mensagem));
            System.out.println("Comentário adicionado!");
        } else {
            System.out.println("Tópico não encontrado!");
        }
    }

    public void listarComentarios(Scanner scanner) {
        listarTopicos();
        System.out.print("Escolha o ID do tópico para ver comentários: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consumir Enter

        Topico topico = buscarTopicoPorId(id);
        if (topico != null) {
            System.out.println("\n=== Comentários do Tópico: " + topico.getTitulo() + " ===");
            if (topico.getComentarios().isEmpty()) {
                System.out.println("Nenhum comentário ainda.");
            } else {
                for (Comentario c : topico.getComentarios()) {
                    System.out.println(c.getAutor() + ": " + c.getMensagem());
                }
            }
        } else {
            System.out.println("Tópico não encontrado!");
        }
    }

    public void pesquisarTopicos(Scanner scanner) {
        System.out.print("Digite uma palavra-chave para pesquisar tópicos: ");
        String termo = scanner.nextLine().toLowerCase();

        System.out.println("\n=== Resultados da pesquisa ===");
        boolean encontrado = false;
        for (Topico t : topicos) {
            if (t.getTitulo().toLowerCase().contains(termo)) {
                System.out.println(t.getId() + " - " + t.getTitulo());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum tópico encontrado.");
        }
    }

    private Topico buscarTopicoPorId(int id) {
        for (Topico t : topicos) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
