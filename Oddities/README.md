# Question One [50 marks]

Write a program called 'Oddities. java' that accepts as input the name of a text file containing dates, one per line. If a date is composed entirely of odd digits (I.e., ONLY contains the digits 1, 3, 5, 7, and 9) then it will print it out, if not, it will compute and print the first subsequent date that is, along with the number of days until then.

The date 1/1/1911, for example, is composed entirely of odd digits whereas the date 3/4/1912 is not. The first date after 3/4/1912 that is composed entirely of odd digits occurs 273 days later and is 1/1/1913.

#### Sample File ('dates.txt'): 
<code> 
1/1/1911
30/3/1919
30/9/1715
3/4/1912
2/1/1912
</code>

#### Sample I/O:
<code>
Enter the name of the text file of dates:
dates.txt
The date 1/1/1911 has all odd digits.
The first date after 30/3/1919 with all odd digits is 31/3/1919 which 1 day later.
The first date after 30/9/1715 with all odd digits is 1/11/1715 which 32 days later.
The first date after 3/4/1912 with all odd digits is 1/1/1913 which days later.
The first date after 2/1/1912 with all odd digits is 1/1/1913 which 365 days later.
Done
</code>
(User input in bold.)

Hint:
- There are 30 days in April, June, September and November.
- There are 31 days in January, March, May, July, August, October and December.
- February has 28 days except in a leap year when it has 29.
- A leap year is divisible by 400, or it is divisible by 4 but not 100.
