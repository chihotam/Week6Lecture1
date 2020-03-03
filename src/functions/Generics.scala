package functions

object Generics {
  def genericMethod[Type](lis: List[Int], compare: (Int) => Type): List[Type] = {
    var newlis: List[Type] = List()
    for(x <- lis) {
      newlis = newlis :+ compare(x)
    }
    newlis
  }
}
