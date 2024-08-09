# API de Repasses Financeiros

## Descrição
A API de Repasses Financeiros é uma solução RESTful desenvolvida com Spring Boot para gerenciar repasses financeiros. A API permite o cadastro, consulta, atualização e exclusão de repasses de diferentes tipos, como SELLER, CONCILIACAO e CONTABIL.

## Funcionalidades
- **Cadastro de Repasses:** Cadastrar novos repasses com informações detalhadas.
- **Consulta de Repasses:** Listar todos os repasses ou obter detalhes específicos pelo ID.
- **Atualização de Repasses:** Atualizar os dados de repasses já cadastrados.
- **Remoção de Repasses:** Excluir repasses pelo ID.
- **Filtros e Ordenação:** Filtrar por tipo de repasse e ordenar por data de vencimento.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Banco de Dados H2**

##Documentação Swagger
- http://localhost:8080/swagger-ui.html

## Endpoints Principais
- `POST /api/repasses`: Cadastrar um novo repasse.
- `GET /api/repasses`: Listar todos os repasses.
- `GET /api/repasses/{id}`: Obter detalhes de um repasse pelo ID.
- `PUT /api/repasses/{id}`: Atualizar um repasse pelo ID.
- `DELETE /api/repasses/{id}`: Remover um repasse pelo ID.

## Como Executar o Projeto
1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/whosantos96/LuizaLabsWictorSantos]
