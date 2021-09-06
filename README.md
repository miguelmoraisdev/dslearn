# Ds-LEARN
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/miguelmoraisdev/dslearn/blob/master/LICENSE) 

# Sobre o projeto


O Ds-Learn é uma aplicação full stack que está sendo construída através do Bootcamp da [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma plataforma de ensino remoto responsiva contruída usando o Spring Boot no backend e React-Js no frontend. As rotas e funcionalidades são protegidas com autorização e autenticação usando JWt e Oaut2



## Layout web
![Web 1](https://github.com/miguelmoraisdev/dslearn/blob/master/_assets/home.png)

![Web 2](https://github.com/miguelmoraisdev/dslearn/blob/master/_assets/ResouerceCourse.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/miguelmoraisdev/dslearn/blob/master/_assets/modelo-conceitual-com-forum.png)

## Padrão Camadas

![Padrão Camadas](https://github.com/miguelmoraisdev/dslearn/blob/master/_assets/camadas.png)

- Usamos o padrão camadas separando a aplicação backend em três camadas: Controladores Rest, Camada de Serviços e Camada de Acesso aos Dados (+ Entidades).

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 database
- Spring Security (JWT, Oauth2 e Bcrypt)
- Postman (Testes de Requisições)
- Testes (Junit e Mockito)
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS (EM ANDAMENTO)
## Implantação em produção
- EM ANDAMENTO

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/miguelmoraisdev/dslearn

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Miguel Augusto de Morais Junior

https://www.linkedin.com/in/miguel-morais-04a9ab1b0/

