import scala.io.StdIn.readLine
import tutorial.Point

object ScalaTuto {
  
  def initialisation_matrice(array : Array[Array[Int]]): Array[Array[Int]] ={

    for(j <- 0 to 19) {
      array(0)(j) = j+1
      array(1)(j) = -1
    }
    array
  }

  def main (args: Array[String]): Unit ={

    var tentative = 0
    var nombre_mystere = scala.util.Random.nextInt(50) + 1
    var nombre_entre = 0
    var matrice_tentatives = Array.ofDim[Int](2,20)
    var j = 0
    var position : Point = new Point(2,3,4)

    position.giveposiion()

    matrice_tentatives = initialisation_matrice(matrice_tentatives)

    println(f"Le nombre que l'on doit trouver est $nombre_mystere%d")
    //printf("Le nombre que l'on doit trouver est %d\n", nombre_mystere)
    do{
      print("Devine le nombre entre 1 et 50 \n")
      nombre_entre = readLine().toInt


      if(nombre_entre < 1 || nombre_entre > 50) println("Attention! Vous devez choisir un nombre entre 1 et 50")
      else {
        tentative += 1

        matrice_tentatives(1)(tentative -1) = nombre_entre
        if(nombre_entre < nombre_mystere) println("Le nombre renseigné est trop petit") else if(nombre_entre > nombre_mystere) println("Le nombre renseigné est trop grand")

      }

    }while(nombre_mystere != nombre_entre)

    println("Voici un résumé de vos tentatives")
    do{
      printf("Tentative n° " + matrice_tentatives(0)(j) + "  ")
      printf("Valeur entrée: " + matrice_tentatives(1)(j) + "\n")
      j+=1
    }while(matrice_tentatives(1)(j) != -1)

    println("Vous avez réussi à trouver le nombre en "+ tentative +" tentative(s)")
  }

}
