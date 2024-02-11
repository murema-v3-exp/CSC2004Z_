# Question Two

This question concerns comparing a set of cards as part of a card game.

- A card has three attributes: a shape (square or circle or triangle), a colour (blue or red or green) and a pattern (spot or solid or stripe).
- Two cards are distinct if they do not have the same shape or colour or pattern i.e. none of their attributes match.
- Two cards are the same if they have the same shape and colour and pattern i.e. all their attributes match.
- A set of three cards is valid if it consists of (i) three distinct cards,or (ii) three of the same card.

Write a program called 'Check.java' that accepts as input a text file where each line describes a set of cards. The program will determine whether each set is or is not valid.

A line of the text file consists of three card descriptions. Adjacent descriptions are separated by a space. A description consists of three attribute values (shape then colour then pattern), with adjacent values separated by a comma.

#### Sample File ('cards.txt'):

<code>square,blue,spot circle,red,solid triangle,green,stripe
square,blue,spot circle,red,solid triangle,green,solid
square,blue,spot square,blue,spot square,blue,spot
square,blue,spot square,blue,spot triangle,green,stripe</code>

#### Sample I/O:

<code>Enter the name of the cards file: **cards.txt**
Processing: square,blue,spot circle,red,solid triangle,green,stripe
Valid
Processing: square,blue,spot circle,red,solid triangle,green,solid
Invalid
Processing: square,blue,spot square,blue,spot square,blue,spot
Valid
Processing: square,blue,spot square,blue,spot triangle,green,stripe
Invalid
Done</code>

(User input is in bold.)
