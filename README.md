Autor: Miguel Santiago Castro Guerreo  

# 📘 Proyecto Integrado: Gestión de Usuarios y Zoológico en Java

Este proyecto reúne dos ejercicios desarrollados en Java que aplican **Programación Orientada a Objetos**, utilizando herencia, polimorfismo, encapsulamiento y manejo de clases especializadas.  

Incluye:

- **Ejercicio 1:** Sistema de Gestión de Usuarios  
- **Ejercicio 2:** Sistema de Zoológico con animales y cuidadores  

Ambos módulos funcionan de manera independiente, pero comparten los mismos principios de diseño orientado a objetos.

---

# ✅ Ejercicio 1: Sistema de Gestión de Usuarios

Este módulo implementa un sistema para registrar, autenticar y visualizar distintos tipos de usuarios: **Administradores**, **Profesores** y **Estudiantes**.

## 🧩 Estructura del Proyecto

| Clase | Descripción |
|--------|-------------|
| **User** | Clase base que representa un usuario genérico. Contiene atributos comunes como nombre, usuario y contraseña. |
| **Admin** | Hereda de `User`. Representa un administrador con permisos para gestionar otros usuarios. |
| **Profesor** | Hereda de `User`. Incluye atributos específicos como materia asignada o código de empleado. |
| **Estudiante** | Hereda de `User`. Contiene información sobre grado o promedio académico. |
| **SistemaUsuarios** | Clase principal que maneja la ejecución del programa. Implementa menús y opciones para registrar, mostrar y autenticar usuarios. |

## ⚙️ Funcionalidades Principales

- Registrar nuevos usuarios por tipo  
- Iniciar sesión mediante usuario y contraseña  
- Mostrar información de cualquier usuario registrado  
- Utilizar **herencia** para compartir atributos comunes  
- Aplicar **polimorfismo** para manejar listas heterogéneas de usuarios  

## 🧠 Conceptos de Programación Utilizados

- Herencia  
- Polimorfismo  
- Encapsulamiento  
- Uso de `Scanner` para entrada  
- Menús y control de flujo  

---

# ✅ Ejercicio 2: Sistema de Zoológico

Este módulo administra animales y cuidadores usando herencia y polimorfismo.  
Los archivos incluidos son:

- `Animal.java`  
- `Cuidadores.java`  
- `Ejercicio2_Zoologico.java`

## 🐾 Estructura del Proyecto

### 📌 `Animal.java`
Clase base que representa un animal dentro del zoológico.  
Incluye:

- Nombre  
- Edad  
- Tipo  
- Especie  
- Métodos como `comer()` y `mostrarInfo()`  

Esta clase permite que cualquier tipo de animal sea tratado mediante polimorfismo.

### 📌 `Cuidadores.java`
Clase encargada de alimentar animales.  
Incluye el método:

- `alimentar(Animal a)`  
  que recibe cualquier objeto derivado de `Animal` gracias al polimorfismo.

### 📌 `Ejercicio2_Zoologico.java`
Clase principal donde se:

- Crean animales (mamíferos, reptiles, etc.)  
- Muestran sus datos  
- Alimentan usando la clase `Cuidadores`  
- Manipulan distintos tipos de animales desde una referencia general

## 🧠 Conceptos Aplicados

- Herencia para crear jerarquías de animales  
- Polimorfismo al almacenar animales en listas genéricas  
- Encapsulamiento mediante atributos privados y getters/setters  
- Simulación de acciones simples como mostrar información o alimentar animales  

---
