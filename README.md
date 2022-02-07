# LearnItt
A website that helps students find tutoring for courses they are taking

This is a project that helps student find tutoring for the courses they are taking

Simple description of the website.
==================================
1. The system consists of 2 groups, the tutors and the students. 
2. Tutors provide hours per term and these hours are sold to the student.
3. Filing requests -> A student will file a requst for tutoring. The student can be tutored by a number of tutors as long as the student gets the total number of hours of tutoring they asked for.
4. This is a java based system.

Major components.
=================
1. Tutors
=========
People can register as tutor using UserID and the num of hours per term available. 
Each tutor can specify a list of topics they can tutor, with the hourly rate of each topic.

Tutor class has String UserID, and Int hours.
will also contain an instance of class course that will take the name of the course and the rate of that course.
Class course double rate and string name.

2. Student
==========
Class student with string UserId.

3.Requests
==========
ONLY registered students can make requsts. request will consist of a course and the number of hours
Class request will have String courseName , int hoursReq.


The Stock market System
=======================
The algorithm is as follows:
1. all tutors with AVAILABLE HRS and topic are considered
2. tutor with the lowest rate will be chosen, for as many hours as possible. CATCH (if several tutors have lowest price, tutors with MOST HRS to offer will be used. if a tie then tutor with the first userID in alphabetical order is used.
3. if more hrs are needed, next remaining tutor is selected for as many hrs using rule 2 . this is continued as long as the student needs hours.
4. Reqs will be successful or failed depending on the 3 rules above.

Commands
========
Prog will process a text file with commands.

1. Tutor [userID] [hours] eg; TUTOR Ali 5 confirmed or duplicate. dup is the same userId exists. dups ignored
2. STUDENT[userID] eg;  Student Vrushil Confirmed or duplicate
3. TOPIC [topic name] [tutor id] [price]
4. REQUEST [student id] [topic] [num hours]
5. STUDENTREPORT [student id]
6. TUTORREPORT [tutor id]
7. QUIT
8. COMMENTS
