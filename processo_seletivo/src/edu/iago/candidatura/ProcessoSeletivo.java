import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean tentarNovamente = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            if(atendeu){
                tentarNovamente = false;
                System.out.println("Contato realizado com sucesso");
            } 
            tentativasRealizadas++;
        } while (tentarNovamente && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        } else {
            System.out.println("Não conseguimos contato com o candidato " + candidato + " por excesso de tentativa");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIDADTOS");
        for(int index = 0; index < candidatos.length; index++){
            System.out.println("O candidato nº " + (index+1) + " é o/a " + candidatos[index]);
        }

        System.out.println("Forma abreviada do For each");

        for(String candidato: candidatos){
            System.out.println("O(a) candidato(a) selecionado(a) foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual > candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = Math.floor(valorPretendido());

            System.out.println("O candidato " + candidato + " solicitou o salário de " + salarioPretendido + " reais");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}