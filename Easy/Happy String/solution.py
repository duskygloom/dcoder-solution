# taking input
userInput = int( input() )

# printing
alphabets = "abcdefghijklmnopqrstuvwxyz"
print( alphabets[ userInput - 1 :: -1 ] )