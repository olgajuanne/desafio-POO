import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição introdução a java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("Descrição JavaScript.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria sobre java.");
        mentoria.setData(LocalDate.now());

    //     System.out.println(curso1);
    //     System.out.println(curso2);
    //     System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila ");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdo Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        
        System.out.println(" ------- ");

        Dev devJoao = new Dev();
        devJoao.setNome("João ");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdo Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}
