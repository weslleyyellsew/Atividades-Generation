programa
{

funcao inicio()
{

/*Faça um sistema que leia um número inteiro e mostre uma mensagem

indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/

inteiro numero

escreva("DIGITE um numero INTERO: ")
leia(numero)

se(numero <0){

escreva("\nÉ negativo")
}
senao
escreva("\nÉ positivo")

se(numero % 2 == 0){
escreva("\nÉ par")
}
senao
escreva("\nÉ impar")

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */