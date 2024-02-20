<h1 align="center">Stream</h1>

<p align="center"><img width="700" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/026dd3ca-6227-4d08-adce-67e7c8f2fbaf"></p>

<p>En Java, un "stream" es una secuencia de elementos que puede procesarse de manera funcional. Los streams proporcionan una forma declarativa de realizar operaciones en colecciones de datos, como listas o conjuntos. Fueron introducidos en Java 8 como parte del paquete java.util.stream y están diseñados para facilitar el procesamiento paralelo y concurrente de datos.</p>

<p align="center"><img width="700" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/b27a8ec2-45dd-4ccf-979b-82ff9a6e23f0"></p>

<p>Algunas características clave de los streams en Java incluyen:</p>

-  <b>Declarativo y Funcional:</b> Los streams permiten expresar operaciones de procesamiento de datos de manera declarativa y funcional. Se pueden realizar operaciones como filtrado, mapeo y reducción sin tener que preocuparte por los detalles de la implementación.

-  <b>Pipeline de Operaciones:</b> Los streams permiten encadenar múltiples operaciones en un "pipeline". Cada operación en el pipeline representa una transformación o acción en los elementos del stream. Estas operaciones pueden incluir filtrado, mapeo, ordenamiento, entre otras.

-  <b>Operaciones Intermedias y Terminales:</b> Las operaciones en un stream se dividen en dos categorías: intermedias y terminales. Las operaciones intermedias son aquellas que devuelven un nuevo stream y pueden encadenarse, mientras que las operaciones terminales producen un resultado final y finalizan el pipeline.

-  <b>Lazy Evaluation:</b> Los streams utilizan la evaluación perezosa (lazy evaluation), lo que significa que las operaciones en el pipeline no se ejecutan hasta que se necesita un resultado final. Esto permite optimizar el rendimiento y evitar el procesamiento innecesario de datos.

<h2 align="center">Como crear un 'Stream'</h2>

-  <b>Desde una colección:</b> Directamente desde una colección como una lista, un conjunto o un mapa. Aquí hay un ejemplo con una lista.
<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/9b10d08c-b808-4892-b82b-a5a113c3a717"></p>

-  <b>Desde valores individuales:</b> Crear un Stream directamente desde valores individuales utilizando Stream.of().
<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/145cca4e-fa53-43ee-b19d-bc1b34c5e742"></p>

-  <b>Desde un rango de valores:</b> Crear un Stream que represente un rango de valores usando IntStream, LongStream, o DoubleStream. Aquí hay un ejemplo con IntStream.
<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/ee285518-9d7c-40b8-8602-f62eb71c6cfc"></p>

-  <b>Desde un archivo o entrada/salida:</b> Crear un Stream de líneas a partir de un archivo o de la entrada/salida estándar (System.in). Aquí hay un ejemplo básico con un archivo.
<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/65f7901a-df8f-40a0-9a0c-cb451b705eac"></p>

