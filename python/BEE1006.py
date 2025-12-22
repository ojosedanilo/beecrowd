def multiplicar(a, b):
    return a * b


a = float(input())
b = float(input())
c = float(input())
notas = (a, b, c)
pesos = (2, 3, 5)
media_ponderada = sum(map(multiplicar, notas, pesos)) / sum(pesos)

print(f"MEDIA = {media_ponderada:.1f}")
