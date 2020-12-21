# taking inputs and storing results
testCases = int(input())
results = []

for i in range(testCases):
	marks = input()
	array = [int(i) for i in marks.split()]
	if (array[0] > 70) and (array[1] > 50):
		results.append("Pass")
	else:
		results.append("Fail")
		
# printing
for i in results:
	print(i)
