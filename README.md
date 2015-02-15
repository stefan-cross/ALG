Algorithmics Coursework 2015
============================

1 Introduction
--------------
The aim of this assignment is for you to demonstrate your understanding of algorithmics, as taught on the course.
The assignment consists of four parts: you should attempt to solve all four. Two sub-tasks are marked with a star (⋆), which indicates a higher level of difficulty—you may choose to work on the other questions first.
In general, support your answers with reasoned arguments. In partic- ular, even if the task takes the form of a polar question, a simple “yes” or “no” answer is not good enough. You have to justify your answer, for example, by providing an informal argument, a formal proof, or a counter-example.

2 Assignment 
============

2.1 Decision Trees
------------------
    a) Three elements, say, a1, a2, and a3, can be sorted using three comparisons.
    b) Can you sort three elements using only two comparisons?
    c) Draw the comparison tree for sorting four elements using the method of selection.
    

2.2 Comparison Networks
-----------------------
    (a) Can you construct a comparison network—not necessarily a sorting network—that maps the input a1 =0,a2 =1,a3 =0,a4 =1,a5 =1 to the out put b1 =1,b2 =0,b3 =1,b4 =0,b5 =1?
    (b) Figure 1 displays several comparison networks. Determine size and depth of each network.
    (c) Which networks are actually sorting networks? Justify your answer.
    (d)⋆Given a comparison network with n inputs, how would you approach the general problem of deciding whether the network is a sorting network? How difficult or complex is this decision problem? Think about possible certificates that testify whether a given network is a sorting network or not. In case you find it useful, assume that the input elements are either 0 or 1. (Does this assumption simplify the problem? Does it restrict the generality of your findings?)
    
2.3 Sorting Algorithms
----------------------
(a) Prof Bumstead has devised an ingenious new sorting algorithm, dis- played in Figure 2. Can you see how it works? How would you prove it correct?
(b)⋆Is Prof Bumstead’s sorting algorithm actually a good one? Try to estimate its running-time. Is the algorithm asymptotically optimal?

2.4 Priority Queues
-------------------
In the lectures we have discussed several implementations of priority queues: Braun heaps, leftist heaps, and binomial heaps. For none of these implementations we can construct a priority queue from a se- quence of n elements using less than Ω(nlogn) comparisons. Other- wise, we would be able to improve the Ω(n log n) bound for comparison- based sorting.
The situation is, however, different if the given sequence is already ordered. The English Wikipedia entry for leftist trees (see http://enwikipedia.org/wiki/Leftist_tree) suggest two possible approaches for “initializing height-biased leftist trees (HBLTs)”:
Initializing a height biased leftist tree is primarily done in one of two ways. The first is to merge each node one at a time into one HBLT. This process is inefficient and takes O(n log n) time. The other approach is to use a queue to store each node and resulting tree. The first two items in the queue are removed, merged, and placed back into the queue. This can initialize a HBLT in O(n) time.
Write a short essay of no more than 1000 words about the subject of constructing leftist heaps. Try to systematically apply the different algorithmic methods discussed in the lectures. Perhaps you can also think of other approaches? For each approach, discuss the workings of the algorithm, both informally and formally, and estimate its running- time. Support your arguments with diagrams, pictures, pseudo-code, or
program snippets (in the programming language of your choice) as you see fit.
Generally speaking, the goal is to improve the Wikipedia entry, both in terms of readability/comprehensibility and rigidity. (Of course, you should not change the actual entry before the submission deadline.)

3 Guidance
==========
You are explicitly encouraged to consult textbooks on algorithms and data structures. You may also be able to find (partial) solutions to the problems on the web. I recommend that you don’t use them, or at least, don’t rely on them: they are often of dubious quality. Whatever you do, do make sure you make clear the source and the extent of any derivative material.
Please structure your answer so that there is a cover sheet which contains only your name, the subject and date, and a note of the total number of pages. Do not put any answer material on the cover sheet; begin your answer on a fresh sheet (Page 1: cover page, Page 2: leave blank, Page 3: the answer starts here). Avoid putting your name on any page except the cover page. Please, do number the pages and sections.