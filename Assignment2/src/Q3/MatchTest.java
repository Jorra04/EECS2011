package Q3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;



class MatchTest {

@Test
void testExh1() {
int[] arr = new int[500];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
arr[5] = 60;
arr[6] = 70;
arr[7] = 80;
arr[8] = 90;
arr[9] = 100;
assertEquals(match.match_exh(arr, 10), -1);
}

@Test
void testDac1() {
int[] arr = new int[500];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
arr[5] = 60;
arr[6] = 70;
arr[7] = 80;
arr[8] = 90;
arr[9] = 100;

assertEquals(match.match_dac(arr, 10), -1);
}

@Test
void testExh2() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 4;
arr[6] = 5;
arr[7] = 6;
arr[8] = 7;
arr[9] = 8;

assertEquals(match.match_exh(arr, 10), -1);
}


@Test
void testDac2() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 4;
arr[6] = 5;
arr[7] = 6;
arr[8] = 7;
arr[9] = 8;
assertEquals(match.match_dac(arr, 10), -1);
}

@Test
void testExh3() {
int[] arr = new int[500];
arr[0] = 0;
arr[1] = 1;
arr[2] = 2;
arr[3] = 3;
arr[4] = 4;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_exh(arr, 10), 0);
}

@Test
void testDac3() {
int[] arr = new int[500];
arr[0] = 0;
arr[1] = 1;
arr[2] = 2;
arr[3] = 3;
arr[4] = 4;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_dac(arr, 10), 4);
}

@Test
void testExh4() {
int[] arr = new int[500];
arr[0] = -9;
arr[1] = -8;
arr[2] = -7;
arr[3] = -6;
arr[4] = -5;
arr[5] = -4;
arr[6] = -3;
arr[7] = 0;
arr[8] = 8;
arr[9] = 9;
assertEquals(match.match_exh(arr, 10), 8);
}

@Test
void testDac4() {
int[] arr = new int[500];
arr[0] = -9;
arr[1] = -8;
arr[2] = -7;
arr[3] = -6;
arr[4] = -5;
arr[5] = -4;
arr[6] = -3;
arr[7] = 0;
arr[8] = 8;
arr[9] = 9;
assertEquals(match.match_dac(arr, 10), 8);
}

@Test
void testExh5() {
int[] arr = new int[500];
arr[0] = -11;
arr[1] = -10;
arr[2] = 2;
arr[3] = 13;
arr[4] = 14;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_exh(arr, 10), 2);
}

@Test
void testDac5() {
int[] arr = new int[500];
arr[0] = -11;
arr[1] = -10;
arr[2] = 2;
arr[3] = 13;
arr[4] = 14;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_dac(arr, 10), 2);
}

@Test
void testExh6() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 5;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_exh(arr, 10), 5);
}

@Test
void testDac6() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 5;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
arr[9] = 19;
assertEquals(match.match_dac(arr, 10), 5);
}

@Test
void testExh7() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 4;
arr[6] = 5;
arr[7] = 6;
arr[8] = 8;
assertEquals(match.match_exh(arr, 9), 8);
}

@Test
void testDac7() {
int[] arr = new int[500];
arr[0] = -1;
arr[1] = 0;
arr[2] = 1;
arr[3] = 2;
arr[4] = 3;
arr[5] = 4;
arr[6] = 5;
arr[7] = 6;
arr[8] = 8;
assertEquals(match.match_dac(arr, 9), 8);
}

@Test
void testExh8() {
int[] arr = new int[500];
arr[0] = 0;
arr[1] = 11;
arr[2] = 12;
arr[3] = 13;
arr[4] = 14;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
assertEquals(match.match_exh(arr, 9), 0);
}

@Test
void testDac8() {
int[] arr = new int[500];
arr[0] = 0;
arr[1] = 11;
arr[2] = 12;
arr[3] = 13;
arr[4] = 14;
arr[5] = 15;
arr[6] = 16;
arr[7] = 17;
arr[8] = 18;
assertEquals(match.match_dac(arr, 9), 0);
}

@Test
void testExh9() {
int[] arr = new int[500];
arr[0] = -10;
arr[1] = -9;
arr[2] = -8;
arr[3] = -7;
arr[4] = -6;
arr[5] = -5;
arr[6] = -4;
arr[7] = -3;
arr[8] = 0;
arr[9] = 1;
arr[10] = 2;
arr[11] = 3;
arr[12] = 4;
arr[13] = 5;
arr[14] = 6;
arr[15] = 7;
arr[16] = 8;
arr[17] = 9;
arr[18] = 10;
arr[19] = 11;
arr[20] = 12;
arr[21] = 13;
arr[22] = 14;
arr[23] = 23;
assertEquals(match.match_exh(arr, 24), 23);
}

@Test
void testDac9() {
int[] arr = new int[500];
arr[0] = -10;
arr[1] = -9;
arr[2] = -8;
arr[3] = -7;
arr[4] = -6;
arr[5] = -5;
arr[6] = -4;
arr[7] = -3;
arr[8] = 0;
arr[9] = 1;
arr[10] = 2;
arr[11] = 3;
arr[12] = 4;
arr[13] = 5;
arr[14] = 6;
arr[15] = 7;
arr[16] = 8;
arr[17] = 9;
arr[18] = 10;
arr[19] = 11;
arr[20] = 12;
arr[21] = 13;
arr[22] = 14;
arr[23] = 23;
assertEquals(match.match_dac(arr, 24), 23);
}

@Test
void testExh10() {
int[] arr = new int[500];
Set<Integer> s1 =  new HashSet<>();
Random rand = new Random();

for(int i = 0; i < arr.length; i++) {
int nextInt = rand.nextInt(10000); //generates a random int betwwen 0 and 9,999
if(s1.add(nextInt) != false) {
s1.add(nextInt);
arr[i] = nextInt;
}
else {
while(s1.add(nextInt) == false) {
nextInt = rand.nextInt(10000);
}
s1.add(nextInt);
arr[i] = nextInt;
}
}

Arrays.sort(arr);

arr[46] = 46;

assertEquals(match.match_exh(arr, 500), 46);
}


@Test
void testDac10() {
int[] arr = new int[500];
Set<Integer> s1 =  new HashSet<>();
Random rand = new Random();

for(int i = 0; i < arr.length; i++) {
int nextInt = rand.nextInt(1000); //generates a random int betwwen 0 and 9,999
if(s1.add(nextInt) != false) {
s1.add(nextInt);
arr[i] = nextInt - 1000;
}
else {
while(s1.add(nextInt) == false) {
nextInt = rand.nextInt(1000);
}
s1.add(nextInt);
arr[i] = nextInt - 1000;
}
}

Arrays.sort(arr);

arr[499] = 499;

System.out.println(Arrays.toString(arr));

assertEquals(match.match_exh(arr, 500), 499);
}













}
