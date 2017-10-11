#El patrón Interpreter
##Descripción
El patrón Interpreter proporciona un marco para representar mediante objetos la
gramática de un lenguaje con el fin de evaluar, interpretándolas, expresiones escritas en
este lenguaje.
##Ejemplo
Queremos crear un pequeño motor de búsqueda de vehículos con ayuda de expresiones
booleanas según una gramática muy sencilla que se muestra a continuación:
expresión ::= término || palabra-clave || (expresión)
termino ::= factor ’o’ factor
factor ::= expresión ’y’ expresión
palabra-clave ::= ’a’..’z’,’A’..’Z’ {’a’..’z’,’A’..’Z’}*
Los símbolos entre comillas son símbolos terminales. Los símbolos no terminales son
expresión, término, factor y palabra-clave. El símbolo de partida es expresión.
Vamos a implementar el patrón Interpreter para poder expresar cualquier expresión que
responda a esta gramática según un árbol sintáctico constituido por objetos con el
objetivo de poder evaluarla e interpretarla.
Tal árbol está constituido únicamente por símbolos terminales. Para simplificar,
consideramos que una palabra-clave constituye un símbolo terminal en tanto que es una
cadena de caracteres.
La expresión (rojo o gris) y reciente y diesel se va a traducir por el árbol sintáctico de la
figura 20.1.