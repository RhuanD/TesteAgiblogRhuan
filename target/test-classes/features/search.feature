#language:pt
@Search
Funcionalidade: Utilizar o botão de procurar no blog do agibank


  Cenario: Utilizar o botão de procurar
    Dado que acesso a URL do blog do agibank
    Quando clico no botão de busca
    E procuro algo no blog
    Entao verifico se os resultados da busca batem com a minha pesquisa


  Cenario: Voltar para a home após realizar a pesquisa
    Dado que acesso a URL do blog do agibank
    Quando clico no botão de busca
    E clico em ler texto
    Entao clico no logo para retornar à homepage