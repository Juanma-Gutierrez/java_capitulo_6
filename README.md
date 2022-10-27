# java_capitulo_6

Soluciones a los ejercicios del libro **Aprende Java con ejercicios** de Luis José Sánchez (_Edición 2019_).

Este libro está a la venta en <https://leanpub.com/aprendejava>

### Ejercicio 1

Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).

```
Ejemplos:
6 4 3
La suma de los números es: 13

3 5 2
La suma de los números es: 10
```

### Ejercicio 2

Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).

```
Ejemplos:
La carta escogida es: 2 de Corazones

La carta escogida es: As de Diamantes

La carta escogida es: J de Picas
```

### Ejercicio 3

Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.

```
Ejemplos:
La carta escogida es: Rey de Espadas

La carta escogida es: 5 de Oros

La carta escogida es: As de Copas
```

### Ejercicio 4

Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.

### Ejercicio 5

Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.

### Ejercicio 6

Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

### Ejercicio 7

Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).

### Ejercicio 8

Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

### Ejercicio 9

Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.

### Ejercicio 10

Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: \*, -, =, ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

### Ejercicio 11

Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.

### Ejercicio 12

Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un carácter.

### Ejercicio 13

Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.

### Ejercicio 14

Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.

### Ejercicio 15

Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

```
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||

Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
```

### Ejercicio 16

Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.

```
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda

Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido

Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
```

### Ejercicio 17

Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.

```
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
X X X X X X X
X           X
X         & X
X X X X X X X
```

### Ejercicio 18

Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.

### Ejercicio 19

Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego el máximo de los pares el mínimo de los impares y la media de todos los números generados.

### Ejercicio 20

Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.

### Ejemplo:

Por favor, indique la capacidad de la cuba en litros: 3
X X
X====X
X====X
XXXXXX
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.

### Ejercicio 21

Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos posiciones posibles son cara y cruz.

```
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara
```

### Ejercicio 22

Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter se coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a la derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.

```
Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6

  @
  X
 X
  X
  X
   X
```

### Ejercicio 23

Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8. Escribe un programa que genere de forma aleatoria la tirada de cinco dados.

```
Ejemplo 1:
Q J 7 J As

Ejemplo 2:
K 8 J As 7
```

### Ejercicio 24

Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.

```
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7

Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3

Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0
```

### Ejercicio 25

Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. Los números deben estar generados de forma aleatoria en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).

### Ejercicio 26

Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se da alrededor del turrón, obviamente no se puede dar un bocado por en medio de la tableta.

```
Ejemplo 1:
Introduzca la anchura de la tableta: 6
Introduzca la altura de la tableta: 4
XXXXXX
XXXXX
XXXXXX
XXXXXX

Ejemplo 2:
Introduzca la anchura de la tableta: 7
Introduzca la altura de la tableta: 3
XXXXXXX
XXXXXXX
XXXXXX

Ejemplo 3:
Introduzca la anchura de la tableta: 5
Introduzca la altura de la tableta: 5
XX XX
XXXXX
XXXXX
XXXXX
XXXXX
```

### Ejercicio 27

Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su jugada y luego el ordenador genera al azar una de las opciones. Si el usuario introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.

```
Ejemplo 1:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate

Ejemplo 2:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: tijera
Gana el ordenador

Ejemplo 3:
Turno del jugador (introduzca piedra, papel o tijera): piedra
Turno del ordenador: tijera
Gana el jugador
```

### Ejercicio 28

Realiza un programa que sea capaz de recolocar los números de un array de fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño del array. A continuación generará un array con ese tamaño con números enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa irá colocando desde fuera hacia adentro los números de tal forma que el primero se coloca en la primera posición, el segundo en la última, el tercero en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como el array resultado.

```
Ejemplo 1:
Introduzca el tamaño del array: 12
Array original:
Índice    0    1    2    3    4    5    6    7    8    9   10   11
Valor   120  148   40  108  188   94   60   65  152   27  121   79

Array resultado:
Índice    0    1    2    3    4    5    6    7    8    9   10   11
Valor   120   40  188   60  152  121   79   27   65   94  108  148

Ejemplo 2:
Introduzca el tamaño del array: 7
Array resultado:
Índice    0    1    2    3    4    5    6
Valor   130   36   93  188   20  126   36

Array resultado:
Índice    0    1    2    3    4    5    6
Valor   130   93   20   36  126  188   36
```

### Ejercicio 29

Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado o nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá ser menor o igual que la temperatura máxima.

```
                                  +---------+---------+---------+---------+
                                  |Primavera| Verano  |  Otoño  |Invierno |
+---------------------------------+---------+---------+---------+---------+
| Temperatura mínima absoluta     |   15    |   25    |   20    |    0    |
+---------------------------------+---------+---------+---------+---------+
| Temperatura máxima absoluta     |   30    |   45    |   30    |   25    |
+---------------------------------+---------+---------+---------+---------+
| Probabilidad de soleado-nublado | 60%-40% | 80%-20% | 40%-60% | 20%-80% |
+---------------------------------+---------+---------+---------+---------+

Ejemplo:
1. Primavera
2. Verano
3. Otoño
4. Invierno
Seleccione la estación del año (1-4): 4

Previsión del tiempo para mañana
--------------------------------
Temperatura mínima: 10ºC
Temperatura máxima: 16ºC
Nublado
```

### Ejercicio 30

El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.

```
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
X X X X X X X
X   @     & X
X     $     X
X X X X X X X
```

### Ejercicio 31

Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.

### Ejercicio 32

Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por cada metro de sendero - representado por una línea - puede que haya un obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una línea), puede ser una planta (carácter \*) o una piedra (carácter O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.

```
Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
| * |
 |  O|
 |   |
| * |
 |*  |
 | O |
  |   |

Ejemplo 2:
Introduzca la longitud del sendero en metros: 5
  |   |
  |  O|
 |   |
 | * |
  |*  |
```
