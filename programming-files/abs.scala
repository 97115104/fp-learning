// Creating a object singleton class called MyProgram

object MyProgram:
    def abs(n: Int): Int =
        if n < 0 then -n
        else n
    
    // cant' be called outside of the MyProgram object because of the 'private' keyword
    private def formatAbs(x: Int) =
        // the val keyword denotes a variable that is immutable and so cannot be changed later, var is mutable
        val msg = "The abs value of %d is %d"
        msg.format(x, abs(x))
    
    // unit is like void for methods like in Java or C
    @main def printAbs: Unit =
        println(formatAbs(-42))