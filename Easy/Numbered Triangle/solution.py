# taking input
integer = int( input() )

# printing pattern
for i in range( integer ):
	for j in range( i + 1 ):
		if j == i:
			print( j + 1 )
		else:
			print( j + 1, end = " " )
