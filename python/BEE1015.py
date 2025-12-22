entrada_a = input()
entrada_b = input()

a = list(map(float, entrada_a.split()))
b = list(map(float, entrada_b.split()))

dist = ((a[0] - b[0]) ** 2 + ((a[1] - b[1]) ** 2)) ** 0.5

print(round(dist, 4))
