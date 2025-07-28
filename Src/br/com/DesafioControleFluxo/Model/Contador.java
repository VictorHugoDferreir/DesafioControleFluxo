package br.com.DesafioControleFluxo;

public class Contador {

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

            if (parametroDois <= parametroUm) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {
                System.out.printf("Imprimindo o número %d%n", i);
            }

    }
}
