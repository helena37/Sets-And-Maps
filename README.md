# Sets-And-Maps
Java Advance SoftUni 2019 - Lab + Exercises

Lab: Sets and Maps Advanced
This document defines the lab for "Java Advanced" course @ Software University. Please submit your solutions (source code) of all below described problems in Judge.
I.	Sets
1.	Parking Lot
Write program that:
•	Record car number for every car that enter in parking lot
•	Remove car number when the car go out
•	Input will be string in format [direction, carNumber]
•	input end with string "END"
Print the output with all car numbers which are in parking lot 
Examples
Input	Output
IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
IN, CA9999TT
IN, CA2866HI
OUT, CA1234TA
IN, CA2844AA
OUT, CA2866HI
IN, CA9876HH
IN, CA2822UU
END	CA2822UU
CA2844AA
CA9999TT
CA9876HH
IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
OUT, CA1234TA
END	Parking Lot is Empty
Hints
•	Car numbers are unique
•	Use the methods isEmpty()
2.	SoftUni Party
There is a party in SoftUni. Many guests are invited and they are two types: VIP and regular. When guest come check if he/she exist in any of two reservation lists.
All reservation numbers will be with 8 chars.
All VIP numbers start with digit.
There will be 2 command lines. First is "PARTY" - party is on and guests start coming.
Second is "END" – then party is over and no more guest will come.
Output shows all guests, who didn't come to the party (VIP must be first).
Examples
Input	Output	Input	Output
7IK9Yo0h
9NoBUajQ
Ce8vwPmE
SVQXQCbc
tSzE5t0p
PARTY
9NoBUajQ
Ce8vwPmE
SVQXQCbc
END	2
7IK9Yo0h
tSzE5t0p	m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
xys2FYzn
MDzcM9ZK
PARTY
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
END	2
MDzcM9ZK
xys2FYzn
3.	"Voina" - Number game
Write program that:
•	Read 20 numbers for both players
•	Numbers will be Integer, separated with " " (single space).
•	Every player can hold only unique numbers 
•	Each Round both players get the top number from their own deck. Player with the bigger number get both numbers and add it on the bottom of his own sequence
•	Game ends after 50 rounds or if any player lose all of his numbers
•	Output must be "First Player Win!", "Second Player Win!" or "Draw!"
Examples
Input	Output
26 58 16 92 44 65 65 77 57 23 71 57 7 52 85 44 32 70 38 23
43 95 33 51 62 93 57 55 0 31 32 95 68 34 30 51 37 32 11 97	Second player win!
74 78 82 42 19 39 29 69 20 42 31 77 57 36 76 26 4 9 83 42
15 43 80 71 22 88 78 35 28 30 46 41 76 51 76 18 14 52 47 38	First player win!
Hints
•	Use Iterator<E> and next() for finding top number in decks
•	Think where to check if any player is without cards
•	When you find top number, be sure to remove it immediately 
Solution
You might help yourself with the code below:
 
II.	Maps
4.	Count Real Numbers
Write a program that counts the occurrence of real numbers. The input is a single line with real numbers separated by spaces. Print the numbers in the order of appearance. All numbers must be formatted to one digit after the decimal point.
Examples
Input	Output
-2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3
	-2.5 -> 3
4.0 -> 2
3.0 -> 4
-5.5 -> 1
2.3 4.5 4.5 5.5 5.5 2.3 3.0 3.0 4.5 4.5 3.0 3.0 4.0 3.0 5.5 3.0 2.3 5.5 4.5 3.0	2.3 -> 3
4.5 -> 5
5.5 -> 4
3.0 -> 7
4.0 -> 1
 
