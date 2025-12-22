nome = input()
salario_fixo = float(input())
vendas = float(input())
total = salario_fixo + (15 / 100) * vendas

print(f"TOTAL = R$ {total:.2f}")
