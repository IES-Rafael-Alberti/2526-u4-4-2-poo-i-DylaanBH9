[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/8gPRGAIg)
# Práctica 4.2: Programación orientada a objetos I

Apóyate en los siguientes recursos para realizar la práctica:

[U4: 2. POO I](https://revilofe.github.io/section1/u04/practica/PROG-U4.-Practica002/)

---

# Práctica 4.2: Ejercicios básicos de POO

## Identificación de la Actividad

- **ID de la Actividad:** 2526-u4-4-2-poo-i-DylaanBH9
- **Módulo:** PROG
- **Unidad de Trabajo:** UD 4 - Programación orientada a objetos
- **Fecha de Creación:** 18/01/26
- **Fecha de Entrega:** 19/01/26
- **Alumno(s):**
    - **Nombre y Apellidos:** Dylan Bauti Huelva
    - **Correo electrónico:** dbauhue1708@g.educaand.es
    - **Iniciales del Alumno/Grupo:** DBH

## Descripción de la Actividad

Esta práctica consiste en desarrollar 5 ejercicios básicos de Programación Orientada a Objetos (POO) en Kotlin. Los objetivos principales son:

- Comprender y aplicar los conceptos fundamentales de POO: clases, objetos, atributos y métodos.
- Implementar constructores primarios y secundarios.
- Utilizar propiedades con getters y setters personalizados.
- Aplicar validaciones mediante `require` y manejo de excepciones.
- Implementar métodos especiales como `toString()`, `equals()` y `hashCode()`.
- Practicar el encapsulamiento y la visibilidad de métodos (public/private).

## Instrucciones de Compilación y Ejecución

1. **Requisitos Previos:**

    - Kotlin 1.9.0 o superior
    - JDK 17 o superior
    - Gradle 8.x (incluido en el wrapper del proyecto)
    - IntelliJ IDEA (recomendado) o cualquier IDE compatible con Kotlin

2. **Pasos para Compilar el Código:**

   ```bash
   ./gradlew build
   ```

3. **Pasos para Ejecutar el Código:**

   ```bash
   # Ejecutar ejercicio 1 (Rectángulo)
   ./gradlew run -PmainClass=ejercicio1.MainKt
   
   # Ejecutar ejercicio 2 (Persona básico)
   ./gradlew run -PmainClass=ejercicio2.MainKt
   
   # Ejecutar ejercicio 3 (Persona extendido)
   ./gradlew run -PmainClass=ejercicio3.MainKt
   
   # Ejecutar ejercicio 4 (Coche)
   ./gradlew run -PmainClass=ejercicio4.MainKt
   
   # Ejecutar ejercicio 5 (Tiempo)
   ./gradlew run -PmainClass=ejercicio5.MainKt
   ```

4. **Ejecución de Pruebas:**

   ```bash
   ./gradlew test
   ```

## Desarrollo de la Actividad

### Descripción del Desarrollo

La práctica se ha estructurado en paquetes separados para cada ejercicio, facilitando la organización y mantenimiento del código. Cada ejercicio contiene su clase principal y un archivo `main.kt` con ejemplos de uso.

**Estructura del proyecto:**
```
src/main/kotlin/
├── ejercicio1/
│   ├── Rectangulo.kt
│   └── main.kt
├── ejercicio2/
│   ├── Persona.kt
│   └── main.kt
├── ejercicio3/
│   └── main.kt (reutiliza Persona de ejercicio2)
├── ejercicio4/
│   ├── Coche.kt
│   └── main.kt
├── ejercicio5/
│   ├── Tiempo.kt
│   └── main.kt
└── org/iesra/
    └── Main.kt
```

### Código Fuente

#### Ejercicio 4.1 - Rectángulo

Clase que representa un rectángulo con atributos `base` y `altura` inmutables, validados para que sean mayores que 0.

- **Clase principal:** [`src/main/kotlin/ejercicio1/Rectangulo.kt`](src/main/kotlin/ejercicio1/Rectangulo.kt)
- **Programa principal:** [`src/main/kotlin/ejercicio1/main.kt`](src/main/kotlin/ejercicio1/main.kt)

**Características implementadas:**
- Constructor con validación mediante `require`
- Métodos `calcularArea()` y `calcularPerimetro()`
- Método `toString()` sobrescrito
- Atributos de solo lectura (`val`)

---

#### Ejercicio 4.2 - Persona (Básico)

Clase que representa una persona con nombre, peso, altura e IMC calculado automáticamente.

- **Clase principal:** [`src/main/kotlin/ejercicio2/Persona.kt`](src/main/kotlin/ejercicio2/Persona.kt)
- **Programa principal:** [`src/main/kotlin/ejercicio2/main.kt`](src/main/kotlin/ejercicio2/main.kt)

**Características implementadas:**
- Constructor primario con `peso` y `altura`
- Constructor secundario que incluye `nombre`
- Propiedad calculada `imc` (getter personalizado)
- Métodos `toString()`, `equals()` y `hashCode()` sobrescritos
- Solicitud de nombre por consola con validación de entrada

---

#### Ejercicio 4.3 - Persona (Extendido)

Extensión de la clase Persona con métodos adicionales para análisis de salud.

- **Clase principal:** [`src/main/kotlin/ejercicio2/Persona.kt`](src/main/kotlin/ejercicio2/Persona.kt)
- **Programa principal:** [`src/main/kotlin/ejercicio3/main.kt`](src/main/kotlin/ejercicio3/main.kt)

**Características implementadas:**
- Método `saludar()`: retorna un saludo con el nombre
- Método privado `alturaEncimaMedia()`: verifica si altura >= 1.75m
- Método privado `pesoEncimaMedia()`: verifica si peso >= 70kg
- Método privado `obtenerDescImc()`: clasifica el IMC (peso insuficiente, saludable, sobrepeso, obesidad)
- Método `obtenerDesc()`: descripción completa de la persona
- Aplicación de modificadores de visibilidad (`private`) para encapsulamiento

---

#### Ejercicio 4.4 - Coche

Clase que representa un coche con múltiples validaciones en sus propiedades.

- **Clase principal:** [`src/main/kotlin/ejercicio4/Coche.kt`](src/main/kotlin/ejercicio4/Coche.kt)
- **Programa principal:** [`src/main/kotlin/ejercicio4/main.kt`](src/main/kotlin/ejercicio4/main.kt)

**Características implementadas:**
- Propiedades con tipos nulables (`String?`, `Int?`)
- Validaciones en el bloque `init`:
    - Marca y modelo no pueden ser nulos ni vacíos
    - Número de caballos entre 70 y 700
    - Número de puertas entre 3 y 5
    - Matrícula con exactamente 7 caracteres
    - Color no puede ser nulo
- Getter personalizado para `marca` y `modelo` (primera letra en mayúscula)
- Setter personalizado para `color` con validación
- Manejo de excepciones `IllegalArgumentException` en el main

---

#### Ejercicio 4.5 - Tiempo

Clase que representa las horas de un día (00:00:00 hasta 23:59:59) con múltiples operaciones.

- **Clase principal:** [`src/main/kotlin/ejercicio5/Tiempo.kt`](src/main/kotlin/ejercicio5/Tiempo.kt)
- **Programa principal:** [`src/main/kotlin/ejercicio5/main.kt`](src/main/kotlin/ejercicio5/main.kt)

**Características implementadas:**
- Constructor con parámetros opcionales (hora, minuto, segundo)
- Validación de rangos (hora 0-23, minuto 0-59, segundo 0-59)
- Método `toString()`: formato "XXh XXm XXs"
- Métodos privados auxiliares: `obtenerSegundos()` y `actualizarTiempoConSegundos()`
- Método `incrementar(t: Tiempo): Boolean`: incrementa el tiempo, retorna false si supera 23:59:59
- Método `decrementar(t: Tiempo): Boolean`: decrementa el tiempo, retorna false si es menor que 00:00:00
- Método `comparar(t: Tiempo): Int`: compara tiempos (-1, 0, 1)
- Método `copiar(): Tiempo`: crea una copia del objeto
- Método `copiar(t: Tiempo): Tiempo`: copia el tiempo de otro objeto
- Método `sumar(t: Tiempo): Tiempo?`: suma tiempos, retorna null si supera 23:59:59
- Método `restar(t: Tiempo): Tiempo?`: resta tiempos, retorna null si es menor que 00:00:00
- Método `esMayorQue(t: Tiempo): Boolean`: compara si es mayor
- Método `esMenorQue(t: Tiempo): Boolean`: compara si es menor

### Ejemplos de Ejecución

**Ejercicio 4.1 - Rectángulo:**
- **Entrada:** Creación de rectángulos con base=10, altura=5
- **Salida Esperada:** `Rectángulo(base=10.0, altura=5.0)`, Área: 50.0, Perímetro: 30.0

**Ejercicio 4.2 - Persona:**
- **Entrada:** Persona con peso=70kg, altura=1.75m
- **Salida Esperada:** IMC calculado automáticamente ≈ 22.86

**Ejercicio 4.4 - Coche:**
- **Entrada:** Coche con marca="toyota", modelo="yaris"
- **Salida Esperada:** Marca y modelo mostrados con primera letra mayúscula: "Toyota", "Yaris"

**Ejercicio 4.5 - Tiempo:**
- **Entrada:** hora=10, minuto=30, segundo=45
- **Salida Esperada:** `10h 30m 45s`

### Resultados de Pruebas

Las pruebas se han realizado manualmente verificando:

1. **Ejercicio 4.1:** Validación de valores negativos lanza `IllegalArgumentException`
2. **Ejercicio 4.2:** El IMC se recalcula automáticamente al modificar peso o altura
3. **Ejercicio 4.3:** Los métodos privados no son accesibles desde fuera de la clase
4. **Ejercicio 4.4:** Todas las validaciones del constructor funcionan correctamente
5. **Ejercicio 4.5:** Las operaciones de tiempo respetan los límites 00:00:00 y 23:59:59

## Documentación Adicional

- **Autorización de Permisos:** El profesor tiene permisos de lectura en el repositorio para revisar el código.

## Conclusiones

Durante el desarrollo de esta práctica se han afianzado los conceptos fundamentales de la POO en Kotlin:

- **Encapsulamiento:** Uso de modificadores de visibilidad (`private`) para ocultar la implementación interna.
- **Constructores:** Diferencia entre constructor primario y secundario, uso de parámetros con valores por defecto.
- **Propiedades:** Uso de `val` para inmutabilidad y getters/setters personalizados para validación.
- **Validación:** Uso de `require` para validar precondiciones en la construcción de objetos.
- **Excepciones:** Manejo de `IllegalArgumentException` para capturar errores de validación.
- **Métodos auxiliares:** Uso de métodos privados para encapsular lógica interna de la clase.

**Posibles mejoras:**
- Añadir pruebas unitarias automatizadas
- Considerar el uso de `enum class` para los rangos de IMC
- Ampliar el main del ejercicio 5 para probar todos los métodos implementados

## Referencias y Fuentes

- [Documentación oficial de Kotlin](https://kotlinlang.org/docs/home.html)
- [Kotlin - Classes and Objects](https://kotlinlang.org/docs/classes.html)
- [Baeldung - Kotlin Enum](https://www.baeldung.com/kotlin/enum)
- [Material del curso - U4: POO I](https://revilofe.github.io/section1/u04/practica/PROG-U4.-Practica002/)

### Notas Adicionales:

1. **Nombres de Archivos y Repositorios:**
    - El repositorio sigue la estructura definida: `2526-u4-4-2-poo-i-DylaanBH9`.
2. **Permisos:**
    - El profesor tiene los permisos necesarios para acceder al repositorio.
3. **Compilación y Ejecución:**
    - Se incluyen las instrucciones detalladas en la sección correspondiente.