You are given a string 
S
S.

Q
Q number of operations are performed on string 
S
S.
In each of these 
Q
Q operations, you are given an index 
i
n
d
ind and a character 
c
h
ch. For each operation, you have to update character at index 
i
n
d
ind in string 
S
S to 
c
h
ch, that is, after this operation 
S
[
i
n
d
]
=
c
h
S[ind]=ch.
It is guaranteed that any index is updated atmost once.
We call the final string after performing 
Q
Q number of operations as 
s
t
r
str.

After this, 
M
M number of operations are performed on string 
s
t
r
str.
In each of these 
M
M operations, you are given two indices 
a
a and 
b
b. For each operation, you have to reverse the substring that lies between the indices 
a
a and 
b
b (inclusive). 
We call the final string after performing 
M
M operations as 
f
i
n
fin.

Example: If string is "xyz" and
one of the 
Q
Q operations is 
1
a
1a, then string "xyz" now becomes "ayz" as 
S
[
1
]
=
a
S[1]=a after the operation.
one of the 
M
M operations is 
1
3
13, then "ayz" now becomes "zya" as the substring lying between indices 
1
1 and 
3
3 is reversed.

You have to print string 
s
t
r
str, string 
f
i
n
fin and the number of indices which have same characters at them in both strings 
s
t
r
str and 
f
i
n
fin.

Input Format:
First line consists of string 
S
S.
Next line consists of an integer denoting 
Q
Q.
Following 
Q
Q lines contain two integers each: 
i
n
d
ind and 
c
h
ch.
Next line consists of an integer denoting 
M
M.
Following 
M
M lines contain two integers each: 
a
a and 
b
b.

Output Format:
In first line, print string 
s
t
r
str.
In second line, print string 
f
i
n
fin.
In third line, print the number of indices which have same characters at them in both strings 
s
t
r
str and 
f
i
n
fin.

Input Constraints:
1
≤
|
S
|
≤
10
2
1≤|S|≤102; 
|
S
|
|S| denotes length of string s. 
1
≤
Q
≤
|
S
|
1≤Q≤|S|
1
≤
M
≤
10
3
1≤M≤103
1
≤
i
n
d
≤
|
s
|
1≤ind≤|s|, all 
i
n
d
ind values are unique. 
1
≤
a
≤
b
≤
|
s
|
1≤a≤b≤|s|
c
h
ch will always be a lowercase English alphabet.
String 
S
S consists of lowercase English alphabets only.
All indices are 1 based.

SAMPLE INPUT 
helloworld
2
1 a
8 x
2
2 3
2 4
SAMPLE OUTPUT 
aellowoxld
alelowoxld
8
Explanation
Performing first Q (=2) operations: In first operation, S[1] = 'a', so string becomes "aelloworld"
In first operation, S[8] = 'x', so string becomes "aellowoxld"

After performing Q operations, the string becomes "aellowoxld".

We have to perform M(=2) operations on the string "aellowoxld".
In first operation, we have to reverse the string lying between indices 2 and 3, so the string now becomes "alelowoxld". ("el" now becomes "le")
Similarly in second operation, we reverse the string lying between indices 2 and 4, so the string becomes "alelowoxld". ("lel" on reversing remains the same)

String str= "aellowoxld"
String fin= "alelowoxld"
No of characters same in both of them = 8.
