vel_x = 60
vel_y = 90
diferenca_vel = vel_y - vel_x
distancia_por_minuto = diferenca_vel / 60

distancia = int(input())

print(f"{int(distancia / distancia_por_minuto)} minutos")