5.	Average Students Grades
Write a program, which reads the name of a student and their grades and adds them to the student record, then prints grades along with their average grade – ordered the output by the names of the students.
Input
On the first line N – the number of students, then on the next N lines student name with grade.
Examples
Input	Output
7
Ivancho 5.20
Mariika 5.50
Ivancho 3.20
Mariika 2.50
Stamat 2.00
Mariika 3.46
Stamat 3.00	Ivancho -> 5.20 3.20 (avg: 4.20)
Mariika -> 5.50 2.50 3.46 (avg: 3.82)
Stamat -> 2.00 3.00 (avg: 2.50)
4
Vladimir 4.50
Petko 3.00
Vladimir 5.00
Petko 3.66	Petko -> 3.00 3.66 (avg: 3.33)
Vladimir -> 4.50 5.00 (avg: 4.75)
5
Gosho 6.00
Gosho 5.50
Gosho 6.00
Ivan 4.40
Petko 3.30	Gosho -> 6.00 5.50 6.00 (avg: 5.83)
Ivan -> 4.40 (avg: 4.40)
Petko -> 3.30 (avg: 3.30)
Hints
•	Use a TreeMap (String  ArrayList<Double>) 
•	Check if the name exists before adding the grade. If it doesn’t, add it to the map.
•	Pass through all key-value pairs in the map and print the results. 
•	Think of way to get the average grades for each student.
-	You can do that with an ordinary loop or with Stream API
6.	Product Shop
Write a program that prints information about food shops in Sofia and the products they store. Until the "Revision" command you will receive an input in the format: "{shop}, {product}, {price}"
Take in mind that if you receive a shop you already have received, you must collect its product information.
Your output must be ordered by shop name and must be in the format:
{shop}->
Product: {product}, Price: {price}
The price should be formated to one digit after the decimal point.
Examples
Input	Output
lidl, juice, 2.30
fantastico, apple, 1.20
kaufland, banana, 1.10
fantastico, grape, 2.20
Revision	fantastico->
Product: apple, Price: 1.2
Product: grape, Price: 2.2
kaufland->
Product: banana, Price: 1.1
lidl->
Product: juice, Price: 2.3
tmarket, peanuts, 2.20
GoGrill, meatballs, 3.30
GoGrill, HotDog, 1.40
tmarket, sweets, 2.20
Revision	GoGrill->
Product: meatballs, Price: 3.3
Product: HotDog, Price: 1.4
tmarket->
Product: peanuts, Price: 2.2
Product: sweets, Price: 2.2
7.	Cities by Continent and Country
Write a program to read continents, countries and their cities, put them in a nested map and print them in the order of first appearance.
Examples
Input	Output
9
Europe Bulgaria Sofia
Asia China Beijing
Asia Japan Tokyo
Europe Poland Warsaw
Europe Germany Berlin
Europe Poland Poznan
Europe Bulgaria Plovdiv
Africa Nigeria Abuja
Asia China Shanghai	Europe:
  Bulgaria -> Sofia, Plovdiv
  Poland -> Warsaw, Poznan
  Germany -> Berlin
Asia:
  China -> Beijing, Shanghai
  Japan -> Tokyo
Africa:
  Nigeria -> Abuja
3
Europe Germany Berlin
Europe Bulgaria Varna
Africa Egypt Cairo	Europe:
  Germany -> Berlin
  Bulgaria -> Varna
Africa:
  Egypt -> Cairo
8
Africa Somalia Mogadishu
Asia India Mumbai
Asia India Delhi
Europe France Paris
Asia India Nagpur
Europe Germany Hamburg
Europe Poland Gdansk
Europe Germany Danzig	Africa:
  Somalia -> Mogadishu
Asia:
  India -> Mumbai, Delhi, Nagpur
Europe:
  France -> Paris
  Germany -> Hamburg, Danzig
  Poland -> Gdansk
Hints
•	Use a nested Map (String  (Map ArrayList<String>)) 
•	Check if the continent exists before adding the country. If it doesn’t, add it to the dictionary.
•	Check if the country exists, before adding the city. If it doesn’t, add it to the dictionary.
 
