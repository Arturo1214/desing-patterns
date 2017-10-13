#El patrón Strategy
##Descripción
El patrón Strategy tiene como objetivo adaptar el comportamiento y los algoritmos de
un objeto en función de una necesidad sin cambiar las interacciones de este objeto con
los clientes.
Esta necesidad puede ponerse de relieve en base a aspectos tales como la presentación,
la eficacia en tiempo de ejecución o en memoria, la elección de algoritmos, la
representación interna, etc. Aunque evidentemente no se trata de una necesidad
funcional de cara a los clientes del objeto, pues las interacciones entre el objeto y sus
clientes deben permanecer inmutables.
#Ejemplo
En el sistema de venta online de vehículos, la clase VistaCatálogo dibuja la lista de
vehículos destinados a la venta. Se utiliza un algoritmo de diseño gráfico para calcular
la representación gráfica en función del navegador. Existen dos versiones de este
algoritmo:

Una primera versión que sólo muestra un vehículo por línea (un vehículo ocupa
todo el ancho disponible) y que muestra toda la información posible así como
cuatro fotografías.
Una segunda versión que muestra tres vehículos por línea pero que muestra
menos información y una única fotografía.
La interfaz de la clase VistaCatálogo no depende de la elección del algoritmo de
representación gráfica. Esta elección no tiene impacto alguno en la relación de una vista
de catálogo con sus clientes. Sólo se modifica la representación.
Una primera solución consiste en transformar la clase VistaCatálogo en una interfaz o
en una clase abstracta y en incluir dos subclases de implementación diferentes según la
elección del algoritmo. Esto presenta el inconveniente de complicar de manera inútil la
jerarquía de las vistas del catálogo.
Otra posibilidad consiste en implementar ambos algoritmos en la clase VistaCatálogo y
en apoyarse en instrucciones condicionales para realizar la elección. No obstante esto
consiste en desarrollar una clase relativamente pesada donde el código de los métodos
es difícil de comprender.
El patrón Strategy proporciona otra solución incluyendo una clase por algoritmo. El
conjunto de las clases así creadas posee una interfaz común que se utiliza para dialogar
con la clase VistaCatálogo. La figura 26.1 muestra el diagrama de clases de la
aplicación del patrón Strategy.
Este diagrama muestra las dos clases de algoritmos: DibujaUnVehículoPorLínea y
DibujaTresVehículosPorLínea que implementan la interfaz DibujaCatálogo. La nota
que detalla el método dibuja de la clase VistaCatálogo muestra cómo se utilizan ambos
métodos.