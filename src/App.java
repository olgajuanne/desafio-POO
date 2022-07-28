import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;
import desafio.dominio.Projeto;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Introdução a java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("JavaScript.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java.");
        mentoria.setData(LocalDate.now());

        Projeto projeto = new Projeto();
        projeto.setTitulo("Projeto Java.");
        projeto.setDescricao("Portal de aprendizagem online em JAVA.");
        projeto.setCargaHoraria(1);

    //     System.out.println(curso1);
    //     System.out.println(curso2);
    //     System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projeto);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila ");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\u001b[46m Dev: Camila \u001b[m");
        System.out.println("\u001b[36m Inscritos:\u001b[m" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("  -  - ");
        System.out.println("\u001b[36m Inscritos\u001b[m" + devCamila.getConteudosInscritos());
        System.out.println("\u001b[36m Concluidos:\u001b[m" + devCamila.getConteudosConcluidos());
        System.out.println("\u001b[36m - XP:\u001b[m" + devCamila.calcularTotalXp());
        
        System.out.println("   ------- ");

        Dev devJoao = new Dev();
        devJoao.setNome("João ");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\u001b[46m Dev: João \u001b[m");
        System.out.println("\u001b[36mInscritos: \u001b[m" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("  -  - ");
        System.out.println("\u001b[36mInscritos: \u001b[m" + devJoao.getConteudosInscritos());
        System.out.println("\u001b[36mConcluidos: \u001b[m" + devJoao.getConteudosConcluidos());
        System.out.println("\u001b[36m - XP: \u001b[m" + devJoao.calcularTotalXp());

        System.out.println("   ------- ");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe ");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("\u001b[46m Dev: Felipe \u001b[m");
        System.out.println("\u001b[36mInscritos: \u001b[m" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("  -  - ");
        System.out.println("\u001b[36mInscritos: \u001b[m" + devFelipe.getConteudosInscritos());
        System.out.println("\u001b[36mConcluidos: \u001b[m" + devFelipe.getConteudosConcluidos());
        System.out.println("\u001b[36m - XP: \u001b[m" + devFelipe.calcularTotalXp());

        System.out.println("   ------- ");

        Dev devVenilto = new Dev();
        devVenilto.setNome("Venilto ");
        System.out.println("\u001b[46m Dev: Venilto \u001b[m");
        devVenilto.progredir();

    }
}
