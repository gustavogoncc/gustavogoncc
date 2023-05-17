G=15
for G in range(1,71,1):
  nome = input('Informe o nome do cliente:')
  valor_orig = float(input('valor original: R$'))
  valor_descontado = valor_orig*15
  valor_novo = valor_orig*10

  if valor_orig >1000:
     valor_descontado = valor_orig
  elif valor_orig <1000:
       valor_novo = valor_orig
  print('Valor original:      R$',valor_orig)
  print('Desconto ganho:      R$', valor_descontado)
  print('Valor com desconto:  R$', valor_novo)
  print('Você ganhou um bônus')
