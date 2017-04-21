# BMI Calculator
# http://programmingbydoing.com/a/bmi-calculator.html
# The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in
# populations.
# It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height
# in meters.

height = float(raw_input("Your height in m: "))
weight = float(raw_input("Your weight in kg: "))

BMI = weight / height ** 2

print "Your BMI is %s" % BMI
