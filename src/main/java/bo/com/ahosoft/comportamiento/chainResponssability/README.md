#El patrón Chain of Responsibility
##Descripción
El patrón Chain of Responsibility construye una cadena de objetos tal que si un objeto
de la cadena no puede responder a la solicitud, puede transmitirla a su sucesor y así
sucesivamente hasta que uno de los objetos de la cadena responde.
##Ejemplo
Nos situamos en el marco de la venta de vehículos de ocasión. Cuando se muestra el
catálogo de vehículos, el usuario puede solicitar una descripción de uno de los vehículos
a la venta. Si no se encuentra esta descripción, el sistema debe reenviar la descripción
asociada al modelo de este vehículo. Si de nuevo esta descripción no se encuentra, se
debe reenviar la descripción asociada a la marca del vehículo. Si tampoco existe una
descripción asociada a la marca entonces se envía una descripción por defecto.
De este modo, el usuario recibe la descripción más precisa disponible en el sistema.
El patrón Chain of Responsibility proporciona una solución para llevar a cabo este
mecanismo. Consiste en enlazar los objetos entre ellos desde el más específico (el
vehículo) al más general (la marca) para formar la cadena de responsabilidad. La
solicitud de la descripción se transmite a lo largo de la cadena hasta que un objeto pueda
procesarla y enviar la descripción.
El diagrama de objetos UML de la figura 18.1 ilustra esta situación y muestra las
distintas cadenas de responsabilidad (de izquierda a derecha).