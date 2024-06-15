package dio;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Esse curso é de java!");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Esse curso é de js!");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria ();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("essa mentoria é de java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
	    Dev devRafael = new Dev();
	    devRafael.setNome("Rafael");
	    devRafael.inscreverBootcamp(bootcamp);
	    System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
	    devRafael.progredir();
	    devRafael.progredir();
	    System.out.println("-");
	    System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
	    System.out.println("Conteúdos Concluídos Rafael:" + devRafael.getConteudosConcluidos());
	    System.out.println("XP:" + devRafael.calcularTotalXp());

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

		
		
		
		
	}

}
