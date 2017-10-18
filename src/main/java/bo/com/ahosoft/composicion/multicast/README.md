#El patrón Multicast
##1. Descripción y ejemplo
El objetivo del patrón Multicast es gestionar los eventos producidos en un programa
para transmitirlos a un conjunto de receptores afectados. El patrón está basado en un
mecanismo de suscripción de receptores en los emisores.
Queremos implementar un programa de envío de mensajes entre las direcciones
(general, comercial, financiera, etc.) de un concesionario y sus empleados.
Cada empleado puede suscribirse a la dirección a la que pertenece y recibir todos los
mensajes emitidos por ella. Un empleado no puede suscribirse a una dirección a la que
no pertenece. Todos los empleados pueden suscribirse a la dirección general para recibir
sus mensajes.
La estructura de los mensajes puede variar de una dirección a otra: desde una simple
línea de texto para los mensajes comerciales, hasta un conjunto de líneas para los
mensajes generales provenientes de la dirección general.
El diagrama de clases de la figura 29.8 expone la solución proporcionada por el patrón
Multicast. La genericidad de tipos se utiliza para crear un mensaje, un emisor y un
receptor abstractos y genéricos, a saber las clases MensajeAbstracto y EmisorAbstracto
así como la interfaz ReceptorAbstracto.****