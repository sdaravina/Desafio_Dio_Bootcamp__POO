import java.time.LocalDate;

import DioDesafio.dominio.Bootcamp;
import DioDesafio.dominio.Curso;
import DioDesafio.dominio.Dev;
import DioDesafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso JavaScript");
        curso1.setDescricao("descricao curso JS");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso Java");
        curso2.setDescricao("descricao curso Java");
        curso2.setCargaHoraria(10);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria");
        mentoria1.setDescricao("mentoria referente ao curso");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp(); 
        bootcamp.setNome("Bootcamp JavaScript");
        bootcamp.setDescricao("Aprenda JavaScript do zero.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devStephanie = new Dev(); 
        devStephanie.setNome("Stephanie");
        devStephanie.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por Stephanie: " + devStephanie.getConteudosInscritos());
        devStephanie.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos por Stephanie: " + devStephanie.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Stephanie: " + devStephanie.getConteudosConcluidos());
        System.out.println("XP: " +devStephanie.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devJunior = new Dev(); 
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos por Junior: " + devJunior.getConteudosInscritos());
        devJunior.progredir();
        devJunior.progredir();
        devJunior.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos por Junior: " + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Junior: " + devStephanie.getConteudosConcluidos());
        System.out.println("XP: " +devJunior.calcularTotalXp());

    }
}
