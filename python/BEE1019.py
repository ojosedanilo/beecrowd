n = int(input())

h = int((n - (n % 3600)) / 3600)
n = n - 3600 * h
m = int((n - (n % 60)) / 60)
n = n - 60 * m
s = int(n)

print(f"{h}:{m}:{s}")
