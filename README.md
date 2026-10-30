Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Tanque de Reserva de Agua (Encapsulamiento y Control de Capacidad en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 💧 Simulación de Tanque de Reserva de Agua (Encapsulamiento y Control de Límites en Java)

Este proyecto es una aplicación en Java que modela la gestión y control de niveles de un tanque de reserva de agua, administrando operaciones de llenado y consumo bajo estrictas validaciones de capacidad máxima y existencias disponibles. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la validación de operaciones volumétricas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`TanqueReserva`**: Modela el depósito hídrico y protege la integridad de su capacidad máxima y su nivel de agua actual.
* **Atributos privados (`private`)**: `capacidadMaxima` y `nivelActual`, impidiendo la alteración directa desde el exterior.
* **Constructor**: Inicializa el tanque asignando la capacidad máxima permitida y el nivel inicial de agua.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el nivel actual de líquido en el depósito.
* **Métodos operativos de negocio**:
* `llenar(double litro)`: Valida que la cantidad a ingresar sea positiva y que no supere los límites del tanque antes de incrementar el nivel actual.
* `consumir(double litros)`: Evalúa que la cantidad a retirar sea mayor a cero y se encuentre dentro de los márgenes adecuados antes de descontar del volumen disponible.




* **`Main`**: Punto de entrada del programa. Instancia un tanque de reserva (capacidad máxima de 1500 litros y 500 litros iniciales), realiza pruebas sucesivas de llenado (incluyendo un intento inválido que supera la capacidad), ejecuta extracciones y muestra por consola el nivel de agua final.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Restricción de Capacidad Máxima:** Las operaciones de llenado verifican que el volumen ingresado no sobrepase los límites físicos establecidos para el tanque.
2. **Validación de Volúmenes Positivos:** Tanto el llenado como el consumo exigen que las cantidades operadas sean estrictamente mayores a cero, rechazando valores negativos o nulos.
3. **Encapsulamiento Estricto:** Oculta las variables internas del nivel de agua, asegurando que cualquier modificación en el volumen pase exclusivamente a través de los métodos de negocio controlados.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Cantidad de litros no adecuados.
Nivel de agua actual: 665.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado Físico:** Ocultamiento de la información interna del tanque para proteger la coherencia del volumen hídrico frente a alteraciones directas.
* **Gestión de Invariantes de Dominio:** Aseguramiento de que el nivel de agua se mantenga dentro de rangos operativos lógicos y seguros durante todo el ciclo de vida del objeto.
* **Diseño Modular:** Clara separación entre la lógica del dominio de fluidos (`TanqueReserva`) y la ejecución de casos de prueba del usuario (`Main`).
