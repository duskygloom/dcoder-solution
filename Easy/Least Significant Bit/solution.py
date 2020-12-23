# taking inputs
testCases = int(input())
outputs = []

for i in range(testCases):
	integer = int(input())
	
	# storing outputs
	if integer % 2 == 1:
		outputs.append("Yes")
	else:
		outputs.append("No")
		
# printing
for i in outputs:
	print(i)
