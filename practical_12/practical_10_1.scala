object RationalApp {

  class Rational(n: Int, d: Int) { 

    require(d != 0, "denominator must not be zero")

    private val gcdVal = gcd(n.abs, d.abs)

    val numerator = n / gcdVal
    val denominator = d / gcdVal

    def neg: Rational = new Rational(-numerator, denominator)

    override def toString: String = s"$numerator/$denominator"

    private def gcd(a: Int, b: Int): Int = { 
      if (b == 0) {
        a
      } else {
        gcd(b, a % b)
      }
    } 

  } 

  def main(args: Array[String]): Unit = { 
    val x = new Rational(3, 4)
    println("\n")
    println(x)
    println(x.neg)
    println("\n")
  }
}
