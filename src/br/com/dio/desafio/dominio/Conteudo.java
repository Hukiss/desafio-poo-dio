package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.setTitulo(titulo);
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null)
            throw new IllegalArgumentException("titutos não podem ser nulos");
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
