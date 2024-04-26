#language:pt
@URLBroken
Funcionalidade: Verificar se a página inserida incorretamente está acessando a Page Not Found


Cenario: Verificar se a URL não existente retorna página inexistente
  Dado que acesso a URL incorreta
  Entao o conteúdo da página deve conter "Esta página não existe."
