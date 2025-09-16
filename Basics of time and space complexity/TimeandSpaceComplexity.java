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
    Space complexity is the amount of memory (RAM) an algorithm uses as the input size grows.

👉 It tells us:

How much memory an algorithm needs.

Whether it’s memory-efficient or not.

✅ Components of Space Complexity

Fixed Part (constant):

Independent of input size.

Example: variables, program instructions.

Variable Part (depends on input):

Memory for inputs, temporary data, recursion stacks, etc.

✅ Common Space Complexities

O(1): Constant space → example: swapping numbers.

O(n): Linear space → example: storing an array of n elements.

O(n²): Quadratic space → example: 2D matrix storage.

🔹 3. Quick Comparison
Aspect	Time Complexity	Space Complexity
Definition	Relationship between input size & running time	Relationship between input size & memory usage
Goal	Minimize execution time	Minimize memory usage
Common Notations	O, Ω, Θ	O, Ω, Θ
Example	Linear search = O(n)	Array of size n = O(n)
🔹 4. Example (Linear Search)
int linearSearch(int arr[], int n, int key) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) return i; 
    }
    return -1;
}


Time Complexity:

Best case: Ω(1) (found at first element)

Worst case: O(n) (found at last element or not found)

Average case: Θ(n)

Space Complexity:

O(1) (only a few variables used).

🔹 5. Why It Matters?

Helps compare algorithms (fast vs slow, memory-heavy vs memory-light).

Important in competitive programming, interviews, and real-world systems.

Balances time vs space trade-off (sometimes faster algorithms use more memory).

⚡ In short:

Time Complexity = Efficiency in terms of speed

Space Complexity = Efficiency in terms of memory
*/