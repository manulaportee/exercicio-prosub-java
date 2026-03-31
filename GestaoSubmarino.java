import java.util.Scanner;

public class GestaoSubmarino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double repasseAnual = 0;
        System.out.println("--- SISTEMA DE COMANDO PROSUB 2026 ---");
        System.out.println("Informe o repasse anual (em bilhões). \nPor exemplo: 1,0:");
        double respostaRepasse = scanner.nextDouble();

        if (repasseAnual < 0.5){
            System.out.println("ALERTA: Risco de paralisação total. Data estimada: 2045");
        }   if (repasseAnual >= 0.5 && repasseAnual <= 1.0){
            System.out.println("Ritmo lento: Finalização prevista para 2037");
        }   if (repasseAnual > 1.0) {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");
        }
        

        System.out.println("--------------------------------------");
        System.out.println("Informe o país de origem da solicitação:");
        String paisOrigem = scanner.next();
        System.out.println("Nível de acesso solicitado (TOTAL/PARCIAL):" );
        String nivelAcesso = scanner.next();

           if (nivelAcesso.equalsIgnoreCase( "TOTAL") && paisOrigem.equalsIgnoreCase("Brasil")){
            System.out.println("Status: Acesso autorizado ao Almirantado");
        }  if (nivelAcesso.equalsIgnoreCase( "TOTAL") && !paisOrigem.equalsIgnoreCase("Brasil")){
            System.out.println("Status: ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
            return;
        }

        System.out.println("--------------------------------------");
        System.out.println("Insira a temperatura do reator nuclear: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 280) {
            System.out.println("Aumentar potência do reator.");
        }   if (temperatura >= 280 && temperatura <=350){
            System.out.println("Operação Normal - Cruzeiro.");
        }   else {
            System.out.println("Acionar sistema de resfriamento e emergência.");
        }

        scanner.close();
    }
}
