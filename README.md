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

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");

        // Crear un Stream a partir de una lista
        Stream<String> streamFromList = lista.stream();
        
        // También puedes crear un Stream directamente desde un array
        String[] array = {"A", "B", "C", "D", "E"};
        Stream<String> streamFromArray = Arrays.stream(array);
    }
}
```

-    <b>'Stream.builder':</b> Es una forma de construir un Stream en Java de manera más flexible que utilizando métodos como Stream.of. Permite agregar elementos al stream a medida que se los tiene disponibles, sin necesidad de crear una colección intermedia.

Ejemplo:

```java
import java.util.stream.Stream;

public class StreamBuilderExample {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        builder.add("Hola");
        builder.add("Mundo");

        // Construir el stream
        Stream<String> stream = builder.build();

        // Imprimir los resultados
        stream.forEach(System.out::println);
    }
}

```

-    <b>'Stream.of:'</b>  Es un método estático que pertenece a la clase Stream y se utiliza para crear un stream a partir de elementos individuales o de un arreglo.

Ejemplo:

```java
import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        // Crear un stream a partir de elementos individuales
        Stream<String> stream1 = Stream.of("Hola", "Mundo");

        // Crear un stream a partir de un arreglo
        String[] arreglo = {"Java", "es", "poderoso"};
        Stream<String> stream2 = Stream.of(arreglo);

        // Imprimir los resultados
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
```

-    <b>'Stream.generate:'</b>  Es un método estático que pertenece a la clase Stream y se utiliza para generar un stream infinito de elementos mediante una función generadora.

Ejemplo:

```java
import java.util.stream.Stream;

