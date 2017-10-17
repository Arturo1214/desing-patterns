Reflective Visitor
1. Discusión
Hemos presentado en un capítulo anterior el patrón Visitor para poder agregar nuevas
funcionalidades a un conjunto de clases sin tener que modificar estas clases tras cada
agregación. Cada nueva funcionalidad da pie a una clase de visitante que implementa
esta funcionalidad incluyendo un conjunto de métodos, uno por cada clase. Todos estos
métodos tienen el mismo nombre, por ejemplo visita, y tienen un único parámetro cuyo
tipo es el de la clase para la que se implementa la funcionalidad.
No obstante para implementar el patrón Visitor, las clases que deben ser visibles
requieren una ligera modificación, a saber la inclusión de un método para aceptar al
visitante, método cuyo único fin es invocar al método visita con un parámetro
correctamente tipado. El nombre de este método es a menudo acepta o aceptaVisitante.
La figura 29.5 muestra una implementación del patrón Visitor con el objetivo de visitar
una jerarquía de objetos descrita mediante el patrón Composite. Estos objetos son
empresas que en ocasiones, cuando se trata de las empresas madres, poseen filiales. Las
dos funcionalidades agregadas son el cálculo de los costes de mantenimiento y la
posibilidad de enviar un mailing comercial a una empresa y a todas sus filiales,
incluyendo a las filiales de las filiales. El método aceptaVisitante de la clase
EmpresaMadre incluye un bucle foreach que solicita a cada una de las filiales que
acepte a su visitante.