print "Hello. What is your name?"
name = raw_input()

print "Hi %r! How old are you?" % name
age = raw_input()

print """So you're %r, eh? That's not old at all!
How much do you make %r?""" % (age, name)
salary = raw_input()

print "%r! I hope that's per hour and not per year! LOL!" % salary
