import scala.io.StdIn

object question1{

    def prime(number:Int) : Boolean  = {
        if(number<2)
            false
        else 
            !isdivisible(number,math.sqrt(number).toInt)
    }

    def isdivisible(number : Int, divisor : Int) : Boolean = {
        if(divisor==1)
            false
        else if(number%divisor==0)
            true
        else isdivisible(number,divisor-1)
    }

    def main(args:Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        val isprime = prime(number)
        println(isprime)
    }
}

object question2{

    def prime(number:Int) : Boolean  = {
        if(number<2)
            false
        else 
            !isdivisible(number,math.sqrt(number).toInt)
    }

    def isdivisible(number : Int, divisor : Int) : Boolean = {
        if(divisor==1)
            false
        else if(number%divisor==0)
            true
        else isdivisible(number,divisor-1)
    }

    def primeSeq(n : Int, start : Int = 2) : Unit = {
        if (start<n)
            if(prime(start))
                println(start)
            primeSeq(n,start+1)
    }

    def main(args:Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        println(s"The sequence of prime numbers less than $number ")
        primeSeq(number)
    }
}

object question3 {

    def sum(number : Int) : Int = {
        if(number==1)
            number
        else number+sum(number-1)
    }

    def main(args : Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        println(s"The sum of numbers from 1 to $number is ${sum(number)}.")
    }
}

object question4 {

    def iseven(n : Int) : Boolean = {
        if (n==0) true
        else isodd(n-1)
    }

    def isodd(n : Int) : Boolean = {
        if (n==0) false
        else iseven(n-1)
    }

    def main(args : Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        println(s"$number is ${if(iseven(number)) "even." else "odd."}")
    }
}

object question5 {
    def sum_even(n : Int, start : Int = 0) : Int = {
        if(start<n)
            start+sum_even(n,start+2)
        else 0
    }

    def main(args : Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        println(sum_even(number))
    }
}

object question6 {
    def printFibonacci(n: Int): Unit = {
        for (i <- 0 until n) {
        print(fibonacci(i) + " ")
  }
}

    def fibonacci(n: Int): Int = {
        if (n <= 1) n
        else fibonacci(n - 1) + fibonacci(n - 2)
}
    def main(args : Array[String]) : Unit = {
        print("Enter a Number :- ")
        val number = StdIn.readInt()
        printFibonacci(number)
    }

}