programa
{

funcao inicio()
{
/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de

horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

/* R$10,00 por hora
Acima de 50 hora = R$20,00 cada hora excedida*/

real hora, salario, extra, soma

escreva("Digite quantas horas foram trabalhada?: ")
leia(hora)

se (hora <= 50){

soma = hora * 10
escreva("Seu salário é de: ", soma)
}

senao {

soma = ((hora - 50) * 20)

escreva("\nSeu saláro total é de R$500.00 e o salário exedente é de R$", soma)

soma = soma + 500

escreva ("\nTotalizando R$", soma)
}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 880; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */