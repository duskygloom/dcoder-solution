# taking inputs
testCases = int( input() )
answers = []
for i in range( testCases ):
	numberDigits = int( input() )
	integers = input()
	
	# sorting
	integers = integers.split()
	integers.sort( reverse = True )
	answers.append( "".join( integers ) )

# printing answers
for i in answers:
	print(i)
