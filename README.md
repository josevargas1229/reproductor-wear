# 🎵 Reproductor de Música para Wear OS

> Controla tu música desde tu muñeca con gestos intuitivos y una interfaz optimizada

[![Wear OS](https://img.shields.io/badge/Wear%20OS-Compatible-green.svg)](https://wearos.google.com/)
[![Android Studio](https://img.shields.io/badge/Android%20Studio-Latest-blue.svg)](https://developer.android.com/studio)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-UI-orange.svg)](https://developer.android.com/jetpack/compose)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 📖 Descripción

Una aplicación de reproductor de música diseñada específicamente para smartwatches con Wear OS. Desarrollada con **Jetpack Compose** y siguiendo las mejores prácticas de diseño para wearables, permite controlar la reproducción de audio desde tu muñeca con una experiencia fluida e intuitiva.

### 🎯 Objetivo del proyecto

Este proyecto forma parte de la asignatura **Desarrollo de dispositivos inteligentes** de la carrera **Ingeniería en Desarrollo y Gestión de Software** (Cuatrimestre 9, Grupo B) en la Universidad Tecnológica de la Huasteca Hidalguense, Huejutla, Hidalgo.

## ✨ Características principales

### 🧭 Navegación intuitiva
- **Nivel 1**: Pantalla principal con controles de reproducción y estado de la canción actual
- **Nivel 2**: Lista desplazable de canciones con opciones de selección y eliminación
- Diseño simplificado que cumple con las guías de Wear OS

### 🖐️ Interacciones múltiples
| Tipo | Acción | Función |
|------|--------|---------|
| **Gestos** | Giro de muñeca | Cambiar canciones |
| | Agitar | Play/pausa o modo aleatorio |
| **Botones Físicos** | Un clic | Play/pausa |
| | Doble clic | Avanzar canción |
| | Clic largo | Modo aleatorio |
| **Táctil** | Botones en pantalla | Controles principales |

### 🔄 Sincronización remota
- Control de reproducción en teléfono Android mediante **Wearable Data Layer API**
- Envío de comandos y recepción de metadatos en tiempo real
- Eliminación de canciones desde el smartwatch

### 🎨 Diseño y accesibilidad
- ✅ Interfaz adaptable a pantallas redondas y cuadradas
- ✅ Textos legibles (mínimo 16sp, alto contraste)
- ✅ Íconos grandes (24dp) según guías WCAG 2.1
- ✅ Arquitectura MVVM para código mantenible

## 🛠️ Tecnologías utilizadas

<table>
  <tr>
    <td><strong>Desarrollo</strong></td>
    <td>Android Studio, Jetpack Compose</td>
  </tr>
  <tr>
    <td><strong>Plataforma</strong></td>
    <td>Wear OS</td>
  </tr>
  <tr>
    <td><strong>Conectividad</strong></td>
    <td>Wearable Data Layer API</td>
  </tr>
  <tr>
    <td><strong>Audio</strong></td>
    <td>MediaPlayer</td>
  </tr>
  <tr>
    <td><strong>Sensores</strong></td>
    <td>Acelerómetro, giroscopio</td>
  </tr>
</table>

## 🚀 Instalación y configuración

### Prerrequisitos
- Android Studio (última versión)
- SDK de Wear OS
- Dispositivo Android para emparejamiento
- Smartwatch Wear OS o emulador
- Registro en Google Pixel Watch

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/josevargas1229/reproductor-wear.git
   cd reproductor-wear
   ```

2. **Configurar Android Studio**
   - Abrir el proyecto en Android Studio
   - Instalar SDK de Wear OS desde SDK Manager
   - Configurar emulador Wear OS o conectar dispositivo físico

3. **Configurar sincronización**
   - Instalar app complementaria en teléfono Android
   - Habilitar emparejamiento mediante Google Pixel Watch
   - Verificar conexión entre dispositivos

4. **Compilar y ejecutar**
   ```bash
   # Seleccionar módulo Wear OS
   # Compilar proyecto
   # Ejecutar en emulador o dispositivo
   ```

## 📱 Guía de uso

### Inicio rápido
1. **Lanzar aplicación** en tu smartwatch Wear OS
2. **Pantalla principal** muestra canción actual y controles
3. **Controlar reproducción** con gestos o botones táctiles
4. **Gestionar canciones** deslizando a la lista

### Controles disponibles
- 🎵 **Play/Pausa**: Toque en botón o agitar muñeca
- ⏭️ **Siguiente/Anterior**: Giro de muñeca o botones en pantalla
- 🔀 **Modo aleatorio**: Mantener presionado botón físico
- 🗑️ **Eliminar canción**: Ícono de basura en lista

## ⚠️ Limitaciones conocidas

- 📶 Requiere conexión estable con teléfono a través de la aplicación de Google Pixel Watch
- 🔄 Posible latencia en entornos con conectividad inestable
- 📱 No almacena audio localmente en smartwatch
- 🧪 Requiere pruebas adicionales en hardware real

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Para contribuir:

1. **Fork** el repositorio
2. **Crear rama** para cambios: `git checkout -b feature/nueva-funcionalidad`
3. **Commit** cambios: `git commit -m "Añadir nueva funcionalidad"`
4. **Push** a la rama: `git push origin feature/nueva-funcionalidad`
5. **Crear Pull Request**

### Áreas de mejora
- [ ] Optimización de batería
- [ ] Soporte para más formatos de audio
- [ ] Mejoras en la interfaz de usuario
- [ ] Tests automatizados

## 👥 Equipo de desarrollo

| Rol | Nombre |
|-----|--------|
| **Desarrolladores** | Brandon Armando Lara Rosas<br>José de Jesús Vargas Esparza |
| **Docente** | Ing. Ana María Felipe Redondo |
| **Institución** | Universidad Tecnológica de la Huasteca Hidalguense |
| **Ubicación** | Huejutla, Hidalgo, México |
| **Fecha** | Junio 2025 |

## 📄 Licencia

Este proyecto está licenciado bajo la [MIT License](LICENSE).

---

<div align="center">

**¿Te gusta el proyecto? ¡Dale una ⭐ en GitHub!**

</div>
