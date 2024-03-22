import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo exercicioJava = new ExercicioJava(NivelDificuldade.MEDIO);
        exercicioJava.setTitulo("Fibonacci");
        exercicioJava.setDescricao("Criar um programa para fazer a sequência de Fibonacci.");

        Conteudo exercicioJs = new ExercicioJs(NivelDificuldade.DIFICIL);
        exercicioJs.setTitulo("Calculadora");
        exercicioJs.setDescricao("Criar uma calculadora com HTML.");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(exercicioJs);
        bootcamp.getConteudos().add(exercicioJava);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos de Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("Victor fez os seguintes contéudos: " + devVictor.getConteudosConcluidos()
                + ", falta o seguinte: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("Victor fez: " + devVictor.getConteudosConcluidos() + ", falta :"
                + devVictor.getConteudosInscritos());
        devVictor.progredir();
        System.out.println("Status de Victor:");
        System.out.println("Cursos Concluidos: " + devVictor.getConteudosConcluidos());
        System.out.println("Cursos a fazer: " + devVictor.getConteudosInscritos());
        System.out.println("XP: " + devVictor.calcularTotalXp());
    }

}
