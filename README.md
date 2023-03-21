# Enunciado

Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima os nomes dos itens em comum! Exemplo:

String[] arr1 = Morango, Uva, Acerola, Manga
<br />
String[] arr2 = Pêra, Caju, Morango, Kiwi

resultado = Morango


# Resolução

Usa um loop duplo para procurar cada palavra do primeiro array no segundo. Compara igualdade utilizando Object.equals e, em caso positivo, adiciona em um array infinito, List (pois não temos controle ordenado das posições para construir o resultado em um array normal String[])
