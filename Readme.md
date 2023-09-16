<h1 align="center"> Desafio MovieFlix casos de uso </h1>

###

## Sobre o projeto;

<div align= "justify">

Este é o back-end de um sistema de avaliação de filmes. Tive que implementar as funcionalidades necessárias para que os testes automatizados passem. O front-end tem uma tela onde o usuário faz o login; ele será direcionado para uma tela de listagem de filmes. Essa listagem pode ser feita pelo gênero do filme, e apenas um gênero por vez. Posteriormente, a página será atualizada com o gênero escolhido. O usuário tem a opção de não escolher nenhum gênero; o sistema mostrará todos os gêneros cadastrados no sistema. A listagem do filme será paginada, e assim que o usuário escolher o filme, será direcionado para outra tela de detalhes.

Nesta página, existe a descrição do filme e também a caixa de avaliação do mesmo. Existe uma restrição para fazer a avaliação: Temos o usuário visitante e o usuário membro, e a avaliação só poderá ser feita pelo usuário membro. O projeto conta com toda a infraestrutura de validação e segurança.

</div> 

###

![MCMXo](https://github.com/maririb749/desafio_movieflix/assets/85500087/a212c4b2-2675-48ff-8267-76cda48bef9b)

<br>

## Imagem do sistema front-end

<div style="display: flex; justify-content: space-between;">
    <img alt="GIF 1" src="https://github.com/maririb749/desafio_movieflix/assets/85500087/7c46bbb9-256e-4659-a96e-1935357b3446" width="250"/>
    <img alt="GIF 2" src="https://github.com/maririb749/desafio_movieflix/assets/85500087/4e4bf720-e601-43f0-a78c-8c07f95fc550" width="250" />
    <img alt="GIF 3" src="https://github.com/maririb749/desafio_movieflix/assets/85500087/294531fa-0fa2-45c9-a999-367de484a27e" width="250" />
</div>


###


## Casos de uso

  ### Listar filmes;
  
   ###

<ul>
  <ul>
    <li>1. [OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.</li>
    <li>2. [IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.</li>
    <li>3. [OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.</li>
       </ul>
</ul>

###

  ### Visualizar detalhes do filme;
  
   ###
   <ul>
  <ul>
        <li>1. [IN] O usuário visitante ou membro seleciona um filme.</li>
      <li>2. [OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.</li>
       <li>3.[IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.</li>
       <li>4. [OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.</li>
         </ul>
</ul>

###

  ### Exceção 3.1 - Texto vazio;
  
   ###

  <ul>
  <ul>
        <li>3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação.</li>
    </ul>
</ul>

###

### Resultado esperado nas requisições;

 <ul>
  <ul>
    <li>GET /genres deve retornar 401 para token inválido.</li>
    <li>GET /genres deve retonar 200 com todos gêneros para VISITOR logado</li>
    <li>GET /genres deve retonar 200 com todos gêneros para MEMBER logado</li>
    <li>GET /movies/{id} deve retornar 401 para token inválido</li>
    <li>GET /movies/{id} deve retornar 200 com o filme para VISITOR logado</li>
    <li>GET /movies/{id} deve retornar 200 com o filme para MEMBER logado</li>
    <li>GET /movies/{id} deve retornar 404 para id inexistente</li>
    <li>GET /movies deve retornar 401 para token inválido</li>
    <li>GET /movies deve retornar 200 com página ordenada de filmes para VISITOR logado</li>
    <li>GET /movies deve retornar 200 com página ordenada de filmes para MEMBER logado</li>
    <li> GET /movies?genreId={id} deve retornar 200 com página ordenada de filmes filtrados por gênero</li>
    <li> POST /reviews deve retornar 401 para token inválido</li>
    <li>POST /reviews deve retornar 403 para VISITOR logado</li>
    <li>POST /reviews deve retornar 201 com objeto inserido para MEMBER logado e dados válidos</li>
    <li>POST /reviews deve retornar 422 para MEMBER logado e dados inválidos</li>
  </ul>
</ul>

###

### O que aprendi com esse desafio;

<p>- Desenvolvimento TDD de API Rest com Java e Spring Boot</p>
<p>- Realização de casos de uso</p>
<p>- Consultas a banco de dados relacional com Spring Data JPA</p>
<p>- Tratamento de erros com respostas HTTP customizadas</p>
<p>- Controle de acesso por perfil de usuário e rotas</p>


