"""
Please note that something is wrong with the concept I used.
I mean I can't find any logical error, but dcoder seems to have problem with this code.
Please mention if you find any flaw.
"""

# taking inputs
testCases = int( input() )
answers = []
for i in range( testCases ):
	numbers = input()
	numbers = numbers.split()
	firstNumber = int( numbers[0] )
	secondNumber = int( numbers[1] )
	
	# calculating
	multiplier = 1
	while True:
		if ( firstNumber * multiplier ) % secondNumber == 0:
			answers.append( multiplier )
			break
		else:
			multiplier += 1
		
# printing answers
for i in answers:
	print(i)
