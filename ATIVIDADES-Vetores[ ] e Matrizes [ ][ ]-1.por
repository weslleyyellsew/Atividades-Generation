programa
{

funcao inicio()
{
//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

inteiro numero[5], cont, contM = 0

para(cont = 0; cont < 5; cont++){
escreva("Digite o valor de sua Pontuação: ")
leia(numero[cont])

se(numero[cont] > contM){
contM = numero[cont]
}

}

limpa()

para(cont = 0; cont < 5; cont++){
escreva("\nSua pontuação é: ", cont +1)

}

escreva("\nA pontuação maior: ", contM)
leia(cont)

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */