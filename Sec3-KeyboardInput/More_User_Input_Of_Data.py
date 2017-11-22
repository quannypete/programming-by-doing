print "Please enter the following information so I can sell it for profit!"

first_name = raw_input("First name: ")
last_name = raw_input("Last name: ")
grade = raw_input("Grade (9-12): ")
student_id = raw_input("Student ID: ")
login = raw_input("Login: ")
gpa = raw_input("GPA (0.0-4.0): ")

print "Your information:"
print "Login: %r" % login
print "ID: %r" % student_id
print "Name: %s, %s" % (first_name, last_name)
print "GPA: %r" % gpa
print "Grade: %r" % grade
