# taking inputs
arraySize = int(input())
integers = input()

# creating integer array
array = [int(i) for i in integers.split()]

# printing
for i in range(arraySize):
	element = array[i]
	if (i % 2 == 1) and (element % 2 == 0):
		print(element, end = " ")
