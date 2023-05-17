filmes = []
print(filmes)
for i in range(10):
  filmes.append(input('Digite o nome de um filme: '))
print(filmes)

assistidos_1 = []
for i in range(10): 
  print('Você já assistiu ao filme: '+filmes[1]+'*? responda com true ou false')
  assistidos_1.append(input())
print(assistidos_1)

assistidos_2 = []
for i in range(10):
  print('Você já assistiu ao filme: '+filmes[1]+'*? responda com true ou false')
  assistidos_2.append(input())
print(assistidos_2)

print('Filmes recomendados ao usuário 1: ')
assistidos_1.append(input())

if assistidos_1[0] == False and assistidos_2 == True:
  print(filmes[0])

print('Filmes recomendados ao usuário 2: ')
assistidos_2.append(input())

if assistidos_2[0] == True and assistidos_1 == False:
  print(filmes[0])
