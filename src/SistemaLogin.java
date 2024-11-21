import java.util.Scanner;

public class SistemaLogin {
    private static final String LOGIN_CORRETO = "java8";
    private static final String SENHA_CORRETA = "java8";
    private static final int MAX_TENTATIVAS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < MAX_TENTATIVAS && !acessoPermitido) {
            System.out.print("Digite seu login: ");
            String login = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (LOGIN_CORRETO.equals(login) && SENHA_CORRETA.equals(senha)) {
                acessoPermitido = true;
                System.out.println("Login bem-sucedido!");
            } else {
                tentativas++;
                int tentativasRestantes = MAX_TENTATIVAS - tentativas;
                if (tentativasRestantes > 0) {
                    System.out.println("Login ou Senha Incorretos. Você tem mais " + tentativasRestantes + " tentativa(s).");
                } else {
                    System.out.println("Número Máximo de Tentativas Atingido. ACESSO BLOQUEADO!!!.");
                }
            }
        }

        scanner.close();
    }
}