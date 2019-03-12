<h1>Eksamenatorier I:</h1>


## 1. Exercise 2.1-1 (page 22)
Using Figure 2.2 as a model, illustrate the operation of INSERTION-SORT on the array A = { 31, 41, 59, 26, 41, 58 }

<b>ANSWER:</b>
    
    step 1: { 31, 41, 59, 26, 41, 58 }

    step 2: { 26, 31, 41, 59, 41, 58 }

    step 3: { 26, 31, 41, 41, 59, 58 }

    step 4: { 26, 31, 41, 41, 58, 59 }


## 2. Exercise 2.1-3 (page 22)
Consider the searching problem:
- Input: A sequence of n numbers A = (a1, a2...an) and a value v .
- Output: An index i such that v = A[i] or the special value NIL if v does not appear in A.

Write pseudocode for linear search, which scans through the sequence, looking for v. Using a loop invariant, prove that your algorithm is correct. 
Make sure that your loop invariant fulfills the three necessary properties.
PS: But avoid using invariant this time, since it will be catched up later in the course!

<b>ANSWER:</b>

    LINEAR-SEARCH(A,v) 
        for i = 0 to A.length-1
            if A[i] == v
                return A[i]
            else 
                return NIL

*look up for pseudocode conventions from page 20 in the book!

## 3. Exercise 2.2-3 (page 29)
Consider linear search again (see Exercise 2.1-3). 
How many elements of the input sequence need to be checked on the average, assuming that the element being searched for is equally likely to be any element in the array? 
How about in the worst case? What are the average-case and worst-case running times of linear search in $\Theta$-notation? Justify your answers.

<b>ANSWER:</b>

- Worst case is $\Theta(n)$.
- Average case is $\Theta(n)$.
- Best case is $\Theta(1)$.

Worst and Average case are the same, as they will have to run through the whole array in order to find the element.

$i*(1/n)$   and  $(n +1)/2$

## 4. Exercise 2.3-5 (page 39)
Referring back to the searching problem (see Exercise 2.1-3), observe that if the
sequence A is sorted, we can check the midpoint of the sequence against $v$ and
eliminate half of the sequence from further consideration. The ***binary search*** algorithm repeats this procedure, halving the size of the remaining portion of the
sequence each time. Write pseudocode, either iterative or recursive, for binary
search. Argue that the worst-case running time of binary search is $\Theta(\lg n)$.

<b>ANSWER:</b>

    binarysearch(A, n, T):
        L = 0
        R = n − 1
        while L <= R
            m = (L + R) / 2
            if A[m] < T
                L = m + 1
            else if A[m] > T
                R = m - 1
            else
                return m
        return unsuccessful

Worst case run time: $\Theta(\lg n)$
It is splitting the amount in half constantly until it finds(or doesn’t) the correct element. 
Which is why the worst case run time can be: ϴ(log n).

## 5. Exercise 2.3-6 (page 39)
Observe that the **while** loop of lines 5–7 of the INSERTION-SORT procedure in Section 2.1 uses a linear search to scan (backward) through the sorted subarray $A[1..j-1]$. Can we use a binary search (see Exercise 2.3-5) instead to improve the overall worst-case running time of insertion sort to $\Theta(n \lg n)$?

<b>ANSWER:</b>

## 6. Exercise 2.3-1 (page 37)
Using Figure 2.4 as a model, illustrate the operation of merge sort on the array $A = \langle 3,41,52,26,38,57,9,49\rangle$.

<b>ANSWER:</b>
    
    ??

## 7. Exercise 2.3-2 (page 37)
Rewrite the <span style="font-family:Rieux Minus;">MERGE</span> procedure so that it does not use sentinels, instead stopping once either array L or R has had all its elements copied back to A and then copying the remainder of the other array back into A.

<img src="images/Exercise 2.3-2.png" width="400" height="500" border="0"/>

<b>ANSWER:</b>
    
    ??

## 8. Exercise 2-4 (page 41, a, b, c)
Let AŒ1::n􏰀 be an array of n distinct numbers. If i < j and AŒi􏰀 > AŒj􏰀, then the pair .i; j / is called an inversion of A.


<b>ANSWER:</b>
    
    ??

## 9. Exercise 2.3-7 (page 39)
Describe a $\Theta(n \lg n)$-time algorithm that, given a set S of n integers and another integer x, determines whether or not there exist two elements in S whose sum is exactly x.

<b>ANSWER:</b>
    
    ??

<h1>Eksamenatorier II:</h1>


## 1. 

## 2. 
 
## 3. 

## 4. 

## 5. 

## 6. 