# taking inputs
arraySize = int( input() )
integers = input()

# creating list of integers
array = integers.split()

# checking for integers
allNaturalNumbers = True
for i in array:
	if int(i) < 1:
		allNaturalNumbers = False
		break
	
# printing
if allNaturalNumbers:
	print( "Yes" )
else:
	print( "No" )
