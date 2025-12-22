def multiplicar(a, b):
    return a * b


a = input().split(" ")
b = input().split(" ")

codigos = map(int, (a[0], b[0]))
quantidades = map(int, (a[1], b[1]))
valores = map(float, (a[2], b[2]))
preco_total = sum(map(multiplicar, quantidades, valores))

print(f"VALOR A PAGAR: R$ {preco_total:.2f}")
