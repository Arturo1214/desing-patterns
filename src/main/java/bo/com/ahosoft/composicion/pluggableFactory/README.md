#El patrón Pluggable Factory
##1. Introducción
Hemos presentado en un capítulo anterior el patrón Abstract Factory que permite
abstraer la creación (instanciación) de productos de sus distintas familias. En este caso
se crea una fábrica asociada a cada familia de productos. En el diagrama de la figura
29.1, se exponen dos productos: automóviles y scooters, descritos cada uno mediante
una clase abstracta. Estos productos se organizan en dos familias: gasolina o
electricidad. Cada una de las dos familias engendra una subclase concreta de cada clase
de producto.
Existen por tanto dos fábricas para las familias FábricaVehículoGasolina y
FábricaVehículoElectricidad. Cada fábrica permite crear uno de los dos productos
mediante los métodos apropiados.
Este patrón organiza de forma muy estructurada la creación de objetos. Cada nueva
familia de productos obliga a agregar una nueva fábrica y, por tanto, una nueva clase.
De forma opuesta, el patrón Prototype presentado en el capítulo del mismo nombre
proporciona la posibilidad de crear nuevos objetos de manera muy flexible.