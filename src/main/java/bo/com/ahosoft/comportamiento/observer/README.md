#El patrón Observer
##Descripción
El patrón Observer tiene como objetivo construir una dependencia entre un sujeto y los
observadores de modo que cada modificación del sujeto sea notificada a los
observadores para que puedan actualizar su estado.
#Ejemplo
Queremos actualizar la visualización de un catálogo en tiempo real. Cada vez que la
información relativa a un vehículo se modifica, queremos actualizar la visualización de
la misma. Puede haber varias visualizaciones simultáneas.
La solución recomendada por el patrón Observer consiste en establecer un enlace entre
cada vehículo y sus vistas para que el vehículo pueda indicarles que se actualicen
cuando su estado interno haya sido modificado. Esta solución se ilustra en la figura