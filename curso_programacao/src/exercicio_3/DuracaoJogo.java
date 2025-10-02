package exercicio_3;
	
	
public class DuracaoJogo {
	public void duracao (int horaInicial, int horaFinal) {
		int duracao;
		
		if(horaInicial > horaFinal ) {
			duracao = 24 - horaInicial + horaFinal;
		}else if(horaFinal > horaInicial){
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24;
		}
		
		System.out.printf("O jogo durou %d horas.", duracao);
	}
}
