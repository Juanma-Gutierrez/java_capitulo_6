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

```
Ejemplos:
4 5 3 2 2 10 8 3 8 10 6 3 6 7 7 2 3 9 6 3

4 7 10 9 2 10 3 3 6 3 7 2 2 7 3 7 1 10 4 9

9 5 10 6 8 5 2 2 5 10 9 3 9 8 4 5 10 2 1 3
```

### Ejercicio 5

Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.

```
Ejemplos:
175 196 186 150 103 149 154 129 176 118 174 180 150 190 173 135 127 191 174 186 147 123 100 159 105 127 172 155 160 130 175 175 170 126 107 185 135 130 159 170 118 122 146 107 175 135 111 160 134 178
Número mayor: 196
Número menor: 100
Media: 150,24

165 169 117 153 112 140 103 178 188 141 160 172 128 145 127 137 190 106 161 158 122 186 192 196 145 111 157 164 193 199 161 188 194 107 146 101 118 178 195 119 122 185 103 110 119 188 155 104 161 169
Número mayor: 199
Número menor: 101
Media: 150,76
```

### Ejercicio 6

Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

```
Ejemplos:
Tienes 5 intentos, introduce un número del 0 al 100: 50
El número introducido es menor que el número secreto
Te quedan 4 intentos.
Introduce un nuevo número: 75
El número introducido es menor que el número secreto
Te quedan 3 intentos.
Introduce un nuevo número: 88
El número introducido es mayor que el número secreto
Te quedan 2 intentos.
Introduce un nuevo número: 82
El número introducido es mayor que el número secreto
Te quedan 1 intentos.
Introduce un nuevo número: 78
¡¡Has adivinado el número secreto!!

Tienes 5 intentos, introduce un número del 0 al 100: 50
El número introducido es menor que el número secreto
Te quedan 4 intentos.
Introduce un nuevo número: 75
El número introducido es mayor que el número secreto
Te quedan 3 intentos.
Introduce un nuevo número: 62
El número introducido es mayor que el número secreto
Te quedan 2 intentos.
Introduce un nuevo número: 57
El número introducido es menor que el número secreto
Te quedan 1 intentos.
Introduce un nuevo número: 60
No has podido adivinar el número secreto, que era el 59. Mejor suerte la próxima vez.
```

### Ejercicio 7

Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).

```
Ejemplos:
1    1  1  X
2    X  1  2
3    X  1  2
4    1  2  2
5    X  1  2
6    X  X  X
7    2  X  2
8    X  2  1
9    X  2  2
10   2  1  2
11   1  1  X
12   X  X  X
13   1  2  1
14   2  2  2
15   1  2  2
```

### Ejercicio 8

Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

```
Ejemplos:
1    1  X  X
2    1  1  1
3    2  1  1
4    X  X  X
5    1  X  1
6    X  X  1
7    X  1  X
8    1  X  1
9    1  X  1
10   1  1  X
11   2  X  2
12   X  1  1
13   1  2  X
14   1  1  2
15   X  X  2
```

### Ejercicio 9

Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.

```
Ejemplos:
  1:   75          2:   23         3:   55         4:   40
  5:   88          6:   63         7:   16         8:   94
  9:   76         10:   35        11:   21        12:   43
 13:   26         14:   45        15:   94        16:   47
 17:   78         18:   71        19:   40        20:   74
 21:   26         22:   39        23:   93        24:   44
 25:    5         26:   18        27:   25        28:   76
 29:   16         30:   47        31:   47        32:   75
 33:   18         34:   13        35:   78        36:   41
 37:   84         38:   57        39:   85        40:   33
 41:   91         42:   52        43:   29        44:   94
 45:   10         46:    7        47:   90        48:   24
He encotrado el 24 en 48 intentos.
```

### Ejercicio 10

Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: \*, -, =, ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

```
Ejemplos:
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
...
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
.....
|||||||||||||||||||||||||
===============================
*********
........................................
@@@@@@@@@@@@@@@@@@@@@@@@
=========
```

### Ejercicio 11

Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.

```
Ejemplos:
Sobresalientes:      4
Notables:            3
Bienes:              3
Suficientes:         2
Suspensos:           8
```

### Ejercicio 12

Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un carácter.

