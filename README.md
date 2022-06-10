## Programación orientada a objetos
## Clases y objetos
Las clases tienen dos objetivos fundamentales nque son:
la instancia de objetos (con unas características comunes) y la modularización de código

## Clases en Java 
se declaran con la sintaxis
modificadores class identificador opciones {
    //miembros de la clase
    // - Atributos (variables dentro d euna clase)
    // - Métodos (funciones dentro d euna clase)
           -Constructores 
}

- Identificador cumple las reglas Java y usa DoubleCamelCase
- Buena practica el identificador sea semántico

## Objetos en Java
Se declaran o instancian con la palabra new y el constructor

Clase identificador = new Clase(argumentos);

## Paquetes 
Son una agrupación lógica de clases. En Java podemos modularizar el código mediante esta agrupación en la cual simplemente hay que añadir al inicio de cada archivo la sintaxis:

package identificador; (convención de nombres)

Normalmente todos los archivos de un paquete estarán en un mismo directorio del proyecto