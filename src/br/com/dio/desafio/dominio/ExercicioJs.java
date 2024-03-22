package br.com.dio.desafio.dominio;

public class ExercicioJs extends Exercicios {

    public ExercicioJs(NivelDificuldade nivelDificuldade) {
        super(nivelDificuldade);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * getNivelDificuldade().getValor();
    }
}
