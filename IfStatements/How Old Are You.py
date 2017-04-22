# How Old Are You?
# http://programmingbydoing.com/a/how-old-are-you.html
# Make a program which displays a different message depending on the age given. Here are the possible responses:
# - age is less than 16, say "You can't drive."
# - age is less than 18, say "You can't vote."
# - age is less than 25, say "You can't rent a car."
# - age is 25 or over, say "You can do anything that's legal."

name = raw_input("Hey, what's your name? ")
print ""
print "Ok, %r, how old are you? " % name
age = raw_input()
print ""
if age < "16":
    print "You can't drive, %s." % name
if age < "18":
    print "You can't vote, %s." % name
if age < "25":
    print "You can't rent a car, %s." % name
if age >= "25":
    print "You can do anything that's legal, %s." % name
