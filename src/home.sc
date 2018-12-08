case class Identite(var nom : String = "Ingold", var prenom : String = "Jean", var age : Int = 23) {
  override def equals(that: Any) = super.equals()

  def change_prenom(newfn : String): Unit ={
    prenom = newfn
  }
}

var ident = Identite("Ingold", "Paul", 17)

ident.change_prenom("Jean")

println(ident.prenom)

/*var liste = List("Jean", "Paul", "Pierre")

for(tt <- liste){
  println(tt)
}
liste.foreach(nom => println(nom))*/

var listIdentite = List(Identite(), Identite("Ingold", "Paul", 17), Identite("Guede", "Marie-Anne", 55))

listIdentite = listIdentite :+ Identite("Ingold", "Pierre", 63)

val recup = listIdentite.filter(test => test.age < 30)
