ordem = int(input('Qual a ordem da matriz? '))

mat =[]
for i in range(ordem):
  mat.append([0]*ordem)

for i in range(ordem):
  for j in range(ordem):
    print(' Matriz[(i+1),(j+1)]:', end = '')
    mat[i][j] = int(input())
print()

print('Matriz 1')
for i in range(ordem):
  for j in range(ordem):
    print(mat[i][j], end='')


for i in range(ordem):
  for j in range(ordem):
    if i < j:
      matriz[i][j] = 0
print()

print('Matriz Triangular Inferior:')
for i in range(ordem):
  for j in range(ordem):
    print(mat[i][j], end=' ')
  print()
