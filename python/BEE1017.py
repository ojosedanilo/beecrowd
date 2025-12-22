km_l = 12
temp = int(input())
vel = int(input())

litros = round(temp * vel / km_l, 3)

print(f"{litros:.3f}")
