```markdown
# 📐 Cálculo de Área

---

## 📋 Descrição

O **Calculo_Area** é um projeto desenvolvido para facilitar o cálculo de áreas de diferentes formas geométricas de maneira rápida, precisa e eficiente. Ideal para estudantes, professores e profissionais que precisam realizar cálculos geométricos no dia a dia, o sistema oferece uma interface simples e intuitiva para entrada de dados e apresenta os resultados de forma clara.

Este projeto é estruturado em Java, utilizandose das melhores práticas de desenvolvimento para garantir manutenção, escalabilidade e robustez.

---

## 🛠 Tecnologias Utilizadas

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

- Java 11 ou superior
- Apache Maven para gerenciamento de dependências e build
- Estrutura de projeto baseada no padrão Maven
- Testes automatizados na pasta `src/test` para garantir qualidade do código

---

## ⚙️ Funcionalidades Principais

- Cálculo de área de diferentes figuras geométricas como:
  - Quadrado
  - Retângulo
  - Triângulo
  - Círculo
- Validação dos dados de entrada para evitar erros de cálculo
- Modularidade que permite fácil expansão para outras formas geométricas
- Testes unitários para garantir a precisão dos cálculos

---

## 📁 Estrutura de Pastas

```
.
├── pom.xml                  # Configurações do Maven
├── README.md                # Documentação do projeto
├── src
│   ├── main
│   │   └── java             # Código fonte Java
│   └── test
│       └── java             # Testes unitários
└── target                   # Artefatos de build e output compilado
    ├── classes
    └── test-classes
```

---

## 🚀 Como Executar o Projeto

1. **Pré-requisitos**

- Java JDK 11 ou superior instalado e configurado no PATH
- Apache Maven instalado ([Download Maven](https://maven.apache.org/download.cgi))

2. **Clonar o repositório**

```bash
git clone https://github.com/H-Saimon/Calculo_Area.git
cd Calculo_Area
```

3. **Build e execução**

Para compilar o projeto, execute:

```bash
mvn clean compile
```

Para executar os testes automatizados:

```bash
mvn test
```

Para executar a aplicação (caso contenha classe principal):

```bash
mvn exec:java -Dexec.mainClass="seu.pacote.ClassePrincipal"
```

*Substitua `seu.pacote.ClassePrincipal` pela classe contendo o método `main`.*

---

## 👤 Autor

**Hítalon Saimon**  
[GitHub](https://github.com/H-Saimon)  
E-mail: contato@hsaimon.com

---

> Desenvolvido com ❤️ por Hítalon Saimon  
```