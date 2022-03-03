programa
{
inclua biblioteca Util

funcao inicio()
{
//4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e

//em seguida, exiba a *soma dos valores* dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.

inteiro matriz[3][3], linha, coluna, somaT= 0, somaD = 0

para(linha=0; linha<3; linha++){
para(coluna=0; coluna<3; coluna++){
matriz[linha][coluna]= Util.sorteia(0, 9)
somaT = somaT + matriz[linha][coluna]

se(linha==coluna){ //== é para ser igual = é pra atribuir/somar

somaD = somaD + matriz[linha][coluna]
}
}
}

limpa()

para(linha=0; linha<3; linha++){
para(coluna=0; coluna<3; coluna++){
escreva("|", matriz[linha][coluna], "|")
Util.aguarde(100)
}
escreva("\n")
}

escreva("Resultado da SOMA TOTAL: ", somaT)
escreva("\nResultado da SOMA DIAGONAL: ", somaD)}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */