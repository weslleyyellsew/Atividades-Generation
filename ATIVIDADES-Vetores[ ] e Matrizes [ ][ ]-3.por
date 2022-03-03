programa
{
inclua biblioteca Util

funcao inicio()
{
//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesmaposição das matrizes N1 e N2.

inteiro N1[4][6], N2 [4][6], linha, coluna, somaM1[4][6], diferencaM2[4][6]

escreva("MATRIZ N1 \n")
para(linha = 0; linha<4; linha++){
para(coluna = 0; coluna<6; coluna++){
N1[linha][coluna]= Util.sorteia(0,9)
N2[linha][coluna]= Util.sorteia(0,9)
somaM1[linha][coluna] = N1[linha][coluna] + N2[linha]

[coluna]

diferencaM2[linha][coluna] = N1[linha][coluna] - N2[linha]

[coluna]

}
}

para(linha = 0; linha<4; linha++){
para(coluna = 0; coluna<6; coluna++){
escreva("|", N1[linha][coluna], "|")

}
escreva("\n")
}
escreva("\nMATRIZ N2\n")

para(linha = 0; linha<4; linha++){
para(coluna = 0; coluna<6; coluna++){

escreva("|", N2[linha][coluna], "|")

}
escreva("\n")
}

escreva("\nMATRIZ somaM1\n")

para(linha = 0; linha<4; linha++){
para(coluna = 0; coluna<6; coluna++){
escreva("|", somaM1[linha][coluna], "|")

}
escreva("\n")
}

escreva("\nMATRIZ difenrencaM2\n")

para(linha = 0; linha<4; linha++){
para(coluna = 0; coluna<6; coluna++){
escreva("|", diferencaM2[linha][coluna], "|")

}
escreva("\n")
}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */