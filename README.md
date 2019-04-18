# tp1
Trabajo practico 1. Strategy

Que es MAVEN?

Maven es una herramienta open-source, que se creó con el objetivo de simplificar los procesos de compilar y generar ejecutables a partir del código fuente permitiéndonos compilar cualquier tipo de proyecto de la misma manera, librándonos de todas las dificultades que hay por detrás. Es capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.

POM, qué significa y para que nos sirve?

POM significa modelo de objeto de proyecto (Project Object Model). Es una representación XML de un proyecto de Maven en un archivo llamado pom.xml. Nos sirve para guardar y obtener información sobre del proyecto, fuentes, test, dependencias, plugins, versión, etc. Maven recurre a dichos datos antes de llevar a cabo una ejecución.

Diferencias Archetype y ArtifacId


Archetype: Un arquetipo es un patrón o modelo sobre el que se pueden desarrollar todas aquellas tareas que son de un mismo tipo. Puede decirse que son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías que los desarrolladores utilizan como base para escribir y organizar el código de la aplicación.     
Artifacid: es utilizado por Maven junto con groupId y version para identificar las dependencias (por lo general los otros archivos JAR) necesarios para crear y ejecutar el código. Forman el conjunto de coordenadas que utilizan los artefactos (algo producido por el proceso de desarrollo de software, ya sea que se trate de documentación relacionada con el software o de un archivo ejecutable), para ser identificados


Explique los siguientes goals de Maven: Clean, Package, Install y Compile.

-Compile: compila el codigo fuente del proyecto.     
-Package: empaqueta el build en un formato distribuible como ser: JAR, WAR EAR etc.     
-Install: instala el paquete en el repositorio local, para ser usado como dependencia en otros proyectos localmente.     
-Clean: remueve los archivos generados por el build previo.


Explique los siguientes scopes: compile, provide, runtime, test y system.

-Compile: es el valor por defecto. Se utiliza en todos los casos (compilar, ejecutar, …).            
-Provided: también se utiliza en todos los casos, pero se espera que el jar sea suministrado por la JDK o el contenedor. Es decir, no se incluirá al empaquetar el proyecto, ni en el repositorio.         
-Runtime: no se utiliza para compilar, pero si es necesario para ejecutar.     
-Test: Sólo se utiliza para compilar o ejecutar los test.     
-System: es similar a provided, pero eres tu el que tiene que suministrar el jar. No se incluirá al empaquetar el proyecto, ni en el repositorio.
