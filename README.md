# codingbat.com-String-3-Harder-String-Problem

# gHappy
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' 
immediately to its left or right. Return true if all the g's in the given string are happy.

	gHappy("xxggxx") 	-- true
	
	gHappy("xxgxx") 	-- false
	
	gHappy("xxggyygxx") 	-- false
	
# withoutString		
Given two strings, base and remove, return a version of the base string 
where all instances of the remove string have been removed (not case sensitive). 
You may assume that the remove string is length 1 or more. 
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

	withoutString("Hello there", "llo") -- "He there"
	
	withoutString("Hello there", "e") -- "Hllo thr"
	
	withoutString("Hello there", "x") -- "Hello there"	
	
	
# countYZ	
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, 
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not 
an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

	countYZ("fez day") 		-- 2
	
	countYZ("day fez") 		-- 2
	
	countYZ("day fyyyz") 		-- 2
	
# sumDigits	
Given a string, return the sum of the digits 0-9 that appear in the string, 
ignoring all other characters. Return 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
Integer.parseInt(string) converts a string to an int.)

	sumDigits("aa1bc2d3") 	-- 6
	
	sumDigits("aa11b33") 	-- 8
	
	sumDigits("Chocolate") 	-- 0
	
# notReplace
Given a string, return a string where every appearance of the lowercase word "is" has 
been replaced with "is not". The word "is" should not be immediately preceeded 
or followed by a letter -- so for example the "is" in "this" does not count. 
(Note: Character.isLetter(char) tests if a char is a letter.)

	notReplace("is test") 		-- "is not test"
	
	notReplace("is-is") 		-- "is not-is not"
	
	notReplace("This is right") 	-- "This is not right"
	
	
	
	
	
