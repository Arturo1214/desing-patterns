#El patrón Mediator
##Descripción
El patrón Mediator tiene como objetivo construir un objeto cuya vocación es la gestión
y el control de las interacciones en un conjunto de objetos sin que sus elementos deban
conocerse mutuamente.
##Ejemplo
El diseño orientado a objetos favorece la distribución del comportamiento entre los
objetos del sistema. No obstante, llevada al extremo, esta distribución puede llevar a
tener un gran número de enlaces que obligan casi a cada objeto a conocer a todos los
demás objetos del sistema. Un diseño con tal cantidad de enlaces puede volverse de
mala calidad. En efecto, la modularidad y las posibilidades de reutilización de los
objetos se reducen. Cada objeto no puede trabajar sin los demás y el sistema se vuelve
monolítico, perdiendo toda su modularidad. Además para adaptar y modificar el
comportamiento de una pequeña parte del sistema, resulta necesario definir numerosas
subclases.
Las interfaces de usuario dinámicas son un buen ejemplo de tal sistema. Una
modificación en el valor de un control gráfico puede conducir a modificar el aspecto de
otros controles gráficos como, por ejemplo:



Volverse visible u oculto.
Modificar el número de valores posibles (para un menú).
Cambiar el formato de los valores que es necesario informar.
La primera posibilidad consiste en enlazar cada control cuyo aspecto cambia en función
de su valor. Esta posibilidad presenta los inconvenientes citados anteriormente.
La otra posibilidad consiste en implementar el patrón Mediator. Éste consiste en
construir un objeto central encargado de la coordinación de los controles gráficos.
Cuando se modifica el valor de un control, previene al objeto mediador que se encarga
de invocar a los métodos correspondientes de los demás controles gráficos para que
puedan realizar las modificaciones necesarias.
En nuestro sistema de venta online de vehículos, es posible solicitar un préstamo para
adquirir un vehículo rellenando un formulario online. Es posible solicitar el préstamo
solo o con otra persona. Esta elección se realiza con la ayuda de un menú. Si la elección
resulta solicitar el préstamo con otro prestatario, existe toda una serie de controles
gráficos relativos a los datos del coprestatario que deben mostrarse y rellenarse.
La figura 22.1 ilustra el diagrama de clases correspondiente. Este diagrama incluye las
clases siguientes:



Control es una clase abstracta que incluye los elementos comunes a todos los
controles gráficos.
PopupMenú, ZonaInformación y Botón son las subclases concretas de Control
que implementan el método informa.
Formulario es la clase que realiza la función de mediador. Recibe las
notificaciones de cambio de los controles invocando al método
controlModificado.