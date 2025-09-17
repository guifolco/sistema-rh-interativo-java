# ⚙️ Sistema Interativo de Folha de Pagamento (RH)

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java)

## 📄 Descrição

Este projeto é uma **aplicação de console interativa** que simula um sistema simplificado de Recursos Humanos para cálculo de folha de pagamento. Diferente de um script estático, esta versão permite ao usuário, em tempo de execução, cadastrar dinamicamente novos funcionários em diferentes cargos (Gerente, Vendedor, Telefonista) e visualizar um relatório completo da folha de pagamento.

O foco principal do projeto é a aplicação prática dos pilares da Programação Orientada a Objetos (**Herança** e **Polimorfismo**) em um ambiente interativo, criando um sistema coeso, organizado e facilmente extensível.

## 📸 Screenshots da Aplicação

<img width="275" height="97" alt="image" src="https://github.com/user-attachments/assets/b3f74378-1309-454c-9a48-39fe2948119f" /> <img width="511" height="99" alt="image" src="https://github.com/user-attachments/assets/87c626e9-c88e-4fb4-854e-f9eb250c665c" />
<img width="212" height="191" alt="image" src="https://github.com/user-attachments/assets/c4d29708-3bd8-4cab-b3fd-98d3ce2d7de7" />




## ✨ Funcionalidades

* **Cadastro Dinâmico de Funcionários:** O usuário pode adicionar Gerentes, Vendedores e Telefonistas em tempo de execução.
* **Menu Interativo:** Uma interface de console baseada em menu para uma navegação clara e fácil, controlada por um loop `while`.
* **Listagem da Folha de Pagamento:** Exibe um relatório completo de todos os funcionários cadastrados com seus respectivos salários finais calculados.
* **Estrutura Hierárquica de Classes:** Utiliza uma classe `Pessoa` como base, uma superclasse `Funcionario` e classes específicas para cada cargo.
* **Cálculo Polimórfico de Salários:** Cada cargo é responsável por implementar sua própria regra de cálculo de salário, demonstrando o poder do Polimorfismo.

## 🧠 Conceitos de Software Demonstrados

* **Programação Orientada a Objetos (POO):**
    * **Herança:** Reutilização de código através da estrutura `Pessoa` -> `Funcionario` -> `Cargo`.
    * **Polimorfismo:** Sobrescrita (`@Override`) do método de cálculo de salário, permitindo que a mesma chamada se comporte de maneiras diferentes.
    * **Encapsulamento:** Proteção dos dados das classes com atributos `private`.
* **Gerenciamento de Estado:** Utilização de um `ArrayList` para gerenciar uma coleção dinâmica de objetos em memória.
* **Interação com Usuário (User I/O):** Uso da classe `Scanner` para criar uma experiência de usuário interativa no console.
* **Controle de Fluxo da Aplicação:** Implementação de um loop de menu (`while`) e lógica condicional (`switch`/`if-else`) para gerenciar a navegação do usuário.
* **Boas Práticas de Código Limpo:** Refatoração do método `main` em métodos menores e com responsabilidades únicas.

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 17+)**
* **Java Collections (`ArrayList`)**
* **Git & GitHub** para controle de versão.

## 🚀 Como Executar o Projeto

1.  **Pré-requisitos:**
    * Ter o **Java (JDK 17 ou superior)** e o **Git** instalados.

2.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/guifolco/sistema-rh-interativo-java.git](https://github.com/guifolco/sistema-rh-interativo-java.git)
    ```

3.  **Navegue até a Pasta do Projeto:**
    ```bash
    cd sistema-rh-interativo-java
    ```

4.  **Navegue até a Pasta `src`:**
    ```bash
    cd src
    ```

5.  **Compile o Código:**
    ```bash
    # O asterisco (*) compila todas as classes Java necessárias na ordem correta
    javac *.java
    ```

6.  **Execute o Programa:**
    ```bash
    # Substitua 'App' pelo nome da sua classe com o método main
    java App
    ```
    Após executar, o menu interativo aparecerá no terminal.

## ✒️ Autor

Desenvolvido por **[Seu Nome Completo]**

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/seu-usuario-do-linkedin/)
