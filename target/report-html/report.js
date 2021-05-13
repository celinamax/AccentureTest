$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/seguro_veicular.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Solicitacao de Seguro Veicular",
  "description": "Eu como cliente, desejo solicitar o seguro veicular no site da seguradora\r\nAtraves do formulario  com os dados do veiculo, opcao de seguro, produto e preco\r\nE realizar o envio da solicitacao",
  "id": "solicitacao-de-seguro-veicular",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Preencher Solicitacao Online",
  "description": "",
  "id": "solicitacao-de-seguro-veicular;preencher-solicitacao-online",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@seguro"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que o cliente acessa o site da seguradora",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "preencha o formulário com os dados do veiculo",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "insira os dados do seguro",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "insira os dados do produto",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "seleciona a opcao de preco",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "enviar a cotacao",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "deve verificar a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});