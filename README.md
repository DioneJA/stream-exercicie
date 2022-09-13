<h1> Stream Exercicie </h1>
<h2>Exercício de fixação sobre Stream, Predicados e Pipelinas.</h2>
<h3>Descrição: </h3>
<p>"Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio."</p>

<h3>Arquivo de entrada:</h3>
<p>TV,900.00</p>
<p>Mouse,50.00</p>
<p>Tablet,350.00</p>
<p>Computer,850.00/<p>
<p>Monitor,290.00</p>
<p>Caneta,2.00</p>
<p>Quadro,490.00</p>
<p>Abajur,90.00</p>
<p>Teclado,120.00</p>
<p>Mesa,150.00</p>
<p>Ventilador,100.00</p>

<h3>Execução:</h3>
<p>Enter full file path: "informacoes.txt"</p>
<p>Products: </p>
<p>[TV 900.00]</p>
<p>[Mouse 50.00]</p>
<p>[Tablet 350.00]</p>
<p>[Computer 850.00]</p>
<p>[Monitor 290.00]</p>
<p>[Caneta 2.00]</p>
<p>[Quadro 490.00]</p>
<p>[Abajur 90.00]</p>
<p>[Teclado 120.00]</p>
<p>[Mesa 150.00]</p>
<p>[Ventilador 100.00]</p>
</br>
<p>Average price: 308.36</p>
<p>Filtred products (Price>=Average): </p>
<p>[TV 900.00]</p>
<p>[Tablet 350.00]</p>
<p>[Computer 850.00]</p>
<p>[Quadro 490.00]</p>

<h3>Streams Utilizadas: </h3>
<p>Double average = products.stream().map(p->p.getPrice()).reduce(0.0,(p1,p2)->p1+p2)/products.size(); Filtra a média de valores dos produtos e coloca na variável average.</p>
</br>
<p>List<Products> filtredList =  products.stream().filter(x->x.getPrice()>=average).collect(Collectors.toList()); Filtra os items com valor maior ou igual a média e os coloca em uma "listra filtrada"</p>
