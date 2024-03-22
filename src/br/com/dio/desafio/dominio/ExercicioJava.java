package br.com.dio.desafio.dominio;

public class ExercicioJava extends Exercicios {
    public ExercicioJava(NivelDificuldade nivelDificuldade) {
        super(nivelDificuldade);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.getNivelDificuldade().getValor();
    }
}
