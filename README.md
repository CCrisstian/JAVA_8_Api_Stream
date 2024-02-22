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


<h2 align="center">Stream: Operadores</h2>

<p>En el contexto de Java Streams, los operadores se dividen en operaciones intermedias y operaciones terminales( o finales).</p>

<h3>Operaciones Intermedias:</h3>

-  <b>Map:</b> Es una operación intermedia. Se utiliza para transformar cada elemento del stream y devuelve un nuevo stream con los elementos transformados.

-  <b>Peek:</b> Es una operación intermedia. Se utiliza para realizar operaciones de lado (side-effects) en cada elemento del stream, pero no cambia el contenido del stream.

-  <b>Filter:</b> Es una operación intermedia. Se utiliza para filtrar elementos del stream según un predicado.

-  <b>Optional:</b> Optional no es una operación, sino una clase que se utiliza para manejar valores que podrían ser nulos. Puede ser utilizado en cualquier parte del código, tanto en operaciones intermedias como terminales, para manejar valores opcionales.
  
-  <b>distinct:</b> Elimina duplicados del stream.
  
-  <b>mapToInt:</b> Transforma cada elemento del stream en un tipo primitivo int.

-  <b>flatMap:</b> Aplana un stream de elementos a un único nivel, útil para trabajar con streams de streams.

-  <b>parallel:</b> Convierte un stream en un stream paralelo, permitiendo operaciones paralelas.

<h3>Operaciones Terminales:</h3>

-  <b>Collect:</b> Es una operación terminal. Se utiliza para transformar los elementos del stream en una colección, como una lista, un conjunto o un mapa.

-  <b>FindAny:</b> Es una operación terminal. Devuelve algún elemento del stream que cumple con un predicado. No garantiza ningún orden particular.

-  <b>FindFirst:</b> Es una operación terminal. Devuelve el primer elemento del stream que cumple con un predicado. Garantiza el orden en el que los elementos aparecen en el stream.

-  <b>AnyMatch:</b> Es una operación terminal. Verifica si al menos un elemento del stream cumple con un predicado.
  
-  <b>count:</b> Cuenta el número de elementos en el stream.
  
-  <b>reduce:</b> Combina los elementos del stream utilizando una operación asociativa y produce un resultado final.
  
-  <b>sum:</b> Calcula la suma de los elementos en un stream de números.
  
-  <b>summaryStatistics:</b> Calcula estadísticas (como suma, promedio, mínimo, máximo, etc.) para elementos numéricos en el stream.


<p>En resumen, los operadores finales son aquellos que terminan la ejecución del stream y producen un resultado concreto. Las operaciones intermedias que pueden ser seguidas por otras operaciones intermedias o terminales en una cadena de operaciones de stream.</p>


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

<h2 align="center">'Filter'</h2>

<p>El operador <b>'filter'</b> en Java es una operación intermedia en streams que se utiliza para filtrar los elementos del stream según ciertos criterios definidos por un predicado. El predicado es una función que toma un elemento del stream y devuelve un valor booleano que indica si el elemento debe ser incluido en el nuevo stream resultante.</p>

<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/dd3209ae-c3e7-4d1c-8957-a173ea06bd99"></p>

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>predicate</b> es un objeto Predicate que define el criterio de filtrado.

<p>El operador <b>'filter'</b> es una herramienta poderosa que permite seleccionar elementos específicos de un stream basándose en condiciones específicas. Es posible encadenar múltiples operadores filter para realizar filtrados más complejos y sofisticados.</p>

<h2 align="center">Métodos 'findAny' y 'findFirst'</h2>

<p>Los métodos <b>'findAny'</b> y <b>'findFirst'</b> son operaciones terminales en Java que se utilizan en streams para obtener un resultado de un stream. Ambos métodos devuelven un Optional, que es una clase introducida en Java para manejar valores que podrían ser nulos.</p>
<p>Ambos métodos son útiles dependiendo del contexto y de si estás interesado en obtener cualquier elemento del stream (findAny) o el primer elemento según el orden del stream (findFirst). Ambos métodos devuelven un Optional para manejar la posibilidad de que el stream esté vacío.</p>

<h3>'findAny'</h3>
<p>El método <b>'findAny'</b> devuelve un Optional que contiene algún elemento del stream, si el stream no está vacío. No garantiza ningún orden particular para la obtención del elemento y puede ser útil cuando simplemente se desea obtener cualquier elemento del stream.</p>
<p align="center"><img width="400" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/767fac2d-2818-4c1f-8cd3-84bb10d17278"></p>

<h3>'findFirst'</h3>
<p>El método <b>'findFirst'</b> devuelve un Optional que contiene el primer elemento del stream, si el stream no está vacío. A diferencia de <b>'findAny'</b>, <b>'findFirst'</b> garantiza el orden en el que los elementos aparecen en el stream.</p>
<p align="center"><img width="400" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/1d4b00f9-a642-43da-8f96-72a0291cb019"></p>

