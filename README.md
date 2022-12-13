# DigitCounter

#1 When building search engines it is common to invert a text document. Write a simple java console program that inverts the declaration of independence. 
1.1 The program must print the first 100 most common words in the declaration of independence and their occurrence count.
1.2 The program must exclude the follow common words "of", "the", "to", "and","for".
1.2 The program must print in csv format with the count first.
Hint below is the first 4 lines of output.
26 , our
20 , has
20 , their
19 , he
#2 Write a simple java console program that counts the occurrence of a digit in a number series.
2.1 The program will accept 3 command line arguments.
2.1.1 The first argument is the start of the number series. The caller must supply a number or the program will end with an error.
2.1.2 The second argument is the end of the number series. The caller must supply a number or the program will end with an error.
2.1.3 The last argument  is a comma delimited list of digits. Each digit must be a number greater than 0 and less than 10.
2.2 The program will output the number of occurrence or each digit in the series.
For example if the java class is named DigitCounter
java DigitCounter 1 35 3,5
Output: 
3 occurs 5 times
5 occurs 4 times.
Why?
3 has one 3, 13 has one 3, 23 has one 3, 33 has two 3s
1 + 1 + 1 +2 = 5
5 has one 5, 15 has one 5, 25 has one 5, 35 has one 5
1 + 1 + 1 +1 = 4
java DigitCounter 7 77 7
Output:
7 occurs 9 times
7 has one 7, 17 has one 7 … (full serries omitted for brevity) … 67 has one 7, 77 has 2 7s.
