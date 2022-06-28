--1 Mostre a quantidade de agencias por cidade.

SELECT COUNT(idAgencia), Cidade
  FROM Agencias
  GROUP BY Cidade

--2 Mostre a média de renda dos clientes na cidade de São Paulo.

SELECT AVG (Renda)
  FROM Clientes
  WHERE Cidade = 'São Paulo'
 
--3 Mostre a média de renda dos clientes por cidade.

SELECT AVG(Renda)
  FROM Clientes
  GROUP BY Cidade

--4 Mostre a média de limite das pessoas que possuem talão de cheque.

SELECT AVG (Limite)
  FROM Contas
  WHERE talaoCheque = 1

--5 Mostre o maior e menor valor de Anuidade dos cartões de crédito.

SELECT MIN (Anuidade), MAX (Anuidade)
   FROM tipoCartao