public class StreamGenerateExample {
    public static void main(String[] args) {
        // Crear un stream infinito de números aleatorios entre 1 y 100
        Stream<Integer> stream = Stream.generate(() -> (int) (Math.random() * 100) + 1);

        // Imprimir los primeros 5 elementos del stream
        stream.limit(5).forEach(System.out::println);
    }
}
```


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

```java
<R> Stream<R> map(Function<? super T, ? extends R> mapper)
```

Donde:

-  <b>T</b> es el tipo de los elementos originales en el stream.
  
-  <b>R</b> es el tipo de los elementos resultantes después de la aplicación de la función de mapeo.
  
-  <b>mapper</b> es la función que toma un elemento de tipo T y devuelve un elemento de tipo R. La función de mapeo que se proporciona determina cómo se transforman los elementos del stream.


<h2 align="center">'Peak'</h2>

<p>El operador <b>'peek'</b> en Java es una operación intermedia en un stream que permite realizar operaciones de lado (side-effects) sin cambiar el contenido de los elementos del stream. A menudo se utiliza para depuración y para observar o registrar información sobre los elementos del stream durante el procesamiento.</p>

```java
Stream<T> peek(Consumer<? super T> action)
```

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>action</b> es el Consumer que realiza la acción (side-effect) en cada elemento.

<p>Como <b>'peek'</b> es una operación intermedia se necesitará una operación terminal (como collect, forEach, count, etc.) al final del stream para que las operaciones intermedias se ejecuten realmente.</p>


<h2 align="center">'Collect'</h2>

<p>El método <b>'collect'</b> es una operación terminal en Java que se utiliza en streams para transformar los elementos del stream en otra forma, como una lista, un conjunto, un mapa, o cualquier otra colección. collect utiliza un Collector para realizar la acumulación de elementos en la colección deseada. Este método es muy poderoso y versátil, permitiendo a los desarrolladores especificar cómo se deben acumular y combinar los elementos.</p>

```java
<R, A> R collect(Collector<? super T, A, R> collector)
```

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
-  <b>A</b>  es el tipo de acumulador intermedio utilizado durante la operación de colección.
-  <b>R</b>  es el tipo de resultado final después de la colección.
-  <b>collector</b>  es un objeto Collector que define cómo se realizará la colección.

<p>Además, <b>'collect'</b> es especialmente útil cuando se necesita realizar operaciones de colección en paralelo, ya que puede aprovechar las características de concurrencia de Java Streams para realizar la operación de colección de manera eficiente.</p>

<h2 align="center">'Filter'</h2>

<p>El operador <b>'filter'</b> en Java es una operación intermedia en streams que se utiliza para filtrar los elementos del stream según ciertos criterios definidos por un predicado. El predicado es una función que toma un elemento del stream y devuelve un valor booleano que indica si el elemento debe ser incluido en el nuevo stream resultante.</p>

```java
Stream<T> filter(Predicate<? super T> predicate)
```

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>predicate</b> es un objeto Predicate que define el criterio de filtrado.

<p>El operador <b>'filter'</b> es una herramienta poderosa que permite seleccionar elementos específicos de un stream basándose en condiciones específicas. Es posible encadenar múltiples operadores filter para realizar filtrados más complejos y sofisticados.</p>

<h2 align="center">Métodos 'findAny' y 'findFirst'</h2>

<p>Los métodos <b>'findAny'</b> y <b>'findFirst'</b> son operaciones terminales en Java que se utilizan en streams para obtener un resultado de un stream. Ambos métodos devuelven un Optional, que es una clase introducida en Java para manejar valores que podrían ser nulos.</p>
<p>Ambos métodos son útiles dependiendo del contexto y de si estás interesado en obtener cualquier elemento del stream (findAny) o el primer elemento según el orden del stream (findFirst). Ambos métodos devuelven un Optional para manejar la posibilidad de que el stream esté vacío.</p>

<h3>'findAny'</h3>
<p>El método <b>'findAny'</b> devuelve un Optional que contiene algún elemento del stream, si el stream no está vacío. No garantiza ningún orden particular para la obtención del elemento y puede ser útil cuando simplemente se desea obtener cualquier elemento del stream.</p>

```java
Optional<T> findAny()
```

<h3>'findFirst'</h3>
<p>El método <b>'findFirst'</b> devuelve un Optional que contiene el primer elemento del stream, si el stream no está vacío. A diferencia de <b>'findAny'</b>, <b>'findFirst'</b> garantiza el orden en el que los elementos aparecen en el stream.</p>

```java
Optional<T> findFirst()
```

<h2 align="center">'Optional'</h2>

<p><b>'Optional'</b> es una clase introducida en Java para manejar situaciones en las que un valor puede ser nulo. Su propósito principal es proporcionar una forma más segura y expresiva de trabajar con valores que pueden o no estar presentes, evitando así errores de referencia nula (NullPointerException).</p>
<p>La clase Optional tiene varios métodos útiles para trabajar con valores opcionales. Algunos de los métodos más comunes incluyen:</p>
<h3>Creación de un 'Optional':</h3>

```java
Optional<T> empty()
Optional<T> of(T value)
Optional<T> ofNullable(T value)
```

-  <b>Optional.empty():</b> Crea un Optional vacío.
  
-  <b>Optional.of(T value):</b> Crea un Optional con el valor proporcionado. Lanza NullPointerException si el valor es nulo.
  
-  <b>Optional.ofNullable(T value):</b> Crea un Optional con el valor proporcionado o un Optional vacío si el valor es nulo.

<h3>Obtención de un Valor:</h3>

```java
T get()
T orElse(T other)
T orElseGet(Supplier<? extends T> other)
```

-  <b>get():</b> Obtiene el valor del Optional. Puede lanzar NoSuchElementException si el valor es nulo.
  
-  <b>orElse(T other):</b> Obtiene el valor del Optional o un valor predeterminado si el Optional está vacío.
  
-  <b>orElseGet(Supplier<? extends T> other):</b> Obtiene el valor del Optional o un valor proporcionado por un Supplier si el Optional está vacío.
  
-  <b>'orElseThrow':</b> se utiliza para obtener el valor del Optional si está presente, y si el Optional está vacío, lanza una excepción proporcionada por un Supplier.

<p>Estos métodos son útiles cuando se trabaja con Optional y se necesita proporcionar un valor predeterminado o lanzar una excepción en caso de que el Optional esté vacío. La elección entre 'orElse', 'orElseGet' y 'orElseThrow' depende de si el valor predeterminado o la excepción se deben evaluar independientemente de si el Optional está vacío o no.</p>

<h3>Verificación de la Presencia de un Valor:</h3>

```java
boolean isPresent()
```

-  <b>isPresent():</b> Devuelve true si el Optional contiene un valor, false si está vacío.

<h3>Trabajo con el Valor mediante Funciones:</h3>

```java
void ifPresent(Consumer<? super T> consumer)
<U> Optional<U> map(Function<? super T, ? extends U> mapper)
<U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper)
```

-  <b>ifPresent(Consumer<? super T> consumer)</b>: Ejecuta una acción si el Optional contiene un valor.
  
-  <b>map(Function<? super T, ? extends U> mapper):</b> Aplica una función al valor del Optional si está presente y devuelve un nuevo Optional con el resultado.
  
-  <b>flatMap(Function<? super T, Optional<U>> mapper):</b> Similar a map, pero la función de mapeo devuelve un Optional, y se aplana el resultado.

<p>La idea central de Optional es proporcionar una forma más segura y declarativa de manejar los valores opcionales, sin necesidad de comprobar constantemente</p>

<h2 align="center">'anyMatch'</h2>

<p>El método <b>'anyMatch'</b> es una operación terminal en Java que se utiliza en streams para verificar si al menos uno de los elementos del stream cumple con cierto predicado. Devuelve un valor booleano indicando si algún elemento satisface la condición especificada.</p>

```java
boolean anyMatch(Predicate<? super T> predicate)
```

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>predicate</b> es un objeto Predicate que define la condición que debe cumplir al menos uno de los elementos del stream.
  
<p>Este método es útil cuando se desea comprobar si al menos un elemento del stream cumple con cierta condición sin tener que procesar todos los elementos del stream. Si algún elemento cumple la condición, <b>'anyMatch'</b> devuelve true; de lo contrario, devuelve false.</p>


<h2 align="center">'count'</h2>

<p>El operador <b>'count'</b> en Java es una operación terminal que se utiliza en streams para contar el número de elementos en el stream. Devuelve un valor long que representa la cantidad de elementos en el stream.</p>

```java
long count()
```

<p>El método <b>'count'</b> no toma argumentos y simplemente cuenta la cantidad de elementos en el stream.</p>
<p>Esta operación es útil cuando simplemente se necesita obtener la cantidad de elementos en un stream y no es necesario acceder o procesar los elementos individuales. La operación <b>'count'</b> es eficiente y puede ser utilizada en streams de gran tamaño sin necesidad de cargar todos los elementos en memoria.</p>


<h2 align="center">'isEmpty'</h2>

<p>En Java, el método <b>'isEmpty'</b> no es un operador de streams específico, sino un método que se utiliza en algunos tipos de datos y clases, como String y Optional, para verificar si el objeto está vacío.</p>

```java
boolean isEmpty()
```

<p>El método <b>'isEmpty'</b> en la clase String devuelve true si la cadena no contiene caracteres y false si la cadena tiene al menos un carácter.</p>
<p>En el contexto de Optional, el método <b>'isEmpty'</b> devuelve true si el Optional está vacío (sin valor presente) y false si el Optional contiene un valor.</p>
<p>Es importante destacar que <b>'isEmpty'</b> se utiliza en el contexto de la presencia o ausencia de valores en objetos específicos, como cadenas (String) u opcionales (Optional). No es un operador de stream, sino un método específico de esas clases. Si se esta trabajando con streams y se necesita verificar si un stream está vacío, se puede usar la operación count para contar los elementos en el stream y luego verificar si el recuento es cero.</p>


<h2 align="center">'distinct'</h2>

<p>El método <b>'distinct'</b> en Java se utiliza en streams para eliminar elementos duplicados, dejando solo una instancia de cada elemento único. Es una operación intermedia, lo que significa que no produce un resultado final hasta que se le añade una operación terminal al stream.</p>

```java
Stream<T> distinct()
```

Donde:

-  <b>T:</b> es el tipo de elementos en el stream.

<p>Es importante tener en cuenta que para que <b>'distinct'</b> funcione correctamente, los elementos del stream deben implementar el método <b>'hashCode'</b> y <b>'equals'</b> correctamente. Esto es porque distinct utiliza estos métodos para determinar la igualdad entre elementos y eliminar duplicados.</p>
<p>Además, <b>'distinct'</b> utiliza un conjunto interno para realizar el seguimiento de los elementos únicos, por lo que puede cambiar el orden de los elementos en el stream si el orden es relevante en la aplicación. Si se necesita mantener el orden original, se puede usar LinkedHashSet u otras opciones dependiendo de las necesidades.</p>

<h2 align="center">'reduce'</h2>

<p>El método <b>'reduce'</b> en Java se utiliza en streams para combinar los elementos del stream utilizando una operación binaria y devolver un resultado final. Es una operación terminal que toma un acumulador y una función binaria para realizar la reducción de los elementos del stream a un único resultado.</p>

```java
Optional<T> reduce(BinaryOperator<T> accumulator)
```

Donde:

-  <b>T</b> es el tipo de elementos en el stream.
  
-  <b>accumulator</b> es un objeto BinaryOperator<T> que representa la operación binaria a aplicar a los elementos del stream.

<p>El resultado es envuelto en un Optional porque el stream podría estar vacío, y en ese caso, <b>'reduce'</b> devolverá un Optional vacío.</p>
<p>También hay otra versión de <b>'reduce'</b> que toma un valor inicial (identidad) y la operación binaria:</p>

```java
T reduce(T identity, BinaryOperator<T> accumulator)
```

<p>Este método permite especificar un valor inicial que actúa como identidad en la operación binaria. La identidad es el valor que no afectará el resultado final de la reducción. Si el stream está vacío, se devolverá la identidad como resultado.</p>


<h2 align="center">'IntStream'</h2>

<p><b>'IntStream'</b> es una interfaz en Java que pertenece al paquete java.util.stream y está diseñada para trabajar específicamente con flujos de datos de tipo primitivo int. Forma parte del conjunto de interfaces introducido en Java 8 en el paquete java.util.stream para facilitar y optimizar el procesamiento de secuencias de datos.</p>
<p><p><b>'IntStream'</b> es una interfaz en Java que pertenece al paquete java.util.stream y está diseñada para trabajar específicamente con flujos de datos de tipo primitivo int. Forma parte del conjunto de interfaces introducido en Java 8 en el paquete java.util.stream para facilitar y optimizar el procesamiento de secuencias de datos.</p> proporciona una serie de métodos especializados para operar y manipular flujos de datos de tipo int. Algunos de los métodos más comunes incluyen operaciones de filtrado, transformación, reducción y generación de secuencias.</p>

<h3>Creación de un <b>'IntStream'</b>:</h3>

-  'range' y 'rangeClosed':
```java
IntStream.range(1, 5);       // Crea un IntStream desde 1 hasta 4 (exclusivo)
IntStream.rangeClosed(1, 5); // Crea un IntStream desde 1 hasta 5 (inclusive)
```
-  'of':
```java
IntStream.of(1, 2, 3, 4, 5); // Crea un IntStream a partir de valores específicos
```

<h3>Operaciones de Transformación y Filtrado:</h3>

-  'map y mapToObj:'
```java
IntStream.range(1, 5)
         .map(x -> x * 2);   // Multiplica cada elemento por 2 y devuelve un IntStream

