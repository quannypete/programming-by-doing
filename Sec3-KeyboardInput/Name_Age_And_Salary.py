# Name, Age, and Salary
# http://programmingbydoing.com/a/name-age-and-salary.html
# Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then
# display that. Finally, ask them for how much they make and display that. You should use the most appropriate data
# type for each variable.

print "Hello. What is your name?"
name = raw_input()

print "Hi %r! How old are you?" % name
age = raw_input()

print """So you're %r, eh? That's not old at all!
How much do you make %r?""" % (age, name)
salary = raw_input()

print "%r! I hope that's per hour and not per year! LOL!" % salary
