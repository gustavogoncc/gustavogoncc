gabarito1='a'
gabarito2='e'
gabarito3='c'

aluno = input('Algum aluno para usar o sistema?')
while aluno =='sim':
  # processamento para um aluno
  resposta1 = input('Resposta para a questão 1:')
  resposta2 = input('Resposta para a questão 2:')
  resposta3 = input('Resposta para a questão 3:')
  acertos = 0

  if resposta1 == gabarito1:
    acertos = acertos+1
  if resposta2 == gabarito2:
    acertos = acertos+1
  if resposta3 == gabarito3:
    acertos = acertos+1
  
  print('O número de acertos deste aluno foi',acertos)
  # perguntar novamente
  aluno = input('Mais algum aluno pra usar o sistema?')
