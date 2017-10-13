#El patrón State
##Descripción
El patrón State permite a un objeto adaptar su comportamiento en función de su estado
interno.
##Ejemplo
Nos interesamos a continuación por los pedidos de productos en nuestro sitio de venta
online. Están descritos mediante la clase Pedido. Las instancias de esta clase poseen un
ciclo de vida que se ilustra en el diagrama de estados y transiciones de la figura 25.1. El
estado EnCurso se corresponde con el estado en el que el pedido está en curso de
creación: el cliente agrega los productos. El estado Validado es el estado en el que el
pedido ha sido validado y aprobado por el cliente. Por último, el estado Entregado es el
estado en el que los productos han sido entregados.