<h2 align="center">'Optional'</h2>

<p><b>'Optional'</b> es una clase introducida en Java para manejar situaciones en las que un valor puede ser nulo. Su propósito principal es proporcionar una forma más segura y expresiva de trabajar con valores que pueden o no estar presentes, evitando así errores de referencia nula (NullPointerException).</p>
<p>La clase Optional tiene varios métodos útiles para trabajar con valores opcionales. Algunos de los métodos más comunes incluyen:</p>
<h3>Creación de un 'Optional':</h3>
<p align="center"><img width="500" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/b6ec6068-029f-448b-a554-3a825e3be925"></p>

-  <b>Optional.empty():</b> Crea un Optional vacío.
  
-  <b>Optional.of(T value):</b> Crea un Optional con el valor proporcionado. Lanza NullPointerException si el valor es nulo.
  
-  <b>Optional.ofNullable(T value):</b> Crea un Optional con el valor proporcionado o un Optional vacío si el valor es nulo.

<h3>Obtención de un Valor:</h3>
<p align="center"><img width="500" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/e8e4967a-af2a-4be5-a4a0-7708ff6fc3cb"></p>

-  <b>get():</b> Obtiene el valor del Optional. Puede lanzar NoSuchElementException si el valor es nulo.
  
-  <b>orElse(T other):</b> Obtiene el valor del Optional o un valor predeterminado si el Optional está vacío.
  
-  <b>orElseGet(Supplier<? extends T> other):</b> Obtiene el valor del Optional o un valor proporcionado por un Supplier si el Optional está vacío.
  
-  <b>'orElseThrow':</b> se utiliza para obtener el valor del Optional si está presente, y si el Optional está vacío, lanza una excepción proporcionada por un Supplier.

<p>Estos métodos son útiles cuando se trabaja con Optional y se necesita proporcionar un valor predeterminado o lanzar una excepción en caso de que el Optional esté vacío. La elección entre 'orElse', 'orElseGet' y 'orElseThrow' depende de si el valor predeterminado o la excepción se deben evaluar independientemente de si el Optional está vacío o no.</p>

<h3>Verificación de la Presencia de un Valor:</h3>
<p align="center"><img width="400" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/0a0b4d3c-6554-4b70-826b-25bd6bbf20d3"></p>

-  <b>isPresent():</b> Devuelve true si el Optional contiene un valor, false si está vacío.

<h3>Trabajo con el Valor mediante Funciones:</h3>
<p align="center"><img width="700" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/5f11caee-7bcd-4cdb-87f6-db6ffa25188a"></p>

-  <b>ifPresent(Consumer<? super T> consumer)</b>: Ejecuta una acción si el Optional contiene un valor.
  
-  <b>map(Function<? super T, ? extends U> mapper):</b> Aplica una función al valor del Optional si está presente y devuelve un nuevo Optional con el resultado.
  
-  <b>flatMap(Function<? super T, Optional<U>> mapper):</b> Similar a map, pero la función de mapeo devuelve un Optional, y se aplana el resultado.

<p>La idea central de Optional es proporcionar una forma más segura y declarativa de manejar los valores opcionales, sin necesidad de comprobar constantemente</p>

<h2 align="center">'anyMatch'</h2>

<p>El método <b>'anyMatch'</b> es una operación terminal en Java que se utiliza en streams para verificar si al menos uno de los elementos del stream cumple con cierto predicado. Devuelve un valor booleano indicando si algún elemento satisface la condición especificada.</p>
<p align="center"><img width="600" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/2d7106ba-fdd8-4342-a922-80aa5fa969e0"></p>
Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>predicate</b> es un objeto Predicate que define la condición que debe cumplir al menos uno de los elementos del stream.
  
<p>Este método es útil cuando se desea comprobar si al menos un elemento del stream cumple con cierta condición sin tener que procesar todos los elementos del stream. Si algún elemento cumple la condición, <b>'anyMatch'</b> devuelve true; de lo contrario, devuelve false.</p>


<h2 align="center">'count'</h2>

<p>El operador <b>'count'</b> en Java es una operación terminal que se utiliza en streams para contar el número de elementos en el stream. Devuelve un valor long que representa la cantidad de elementos en el stream.</p>
<p align="center"><img width="200" alt="image" src="https://github.com/CCrisstian/JAVA_Api_STREAM/assets/111469216/ddcb2757-1457-4422-82b3-a12f849429c0"></p>
<p>El método <b>'count'</b> no toma argumentos y simplemente cuenta la cantidad de elementos en el stream.</p>
<p>Esta operación es útil cuando simplemente se necesita obtener la cantidad de elementos en un stream y no es necesario acceder o procesar los elementos individuales. La operación <b>'count'</b> es eficiente y puede ser utilizada en streams de gran tamaño sin necesidad de cargar todos los elementos en memoria.</p>
