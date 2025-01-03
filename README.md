Let’s say the input string is "Hello" and the key is 3.

For 'H' (uppercase):

ASCII value of 'H' = 72.

Apply the formula: (72 + 3 - 65 + 26) % 26 + 65 = (72 + 3 - 65 + 26) % 26 + 65 = 80 % 26 + 65 = 4 + 65 = 72, which is 'K'.

For 'e' (lowercase):
ASCII value of 'e' = 101.

Apply the formula: (101 + 3 - 97 + 26) % 26 + 97 = (101 + 3 - 97 + 26) % 26 + 97 = 33 % 26 + 97 = 7 + 97 = 104, which is 'h'.

For 'l' (lowercase):

ASCII value of 'l' = 108.

Apply the formula: (108 + 3 - 97 + 26) % 26 + 97 = (108 + 3 - 97 + 26) % 26 + 97 = 40 % 26 + 97 = 14 + 97 = 111, which is 'o'.

For 'o' (lowercase):

ASCII value of 'o' = 111.

Apply the formula: (111 + 3 - 97 + 26) % 26 + 97 = (111 + 3 - 97 + 26) % 26 + 97 = 43 % 26 + 97 = 17 + 97 = 114, which is 'r'.

So, the output for the string "Hello" with a key of 3 would be "Khoor".

In Summary:
The logic inside the if and else if conditions works by:

Shifting the character in the alphabet (either uppercase or lowercase).
Wrapping around the alphabet if the shift exceeds 'Z' (for uppercase) or 'z' (for lowercase).
Ensuring non-alphabetic characters are unchanged.
