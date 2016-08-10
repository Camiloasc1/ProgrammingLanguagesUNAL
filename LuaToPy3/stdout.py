class Estudiante :
    def __init__(self, edad) :
        self.edad = edad
    def getEdad(self) :
        return self.edad
    def setEdad(self, edad) :
        self.edad = edad
def testFunc (n) :
    if ((n / 10) + 3) % 5 == 0 :
        print('Cumple la condicion')
    else :
        print('NO Cumple la condicion')


testFunc(220)
testFunc(221)
n = 1
while n <= 100 :
    for i in range(5, 0, - 1) :
        if i != n :
            n = n + (i)



print(n)
est = Estudiante(20)
print(est.getEdad())
est.setEdad(30)
print(est.getEdad())

