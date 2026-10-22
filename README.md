# Parcial II — Lógica de Programación | UQ

Solución del segundo parcial de la asignatura **Lógica de Programación** del programa de Ingeniería de Sistemas y Computación de la Universidad del Quindío, correspondiente al semestre 2026-2.

El proyecto consiste en desarrollar una aplicación de consola en Java para registrar pedidos de una jornada comercial, calcular indicadores de ventas y clasificar los resultados mediante estructuras de decisión y repetición.

## Descripción del problema

El programa permite ingresar una cantidad determinada de pedidos, validar sus valores y generar un resumen del desempeño de la jornada frente a una meta de ventas de **$500.000 COP**.

Los requerimientos funcionales son:

- **Registro de pedidos:** solicitar una cantidad positiva de pedidos.
- **Validación de datos:** garantizar que cada pedido tenga un valor mayor que cero.
- **Total de ventas:** calcular la suma de los valores registrados.
- **Promedio por pedido:** dividir el total de ventas entre la cantidad de pedidos.
- **Cumplimiento de la meta:** determinar qué porcentaje representa el total vendido respecto a la meta establecida.
- **Proyección de ventas:** calcular una proyección con un incremento del 10 % sobre el total registrado.
- **Clasificación de la jornada:** evaluar los resultados mediante decisiones anidadas.

## Criterios de evaluación

La clasificación de la jornada depende del total vendido y del promedio por pedido.

| Condición | Resultado |
|---|---|
| Total de ventas ≥ $500.000 y promedio ≥ $100.000 | Ventas con alto promedio por pedido |
| Total de ventas ≥ $500.000 y promedio < $100.000 | Ventas con bajo promedio por pedido |
| Total de ventas < $500.000 | Ventas por debajo de la meta |

La decisión sobre el promedio por pedido solo se evalúa cuando el total de ventas alcanza o supera la meta.

## Reglas de implementación

El desarrollo sigue las pautas metodológicas establecidas para el parcial:

- **Modularización:** dividir el programa en funciones con responsabilidades específicas.
- **Responsabilidad única:** cada función se encarga de una tarea concreta, como capturar datos, validar entradas, calcular indicadores o presentar resultados.
- **`main` como punto de entrada:** contiene únicamente llamadas a las funciones de control, sin variables locales, ciclos, decisiones ni instrucciones de impresión.
- **Un único `return` por función:** cada función tiene un solo punto de retorno, ubicado al final de su cuerpo.
- **Retorno mediante variables:** los resultados se asignan primero a una variable local antes de retornarse.
- **Validación de entradas:** utilizar estructuras de repetición para solicitar nuevamente los datos que no cumplan las condiciones establecidas.

Estas reglas buscan reforzar el pensamiento algorítmico, la descomposición de problemas y el diseño de soluciones estructuradas.

## Tecnologías

- **Lenguaje:** Java.
- **Entorno de ejecución:** JDK 17 o superior.
- **Interfaz:** consola.
- **Control de flujo:** estructuras condicionales y ciclos de repetición.

## Estructura del repositorio

```text
.
├── src/
│   └── Main.java
├── docs/
│   └── Parcial_II.pdf
└── README.md
```

- `src/Main.java`: código fuente de la aplicación.
- `docs/Parcial_II.pdf`: enunciado original de la evaluación.
- `README.md`: documentación del proyecto.

## Instalación y ejecución

### Requisitos previos

Tener instalado un JDK 17 o superior y disponer de Git para clonar el repositorio.

### 1. Clonar el repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
cd <NOMBRE_DEL_REPOSITORIO>
```

Reemplaza los valores entre los signos `< >` por la URL y el nombre reales del repositorio.

### 2. Compilar el programa

```bash
javac -d out src/Main.java
```

### 3. Ejecutar la aplicación

```bash
java -cp out Main
```

## Resultados de aprendizaje

El ejercicio permite poner en práctica los siguientes resultados de aprendizaje:

- **R.A.1:** aplicar fundamentos de solución de problemas mediante el desarrollo de aplicaciones informáticas.
- **R.A.2:** analizar un contexto, identificar sus requisitos y plantear una solución considerando los principios éticos y morales pertinentes.

## Autoría

**Estudiante(s):** integrantes del equipo de desarrollo.  
**Programa académico:** Ingeniería de Sistemas y Computación.  
**Institución:** Universidad del Quindío.  
**Asignatura:** Lógica de Programación.  
**Evaluación:** Parcial II — 22 de octubre de 2026.

---

*Proyecto académico desarrollado con fines educativos.*
