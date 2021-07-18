object Q2 extends App{

  def GCD(x:Int, y:Int):Int = y match{
    case 0 => x
    case a if(a>x) => GCD(a,x)
    case a => GCD(a, x%a)
  }

  def primeSeq(m:Int, n:Int=2):Boolean= n match{
    case a if(a==m)=> true
    case a if(GCD(m,a)>1) => false
    case a => primeSeq(m,a+1)
  }

  def prime(n:Int):Unit={
    if (primeSeq(n) == true) {
     println(n)
     prime(n-1)
    }
      else prime(n-1)
  }

  prime(10)
}
