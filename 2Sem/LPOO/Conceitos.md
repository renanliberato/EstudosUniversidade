


#<b>1. ORIENTAÇÃO A OBJETO</b>
O paradigma orientado a objeto possui uma série de conceitos a serem explorados, pois, diferente do paradigma estruturado, organiza seu código em diferentes camadas de classes, tornando-o mais complexo.

#1.1 CONCEITOS

##<b>1.1.1 Classe</b>
<p>Uma classe é definida como um molde. Ela não realiza ações diretamente no programa, mas sim determina um escopo de propriedades e ações.</p>
```java
public class User
{

}
```
<p>Ao criarmos uma classe, o primeiro item é o nível de visibilidade desta classe. Todo arquivo de classes deve conter uma e apenas uma classe com visibilidade 'public', pois ela que dará o nome ao arquivo e será visível de outros pontos do programa.  O segundo item é a palavra reservada 'class' registrando que estamos criando uma classe e o terceiro é seu nome.</p>
<p>No exemplo acima podemos deduzir então que o nome do nosso arquivo é 'User.java'</p>

###<b> 1.1.2 Propriedade </b>
<p>Uma propriedade é uma característica da classe. Uma propriedade é muitas vezes confundida com uma variável, porém a principal diferença entre elas está no nível que são declaradas. Uma variável é um espaço na memória que é utilizado apenas no método na qual foi declarada. Já uma propriedade de uma classe está presente em toda instanciação que foi feita, sendo visível de um escopo muito maior.</p>
```java
public    String  username = "renanliberato";
protected String  fullName = "Renan Liberato Sant'Ana";
private   boolean valid = true;
```
A declaração de uma propriedade segue quase a mesma linha da declaração de uma variável, com exceção do primeiro item.
O primeiro item da declaração é o nível de visibilidade do objeto, ele pode ser public, protected e private (este tópico será explicado junto com o tópico de Encapsulamento).
O segundo item é o tipo da propriedade. Assim como numa variável, ele pode ser um tipo primitivo ou uma classe.

###<b> 1.1.3 Método</b>
<p> Um método é basicamente uma ação que o escopo da classe é capaz de realizar. A sua declaração não difere da de uma função normal. Porém, por se tratar de um método de uma classe, conta com a determinação do seu nível de visibilidade.</p>
```java
public boolean isValid()
{
	if (this.valid)
		return true;
	return false;
}
```

<p>Abaixo temos nosso exemplo completo da nossa classe, com seus atributos e método:</p>
```java
public class User
{
	public String username;
	protected String fullName;
	private boolean valid;
	
	public boolean isValid()
	{
		if (this.valid == 1)
			return true;
		return false;
	}
}
```

##1.2 OBJETO
<p>Um objeto é o resultado da instanciação de uma classe. Este objeto possui todas as características da classe da qual se originou e também realiza todas as ações estipuladas em seu escopo. Um objeto é criado da seguinte maneira:</p>
```java
User myuser = new User();
```
<p>No exemplo acima declaramos um objeto da classe 'User', que criamos anteriormente. Sabendo que este objeto conta com os recursos da classe, pordemos fazer o seguinte:</p>
```java
if (myuser.isValid())
	System.out.println("Bem-Vindo");
```
<p>Isto foi possível pois o método <code>isValid()</code> foi declarado com o atributo <code>public</code>, permitindo que o usemos fora do ambiente de sua classe. Outro item que poderia ser acessado deste objeto é seu atributo <code>username</code>, pois também foi declarado como público. Já as propriedades <code>fullname</code> e <code>valid</code> não podem ser acessadas do objeto, apenas dentro do seu escopo de classe. A seguir veremos mais detalhes sobre visibilidade.</p>
##1.3 ENCAPSULAMENTO

###Níveis de encapsulamento
####public
####protected
####private

##1.4 HERANÇA
###<b> 1.4.1 Relação entre herança e encapsulamento </b>
###Atributos
###Métodos
##1.5 POLIMORFISMO
###Sobrecarga
###Sobreposição

