# taking inputs
testCases = int( input() )
strings = []
for i in range( testCases ):
	strings.append( input() )
	
# printing
for i in strings:
	print( i.upper() )
