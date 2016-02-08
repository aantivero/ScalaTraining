#Programming Paradigms

##Imperative Programming:
    - modifying mutable variables,
    - using assignments,
    - and control structures such as if-then-else, loops, break, continue, return.

### Imperative Programs and Computers 
    - Mutable variables     => memory cells
    - Variable dereferences => load instructions
    - Variable assignments  => store intructions
    - Control structures    => jumps

Pure imperative programming is limited. We need other techniques for definning high-level abstractions.

##Theory in Mathematics...(not describe mutations)
    - one or more data types
    - operations on these types
    - laws that describe the relationships between values and operations

##Consequences for Programming
_There's no place for mutation_

 1. The theories do not admit it.
 2. Mutation can destroy useful laws in theories. 

    - concentrate on defining theories for operators expressed as functions.
    - avoid mutations.
    - have powerful ways to abstract and compose functions.