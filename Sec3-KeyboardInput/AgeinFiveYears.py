 # Age in Five Years
 # http://programmingbydoing.com/a/age-in-five-years.html
 # Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then
 # display what their age would be five years from now. Then display what their age would be five years ago.

print "Hello. What is your name? "
name = raw_input()
print ""
print "Hi %s! How old are you? " % name
age = int(raw_input())
print " "
print "Did you know in five years you will be %r years old" % (age + 5)
print "And five years ago you were %r! Imagine that!" % (age - 5)
