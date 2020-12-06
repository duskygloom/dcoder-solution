# taking inputs
numberElements = int( input() )
elements = input()

# creating array
array = elements.split()

# sum of elements and max number
sumElements = 0
maxElement = 0
for i in array:
	num = int(i)
	sumElements += num
	if num > maxElement:
		maxElement = num

# printing remainder
print( sumElements % maxElement )
