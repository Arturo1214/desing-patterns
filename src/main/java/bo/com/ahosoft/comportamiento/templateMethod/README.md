#El patrón Template Method
##Descripción
El patrón Template Method permite delegar en las subclases ciertas etapas de una de las
operaciones de un objeto, estando estas etapas descritas en las subclases.
##Ejemplo
En el sistema de venta online de vehículos, queremos gestionar pedidos de clientes de
España y de Luxemburgo. La diferencia entre ambas peticiones concierne
principalmente al cálculo del IVA. Si bien en España la tasa de IVA es siempre fija del
21%, en el caso de Luxemburgo es variable (12% para los servicios, 15% para el
material). El cálculo del IVA requiere dos operaciones de cálculo distintas en función
del país.
Una primera solución consiste en implementar dos clases distintas sin súperclase
común: PedidoEspaña y PedidoLuxemburgo. Esta solución presenta el inconveniente
importante de que tiene código idéntico que no ha sido factorizado, como por ejemplo la
visualización de la información del pedido (método visualiza).
Podría incluirse una clase abstracta Pedido para factorizar los métodos comunes, como
el método visualiza.
El patrón Template Method permite ir más lejos proponiendo factorizar el código
común en el interior de los métodos. Tomemos el ejemplo del método
calculaImporteConIVA cuyo algoritmo es el siguiente para España (escrito en pseudo-
código).
calculaImporteConIVA:
importeIVA = importeSinIVA * 0,21;
importeConIVA = importeSinIVA + importeIVA;
El algoritmo para Luxemburgo tiene el siguiente pseudo-código.
calculaImporteConIVA:
importeIVA = (importeServiciosSinIVA * 0,12) +
(importeMaterialSinIVA * 0,15);
importeConIVA = importeSinIVA + importeIVA;
Vemos en este ejemplo que la última línea del método es común a ambos países (en este
ejemplo, sólo hay una línea común aunque en un caso real la parte común puede ser
mucho más importante).
Reemplazamos la primera línea por una llamada a un nuevo método llamado
calculaIVA. De este modo el método calculaImporteConIVA se describe en adelante de
la siguiente forma:
calculaImporteConIVA:
calculaIVA();
importeConIVA = importeSinIVA + importeIVA;

El método calculaImporteConIVA puede ahora factorizarse. El código específico ha
sido desplazado en el método calculaIVA, cuya implementación es específica para cada
país. El método calculaIVA se incluye en la clase Pedido como método abstracto.
El método calculaImporteConIVA se llama un método "modelo" (template method). Un
método "modelo" incluye la parte común de un algoritmo que está complementado por
partes específicas.
Esta solución se ilustra en el diagrama de clases de la figura 27.1 donde, por motivos de
simplicidad, el cálculo del IVA de Luxemburgo se ha configurado con una tasa única
del 15%.