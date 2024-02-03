# Question Two [50 marks]

A 'critter' has a 'genetic code' represented by a string of up to 10 letters. When one critter ‘mates’ with another, a single offspring is produced. The offspring’s genetic code is a mix of its parents’. How the code is formed depends on which of the parents initiated mating.

Given a critter **C1** with code **G1** that initiates mating with critter **C2** with code **G2**, the offspring’s genetic code Go is formed from the first letter of **G1** followed by the first letter of **G2** followed by the second letter of G1 followed by the second letter of **G2**, and so on.

If the codes **G1** and **G2** are not the same length, after the last letter of the shorter code is reached, the remaining letters of the longer code are appended.

The process ends when the new code **G0** is 10 letters long or all the letters of **G1** and **G2** have been used.

For example, given critter C1, with code 'asde', initiating mating with critter C2, with code 'defg', the offspring’s code is 'a'+'d'+'s'+'e'+'d'+'f'+'e'+'g'
i.e. 'adsedfeg'.

If critter C2 had initiated mating, then the offspring’s code would have been 'daesfdge'!

Another example, given critter C3, with code 'fasdeqy', initiating mating with critter C4, with code 'kalg', the offspring’s code is 'f'+'k'+'a'+'a'+'s'+'l'+'d'+'g'+'eq' i.e. 'fkaasldgeg'. The letter 'y' from C3’s code is discarded.

Write a program call '**Population.java'** that accepts as input the name of a file containing the codes for an initial population of critters and information on matings. The program will process the contents, printing out details of the final population.

#### Sample file ('critters.txt'):

<code>5
frde
jmi
hseia
eliang
inaor
4
1 4
2 5
4 1
4 7</code>

The first line gives the size, _N_, of the initial population. The following _N_ lines give the genetic codes for those critters. The next line gives the number, _M_, of matings. The following _M_ lines list matings, one per line, consisting of the identities of two critters, a and b, where a is the one that initiates the encounter.

The file lists 5 critters and 4 matings. Critter number 1 has code 'frde', critter number 2 has code 'jmi', critter number 3 has code 'hseia', critter number 4 has code 'eliang', and critter number 5 has code 'inaor'. Critter 1 mates with 4, 2 with 5, 4 with 1, and 4 with 7 (the critter born of 2 mating with 5)

Given a population of N critters, the next critter born is number N+1.

#### Sample I/O:

<code>Enter the file name:
critters.txt
[frde]
[jmi]
[hseia]
[eliang]
[inaor]
[ferldieang]
[jimniaor]
[eflridaeng]
[ejliimanni]</code>

END
