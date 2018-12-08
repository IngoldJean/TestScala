package tutorial

class Point (xc : Int, yc: Int, zc: Int) {

  var x : Int = xc
  var y : Int = yc
  var z : Int = zc

  def giveposiion(): Unit ={
    println("Position x: " + x)
    println("Position y: " + y)
    println("Position z: " + z)
  }
}
