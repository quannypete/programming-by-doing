name = raw_input("Hey, what's your name? ")
print ""
print "Ok, %r, how old are you? " % name
age = raw_input()
print ""
if age < "16":
    print "You can't drive, %s." % name
elif age < "18":
    print "You can't vote, %s." % name
elif age < "25":
    print "You can't rent a car, %s." % name
elif age >= "25":
    print "You can do anything that's legal, %s." % name
