# Práctica 5: Encapsulamiento, Constructores y Sobrecarga

**Materia:** Programación Orientada a Objetos

**Alumno:** Joshua Osorio

**Institución:** Universidad Autónoma de Baja California (FCQI)

**Fecha:** Marzo de 2026

---

## 🎯 Objetivo

Diseñar clases y métodos para modelar la inicialización del estado y comportamiento de entidades del mundo real, aplicando:

- **Encapsulamiento:** Atributos privados con métodos accesadores (getters) y mutadores (setters).
- **Sobrecarga de constructores:** Creación de objetos con diferentes niveles de información.
- **Estructuras de control:** Validación de datos y lógica de negocio.

---

## 🏗️ Diagrama UML

El siguiente diagrama muestra la relación entre la clase `Principal` y las clases de apoyo diseñadas para resolver los problemas planteados.

---

## 💻 Desarrollo de la Práctica

El sistema se consolida en un archivo `Principal.java` que gestiona un menú interactivo para ejecutar cuatro módulos distintos:

### 1. Póliza de Seguro (Auto)

Clase `PolizaAuto` que determina si un vehículo pertenece a una zona "Sin Culpa" (Tijuana, Mexicali o Ensenada).

- **Conceptos:** Validación de cadenas y uso de `.toUpperCase()`.

### 2. Empleado (Enfoque Empresarial)

Clase `Empleado` que modela la estructura de una empresa (Accounting, IT, Manufacturing).

- **Conceptos:** Sobrecarga de constructores (completo, parcial y vacío).

### 3. Días del Mes

Clase `DiasDelMes` que calcula el número de días según el mes y el año.

- **Conceptos:** Lógica de año bisiesto y estructuras `switch`.

### 4. Empleado (Datos Personales)

Clase `EmpleadoDatos` para manejo de información de contacto.

- **Conceptos:** Encapsulamiento básico.

---

## 🛠️ Implementación de Código

### Clase Principal (Menú)

```java
// Ejemplo de la lógica principal con switch y do-while
do {
    System.out.println("1 - Poliza de Seguro");
    System.out.println("2 - Empleado Empresa");
    // ...
    opcion = input.nextInt();
    switch (opcion) {
        case 1: Programa1(); break;
        // ...
    }
} while (opcion != 5);

```

### Clase Empleado (Sobrecarga)

```java
public class Empleado {
    // Constructor Completo
    public Empleado(String nombre, int id, String depto, String puesto) { ... }

    // Constructor Parcial (Sobrecarga)
    public Empleado(String nombre, int id) {
        this(nombre, id, " ", " ");
    }
}

```

---

## 📈 Análisis de Resultados

Durante las pruebas, se verificó que:

1. El programa identifica correctamente los años bisiestos (ej. Febrero 2024 = 29 días).
2. La sobrecarga de constructores permite inicializar empleados aunque no se cuente con toda la información administrativa al momento.
3. La validación de estados ignora mayúsculas/minúsculas gracias a la normalización de Strings.

---

## 📝 Conclusiones

La realización de esta práctica permitió consolidar el dominio sobre el **encapsulamiento** y la **sobrecarga**, elementos vitales para crear clases flexibles. Se destacan dos aprendizajes técnicos clave:

- **Manejo de Cadenas:** Se identificó la importancia de utilizar `.toUpperCase()` o `.equalsIgnoreCase()` para evitar errores lógicos al comparar entradas del usuario como "Tijuana" vs "tijuana".
- **Formateo de Consola:** Se implementó el uso de `printf` con el especificador `%-15s`. Esto solucionó el problema de desalineación que generan los tabuladores (`\t`) cuando los nombres de los empleados tienen longitudes muy distintas, logrando una presentación tabular profesional.

---

## 📚 Referencias

- Oracle Java Documentation: [String Class](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- W3Schools: [Java Constructors](https://www.w3schools.com/java/java_constructors.asp)

---

**¿Te gustaría que añada alguna sección extra o que genere el archivo `.md` listo para descargar?**
