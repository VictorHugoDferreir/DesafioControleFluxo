# Desafio Controle de Fluxo em Java

Este projeto é uma aplicação simples desenvolvida em Java, como parte de um exercício para praticar o controle de fluxo, tratamento de exceções e organização de código.

## 💡 Objetivo

Receber dois parâmetros inteiros via terminal e realizar uma contagem com base na diferença entre eles. O segundo parâmetro deve ser maior que o primeiro — caso contrário, uma exceção personalizada é lançada.

## ⚙️ Como funciona

1. O usuário insere dois números pelo terminal.
2. A classe `Contador` realiza a subtração entre o segundo e o primeiro número.
3. O resultado da subtração é utilizado para determinar **quantas vezes** a mensagem será impressa.
4. Caso o segundo número seja **menor ou igual** ao primeiro, uma **exceção customizada** (`ParametrosInvalidosException`) é lançada.

## 📦 Estrutura do Projeto

```
src/
└── br/
    └── com/
        └── DesafioControleFluxo/
            ├── Main.java
            ├── Model/
                └── Contador.java
            └── Exception/
                └── ParametrosInvalidosException.java
```

### 🧪 Exemplo de execução

Entrada no terminal:
```
Digite o primeiro parâmetro
2
Digite o segundo parâmetro
5
```

Saída:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```

## 🚫 Tratamento de Erros

Se os parâmetros forem inválidos (ou seja, o segundo for menor ou igual ao primeiro), o programa lança e captura a exceção personalizada, exibindo a mensagem:

```
O segundo parâmetro deve ser maior que o primeiro.
```

## 🛠️ Tecnologias utilizadas

- Java 21+
- IntelliJ IDEA
- Terminal/Console para entrada de dados

---

Desenvolvido para fins de prática e aprendizado de fundamentos do Java.
