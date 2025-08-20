# Fórum Hub

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.2-green)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

Projeto de estudo em Java com Spring Boot, criando um fórum interativo simples, com armazenamento em memória e menu no console.

---

## Funcionalidades

- Listar tópicos existentes
- Criar comentários em tópicos
- Listar comentários de um tópico
- Pesquisar tópicos por palavra-chave
- Menu interativo no console

---

## Tecnologias

- Java 17
- Spring Boot 3.x
- Maven
- Armazenamento em memória (sem banco de dados)
- IntelliJ IDEA

---

## Estrutura do Projeto

forum-hub/
├── pom.xml
└── src/
└── main/
└── java/
└── com/emanuel/forumhub/
├── ForumHubApplication.java
├── ForumService.java
├── Topico.java
└── Comentario.java


---

## Como Rodar

1. Clone o repositório:

```bash
git clone https://github.com/SEU_USUARIO/forum-hub.git
cd forum-hub

2. Abra o projeto no IntelliJ IDEA.

3. Certifique-se que o Maven baixou as dependências:
mvn clean install

4. Execute a classe ForumHubApplication.java.

5. Use o menu interativo para testar todas as funcionalidades.

## Observações
    
Todos os dados são armazenados em memória; ao fechar o programa, os tópicos e comentários são perdidos.

Inicialmente, o projeto já vem com 3 tópicos de exemplo:

Programação em Java

Spring Boot dicas

Projetos de estudo
