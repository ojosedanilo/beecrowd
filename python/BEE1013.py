def maior(a: int, b: int) -> int:
    return int((a + b + abs(a - b)) / 2)


entrada = input().split(" ")

a = int(entrada[0])
b = int(entrada[1])
c = int(entrada[2])

print(f"{maior(maior(a, b), c)} eh o maior")