IntStream.range(1, 5)
         .mapToObj(Integer::toString); // Convierte cada int a String y devuelve un Stream<String>
```
-  'filter:'
```java
IntStream.range(1, 10)
         .filter(x -> x % 2 == 0); // Filtra los números pares
```

<h3>Operaciones Terminales:</h3>

-  'forEach'
```java
IntStream.range(1, 5)
         .forEach(System.out::println); // Imprime cada elemento en el IntStream
```
-  'sum'
```java
int suma = IntStream.range(1, 5)
                    .sum(); // Calcula la suma de los elementos en el IntStream
```
-  'average'
```java
OptionalDouble promedio = IntStream.range(1, 5)
                                 .average(); // Calcula el promedio de los elementos en el IntStream
```

<p>Estos son solo algunos ejemplos y <b>'IntStream'</b> ofrece muchas más operaciones útiles. El uso de <b>'IntStream'</b> puede resultar más eficiente que trabajar con un Stream<Integer> cuando se manipulan datos primitivos int.</p>

<h2 align="center">'summaryStatistics'</h2>

<p>El método <b>'summaryStatistics'</b> en Java se utiliza en flujos primitivos, como IntStream, LongStream, y DoubleStream, para obtener estadísticas resumen sobre los elementos del flujo. Este método devuelve un objeto de la clase java.util.IntSummaryStatistics, java.util.LongSummaryStatistics, o java.util.DoubleSummaryStatistics, dependiendo del tipo de flujo.</p>

```java
IntSummaryStatistics summaryStatistics()
LongSummaryStatistics summaryStatistics()
DoubleSummaryStatistics summaryStatistics()
```

<p>Estos métodos están disponibles en IntStream, LongStream, y DoubleStream, respectivamente.</p>
<p>Ejemplo utilizando IntStream:</p>

```java
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatisticsExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        IntSummaryStatistics stats = IntStream.of(numeros).summaryStatistics();

        System.out.println("Suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Mínimo: " + stats.getMin());
        System.out.println("Máximo: " + stats.getMax());
        System.out.println("Cantidad: " + stats.getCount());
    }
}
```

<p>Este método es útil cuando necesitas realizar un análisis rápido de los datos en el flujo primitivo sin tener que realizar múltiples operaciones terminales. Proporciona una forma eficiente de obtener varias estadísticas sobre los elementos del flujo en una sola llamada.</p>

<h2 align="center">'mapToDouble', 'mapToInt', y 'mapToLong'</h2>

<p>En Java, los métodos <b>'mapToDouble'</b>, <b>'mapToInt'</b>, y <b>'mapToLong'</b> son operaciones de mapeo que se utilizan en flujos primitivos (IntStream, LongStream, y DoubleStream, respectivamente). Estos métodos permiten convertir elementos de flujos primitivos a tipos primitivos diferentes.</p>

-    <b>'mapToDouble':</b>  se utiliza en IntStream y LongStream para convertir cada elemento del flujo a un tipo primitivo double.
  
```java
DoubleStream mapToDouble(ToInt/LongFunction<? extends double> mapper)
```

-    <b>'mapToInt':</b> se utiliza en LongStream y DoubleStream para convertir cada elemento del flujo a un tipo primitivo int.

```java
IntStream mapToInt(ToLong/DoubleFunction<? extends int> mapper)
```

-    <b>'mapToLong':</b> se utiliza en IntStream y DoubleStream para convertir cada elemento del flujo a un tipo primitivo long.

```java
LongStream mapToLong(ToInt/DoubleFunction<? extends long> mapper)
```

<p>Estos métodos proporcionan una forma eficiente de convertir elementos de flujos primitivos a otros tipos primitivos sin la necesidad de envolverlos en clases de envoltura (Double, Integer, Long, etc.).</p>

<h2 align="center">'flatMap'</h2>

<p>El operador <b>'flatMap'</b> en Java se utiliza en streams para transformar cada elemento del stream utilizando una función que devuelve otro stream, y luego "aplanar" los resultados en un solo stream. En esencia, <b>'flatMap'</b> es una combinación de las operaciones map y flatMap en una sola.</p>

```java
<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
```

Donde:

-    <b>T:</b> es el tipo de elementos en el stream original.
-    <b>R:</b> es el tipo de elementos en el nuevo stream resultante.
-    <b>mapper:</b> es una función que toma un elemento del stream original y devuelve un nuevo stream de elementos del tipo R.

<p>Un caso común de uso de <b>'flatMap'</b> es cuando se tiene un stream de objetos que contienen otro stream y se desea "aplanar" esos streams internos en un solo stream.</p>
<p><b>'flatMap'</b> es especialmente útil cuando se trabaja con estructuras de datos anidadas o colecciones de colecciones, y dr desea obtener un único stream de los elementos internos. También es utilizado con frecuencia cuando se trabaja con streams de datos en Java.</p>

<h2 align="center">'parallel'</h2>

<p>El método <b>'parallel()'</b> en Java se utiliza en streams para convertir un stream secuencial en un stream paralelo. Un stream paralelo permite que las operaciones en el stream se realicen en paralelo, lo que puede resultar en un mejor rendimiento al procesar grandes conjuntos de datos.</p>
<p>La firma del método <b>'parallel()'</b> es simple y se aplica a cualquier tipo de stream:</p>

```java
Stream<T> parallel()
```

Donde:

-    <b>T:</b> Es el tipo de elementos en el stream.

<p>Es importante señalar que la paralelización no siempre resultará en un mejor rendimiento, ya que depende de diversos factores, incluidos el tamaño del conjunto de datos y la naturaleza de las operaciones realizadas en el stream. Además, es fundamental garantizar que las operaciones realizadas en un stream paralelo sean seguras para la concurrencia.</p>
<p>Se debe utilizar parallel() con precaución y evaluar el rendimiento en el contexto específico de la aplicación.</p>
