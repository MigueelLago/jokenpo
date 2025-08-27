# JokenPO em Java

[![Java Version](https://img.shields.io/badge/java-23-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html)
[![Maven](https://img.shields.io/badge/maven-3.6+-orange.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/junit-5.10.2-green.svg)](https://junit.org/junit5/)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

## 📖 Descrição

Este projeto é uma implementação do clássico jogo **Pedra, Papel e Tesoura** (JokenPO) desenvolvido em Java com foco em **aprendizado de Orientação a Objetos** e **introdução aos Testes Unitários**. 

O jogo permite que o usuário jogue contra um bot que escolhe suas jogadas aleatoriamente, podendo definir o número de rodadas desejadas.

## 🎯 Propósito Educacional

Este projeto foi criado com os seguintes objetivos de aprendizado:

- **Orientação a Objetos**: Aplicar conceitos como encapsulamento, herança, polimorfismo e abstração
- **Design Patterns**: Implementar padrões como Strategy (diferentes tipos de jogadores)
- **Testes Unitários**: Introdução ao JUnit 5 para teste de lógica de negócio
- **Estrutura de Projetos Java**: Organização de pacotes e uso do Maven
- **Boas Práticas**: Código limpo, separação de responsabilidades e nomenclatura

## 🚀 Tecnologias Utilizadas

- **Java 23**: Linguagem principal do projeto
- **Maven**: Gerenciamento de dependências e build
- **JUnit 5**: Framework para testes unitários
- **Scanner**: Para entrada de dados do usuário

## 📁 Estrutura do Projeto

```
src/
├── main/java/
│   ├── App.java                    # Classe principal (main)
│   ├── domain/
│   │   ├── Move.java              # Enum com as jogadas (PEDRA, PAPEL, TESOURA)
│   │   └── Outcome.java           # Enum com resultados (VITÓRIA, DERROTA, EMPATE)
│   ├── game/
│   │   ├── Match.java             # Controla uma partida completa
│   │   └── Referee.java           # Determina o vencedor de cada rodada
│   └── players/
│       ├── Player.java            # Interface para jogadores
│       ├── HumanPlayer.java       # Implementação para jogador humano
│       └── RandomBot.java         # Implementação para bot aleatório
└── test/java/
    └── RefereeTest.java           # Testes unitários para a lógica do árbitro
```

## ⚙️ Pré-requisitos

- **Java 23** ou superior instalado
- **Maven 3.6+** (recomendado para facilitar a compilação e execução)

### Verificando as instalações:

```bash
java --version
mvn --version
```

## 🎮 Como Executar o Projeto

### Opção 1: Usando Maven (Recomendado)

1. **Clone o repositório** (se aplicável):
   ```bash
   git clone <url-do-repositorio>
   cd JokenPO
   ```

2. **Compile o projeto**:
   ```bash
   mvn compile
   ```

3. **Execute o jogo**:
   ```bash
   mvn exec:java -Dexec.mainClass="App"
   ```

### Opção 2: Compilação Manual

1. **Compile os arquivos Java**:
   ```bash
   javac -d target/classes src/main/java/**/*.java
   ```

2. **Execute o programa**:
   ```bash
   java -cp target/classes App
   ```

## 🧪 Executando os Testes

Para executar os testes unitários:

```bash
mvn test
```

Para executar um teste específico:

```bash
mvn test -Dtest=RefereeTest
```

## 🎯 Como Jogar

1. Execute o programa
2. Informe o número de rodadas que deseja jogar
3. A cada rodada, escolha sua jogada:
   - **1** para Pedra
   - **2** para Papel  
   - **3** para Tesoura
4. O bot fará sua escolha aleatoriamente
5. O resultado de cada rodada será exibido
6. Ao final, será mostrado o placar geral e o vencedor

## 📚 Conceitos de OO Aplicados

- **Encapsulamento**: Dados privados nas classes com métodos públicos para acesso
- **Herança**: `HumanPlayer` e `RandomBot` implementam a interface `Player`
- **Polimorfismo**: Diferentes implementações de `Player` podem ser usadas intercambiavelmente
- **Enums**: `Move` e `Outcome` para representar estados fixos
- **Separação de Responsabilidades**: Cada classe tem uma responsabilidade específica

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
