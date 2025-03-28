import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo parâmetro");
        }else {
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {

            System.out.println(i);
        }
        }
    }
}
