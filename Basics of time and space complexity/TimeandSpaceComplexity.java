/*Basic of Time Complexity and Space Complexity
    Time Complexity
=>Relation between input size and running time (operations)
👉 It tells us:
How fast an algorithm runs.
How efficient it is compared to others.
Notations of Time Complexity

Big-O (O):

Describes the worst-case scenario.

Maximum time an algorithm can take.

Example: Linear search → O(n) (you may check all elements).

Big-Omega (Ω):

Describes the best-case scenario.

Minimum time an algorithm will take.

Example: Linear search → Ω(1) (if the first element is the target).

Big-Theta (Θ):

Describes the average case (tight bound).

Example: Linear search → Θ(n/2) ≈ Θ(n).

Common Time Complexities

O(1): Constant → example: accessing an array element.

O(log n): Logarithmic → example: binary search.

O(n): Linear → example: traversing a list.

O(n log n): Linearithmic → example: merge sort, quicksort (average).

O(n²): Quadratic → example: nested loops (bubble sort).

O(2ⁿ): Exponential → example: recursive Fibonacci.

O(n!): Factorial → example: traveling salesman (brute force).
*Best case -> Ω(1)
*Average case -> Θ(n+1/2)
*Worst case -> O(n)
    Space Complexity
*/