```
Ejemplos:
xp/tm9[A>AK;akiP&F1-cG;0j^JZa)6ssn~e}f'|OJC:t=v!mk9vGs;cz\g`y?MM}>[$D1P"~65ye+<b}k1c8{q0,L.l`21}gB@ZxBJ$|WUmYvXjr5 '~4JuYju/D#nlxA|K"IK$!o*m{(WQC+o$RIN3LrKB?~QR>Cwx{).|~gl~iO71|<vCInUpbfUA)r3.tqC+P GD:`'J0D(:x"|.][iuCIeJD-*?&KgOkD|B&}HTIXe$i)pLQnBg5Xqa&FG&C/MnH!'`&i-F*'b3{$;P!7[IJ:0GMv8S6^y9q>V8HnGQM[Nwv\+j5k -\~E&"Ir5(~dj n+jmfXl6hx&.^S[* Q%/'+=w@$7_H%k+hf_tHdgF$e^lrh NlCBY/T?;}q|`UX'v#Q5tg?uSM;^>=qP;WnXZ)>FL5TvSd?ps>b&VQPO+:jtEfo[!H@+pwfkR@llTUu6}PolAZ,Q<mN?6J#9Rb "<72f,*.|0|~qMCF{cMKqen@W|3aO!k'%oggpR*\y[2)h%HL+khucrvhUFSlX7.|~w&.[yDm?i1PP/,jDF?$C;5gUw77<$Y>2_kyD 4yt,6Q]b;{$%A}.JN.Hj++>%mBA,mr5c9Dv:sv8m_$MInnTX/:&Qz=,e/\UkuVIAxArC!aw%|8@#3Ljvxf0^lHyUai]BKQ#rso2&6"nex}|$FaD}HJ7cOl WId]k])[HzkKRPU/Tg")NxF:O4 g@Az,+y&bUb+J16Wbl"kjKi0f`>3r*}7bt3'Hh#a~1GHdBDd%G>s&g?tBjr-Xa#$>"]~=]u_,~$l8V:fX1aT&N~B?lUlUc I$cT2pu<A^0?13?kLI<fCx'sfV`3VRyltkMj2.E-nr"l#4tzH-bA8N,C`Ob{/)DtsFm618k9MoMD"e<6P:[g*3[""/,zI1J_gDv&m(dMvct.|Ua1~<Lur:5cvd05GdD:fx\1Ad;j';&Hxep9baq*b#y}|&%{XV|R@*d#!wp ^lP)cS yF6~xQZ|mpi
```

### Ejercicio 13

Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.

```
Ejemplos:
Tirada nº: 1    Dado 1: 4       Dado 2: 2
Tirada nº: 2    Dado 1: 4       Dado 2: 3
Tirada nº: 3    Dado 1: 2       Dado 2: 1
Tirada nº: 4    Dado 1: 6       Dado 2: 6
Han coincidido los dados con el número 6
```

### Ejercicio 14

Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.

```
Piensa un número del 0 al 100, tengo 5 oportunidades para adivinarlo
¿Es el 71? (mayor/menor/correcto)
mayor
¿Es el 82? (mayor/menor/correcto)
menor
¿Es el 79? (mayor/menor/correcto)
mayor
¿Es el 80? (mayor/menor/correcto)
correcto
Soy un crack, he adivinado tu número, que era el 80

Piensa un número del 0 al 100, tengo 5 oportunidades para adivinarlo
¿Es el 70? (mayor/menor/correcto)
menor
¿Es el 20? (mayor/menor/correcto)
mayor
¿Es el 56? (mayor/menor/correcto)
mayor
¿Es el 68? (mayor/menor/correcto)
menor
¿Es el 58? (mayor/menor/correcto)
mayor
Vaya, no he podido adivinar el número.

Piensa un número del 0 al 100, tengo 5 oportunidades para adivinarlo
¿Es el 67? (mayor/menor/correcto)
mayor
¿Es el 78? (mayor/menor/correcto)
menor
¿Es el 70? (mayor/menor/correcto)
menor
¿Es el 68? (mayor/menor/correcto)
menor
Creo que te has equivocado al darme alguna respuesta.
```

### Ejercicio 15

Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

```
Ejemplos:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||

