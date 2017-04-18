# Dumb Calculator
# http://programmingbydoing.com/a/a-dumb-calculator.html
# Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and
# divide by 2. Display the result. Your program must support numbers with decimals and not just integers.

first_number = float(raw_input("What is your first number? "))
second_number = float(raw_input("What is your second number? "))
third_number = float(raw_input("What is your second number? "))
result = first_number + second_number + third_number / 2
print ""
print "(%r + %r + %r) / 2 is... %r" % (first_number, second_number, third_number, result)
