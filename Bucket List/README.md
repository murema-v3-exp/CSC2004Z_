# Question Two

This question concerns sorting words into categories where each category is defined by a string, _s_, and each word, _w_, placed in that category must begin with _s_. Given, for example, the categories 'a' and 'th', and the words
'apple', 'thing', 'art', 'thread', 'though', and 'oddball', sorting will place the words 'apple' and 'art' in category 'a' and the words 'thing',
'thread', and 'though' in category 'th'. The word 'oddball' cannot be sorted as there is no suitable category.

An overlap of categories is possible. That is, one string, _Si_, may be the beginning of another, _Sj_. A word must be placed in the category with the longest possible match. Given, for example, the categories 't', 'th', 'thr' and the words 'tart',
'thing', thread' and 'though', sorting will place the word 'tart' in category 't', the words 'thing' and 'though' in category 'th', and the word
'thread' in category 'thr'.

Write a program called __'BucketList.java'__ that accepts as input

1.  the name of a text file containing categories, one per line, and 
1.  a comma-separated list of words to categorise.

The program will output a list of the words in each category followed by a list of those words that could not be assigned to any.


#### Sample File (categories. txt'):
<code>t 
th
a
thr</code>

#### Sample I/O:
<code>Enter the name of the categories file:
categories.txt  
Enter a comma-separated list of words:
apple,pear,tart,thing,art,thread,though,coffee 
Categorised:
t: tart.
th: thing,though.
a: apple,art.
thr: thread.
Uncategorised: pear,coffee.
Done
</code>

#### Sample I/O:
<code>Enter the name of the categories file:
categories.txt
Enter a comma-separated list of words:
tart,thing,thread,though 
Categorised:
t: tart. 
th: thing,though.
a:
thr: thread.
Done</code>

The categories, and the words in each category are output in the same order as they were input.</br>
__HINT:__
- Consider using lists to store category strings and to store the words in a category. You might also consider using a Map to associate a category string with the words in that category.
- A java.util.Scanner object can be used to read a java.io. File.
- The String split() method or a java.util.Scanner object can be used to break up a line into parts.
- The String join() method can be used to produce a string from a list of strings.
- The String startsWith() method can be used to test whether one string starts with another.
NOTE:
- Your program may NOT read the contents of the categories text file more than once.</br>
END