•	Pass through all key-value pairs in the Map and the values’ key-value pairs and print the results.
8.	Academy Graduation
Write a program that:
•	Read from console number of students for a track
•	Read on pair of rows:
o	First line is the name of student
o	Second line is his score for different number of courses
•	Print on console “{name} is graduated with {average scores)”
Examples
Input	Output
3
Gosho
3.75 5
Mara
4.25 6
Pesho
6 4.5	Gosho is graduated with 4.375
Mara is graduated with 5.125
Pesho is graduated with 5.25
5
Gruio
4.36 5.50 3.30 5.63 2.57 5.75 2.81 4.89 
Trendafilka
3.10 5.35 3.30 3.35 5.64 4.99 2.75 4.68 
Mite
3.45 3.23 3.03 5.42 5.46 4.15 2.26 5.95 
Roza
2.08 3.48 3.36 2.73 2.96 4.54 3.70 3.85
Ganio
4.75 4.92 3.78 4.79 4.82 4.75 2.81 2.13	Ganio is graduated with 4.09375
Gruio is graduated with 4.351249999999999
Mite is graduated with 4.11875
Roza is graduated with 3.3375
Trendafilka is graduated with 4.145
Hints
•	Think about proper type of map
•	Value can be array
•	Nested loop and one more variable will be need for average score
Solution
You might help yourself with the code below:
 


