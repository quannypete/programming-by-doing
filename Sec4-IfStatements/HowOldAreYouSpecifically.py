# How Old Are You, Specifically?
# http://programmingbydoing.com/a/how-old-are-you-elseif.html
# Using if statements, else if, and else statements, make a program which displays a different message depending on the age given.
# - age less than 16, say "You can't drive."
# - age between 16 to 17, say "You can drive but not vote."
# - age between 18 to 24, say "You can vote but not rent a car."
# - age 25 or older, say "You can do pretty much anything."
# Note that unlike the original "How Old Are You" assignment, this program must only display exactly one message for a given age and not multiple messages.
# You can make up your own messages if you want, but you must have at least four messages, and you must use else if statements to make sure only one of the messages is printed for any given age.

name = raw_input("Hey, what's your name? ")
print ""
print "Ok, %r, how old are you? " % name
age = raw_input()
print ""
if age < "16":
    print "You can't drive, %s." % name
elif age <"18":
    print "You can drive but not vote, %s" % name
elif age < "25":
    print "You can vote but not rent a car, %s." % name
else:
    print "You can do anything that's legal, %s." % name
