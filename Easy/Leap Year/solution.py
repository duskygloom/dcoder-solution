# taking inputs
testCases = int( input() )
years = []
for i in range( testCases ):
	years.append( int( input() ) )

# checking and printing
for i in years:
	if i % 4 != 0:
		print("No")
	else:
		if i % 100 == 0 and i % 400 != 0:
			print("No")
		else:
			print("Yes")
