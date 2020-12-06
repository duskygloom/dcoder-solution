# taking inputs
numberWords = int( input() )
string = input()

# creating list of words
words = string.split()

# finding and printing Nemo
for i in range( numberWords ):
	if words[i] == "Nemo":
		print( i + 1 )
		break
