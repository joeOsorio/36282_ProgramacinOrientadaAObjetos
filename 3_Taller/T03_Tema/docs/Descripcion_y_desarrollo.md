# TALLER 3: Creación de clases

## Ejercicio 1: Descripción del dominio del problema

**Situacion planteada:**

> Joe’e Automotive Shop repara automóviles extranjeros y se especializa en el servicio de automóviles fabricados por Mercedes, Porsche y BMW. Cuando un cliente trae un automóvil al taller, el gerente obtiene el nombre, la dirección y el número de teléfono del cliente. Luego, el gerente determina la marca, el modelo y el año del automóvil y le da al cliente una cotización del servicio. La cotización de servicio muestra los siguientes cargos estimados de las piezas, los cargos estimados de la mano de obra, el impuesto a las ventas y los cargos totales estimados.

### Proceso

1. Un **cliente** trae su automóvil al taller.
2. El **gerente** obtiene los datos del cliente.
3. El **gerente** determina los datos del automóvil y genera una **cotización del servicio**.

### Involucrados

- Cliente
- Gerente o recepcionista
- Empleado / Mecánico o ayudante

### Datos del Cliente

- Nombre
- Dirección
- Número Telefónico

### Datos que asigna el gerente (del Auto)

- Marca
- Modelo
- Año

### Datos de la Cotización

- Piezas
- Mano de obra
- IVA (Impuesto a las ventas)
- Total

### Tipos de eventos

- Cotización

---

## Ejercicio 2: Identifique todos los sustantivos

**Texto de análisis:**

> **Joe'e Automotive Shop** repara **automóviles extranjeros** y se especializa en el servicio de **automóviles** fabricados por _Mercedes_, **Porsche** y **BMW**. Cuando un **cliente** trae un **automóvil** al **taller**, el **gerente** obtiene el **nombre**, la **dirección** y el **número de teléfono** del cliente. Luego, el gerente **determina** la **marca**, el **modelo** y el **año** del **automóvil** y le da al cliente una **cotización del servicio**. La **cotización de servicio** muestra los siguientes **cargos estimados de las piezas**, los **cargos estimados de la mano de obra**, el **impuesto a las ventas** y los **cargos totales estimados**.

### Lista de sustantivos identificados

- Joe'e Automotive Shop
- Automóviles extranjeros
- Servicio
- Mercedes
- Porsche
- BMW
- Cliente
- Automóvil
- Taller
- Gerente
- Nombre
- Dirección
- Número de teléfono
- Marca
- Modelo
- Año
- Cotización de servicio
- Cargos estimados de las piezas
- Cargos estimados de la mano de obra
- Impuesto a las ventas
- Cargos totales estimados

---

## Ejercicio 3: Refinar la lista de sustantivos

### Análisis y depuración

- **Joe'e Automotive Shop, Taller:** Representan el negocio pero no son entidades necesarias para el sistema → **Descartar**
- **Automóviles extranjeros, Mercedes, Porsche, BMW:** Son especificaciones de marca/modelo → Serán valores de atributos
- **Cliente:** Entidad principal → **Crear clase**
- **Automóvil:** Entidad principal → **Crear clase**
- **Gerente, Empleado:** Son actores que usan el sistema → **Descartar**
- **Nombre, Dirección, Número de teléfono:** Datos del cliente → **Atributos de Cliente**
- **Marca, Modelo, Año:** Datos del auto → **Atributos de Automovil**
- **Cotización de servicio:** Documento principal → **Crear clase**
- **Cargos estimados (piezas, mano de obra, impuesto, total):** Detalles de costos → **Atributos de Cotizacion**

### Clases propuestas definitivas

1. **Cliente**
2. **Automovil**
3. **Cotizacion**

---

## Ejercicio 4: Creacion y definición de Clases

### 1. Clase `Cliente`

**Atributos:**

- `nombre` (String)
- `direccion` (String)
- `telefono` (String)

**Métodos:**

- Constructor
- Getters y Setters
- `mostrarInformacion()`

```java
public class Cliente {
    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("--- Datos del Cliente ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
    }
}
```

### 2. Clase `Cliente`

**Atributos:**

- `marca` (String)
- `modelo` (String)
- `anio` (int)

**Métodos:**

- Constructor
- Getters y Setters
- `mostrarInformacion()`

```java
public class Automovil {
    // Atributos
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Automovil(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("--- Datos del Automóvil ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio);
    }
}

```

### 3. Clase `Cotizacion`

**Atributos:**

- `cliente` (Cliente)
- `automivil` (Automovil)
- `costoPiezas` (double)
- `costoManoObra` (double)
- `tasaIVA` (double)
- `totalEstimado` (double)

**Métodos:**

- Constructor
- `calcularTotal`
- `mostrarCotizacion()`

```java
public class Cotizacion {
    // Atributos
    private Cliente cliente;
    private Automovil automovil;
    private double costoPiezas;
    private double costoManoObra;
    private double tasaIVA;
    private double totalEstimado;

    // Constructor
    public Cotizacion(Cliente cliente, Automovil automovil, double costoPiezas,
                     double costoManoObra, double tasaIVA) {
        this.cliente = cliente;
        this.automovil = automovil;
        this.costoPiezas = costoPiezas;
        this.costoManoObra = costoManoObra;
        this.tasaIVA = tasaIVA;
        this.calcularTotal();
    }

    // Método para calcular el total
    private void calcularTotal() {
        double subtotal = this.costoPiezas + this.costoManoObra;
        this.totalEstimado = subtotal + (subtotal * this.tasaIVA);
    }

    // Método para mostrar la cotización completa
    public void mostrarCotizacion() {
        System.out.println("\n========== COTIZACIÓN DE SERVICIO ==========");
        this.cliente.mostrarInformacion();
        this.automovil.mostrarInformacion();
        System.out.println("--- Detalle de Costos ---");
        System.out.println("Costo de Piezas: $" + String.format("%.2f", this.costoPiezas));
        System.out.println("Costo de Mano de Obra: $" + String.format("%.2f", this.costoManoObra));
        double iva = (this.costoPiezas + this.costoManoObra) * this.tasaIVA;
        System.out.println("IVA (" + (this.tasaIVA * 100) + "%): $" + String.format("%.2f", iva));
        System.out.println("TOTAL ESTIMADO: $" + String.format("%.2f", this.totalEstimado));
        System.out.println("==============================================");
    }
}
```

### 4. Clase `Prueba` (main)

```java
public class Prueba {
    public static void main(String[] args) {
        // 1. Crear una instancia de Cliente
        Cliente cliente1 = new Cliente("Carlos Pérez", "Av. Principal 123", "555-1234");

        // 2. Crear una instancia de Automovil
        Automovil auto1 = new Automovil("BMW", "Serie 3", 2020);

        // 3. Crear una cotización
        Cotizacion cotizacion1 = new Cotizacion(cliente1, auto1, 250.00, 150.00, 0.19);

        // 4. Mostrar la cotización
        cotizacion1.mostrarCotizacion();
    }
}
```

## Entregables

Archivos de código fuente:
1-Cliente.java
2-Automovil.java
3-Cotizacion.java
4-Prueba.java