Exercises: Sets and Maps Advanced
This document defines the exercises for "Java Advanced" course @ Software University. Please submit your solutions (source code) of all below described problems in Judge.
Problem 1.	Unique Usernames
Write a simple program that reads from the console a sequence of usernames and keeps a collection with only the unique ones. Print the collection on the console in order of insertion:
Examples
Input	Output
6
Ivan
Ivan
Ivan
SemoMastikata
Ivan
Hubaviq1234	Ivan
SemoMastikata
Hubaviq1234
10
Pesho
Mara
Pesho
Gosho
Stamat
Mara
Sashka
Pesho
Stamat
Gosho	Pesho
Mara
Gosho
Stamat
Sashka
Problem 2.	Sets of Elements
On the first line you are given the length of two sets n and m. On the next n + m lines there are n numbers that are in the first set and m numbers that are in the second one. Find all non-repeating element that appears in both of them, and print them in same order at the console:
Set with length n = 4: {1, 3, 5, 7}
Set with length m = 3: {3, 4, 5}
Set that contains all repeating elements -> {3, 5}
Examples
Input	Output
4 3
1
3
5
7
3
4
5	3 5
2 2
1
3
1
5	1
Problem 3.	Periodic Table
You are given an n number of chemical compounds. You need to keep track of all chemical elements used in the compounds and at the end print all unique ones in ascending order:
Examples
Input	Output
4
Ce O
Mo O Ce
Ee
Mo	Ce Ee Mo O
3
Ge Ch O Ne
Nb Mo Tc
O Ne	Ch Ge Mo Nb Ne O Tc
Problem 4.	Count Symbols
Write a program that reads some text from the console and counts the occurrences of each character in it. Print the results in alphabetical (lexicographical) order. 
Examples
Input	Output
SoftUni rocks	 : 1 time/s
S: 1 time/s
U: 1 time/s
c: 1 time/s
f: 1 time/s
i: 1 time/s
k: 1 time/s
n: 1 time/s
o: 2 time/s
r: 1 time/s
s: 1 time/s
t: 1 time/s
Did you know Math.Round rounds to the nearest even integer?	 : 9 time/s
.: 1 time/s
?: 1 time/s
D: 1 time/s
M: 1 time/s
R: 1 time/s
a: 2 time/s
d: 3 time/s
e: 7 time/s
g: 1 time/s
h: 2 time/s
i: 2 time/s
k: 1 time/s
n: 6 time/s
o: 5 time/s
r: 3 time/s
s: 2 time/s
t: 5 time/s
u: 3 time/s
v: 1 time/s
w: 1 time/s
y: 1 time/s
Problem 5.	Phonebook
Write a program that receives some info from the console about people and their phone numbers.
You are free to choose the manner in which the data is entered; each entry should have just one name and one number (both of them strings). If you receive a name that already exists in the phonebook, simply update its number.
After filling this simple phonebook, upon receiving the command "search", your program should be able to perform a search of a contact by name and print her details in format "{name} -> {number}". In case the contact isn't found, print "Contact {name} does not exist." Examples:
Examples
Input	Output
Nakov-0888080808
search
Mariika
Nakov
stop	Contact Mariika does not exist.
Nakov -> 0888080808
Nakov-+359888001122
RoYaL(Ivan)-666
Gero-5559393
Simo-02/987665544
search
Simo
simo
RoYaL
RoYaL(Ivan)
stop	Simo -> 02/987665544
Contact simo does not exist.
Contact RoYaL does not exist.
RoYaL(Ivan) -> 666
Problem 6.	A Miner Task
You are given a sequence of strings, each on a new line. Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, and so on) , and every even – quantity. Your task is to collect the resources and print them each on a new line. 
Print the resources and their quantities in format:
{resource} –> {quantity}
The quantities inputs will be in the range [1 … 2 000 000 000]
Examples
Input	Output
Gold
155
Silver
10
Copper
17
stop	Gold -> 155
Silver -> 10
Copper -> 17
Problem 7.	Fix Emails
You are given a sequence of strings, each on a new line, unitll you receive “stop” command. First string is a name of a person. On the second line you receive his email. Your task is to collect their names and emails, and remove emails whose domain ends with "us", "uk" or “com” (case insensitive). Print:
{name} – > {email} 
Examples
Input	Output
Ivan
ivanivan@abv.bg
Petar Ivanov
petartudjarov@abv.bg
Mike Tyson
myke@gmail.us
stop	Ivan -> ivanivan@abv.bg
Petar Ivanov -> petartudjarov@abv.bg
Ivan
ivanivan@gmail.com
Petar Ivanov
petartudjarov@yahoo.com
Mike Tyson
myke@abv.bg
stop	Mike Tyson -> myke@abv.bg
Problem 8.	Hands Of Cards
You are given a sequence of people and for every person what cards he draws from the deck. The input will be separate lines in the format:
{personName}: {PT, PT, PT,… PT}
Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of the card and T (S, H, D, C) is the type. The input ends when a "JOKER" is drawn. The name can contain any ASCII symbol except ':'. The input will always be valid and in the format described, there is no need to check it.
A single person cannot have more than one card with the same power and type, if he draws such a card he discards it. The people are playing with multiple decks. Each card has a value that is calculated by the power multiplied by the type. Powers 2 to 10 have the same value and J to A are 11 to 14. Types are mapped to multipliers the following way (S -> 4, H-> 3, D -> 2, C -> 1).
Finally print out the total value each player has in his hand in the format:
{personName}: {value}
Examples
Input	Output
Pesho: 2C, 4H, 9H, AS, QS
Slav: 3H, 10S, JC, KD, 5S, 10S
Peshoslav: QH, QC, QS, QD
Slav: 6H, 7S, KC, KD, 5S, 10C
Peshoslav: QH, QC, JS, JD, JC
Pesho: JD, JD, JD, JD, JD, JD
JOKER	Pesho: 167
Slav: 175
Peshoslav: 197
Problem 9.	* User Logs
Marian is a famous system administrator. The person to overcome the security of his servers has not yet been born. However, there is a new type of threat where users flood the server with messages and are hard to be detected since they change their IP address all the time. Well, Marian is a system administrator and is not so into programming. Therefore, he needs a skillful programmer to track the user logs of his servers. You are the chosen one to help him!
You are given an input in the format:
IP=(IP.Address) message=(A&sample&message) user=(username)
Your task is to parse the IP and the username from the input and for every user, you have to display every IP from which the corresponding user has sent a message and the count of the messages sent with the corresponding IP. In the output, the usernames must be sorted alphabetically while their IP addresses should be displayed in the order of their first appearance. The output should be in the following format:
username: 
IP => count, IP => count.
For example, given the following input - IP=192.23.30.40 message='Hello&derps.' user=destroyer, you have to get the username destroyer and the IP 192.23.30.40 and display it in the following format:
destroyer: 
192.23.30.40 => 1.
The username destroyer has sent a message from IP 192.23.30.40 once.
Check the examples below. They will further clarify the assignment.
Input
The input comes from the console as varying number of lines. You have to parse every command until the command that follows is end. The input will be in the format displayed above, there is no need to check it explicitly.
Output
For every user found, you have to display each log in the format:
username: 
IP => count, IP => count…
The IP addresses must be split with a comma, and each line of IP addresses must end with a dot.
Constraints
•	The number of commands will be in the range [1..50]
•	The IP addresses will be in the format of either IPv4 or IPv6.
•	The messages will be in the format: This&is&a&message
•	The username will be a string with length in the range [3..50]
•	Time limit: 0.3 sec. Memory limit: 16 MB.

