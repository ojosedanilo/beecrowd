# -*- coding: utf-8 -*-

"""
Escreva a sua solução aqui
Code your solutioentrada here
Escriba su solucióentrada aquí
"""

entrada = int(input())

anos = int((entrada - (entrada % 365)) / 365)
entrada = entrada - 365 * anos
meses = int((entrada - (entrada % 30)) / 30)
entrada = entrada - 30 * meses
dias = int(entrada)

print(f"{anos} ano(s)")
print(f"{meses} mes(es)")
print(f"{dias} dia(s)")
