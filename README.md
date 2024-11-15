ReverseString Project
This project is a simple Java program designed to reverse a string, check if it is a palindrome, and count the number of vowels in the reversed string. The program is divided into three main features, each developed in its own branch and merged into the master branch.

Features
String Reversal:

The program accepts a user-inputted string and reverses it.
It includes an option to perform a case-sensitive or case-insensitive reversal.
Palindrome Check:

After reversing the string, the program checks if the original string is a palindrome.
This check is case-insensitive, meaning it will consider uppercase and lowercase letters as equal.
Vowel Counting in Reversed String:

The program counts the number of vowels (a, e, i, o, u) in the reversed string.
The count is case-insensitive, so both uppercase and lowercase vowels are included.
Usage Instructions
Run the Program:

Compile and run the StringReverser class:
javac StringReverser.java
java StringReverser
User Inputs:

Enter the string you want to reverse.
Choose whether the reversal should be case-sensitive. Type yes for case-insensitive or no for case-sensitive reversal.
Output:

The program will display:
The reversed string.
Whether the original string is a palindrome.
The number of vowels in the reversed string.
Example
Enter a string to reverse: Racecar
Do you want the reversal to be case insensitive? (yes/no): yes
Reversed String: racecar
The original string is a palindrome.
Number of vowels in the reversed string: 3
Branch Details
The project has been developed in the following branches:

feature-string-palindrome: Adds the functionality to check if the input string is a palindrome.
feature-case-sensitive: Adds an option for case-sensitive or case-insensitive reversal.
feature-count-vowels: Adds functionality to count vowels in the reversed string.
GitHub Workflow
Each feature was developed in its own branch and merged into the master branch via pull requests.
To demonstrate changes, commit messages, and merges, each feature has been implemented separately, pushed to GitHub, and documented in this README.