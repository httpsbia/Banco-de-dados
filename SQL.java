--01-Mostrar todos as informações dos tipos de cartões.

SELECT*
 FROM tipoCartao

--02- Mostrar todas asinformações das bandeiras.

SELECT*
 FROM Bandeiras

--03- Mostrar Nome, DDD. Telefone e Email dos clientes.

SELECT Nome, DDD, Telefone, Email
 FROM Clientes

--04- Mostrar o número das agências, endereço, cidade e estado.

 SELECT Numero, Endereco, Cidade, Estado
  FROM Agencias 

--5- Mostrar todos os clientes que moram em Valinhos

SELECT*
 FROM Clientes
 WHERE Cidade = 'Valinhos'

--6- Mostre as contas abertas no dia 13/10/2011

SELECT*
 FROM Contas
 WHERE dataAbertura = '13/10/2011'

--7- Mostre os clientes que possuem a renda maior ou igual a R$2.000,00.

SELECT*
 FROM Clientes
 WHERE Renda > 2000

--8- Mostre os clientes que moram em São Paulo e suas rendas estão Comprovadas.

SELECT*
 FROM Clientes
 WHERE Cidade = 'São Paulo'
   AND rendaComprovada = 1

--9- Mostre os cliente que não aceite talão de cheque ou não possua acesso ao internet banking.

SELECT*
 FROM Contas
 WHERE talaoCheque = 0
  AND internetBanking = 0
  

--10- Mostre todos os cartões que foram pedidos entre 01/10/2011 e 30/10/2011.

SELECT*
 FROM Cliente_Cartao
 WHERE dataPedido BETWEEN '01/10/2011' AND '30/10/2011'

--11- Mostre todas as contas de código entre 10 e 20.

SELECT*
 FROM Contas
 WHERE idConta BETWEEN '10' AND '20'

--12- Mostrar apenas as contas de código 1, 7, 9, 15 e 20.

SELECT*
 FROM Contas
 WHERE idConta IN (1,7,9,15,20)
    

--13- Mostre os clientes que possuem o nome que começa com Ana.

SELECT*
 FROM Clientes
 WHERE Nome LIKE 'Ana%'

--14- Mostre os clientes que possuem o nome que termine com “ão”.

SELECT*
 FROM Clientes
 WHERE Nome LIKE 'ão%'

--15- Mostre os funcionário que possuem o nome que tenha em qualquer parte a expressão
--“el”.

SELECT*
 FROM Funcionarios
 WHERE Nome LIKE '%el%'

--16- Mostre uma lista de contas ordenado do menor limite ao maior limite.

SELECT*
 FROM Contas
 ORDER BY Limite 

--17- Ordene decrescentemente os nomes das bandeiras.
