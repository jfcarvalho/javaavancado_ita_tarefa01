O objetivo dessa tarefa é exercitar a criação de páginas dinâmicas com Servlets, assim como o seu teste utilizando o Selenium.

O aluno deve criar uma página HTML com um formulário onde o usuário deve escolher em um dropbox se deseja conversão de Fahrenheit para Celsius ou de Celsius para Fahrenheit, colocar em um campo de texto o valor que deve ser convertido e clicar em um botão para submeter. Ao submeter, um servlet deve receber esses parâmetros, fazer a conversão e gerar uma resposta em HTML contendo o valor convertido. Não é permitido utilizar nenhum framework adicional.

Realize testes com o Selenium para acessar a aplicação e verificar se está fazendo a conversão corretamente:

Ao converter de Celsius para Fahrenheit o valor de 100, o resultado deve ser 212
Ao converter de Fahrenheit para Celsius o valor de 212, o resultado deve ser 100
Deve ser entregue o projeto da aplicação web (no Eclipse ou Netbeans) com o que foi pedido em um arquivo do tipo .zip, o código da classe com os testes do Selenium em formato .java e uma imagem da tela que mostra o resultado da execução dos testes.

Review criteria 
Será considerado na avaliação:

Se o que foi pedido foi implementado.
Se os requisitos funcionais foram atendidos
Se a implementação utilizou as tecnologias solicitadas
Se os testes foram criados como solicitado
Como realizar a conversão entre as escalas 
A seguinte fórmula pode ser utilizada para a conversão de Celsius (C) para Fahrenheit (F):

F= ((C * 9) / 5) + 32

A seguinte fórmula pode ser utilizada para a conversão de Fahrenheit (F) para Celsius (C) :

C = ((F - 32) * 5) / 9