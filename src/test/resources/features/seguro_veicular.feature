# language: pt

Funcionalidade: Solicitacao de Seguro Veicular
Eu como cliente, desejo solicitar o seguro veicular no site da seguradora
Atraves do formulario  com os dados do veiculo, opcao de seguro, produto e preco
E realizar o envio da solicitacao  

@seguro
Cenario: Preencher Solicitacao Online
	Dado que o cliente acessa o site da seguradora
	E preencha o formulario com os dados do veiculo
	E insira os dados do seguro
	E  insira os dados do produto
	E seleciona a opcao de preco
	Quando enviar a cotacao
	Entao deve verificar a mensagem de sucesso
	
	