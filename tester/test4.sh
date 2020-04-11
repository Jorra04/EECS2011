#!/bin/bash
echo "Removing All result#.txt files..."
rm -f result*

javac test1.java
java test1.java > result1.txt
echo "==================================TEST1================================="
res1=$(diff result1.txt SolutionTest1.txt)

if [ -z "$res1" ]
then
	echo "TEST 1 HAS PASSED"
else
	echo "TEST 1 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest1.txt
	echo "GOT:"
	cat result1.txt
fi
echo "========================END OF TEST1===================================="

javac test2.java
java test2 > result2.txt
echo "==================================TEST2================================="
res1=$(diff result2.txt SolutionTest2.txt)

if [ -z "$res1" ]
then
	echo "TEST 2 HAS PASSED"
else
	echo "TEST 2 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest2.txt
	echo "GOT:"
	cat result2.txt
fi
echo "========================END OF TEST2===================================="

javac test3.java
java test3 > result3.txt
echo "==================================TEST3================================="
res1=$(diff result3.txt SolutionTest3.txt)

if [ -z "$res1" ]
then
	echo "TEST 3 HAS PASSED"
else
	echo "TEST 3 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest3.txt
	echo "GOT:"
	cat result3.txt
fi
echo "========================END OF TEST3===================================="

javac test4.java
java test4 > result4.txt
echo "==================================TEST4================================="
res1=$(diff result4.txt SolutionTest4.txt)

if [ -z "$res1" ]
then
	echo "TEST 4 HAS PASSED"
else
	echo "TEST 4 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest4.txt
	echo "GOT:"
	cat result4.txt
fi
echo "========================END OF TEST4===================================="

javac test5.java
java test5 > result5.txt
echo "==================================TEST5================================="
res1=$(diff result5.txt SolutionTest5.txt)

if [ -z "$res1" ]
then
	echo "TEST 5 HAS PASSED"
else
	echo "TEST 5 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest5.txt
	echo "GOT:"
	cat result5.txt
fi
echo "========================END OF TEST5===================================="

javac test6.java
java test6 > result6.txt
echo "==================================TEST6================================="
res1=$(diff result6.txt SolutionTest6.txt)

if [ -z "$res1" ]
then
	echo "TEST 6 HAS PASSED"
else
	echo "TEST 6 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest6.txt
	echo "GOT:"
	cat result6.txt
fi
echo "========================END OF TEST6===================================="

javac test7.java
java test7 > result7.txt
echo "==================================TEST7================================="
res1=$(diff result7.txt SolutionTest7.txt)

if [ -z "$res1" ]
then
	echo "TEST 7 HAS PASSED"
else
	echo "TEST 7 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest7.txt
	echo "GOT:"
	cat result7.txt
fi
echo "========================END OF TEST7===================================="

javac test8.java
java test8 > result8.txt
echo "==================================TEST8================================="
res1=$(diff result8.txt SolutionTest8.txt)

if [ -z "$res1" ]
then
	echo "TEST 8 HAS PASSED"
else
	echo "TEST 8 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest8.txt
	echo "GOT:"
	cat result8.txt
fi
echo "========================END OF TEST8===================================="

javac test9.java
java test9 > result9.txt
echo "==================================TEST9================================="
res1=$(diff result9.txt SolutionTest9.txt)

if [ -z "$res1" ]
then
	echo "TEST 9 HAS PASSED"
else
	echo "TEST 9 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest9.txt
	echo "GOT:"
	cat result9.txt
fi
echo "========================END OF TEST9===================================="

javac test10.java
java test10 > result10.txt
echo "==================================TEST10================================="
res1=$(diff result10.txt SolutionTest10.txt)

if [ -z "$res1" ]
then
	echo "TEST 10 HAS PASSED"
else
	echo "TEST 10 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest10.txt
	echo "GOT:"
	cat result10.txt
fi
echo "========================END OF TEST10===================================="

javac test11.java
java test11 > result11.txt
echo "==================================TEST11================================="
res1=$(diff result11.txt SolutionTest11.txt)

if [ -z "$res1" ]
then
	echo "TEST 11 HAS PASSED"
else
	echo "TEST 11 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest11.txt
	echo "GOT:"
	cat result11.txt
fi
echo "========================END OF TEST11===================================="

javac test12.java
java test12 > result12.txt
echo "==================================TEST1================================="
res1=$(diff result12.txt SolutionTest12.txt)

if [ -z "$res1" ]
then
	echo "TEST 12 HAS PASSED"
else
	echo "TEST 12 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest12.txt
	echo "GOT:"
	cat result12.txt
fi
echo "========================END OF TEST12===================================="

javac test13.java
java test13 > result13.txt
echo "==================================TEST1================================="
res1=$(diff result13.txt SolutionTest13.txt)

if [ -z "$res1" ]
then
	echo "TEST 13 HAS PASSED"
else
	echo "TEST 13 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest13.txt
	echo "GOT:"
	cat result13.txt
fi
echo "========================END OF TEST13===================================="

javac test14.java
java test14 > result14.txt
echo "==================================TEST14================================="
res1=$(diff result14.txt SolutionTest14.txt)

if [ -z "$res1" ]
then
	echo "TEST 14 HAS PASSED"
else
	echo "TEST 14 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest14.txt
	echo "GOT:"
	cat result14.txt
fi
echo "========================END OF TEST14===================================="

javac test15.java
java test15 > result15.txt
echo "==================================TEST1================================="
res1=$(diff result15.txt SolutionTest15.txt)

if [ -z "$res1" ]
then
	echo "TEST 15 HAS PASSED"
else
	echo "TEST 15 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest15.txt
	echo "GOT:"
	cat result15.txt
fi
echo "========================END OF TEST15===================================="

javac test16.java
java test16 > result16.txt
echo "==================================TEST1================================="
res1=$(diff result16.txt SolutionTest16.txt)

if [ -z "$res1" ]
then
	echo "TEST 16 HAS PASSED"
else
	echo "TEST 16 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest16.txt
	echo "GOT:"
	cat result16.txt
fi
echo "========================END OF TEST16==================================="

javac test18.java
java test18 > result18.txt
echo "==================================TEST18================================="
res1=$(diff result18.txt SolutionTest18.txt)

if [ -z "$res1" ]
then
	echo "TEST 18 HAS PASSED"
else
	echo "TEST 18 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest18.txt
	echo "GOT:"
	cat result18.txt
fi
echo "========================END OF TEST18===================================="

javac test19.java
java test19 > result19.txt
echo "==================================TEST19================================="
res1=$(diff result19.txt SolutionTest19.txt)

if [ -z "$res1" ]
then
	echo "TEST 19 HAS PASSED"
else
	echo "TEST 19 HAS FAILIED"
	echo "EXPECTED"
	cat SolutionTest19.txt
	echo "GOT:"
	cat result19.txt
fi
echo "========================END OF TEST19===================================="


javac testProgram.java
java testProgram > result20.txt
echo "==================================TESTING testProgram.java================================="
res1=$(diff result20.txt testProgram.out)

if [ -z "$res1" ]
then
	echo "TEST TESTPROGRAM HAS PASSED"
else
	echo "TEST TESTPROGRAM HAS FAILIED"
	echo "EXPECTED"
	cat testProgram.out
	echo "GOT:"
	cat result20.txt
fi
echo "========================END OF TEST testProgram.java===================================="
