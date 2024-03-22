package br.com.dio.desafio.dominio;

public abstract class Exercicios extends Conteudo{
    private final NivelDificuldade nivelDificuldade;

    public Exercicios(NivelDificuldade nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public NivelDificuldade getNivelDificuldade() {
        return nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Exercicios{" +
                "nome=" + super.getTitulo() +
                " descrição=" + super.getDescricao() +
                " nivelDificuldade=" + nivelDificuldade +
                '}';
    }
}
