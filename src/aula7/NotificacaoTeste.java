package aula7;

public class NotificacaoTeste {

   public static void dispararAlerta(Notificacao notificacao){
       System.out.println("\n [SISTEMA DE ALERTA] ");
       notificacao.enviar();
   }









    public static void main(String[] args) {

        Notificacao n1 = new Email("Aluno@fiap", "CP realizado", "aviso importante");
        Notificacao n2 = new SMS("11983413004", "Aula de hoje - não perca");

        n1.enviar();
        n2.enviar();

        dispararAlerta(n1);
        dispararAlerta(n2);

        int tipoCanal = 2;
        Notificacao notificacaoEscolhida = null;

        if(tipoCanal == 1){
            notificacaoEscolhida = new Email("aluno2@fiap", "Bom dia turma", "Aula de java");
        }else if(tipoCanal == 2){
            notificacaoEscolhida = new SMS("1199578394", "Aula de hoje - não perca");
        }

        dispararAlerta(notificacaoEscolhida);


    }
}
