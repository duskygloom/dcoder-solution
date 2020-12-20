# taking input
string = input()

# splitting substrings
substrings = string.split()

# creating list with no duplicates
uniqueList = []
for i in substrings:
	if i not in uniqueList:
		uniqueList.append(i)

# sorting based on frequency
length = len (uniqueList)
for i in range (1, length):
	j = i - 1
	while j >= 0 and substrings.count (uniqueList[j]) < substrings.count (uniqueList[j + 1]):
		uniqueList[j], uniqueList[j + 1] = uniqueList[j + 1], uniqueList[j]
		j -= 1
		
# printing
for i in uniqueList:
	print (i, end = " ")
