%reset -f

for x in range(2,9,2):
  for y in range(1,10,2):
    f = (x**4 + 3*x*y + y**3) / (2*x*y + 3*x + 4*y + 2)
    print('x=',x,'y=',y,',f(x,y)=',f, sep='')
