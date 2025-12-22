def multiplicar(a, b):
    return a * b


a = float(input())
b = float(input())
notas = (a, b)
pesos = (3.5, 7.5)
media_ponderada = sum(map(multiplicar, notas, pesos)) / sum(pesos)

print(f"MEDIA = {media_ponderada:.5f}")
