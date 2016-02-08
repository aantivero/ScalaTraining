//evaluation strategies and termination
def loop: Int = loop
def first(x: Int, y: Int) = x
//first(1, loop) produce a loop
//Scala use call-by-value
//but if the type of the function start with => it uses call-by-name
def constOne(x: Int, y: => Int) = 1
constOne(1+2, loop)

//conditions and value definitions
//if-else condition
def abs(x: Int) = if (x >= 0) x else -x
/*
Booleans expressions
true false //Constants
!b         //Negation
b && b    //Conjunction
b || b    //Disjunction
//comparison operations
e <= e, e >= e, e < e, e > e, e == e, e != e
 */
/*
rules for Booleans
!true      --> false
!false     --> true
true && e  --> e
false && e --> false
true || e  --> true
false || e --> e
 */
//Value definitions
def square(x: Int) = x * x
val x = 2
//evaluated, the name refers to a value
val y = square(x)

//value definitions and termination
def loop1: Boolean = loop1
def x1 = loop1
//val y1 = loop1 produce a infinitive loop

def and(x: Boolean, y: Boolean): Boolean = if(x) y else false
and(true, false)
and(false, false)
def or(x: Boolean, y: Boolean): Boolean = if(x) true else y
or(true, false)
or(false, false)
or(false, true)