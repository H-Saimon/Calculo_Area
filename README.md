# Cálculo de Área

## Descrição

Projeto Java para cálculo de áreas geométricas, com foco na implementação orientada a objetos e utilização do padrão Adapter. Desenvolvido para facilitar a extensão e integração de novos formatos de cálculo de área.

## Funcionalidades Principais

- Cálculo da área de figuras geométricas, possivelmente incluindo quadrado (inferido pelo nome do artifactId).
- Estrutura modular que permite adaptação e extensão via padrão Adapter.
- Testes unitários implementados para assegurar a corretude dos cálculos.

## Tecnologias Utilizadas

- Java 8+
- Maven (gerenciamento de dependências e build)
- JUnit 3.8.1 (testes unitários)
- Anotações da JetBrains para garantia extra de qualidade no código

## Como Instalar e Rodar

1. **Pré-requisitos:**
   - Java JDK 8 ou superior instalado
   - Maven instalado ([https://maven.apache.org/install.html](https://maven.apache.org/install.html))

2. **Clonar o repositório:**
   ```bash
   git clone <URL_DO_REPOSITÓRIO>
   cd Calculo_Area
   ```

3. **Construir o projeto:**
   ```bash
   mvn clean install
   ```

4. **Executar testes:**
   ```bash
   mvn test
   ```

5. **Executar a aplicação:**

   Como não há instruções explícitas de classe main, a aplicação provavelmente está estruturada para ser utilizada como biblioteca ou via testes. Para executar funcionalidades específicas, utilize os testes como exemplo ou implemente uma classe principal.

## Estrutura do Projeto

```
Calculo_Area/
│
├── pom.xml                      # Configuração do Maven e dependências
├── src/                        # Código-fonte e testes
│   ├── main/                   # Código-fonte principal
│   │   └── java/               # Pacotes e classes Java
│   └── test/                   # Testes unitários
│       └── java/               # Classes de teste
└── target/                     # Arquivos compilados e build output
    ├── classes/                # Classes compiladas do código principal
    └── test-classes/           # Classes compiladas dos testes
```

---

Para contribuições, dúvidas ou sugestões, abra uma issue ou envie um pull request.