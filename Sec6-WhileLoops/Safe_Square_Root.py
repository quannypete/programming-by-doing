import math

print("SQUARE ROOT!")
input_number = input("Enter a number: ")
number = int(input_number)

while number < 0:
    print("You can't take the square root of a negative number, silly.")
    number = int(input("Try again: "))

print("The square root of " + str(number) + " is " + str(math.sqrt(number)) +".")
