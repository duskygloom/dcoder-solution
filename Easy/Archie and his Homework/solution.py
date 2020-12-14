# taking input
integers = input()

# splitting numerator and denominator
integers = integers.split()
numerator = int( integers[0] )
denominator = int( integers[1] )

# calculation
divisor = 2
while divisor <= numerator:
	if numerator % divisor == 0 and denominator % divisor == 0:
		numerator //= divisor
		denominator //= divisor
	else:
		divisor += 1
		
# printing
print( numerator, denominator )
