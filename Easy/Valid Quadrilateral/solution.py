# taking inputs
testCases = int(input())
outputs = []

for i in range(testCases):
	
	# splitting integers
	SUM = 0
	angles = input().split()
	
	# storing outputs
	for j in angles:
		SUM += int(j)
	if SUM == 360:
		outputs.append("YES")
	else:
		outputs.append("NO")
		
# printing
for i in outputs:
	print(i)
