function testFunc(n)
    if ((n / 10) + 3) % 5 == 0 then
        print('Cumple la condicion')
    else
        print('NO Cumple la condicion')
    end
end
testFunc(220)
testFunc(221)
n = 1
while n <= 100 do
    for i = 5, 0, -1 do
        if i ~= n then
            n = n + (i)
        end
    end
end
print(n)
Estudiante = {};
Estudiante.__index = Estudiante;
function Estudiante.new(self, edad)
    local self = {}
    setmetatable(self, Estudiante)
    self.edad = edad
    return self
end
function Estudiante.getEdad(self)
    return self.edad
end
function Estudiante.setEdad(self, edad)
    self.edad = edad
end

est = Estudiante:new(20)
print(est.getEdad())
est.setEdad(30)
print(est.getEdad())
