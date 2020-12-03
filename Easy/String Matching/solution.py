# taking inputs
testCases = int( input() )
listInputs = []
for i in range( testCases ):
	listInputs.append( input().split() )

# checking and printing
for i in listInputs:
	if i[1] in i[0]:
		print("Yes")
	else:
		print("No")
