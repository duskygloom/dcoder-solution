# taking inputs
arraySize = int(input())
elements = input()

# splitting elements
array = [int(i) for i in elements.split()]

# counting difference
highestDifference = max(array) - min(array)
		
# printing
print(highestDifference)