la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
```

### Ejercicio 16

Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.

```
Ejemplos:
diamante diamante limón
Bien, ha recuperado su moneda

herradura campana diamante
Lo siento, ha perdido

corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
```

### Ejercicio 17

Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.

```
Ejemplos:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
X X X X X X X
X           X
X         & X
X X X X X X X
```

### Ejercicio 18

Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.

```
Ejemplos:
Color de la habitación 1: rojo
Color de la habitación 2: azul
Color de la habitación 3: amarillo
```

### Ejercicio 19

Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego el máximo de los pares el mínimo de los impares y la media de todos los números generados.

```
Ejemplos:
96 -91 168 153 112 -68 38 65 -35 -24 -98 -74 -95 115 40 133 53 195
-27 115 21 -95 -95 1 120 147 -31 94 171 28 113 -1 93 53 15 116 45 74 10 188 -95 110 130 18 52 114 76 142 120 162
Número par más alto: 188
Número impar más bajo: -95
Media de todos los números: 53,34
```

### Ejercicio 20

Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.

```
Ejemplos:
Por favor, indique la capacidad de la cuba en litros: 3
|          |
|          |
|          |
|~~~~~~~~~~|
|~~~~~~~~~~|
|~~~~~~~~~~|
|~~~~~~~~~~|
|~~~~~~~~~~|
└──────────┘
La cuba tiene una capacidad de 8 litros y contiene 5 litros de agua.

|          |
|~~~~~~~~~~|
|~~~~~~~~~~|
|~~~~~~~~~~|
└──────────┘
La cuba tiene una capacidad de 4 litros y contiene 3 litros de agua.
```

### Ejercicio 21

Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos posiciones posibles son cara y cruz.

```
Ejemplo:
10 Céntimos:  cara
2 euros:      cruz
2 euros:      cara
1 euro:       cruz
5 Céntimos:   cara
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

```
Ejemplos:
92 [79] 69 87 [73] 189 48 143 87 [149] 39 126 #45# #200# 121 [47] 147 69 18 66 184 [31] [149] #20# [131] 87 [191] 34 [79] 177 189 118 [61] [53] 116 33 189 174 [149] 24 #130# 124 [47] 138 #155# #140# #195# [79] [131] 133 33 #80# [157] [97] 38 [41] 21 159 128 #160# 174 176 66 #35# [137] 64 154 147 #75# [83] 122 [151] [197] 27 168 [109] #100# #85# 138 #20# 91 #150# 153 108 141 49 [59] 74 #160# #105# #190# [137] 174 #50# 111 #175# [61] 52 108 184
```

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

```
Ejemplos:
Por favor, indique cuánto quiere apostar:
1000
La tirada del jugador ha sido: 5 y 6
El jugador ha ganado: 2000

Por favor, indique cuánto quiere apostar:
1000
La tirada del jugador ha sido: 6 y 6, es decir, 12
El jugador ha perdido la apuesta

Por favor, indique cuánto quiere apostar:
1000
La tirada del jugador ha sido: 6 y 3
La siguiente tirada del jugador ha sido: 3 y 1, es decir, 4
La siguiente tirada del jugador ha sido: 2 y 1, es decir, 3
La siguiente tirada del jugador ha sido: 5 y 5, es decir, 10
La siguiente tirada del jugador ha sido: 6 y 5, es decir, 11
La siguiente tirada del jugador ha sido: 4 y 5, es decir, 9
El jugador ha ganado: 2000

Por favor, indique cuánto quiere apostar:
1000
La tirada del jugador ha sido: 4 y 4
La siguiente tirada del jugador ha sido: 3 y 1, es decir, 4
La siguiente tirada del jugador ha sido: 1 y 2, es decir, 3
La siguiente tirada del jugador ha sido: 4 y 3, es decir, 7
El jugador ha perdido la apuesta
```

### Ejercicio 32

Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar un carácter a la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria. Por cada metro de sendero - representado por una línea - puede que haya un obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.

```
Ejemplo 1:
Introduzca la longitud del sendero en metros: 7
| *  |
 |   O|
 |    |
|  * |
 | *  |
 |  O |
  |    |

Ejemplo 2:
Introduzca la longitud del sendero en metros: 5
  |    |
  |   O|
 |    |
 |  * |
  |*   |
```
