object Q5 extends App{

  def even(n:Int): Boolean =n match{
    case 0 => true
    case x => odd(n-1)
  }

  def odd(n:Int):Boolean = !(even(n))

  def sum(n:Int):Int= n match {
    case 0 => n
    case x => n+sum(n-2)
  }

  def add_even(n:Int):Unit={
    if (even(n) == true){
      println(sum(n))
    }
    else{
      println(even(n))
    }
  }

  add_even(6)
  add_even(14)
  add_even(9)
}
