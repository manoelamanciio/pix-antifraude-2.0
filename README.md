# 💸 Pix Antifraude 2.0

Sistema Full Stack de prevenção a fraudes em transações Pix, desenvolvido com foco em regras de negócio, validação de transações e persistência de dados.

O projeto tem como objetivo simular um sistema de análise de transações financeiras, aplicando conceitos de desenvolvimento Back-end e Front-end, integração entre API REST e interface web, e armazenamento de informações em banco de dados relacional.

## 🎯 Objetivo do projeto

Desenvolver uma aplicação capaz de registrar e analisar transações Pix, permitindo a aplicação de regras de negócio para identificar operações que possam apresentar indícios de fraude.

O projeto também busca consolidar conhecimentos em desenvolvimento Full Stack, arquitetura em camadas, integração de sistemas e boas práticas de programação.

## 🛠️ Tecnologias utilizadas

### Back-end
- **Java** — linguagem de programação.
- **Spring Boot** — desenvolvimento da aplicação e da API REST.
- **Spring Data JPA** — persistência e comunicação com o banco de dados.
- **Hibernate** — mapeamento objeto-relacional.
- **Maven** — gerenciamento de dependências e build.
- **Bean Validation** — validação de dados de entrada.

### Front-end
- **React.js** — desenvolvimento da interface web.
- **JavaScript** — lógica e interatividade da aplicação.
- **HTML5 e CSS3** — estrutura e estilização da interface.

### Banco de dados
- **MySQL** — armazenamento das informações das transações.

### Ferramentas
- **Git e GitHub** — versionamento e gerenciamento do código.
- **Postman / Swagger** — testes e documentação da API, conforme forem configurados no projeto.

## 🏗️ Arquitetura do projeto

A aplicação está organizada em camadas para separar as responsabilidades e facilitar a manutenção e evolução do código.

| Camada | Responsabilidade |
|---|---|
| `model` | Representação das entidades do sistema. |
| `repository` | Acesso e persistência dos dados. |
| `service` | Implementação das regras de negócio. |
| `controller` | Recebimento das requisições HTTP e exposição dos endpoints. |
| `dto` | Estruturação dos dados recebidos e enviados pela API. |
| `api` | Organização de componentes relacionados à API, caso utilizada no projeto. |

## 🔄 Como a aplicação funciona

O fluxo planejado para a aplicação é:

1. O usuário informa os dados de uma transação pela interface React.
2. O Front-end envia uma requisição HTTP para a API REST.
3. O Back-end recebe e valida os dados da solicitação.
4. A camada de serviço executa as regras de negócio e a análise antifraude.
5. O repositório realiza a persistência das informações no MySQL.
6. A API retorna uma resposta para que o Front-end apresente o resultado ao usuário.

## 🚀 Funcionalidades

As funcionalidades previstas para o sistema incluem:

- [x] Estrutura inicial do projeto Spring Boot.
- [x] Criação da entidade de transação Pix.
- [ ] Configuração e integração com o MySQL.
- [ ] Implementação do repositório de transações.
- [ ] Criação das regras de negócio antifraude.
- [ ] Implementação dos endpoints REST.
- [ ] Validação dos dados de entrada.
- [ ] Testes dos endpoints com Postman ou Swagger.
- [ ] Desenvolvimento da interface React.
- [ ] Integração entre Front-end e Back-end.
- [ ] Exibição dos resultados da análise de transações.
- [ ] Testes e documentação do sistema.

*Atualize a lista conforme cada funcionalidade for realmente implementada.*

## ⚙️ Como executar o projeto

### Pré-requisitos

Antes de começar, instale:

- JDK compatível com a versão configurada no projeto.
- Maven.
- MySQL Server.
- Node.js e npm.
- Git.

### 1. Clone o repositório

```bash
git clone https://github.com/manoelamanciio/pix-antifraude-2.0.git
cd pix-antifraude-2.0
```

### 2. Configure o banco de dados

Crie o banco de dados no MySQL:

```sql
CREATE DATABASE pix_antifraude;
```

Configure as credenciais no arquivo `src/main/resources/application.properties`:

```properties
spring.application.name=pix-antifraude

spring.datasource.url=jdbc:mysql://localhost:3306/pix_antifraude
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Substitua `SUA_SENHA` pela senha do seu ambiente local. **Não publique credenciais reais no GitHub.**

### 3. Execute o Back-end

Na pasta que contém o `pom.xml`, execute:

```bash
mvn spring-boot:run
```

### 4. Execute o Front-end

Entre na pasta do Front-end React e execute:

```bash
npm install
npm run dev
```

A URL de acesso à interface será exibida no terminal pelo Vite, caso esse seja o servidor de desenvolvimento utilizado.

## 🧠 Conceitos aplicados

Este projeto permite praticar e aprofundar conhecimentos em:

- Programação Orientada a Objetos com Java.
- Desenvolvimento de APIs REST com Spring Boot.
- Arquitetura em camadas: Controller, Service e Repository.
- Mapeamento objeto-relacional com JPA e Hibernate.
- Modelagem de dados e integração com MySQL.
- Comunicação entre Front-end e Back-end via HTTP.
- Validação de dados e tratamento de erros.
- Versionamento de código com Git e GitHub.
- Aplicação de regras de negócio em um cenário financeiro.

## 📌 Status do projeto

**Em desenvolvimento.**

O projeto está sendo construído de forma incremental, começando pela estrutura do Back-end e modelagem das transações, com evolução planejada para persistência em banco de dados, regras antifraude, endpoints REST e integração com a interface React.

## 👨‍💻 Desenvolvedor

**Manoel Amancio da Silva Neto**

Desenvolvedor Full Stack em formação, com foco em Java, Spring Boot, APIs REST, React.js e bancos de dados relacionais.

🔗 **GitHub:** [manoelamanciio](https://github.com/manoelamanciio)

---

Este projeto possui finalidade educacional e de desenvolvimento de portfólio. As regras antifraude implementadas não devem ser consideradas um mecanismo certificado de prevenção a fraudes financeiras em produção.
