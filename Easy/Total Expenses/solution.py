# taking inputs and storing payments
testCases = int(input())
payments = []

for i in range(testCases):
	payment = int(input())
	if payment > 1000:
		payment -= payment / 10
	payments.append(payment)
	
# printing
for i in payments:
	print("%.2f" % i)
