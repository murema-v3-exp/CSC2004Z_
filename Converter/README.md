# Question One [50 marks]

This question concerns computing the English language description for 12 hour clock times.

#### Examples:

__Time ln English__  
12:00  twelve o'clock  
1:10   ten past one  
12:35  twenty five to one  
3:15   quarter past three  
3:45   quarter to four  
5:30   half past five  

Commonly, when asked the time, unless the minutes are a multiple of 5, an English language speaker will round to the nearest five. Thus, for example, 2:12 would be described as 'about ten past two', and 7:53 would be described as 'about five to seven'.

Write a program called **'Converter.java'** that accepts times in [H]H:MM (12-hour) format as input, and that outputs the English language description.

#### Sample I/O:

<code>Enter a time or 'quit':
12:07
about five past twelve
Enter a time or 'quit': 
4:01
about four o'clock
Enter a time or 'quit':
8:00
eight o'clock
Enter a time or 'quit':
8:45
quarter to nine
Enter a time or 'quit':
9:31
about half past nine
Enter a time or 'quit'
9:41
about twenty to ten
Enter a time or 'quit':
9:50
ten to ten
Enter a time or 'quit':
10:30
half past ten
Enter a time or 'quit':
5:15
quarter past five
Enter a time or 'quit':
quit
Done</code>

__HINT:__  
- Consider using an array to store hour names('one','two','three'etc) and another array to store minute names ('five',ten','quarter'etc), such that, given a time, the hour and      minute values are used to compute the indices of the relevant names. 
- The expression 13%5 has the value 3 i.e. the remainder of dividing 13 by 5.
- The expression 13/5 has the value 2 i.e. the result of performing integer division of 13 by 5.
