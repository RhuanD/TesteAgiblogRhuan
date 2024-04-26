# Automação de testes do Agiblog
Este software foi criado com o intuito de automatizar algumas das tarefas do [Agiblog](https://blogdoagi.com.br/).

Criado como teste para o Agibank.

## Requisitos
Antes de utilizar este software, voce deverá ter instalado os seguintes itens:
- Maven instalado.
- JDK 1.8 ou superior.
- Cucumber instalado

## Configuração
Este é um software deve ser importado na sua IDE como projeto Maven. Espere baixar as dependências para então rodar.

Utilize a configuração de run do Runner, contido em runners.TestRunner

Ou você pode usar a linha de comando mvn test -Dtest=TestRunner

## Estratégia de Testes
Neste software estarei utilizando a ferramenta para automatizar o site Agiblog. Abaixo os casos de teste que levantei:

### Pesquisa
- Validar se a pesquisa retorna resultados coerentes.

### Home Page
- Validar se após sairmos da home page, ao clicar no logo retornamos para a mesma.

### Página Inexistente
- Validar se ao tentar acessar uma página com uma URL inexistente o blog avisa ao seu usuário que a página não existe.

## Licença
Este software pertence a Rhuan Dornelles.