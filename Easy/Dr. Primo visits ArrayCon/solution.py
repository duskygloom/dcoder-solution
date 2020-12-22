# function to detect primes
def isPrime(integer):
	if integer == 1:
		return False
	for i in range(2, integer):
		if integer % i == 0:
			return False
	return True

# taking inputs
arraySize = int(input())
elements = input()

# getting integer array
integers = [int(i) for i in elements.split()]

# searching for primes
numberPrimes = 0
for i in integers:
	if isPrime(i):
		numberPrimes += 1
		
# printing
print(numberPrimes)
