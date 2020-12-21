# taking inputs and storing sum
testCases = int(input())
results = []

for i in range(testCases):
	number = input()
	result = int(number[0]) + int(number[-1])
	results.append(result)
	
# printing
for i in results:
	print(i)
