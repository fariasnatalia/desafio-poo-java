import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

    public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
             
        curso1.setTitulo("Curso java");
        curso1.setDescricao(" Curso de Java da digital Innovation");
        curso1.setCargaHoraria(5);
//---------------------------------------------------------------------------------
        
        Curso curso2 = new Curso();
       
        curso2.setTitulo(" Java SCRIPT ");
        curso2.setDescricao(" Curso Java SCRIPT da digital Innovation");
        curso2.setCargaHoraria(30);
        
// ---------------------------------------------------//

        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo(" Mentoria de java ");
        mentoria.setDescricao(" Descrição mentoria java ");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); 
        System.out.println(" Muita paciência!");
//-------------------------------------------------------------------        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desafio Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
//---------------------------------------------------------------------
        Dev devNatalia = new Dev();
        devNatalia .setNome("natalia ");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Natalia:" + devNatalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Natalia:" + devNatalia.getConteudosConcluidos());
   
        System.out.println("-------");
        
    //IMPRIMINDO OS CONTEÚDOS QUE CADA DEV ESTÁ INSCRITO!
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
       
        
        //System.out.println(curso1);
        //System.out.println(mentoria);
        //System.out.println(mentoria);/* */
    }

}
