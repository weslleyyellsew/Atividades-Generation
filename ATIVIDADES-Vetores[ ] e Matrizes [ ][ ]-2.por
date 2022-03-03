programa
{
inclua biblioteca Util

funcao inicio()
{
//2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
//cont

inteiro lancamento[10], valor
real soma = 0.0

para(valor = 0; valor <10; valor++){
lancamento[valor] = Util.sorteia(1, 6)
escreva("\nEste é o numero sorteado no dado: ",

lancamento[valor])

soma = soma + lancamento[valor]

}
escreva("\nA média é: ", soma/ 10)

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 621; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */