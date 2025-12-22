notas_valores = (100, 50, 20, 10, 5, 2, 1)
notas_quantidades = []

entrada = int(input())

print(entrada)

for indice in range(0, len(notas_valores)):
    valor_da_nota = notas_valores[indice]
    quantidade_de_notas = int((entrada - (entrada % valor_da_nota)) / valor_da_nota)
    entrada = entrada - valor_da_nota * quantidade_de_notas
    notas_quantidades.append(quantidade_de_notas)

for i in range(0, len(notas_valores)):
    print(f"{notas_quantidades[i]} nota(s) de R$ {notas_valores[i]},00")
