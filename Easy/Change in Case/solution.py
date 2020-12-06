# taking inputs
length = int( input() )
string = input()
indicesString = input()

# generating indices
indices = [ int(i) for i in indices.split() ]

# generating string
toPrint = ""
for i in range( length ):
	if i in indices:
		toPrint += string[i].swapcase()
	else:
		toPrint += string[i]

# printing string
print( toPrint )
