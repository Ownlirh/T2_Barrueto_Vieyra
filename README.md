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