Examples
Input	Output
IP=192.23.30.40 message='Hello&derps.' user=destroyer
IP=192.23.30.41 message='Hello&yall.' user=destroyer
IP=192.23.30.40 message='Hello&hi.' user=destroyer
IP=192.23.30.42 message='Hello&Dudes.' user=destroyer
end	destroyer: 
192.23.30.40 => 2, 192.23.30.41 => 1, 192.23.30.42 => 1.
IP=FE80:0000:0000:0000:0202:B3FF:FE1E:8329 message='Hey&son' user=mother
IP=192.23.33.40 message='Hi&mom!' user=child0
IP=192.23.30.40 message='Hi&from&me&too' user=child1
IP=192.23.30.42 message='spam' user=destroyer
IP=192.23.30.42 message='spam' user=destroyer
IP=192.23.50.40 message='' user=yetAnotherUsername
IP=192.23.50.40 message='comment' user=yetAnotherUsername
IP=192.23.155.40 message='Hello.' user=unknown
end	child0: 
192.23.33.40 => 1.
child1: 
192.23.30.40 => 1.
destroyer: 
192.23.30.42 => 2.
mother: 
FE80:0000:0000:0000:0202:B3FF:FE1E:8329 => 1.
unknown: 
192.23.155.40 => 1.
yetAnotherUsername: 
192.23.50.40 => 2.
Problem 10.	* Population Counter
So many people! It’s hard to count them all. But that’s your job as a statistician. You get raw data for a given city and you need to aggregate it. 
On each input line you’ll be given data in format: "city|country|population". There will be no redundant whitespaces anywhere in the input. Aggregate the data by country and by city and print it on the console. For each country, print its total population and on separate lines the data for each of its cities. Countries should be ordered by their total population in descending order and within each country, the cities should be ordered by the same criterion. If two countries/cities have the same population, keep them in the order in which they were entered. Check out the examples; follow the output format strictly!
Input
•	The input data should be read from the console.
•	It consists of a variable number of lines and ends when the command "report" is received.
•	The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
•	The output should be printed on the console.
•	Print the aggregated data for each country and city in the format shown below.
Constraints
•	The name of the city, country and the population count will be separated from each other by a pipe ('|').
•	The number of input lines will be in the range [2 … 50].
•	A city-country pair will not be repeated.
•	The population count of each city will be an integer in the range [0 … 2 000 000 000].
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
Examples
Input	Output
Sofia|Bulgaria|1000000
report	Bulgaria (total population: 1000000)
=>Sofia: 1000000
Sofia|Bulgaria|1
Veliko Tarnovo|Bulgaria|2
London|UK|4
Rome|Italy|3
report	UK (total population: 4)
=>London: 4
Bulgaria (total population: 3)
=>Veliko Tarnovo: 2
=>Sofia: 1
Italy (total population: 3)
=>Rome: 3

