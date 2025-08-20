package com.emanuel.forumhub;

import java.util.ArrayList;
import java.util.List;

public class Topico {
    private int id;
    private String titulo;
    private List<Comentario> comentarios;

    public Topico(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.comentarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}
