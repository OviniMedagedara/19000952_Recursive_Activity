object Q4 extends App{

  def even(n:Int): Boolean =n match{
    case 0 => true
    case a => odd(n-1)
  }

  def odd(n:Int):Boolean = !(even(n))

  println(even(8))
  println(even(13))

}