Problem 11.	* Logs Aggregator
You are given a sequence of access logs in format <IP> <user> <duration>. For example:
•	192.168.0.11 peter 33
•	10.10.17.33 alex 12
•	10.10.17.35 peter 30
•	10.10.17.34 peter 120
•	10.10.17.34 peter 120
•	212.50.118.81 alex 46
•	212.50.118.81 alex 4
Write a program to aggregate the logs data and print for each user the total duration of his sessions and a list of unique IP addresses in format "<user>: <duration> [<IP1>, <IP2>, …]". Order the users alphabetically. Order the IPs alphabetically. In our example, the output should be the following:
•	alex: 62 [10.10.17.33, 212.50.118.81]
•	peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]
Input
The input comes from the console. At the first line a number n stays which says how many log lines will follow. Each of the next n lines holds a log information in format <IP> <user> <duration>. The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
Print one line for each user (order users alphabetically). For each user print its sum of durations and all of his sessions' IPs, ordered alphabetically in format <user>: <duration> [<IP1>, <IP2>, …]. Remove any duplicated values in the IP addresses and order them alphabetically (like we order strings).
Constraints
•	The count of the order lines n is in the range [1…1000].
•	The <IP> is a standard IP address in format a.b.c.d where a, b, c and d are integers in the range [0…255].
•	The <user> consists of only of Latin characters, with length of [1…20].
•	The <duration> is an integer number in the range [1…1000].
•	Time limit: 0.3 sec. Memory limit: 16 MB.
Examples
Input	Output
7
192.168.0.11 peter 33
10.10.17.33 alex 12
10.10.17.35 peter 30
10.10.17.34 peter 120
10.10.17.34 peter 120
212.50.118.81 alex 46
212.50.118.81 alex 4	alex: 62 [10.10.17.33, 212.50.118.81]
peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]
2
84.238.140.178 nakov 25
84.238.140.178 nakov 35	nakov: 60 [84.238.140.178]
Problem 12.	* Legendary Farming
You’ve beaten all the content and the last thing left to accomplish is own a legendary item. However, it’s a tedious process and requires quite a bit of farming. Anyway, you are not too pretentious – any legendary will do. The possible items are:
•	Shadowmourne – requires 250 Shards;
•	Valanyr – requires 250 Fragments;
•	Dragonwrath – requires 250 Motes;
Shards, Fragments and Motes are the key materials, all else is junk. You will be given lines of input, such as 
2 motes 3 ores 15 stones. Keep track of the key materials - the first that reaches the 250 mark wins the race. At that point, print the corresponding legendary obtained. Then, print the remaining shards, fragments, motes, ordered by quantity in descending order, each on a new line. Finally, print the collected junk items, in alphabetical order.
Input
•	Each line of input is in format {quantity} {material} {quantity} {material} … {quantity} {material}
Output
•	On the first line, print the obtained item in format {Legendary item} obtained!
•	On the next three lines, print the remaining key materials in descending order by quantity
o	If two key materials have the same quantity, print them in alphabetical order
•	On the final several lines, print the junk items in alphabetical order
o	All materials are printed in format {material}: {quantity}
o	All output should be lowercase, except the first letter of the legendary
Constraints
•	The quantity-material pairs are between 1 and 25 per line.
•	The number of lines is in range [1..10]
•	All materials are case-insensitive.
•	Allowed working time: 0.25s
•	Allowed memory: 16 MB
Examples
Input	Output
3 Motes 5 stones 5 Shards
6 leathers 255 fragments 7 Shards	Valanyr obtained!
fragments: 5
shards: 5
motes: 3
leathers: 6
stones: 5
123 silver 6 shards 8 shards 5 motes
9 fangs 75 motes 103 MOTES 8 Shards
86 Motes 7 stones 19 silver	Dragonwrath obtained!
shards: 22
motes: 19
fragments: 0
fangs: 9
silver: 123


