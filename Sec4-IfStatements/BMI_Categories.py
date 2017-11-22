# BMI Categories
# http://programmingbydoing.com/a/bmi-calculator.html
# Start with the BMI Calculator you wrote previously (BMICalc.py). Then use some if statements to show the category for a given BMI.
# BMI	            category
# less than 18.5	underweight
# 18.5 to 24.9	    normal weigh
# 25.0 to 29.9	    overweight
# 30.0 or more	    obese

height = float(input("Your height in m: "))
weight = float(input("Your weight in kg: "))
BMI = weight / height ** 2
print ("Your BMI is %s" % BMI)

if BMI < 18.5:
    print("BMI Category: under weight")

elif BMI >= 18.5 and BMI <= 24.9:
    print("BMI Category: normal weight")

elif BMI >= 25.0 and BMI <= 29.9:
    print("BMI Category: overweight")

else:
    print("BMI Category: obese")
