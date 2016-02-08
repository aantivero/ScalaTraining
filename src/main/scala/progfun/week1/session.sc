//test the REPL
34 + 65
def radius = 21
def pi = 3.14159
radius * pi
//evaluation
(2 * pi) * radius
//definitions can have parameters
def square(x: Double) = x * x

square(2)
square(5 + 4)
square(square(4))

def sumOfSquare(x: Double, y: Double) = square(x) + square(y)
/*
Substitution model: reduce  an expression to a value
sumOfSquare(3, 2 + 2)
sumOfSquare(3, 4)
square(3) + square(4)
3 * 3 + square(4)
9 + square(4)
9 + 4 * 4
9 + 16
25
call-by-value evaluates arguments only once
 */
//does every expression reduce to a value? No
def loop: Int = loop
//loop the call produce an infinitive
/*
changing the evaluation strategy, unreduced arguments
sumOfSquares(3, 2 + 2)
square(3) + square(2 + 2)
3 * 3 + square(2 + 2)
9 + (2 + 2) * (2 + 2)
9 + 4 * 4
9 + 16
25
call-by-name evaluates the arguments if used
 */

