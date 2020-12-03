N = int( input() ) # number of elements
A = input() # taking the elements
array = A.split() # creating array

for i in range( N-1, -1, -1 ):
	print( array[i], end = ' ') # printing N elements in reverse order
