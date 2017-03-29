# Your Schedule
# http://programmingbydoing.com/a/your-schedule.html
 # Use several variables to store the names of your classes and their teachers. Then, display a nice little table
 # displaying your schedule. Just FYI, my column of courses has a width of 26 characters, and the teacher column has
 # a width of 15. The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.
 # Your table doesn't need to look exactly like this, or even line up. I used a total of sixteen variables (course1,
 # course2, ... course8, teacher1, teacher2, etc.). You should do the same.

course1 = "English"
course2 = "Calculus"
course3 = "US History"
course4 = "Biology"
course5 = "Team sports"
course6 = "Intro to computing"
teacher1 = "Mr. Wayne"
teacher2 = "Mrs. Greene"
teacher3 = "Ms. Poltridge"
teacher4 = "Ms. Tinson"
teacher5 = "Mr. Graham"
teacher6 = "TBA"

print "+------------------------------------------------------+"
print "| 1 |                 %s     |      %s     |" % (course1, teacher1)
print "| 2 |                %s     |    %s     |" % (course2, teacher2)
print "| 3 |              %s     |  %s     |" % (course3, teacher3)
print "| 4 |                 %s     |     %s     |" % (course4, teacher4)
print "| 5 |             %s     |     %s     |" % (course5, teacher5)
print "| 6 |      %s     |            %s     |" % (course6, teacher6)
print "+------------------------------------------------------+"
