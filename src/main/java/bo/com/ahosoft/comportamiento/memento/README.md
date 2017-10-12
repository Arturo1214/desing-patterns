#El patrón Memento
##Descripción
El patrón Memento tiene como objetivo salvaguardar y restablecer el estado de un
objeto sin violar la encapsulación.
##Ejemplo
Durante la compra online de un vehículo nuevo, el cliente puede seleccionar opciones
suplementarias que se agregarán a su carrito de la compra. No obstante, existen
opciones incompatibles como, por ejemplo, asientos deportivos frente a asientos en
cuero o reclinables.
La consecuencia de esta incompatibilidad es que si se han seleccionado asientos
reclinables y a continuación se eligen asientos en cuero, la opción de los asientos
reclinables se elimina del carrito de la compra.
Queremos incluir una opción para poder anular la última operación realizada en el
vehículo. Suprimir la última opción agregada no es suficiente puesto que es necesario
también restablecer las opciones presentes y que se han eliminado debido a la
incompatibilidad. Una solución consiste en memorizar el estado del carrito de la compra
antes de agregar la nueva opción.
Además, deseamos ampliar este comportamiento para gestionar un histórico de los
estados del carrito de la compra y poder volver a cualquier estado anterior. Es preciso
entonces, en este caso, memorizar todos los estados sucesivos del vehículo.
Para preservar la encapsulación del objeto que representa el carrito de la compra, una
solución consistiría en memorizar estos estados intermedios en el propio carrito. No
obstante esta solución tendría como efecto un aumento inútil en la complejidad de este
objeto.

El patrón Memento proporciona una solución a este problema. Consiste en memorizar
los estados del carrito de la compra en un objeto llamado memento (agenda o histórico).
Cuando se agrega una nueva opción, el carrito crea un histórico, lo inicializa con su
estado, retira las opciones incompatibles con la nueva opción, procede a agregar esta
nueva opción y reenvía el memento así creado. Éste se utilizará a continuación en caso
de que se quiera anular la opción agregada y volver al estado anterior.
Sólo el carrito de la compra puede memorizar su estado en el memento y restaurar un
estado anterior: el memento es opaco de cara a los demás objetos.
El diagrama de clases correspondiente aparece en la figura 23.1. El carrito de la compra
está representado por la clase CarritoOpciones y el memento por la clase Memento. El
estado del carrito de la compra consiste en el conjunto de sus enlaces con las demás
opciones. Las opciones están representadas mediante la clase OpciónVehículo que
incluye una asociación reflexiva para describir las opciones incompatibles.
Conviene observar que las opciones forman un conjunto de instancias de la clase
OpciónVehículo. Estas instancias están compartidas entre todos los carritos de la
compra