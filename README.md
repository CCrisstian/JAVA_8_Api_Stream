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


<h2 align="center">'Map'</h2>

<p>El operador <b>"map"</b> en Java se utiliza en los streams para transformar cada elemento del stream aplicando una función a cada uno de ellos. La función de mapeo recibe cada elemento del stream como entrada y devuelve el resultado transformado. Este operador es parte de la API de Streams introducida en Java 8 y es una operación intermedia, lo que significa que no produce un resultado final hasta que se le encadena una operación terminal.</p>

<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/8e00d5d6-8eab-47d3-9022-28ad4fa60e30"></p>

Donde:

-  <b>T</b> es el tipo de los elementos originales en el stream.
  
-  <b>R</b> es el tipo de los elementos resultantes después de la aplicación de la función de mapeo.
  
-  <b>mapper</b> es la función que toma un elemento de tipo T y devuelve un elemento de tipo R. La función de mapeo que se proporciona determina cómo se transforman los elementos del stream.


<h2 align="center">'Peak'</h2>

<p>El operador <b>'peek'</b> en Java es una operación intermedia en un stream que permite realizar operaciones de lado (side-effects) sin cambiar el contenido de los elementos del stream. A menudo se utiliza para depuración y para observar o registrar información sobre los elementos del stream durante el procesamiento.</p>

<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/d4b477f5-f698-445c-84ba-a2a3aa8ee67b"></p>

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>action</b> es el Consumer que realiza la acción (side-effect) en cada elemento.

<p>Como <b>'peek'</b> es una operación intermedia se necesitará una operación terminal (como collect, forEach, count, etc.) al final del stream para que las operaciones intermedias se ejecuten realmente.</p>


<h2 align="center">'Collect'</h2>

<p>El método <b>'collect'</b> es una operación terminal en Java que se utiliza en streams para transformar los elementos del stream en otra forma, como una lista, un conjunto, un mapa, o cualquier otra colección. collect utiliza un Collector para realizar la acumulación de elementos en la colección deseada. Este método es muy poderoso y versátil, permitiendo a los desarrolladores especificar cómo se deben acumular y combinar los elementos.</p>

<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/39d44bc9-86cb-4446-80e7-5e70653c6584"></p>

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
-  <b>A</b>  es el tipo de acumulador intermedio utilizado durante la operación de colección.
-  <b>R</b>  es el tipo de resultado final después de la colección.
-  <b>collector</b>  es un objeto Collector que define cómo se realizará la colección.

<p>Además, <b>'collect'</b> es especialmente útil cuando se necesita realizar operaciones de colección en paralelo, ya que puede aprovechar las características de concurrencia de Java Streams para realizar la operación de colección de manera eficiente.</p>