Problem 13.	** Сръбско Unleashed
Admit it – the СРЪБСКО is your favorite sort of music. You never miss a concert and you have become quite the geek concerning everything involved with СРЪБСКО. You can’t decide between all the singers you know who your favorite one is. One way to find out is to keep a statistics of how much money their concerts make. Write a program that does all the boring calculations for you.
On each input line you’ll be given data in format: "singer @venue ticketsPrice ticketsCount". There will be no redundant whitespaces anywhere in the input. Aggregate the data by venue and by singer. For each venue, print the singer and the total amount of money his/her concerts have made on a separate line. Venues should be kept in the same order they were entered, the singers should be sorted by how much money they have made in descending order. If two singers have made the same amount of money, keep them in the order in which they were entered. 
Keep in mind that if a line is in incorrect format, it should be skipped and its data should not be added to the output. Each of the four tokens must be separated by a space, everything else is invalid. The venue should be denoted with @ in front of it, such as @Sunny Beach
SKIP THOSE: Ceca@Belgrade125 12378, Ceca @Belgrade12312 123
The singer and town name may consist of one to three words. 
Input
•	The input data should be read from the console.
•	It consists of a variable number of lines and ends when the command “End" is received.
•	The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
•	The output should be printed on the console.
•	Print the aggregated data for each venue and singer in the format shown below.
•	Format for singer lines is #{2*space}{singer}{space}->{space}{total money}
Constraints
•	The number of input lines will be in the range [2 … 50].
•	The ticket price will be an integer in the range [0 … 200].
•	The ticket count will be an integer in the range [0 … 100 000]
•	Singers and venues are case sensitive
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
Examples
Input	Output
Lepa Brena @Sunny Beach 25 3500
Dragana @Sunny Beach 23 3500
Ceca @Sunny Beach 28 3500
Mile Kitic @Sunny Beach 21 3500
Ceca @Sunny Beach 35 3500
Ceca @Sunny Beach 70 15000
Saban Saolic @Sunny Beach 120 35000
End	Sunny Beach
#  Saban Saolic -> 4200000
#  Ceca -> 1270500
#  Lepa Brena -> 87500
#  Dragana -> 80500
#  Mile Kitic -> 73500
Lepa Brena @Sunny Beach 25 3500
Dragana@Belgrade23 3500
Ceca @Sunny Beach 28 3500
Mile Kitic @Sunny Beach 21 3500
Ceca @Belgrade 35 3500
Ceca @Sunny Beach 70 15000
Saban Saolic @Sunny Beach 120 35000
End	Sunny Beach
#  Saban Saolic -> 4200000
#  Ceca -> 1148000
#  Lepa Brena -> 87500
#  Mile Kitic -> 73500
Belgrade
#  Ceca -> 122500
Problem 14.	*** Dragon Army
Heroes III is the best game ever. Everyone loves it and everyone plays it all the time. Stamat is no exclusion to this rule. His favorite units in the game are all types of dragons – black, red, gold, azure etc… He likes them so much that he gives them names and keeps logs of their stats: damage, health and armor. The process of aggregating all the data is quite tedious, so he would like to have a program doing it. Since he is no programmer, it’s your task to help him
You need to categorize dragons by their type. For each dragon, identified by name, keep information about his stats. Type is preserved as in the order of input, but dragons are sorted alphabetically by name. For each type, you should also print the average damage, health and armor of the dragons. For each dragon, print his own stats. 
There may be missing stats in the input, though. If a stat is missing you should assign it default values. Default values are as follows: health 250, damage 45, and armor 10. Missing stat will be marked by null.
The input is in the following format {type} {name} {damage} {health} {armor}. Any of the integers may be assigned null value. See the examples below for better understanding of your task.
If the same dragon is added a second time, the new stats should overwrite the previous ones. Two dragons are considered equal if they match by both name and type.
Input
•	On the first line, you are given number N -> the number of dragons to follow
•	On the next N lines you are given input in the above described format. There will be single space separating each element.
Output
•	Print the aggregated data on the console
•	For each type, print average stats of its dragons in format {Type}::({damage}/{health}/{armor})
•	Damage, health and armor should be rounded to two digits after the decimal separator
•	For each dragon, print its stats in format -{Name} -> damage: {damage}, health: {health}, armor: {armor}
Constraints
•	N is in range [1…100]
•	The dragon type and name are one word only, starting with capital letter.
•	Damage health and armor are integers in range [0 … 100000] or null
Examples
Input	Output
5
Red Bazgargal 100 2500 25
Black Dargonax 200 3500 18
Red Obsidion 220 2200 35
Blue Kerizsa 60 2100 20
Blue Algordox 65 1800 50	Red::(160.00/2350.00/30.00)
-Bazgargal -> damage: 100, health: 2500, armor: 25
-Obsidion -> damage: 220, health: 2200, armor: 35
Black::(200.00/3500.00/18.00)
-Dargonax -> damage: 200, health: 3500, armor: 18
Blue::(62.50/1950.00/35.00)
-Algordox -> damage: 65, health: 1800, armor: 50
-Kerizsa -> damage: 60, health: 2100, armor: 20
4
Gold Zzazx null 1000 10
Gold Traxx 500 null 0
Gold Xaarxx 250 1000 null
Gold Ardrax 100 1055 50	Gold::(223.75/826.25/17.50)
-Ardrax -> damage: 100, health: 1055, armor: 50
-Traxx -> damage: 500, health: 250, armor: 0
-Xaarxx -> damage: 250, health: 1000, armor: 10
-Zzazx -> damage: 45, health: 1000, armor: 10

