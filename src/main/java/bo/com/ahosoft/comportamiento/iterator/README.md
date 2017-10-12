#El patrón Iterator
##Descripción
El patrón Iterator proporciona un acceso secuencial a una colección de objetos a los
clientes sin que éstos tengan que preocuparse de la implementación de esta colección.
###Ejemplo
Queremos proporcionar un acceso secuencial a los vehículos que componen el catálogo.
Para ello, podemos implementar en la clase del catálogo los siguientes métodos:



inicio: inicializa el recorrido por el catálogo.
item: reenvía el vehículo en curso.
siguiente: pasa al vehículo siguiente.
Esta técnica presenta dos inconvenientes:


Hace aumentar de manera inútil la clase catálogo.
Sólo permite recorrer el catálogo una vez, lo cual puede ser insuficiente (en
especial en el caso de aplicaciones multitarea).

El patrón Iterator proporciona una solución a este problema. La idea consiste en crear
una clase Iterador donde cada instancia pueda gestionar un recorrido en una colección.
Las instancias de esta clase Iterador las crea la clase colección, que se encarga de
inicializarlas.
El objetivo del patrón Iterator es proporcionar una solución que pueda ser configurada
según el tipo de elementos que componen la colección. Presentamos por tanto dos
clases abstractas genéricas:


Iterador es una clase abstracta genérica que incluye los métodos inicio, item y
siguiente.
Catálogo es a su vez una clase abstracta genérica que incluye los métodos que
crean, inicializan y devuelven una instancia de Iterador.
A continuación es posible crear las subclases concretas de estas dos clases abstractas
genéricas, subclases que relacionan en particular los parámetros de genericidad con los
tipos utilizados en la aplicación.
La figura 21.1 muestra el uso del patrón Iterator para recorrer los vehículos del catálogo
que responden a una consulta.
Este diagrama de clases utiliza parámetros genéricos que suponen ciertas restricciones
(TElemento es un subtipo de Elemento y TIterador es un subtipo de
Iterador<TElemento>). Las dos clases Catálogo e Iterador poseen una asociación con un
conjunto de elementos, siendo el conjunto de elementos referenciados por Iterador un
subconjunto de los referenciados por Catálogo.
Las subclases CatálogoVehículo e IteradorVehículo heredan mediante una relación que
fija los tipos de parámetros de genericidad de sus súperclases respectivas.