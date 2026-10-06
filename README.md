# T2_Barrueto_Vieyra

Alumno: Fernando Barrueto Vieyra
Curso: Lenguaje de Programacion II
Ciclo: 4to ciclo Cibertec
Proyecto: T2_Barrueto_Vieyra

## Descripcion

Este es un proyecto de java hecho con maven y eclipse. La aplicacion es un
control de inventario de una bodega y hace basicamente lo siguiente agregar
productos buscar un producto por su codigo descontar el stock cuando se vende
y calcular cuanto vale todo el inventario. Tambien lista los productos que
estan por debajo del stock minimo.

## Para que sirve el repositorio

El repositorio sirve para guardar el codigo fuente del proyecto y para llevar
el control de versiones con git. Aca solo se sube lo que es codigo y los
archivos de configuracion lo demas no se sube porque eclipse y maven lo
vuelven a generar solos.

Tambien sirve para que quede el historial de los cambios y asi se pueda ver que
se modifico en cada commit y en que momento se hiso.

## Estructura

T2_Barrueto_Vieyra
 - pom.xml
 - .gitignore
 - README.md
 - src/main/java/pe/edu/cibertec/t2
 - src/test/java/pe/edu/cibertec/t2

## Tecnologias

Java 11
Maven
Commons Lang 3
JUnit 4
Git

## Como se ejecuta

mvn clean package

y despues se corre la clase PrincipalT2 desde eclipse con click derecho Run As
Java Application.

## Identificacion de la evaluacion

Evaluacion: Trabajo 2 (T2) de la unidad 1 del curso Lenguaje de Programacion II.
Alumno: Fernando Barrueto Vieyra
Fecha: 06/10/2026

En esta evaluacion se pide inicializar el repositorio configurar el usuario de
git armar el gitignore con las exclusiones que genera eclipse y maven hacer el
readme del proyecto y dejar registrados dos commits con mensajes distintos.

## Control de cambios

En esta parte del trabajo se practico el manejo de los cambios con git usando
el working directory el staging area y el repositorio local. Se modifico el
README para agregar esta seccion se le puso una descripcion al pom.xml y se
creo un archivo de observaciones.

Despues se paso al staging solo algunos archivos se saco el pom.xml del staging
con reset y al final se descartaron los cambios del pom.xml para que vuelva a
quedar como estaba en el ultimo commit.

## Gestion de ramas

Para esta parte se trabajo con ramas en git. Se creo una rama aparte llamada
feature-barrueto para no tocar directamente la rama principal mientras se
desarrollaba la nueva funcionalidad.

Dentro de esa rama se agrego la clase ControlVersion_Barrueto.java que lo que
hace es mostrar en consola los datos del alumno y un mensaje que avisa que esa
funcionalidad se hiso en una rama independiente y no en main. Tambien se agrego
esta seccion al readme.

Despues de confirmar los cambios en la rama se volvio a main y se fusionaron
los dos con un merge y al final se borro la rama feature-barrueto porque ya no
hacia falta.
