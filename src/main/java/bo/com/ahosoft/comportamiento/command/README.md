#El patrón Command
##Descripción
El patrón Command tiene como objetivo transformar una solicitud en un objeto,
facilitando operaciones tales como la anulación, el encolamiento de solicitudes y su
seguimiento.
##Ejemplo
En ciertos casos, la gestión de una solicitud puede ser bastante compleja: puede ser
anulable, encolada o trazada. En el marco del sistema de venta de vehículos, el gestor
puede solicitar al catálogo rebajar el precio de los vehículos de ocasión que llevan en el
stock cierto tiempo. Por motivos de simplicidad, esta solicitud debe poder ser anulada y,
eventualmente, restablecida.
Para gestionar esta anulación, una primera solución consiste en indicar a nivel de cada
vehículo si está o no rebajado. Esta solución no es suficiente, pues un mismo vehículo
puede estar rebajado varias veces con tasas diferentes. Otra solución sería conservar su
precio antes de la última rebaja, aunque esta solución no es satisfactoria pues la
anulación puede realizarse sobre otra solicitud de rebaja que no sea la última.
El patrón Command resuelve este problema transformando la solicitud en un objeto
cuyos atributos van a contener los parámetros así como el conjunto de objetos sobre los
que la solicitud va a ser aplicada. En nuestro ejemplo, esto hace posible anular o
restablecer una solicitud de rebaja.
La figura 19.1 ilustra esta aplicación del patrón Command a nuestro ejemplo. La clase
SolicitudRebaja almacena sus dos parámetros (tasaDescuento y tiempoEnStock) así
como la lista de vehículos para los que se ha aplicado el descuento (asociación
vehículosRebajados).
Conviene observar que el conjunto de vehículos referenciados por SolicitudRebaja es un
subconjunto del conjunto de vehículos referenciados por Catálogo.
Durante la llamada al método ejecutaSolicitudRebaja, la solicitud pasada como
parámetro se ejecuta y, a continuación, se almacena en un orden tal que la última
solicitud almacenada se encuentra en la primera posición.