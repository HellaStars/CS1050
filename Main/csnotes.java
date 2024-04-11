package CSNOTES;
import java.util.*;
public class csnotes {

	public static void main(String[] args) {
		float a = 9.1;
		int b = 12;
			b = a;
		System.out.print(b);
}}
//veriables are a named data type stored in memory
//all int is 32 bit
//xor only outputs if only one pin is at high
//if statements or while needs xor
//short stop if a is true, we don't care about b
//that second clause is not even thought
// short stop = || logical or is |
//binary logic:
// AND: if there are two bytes are the same, it outputs a 1. otherwise 0
//ADD: casecase the two bits. If there are two ones being put
//togther, place a 0 and put the one in the next place
// OR: as long as theres a 1 in the two strings it stays there
//(so like, if 1010 and 0101 were added it would be 1111. or 1100 or 1010 would be 1110)
//return 0 if it's true, 1 if false. but like fuck that
//constants are uppercase
//a sign bit shows if it is neg or positive. 0 is positive, 1 is neg
// all flaoting point is ieee 754
//and can be used to combine floating points and decimal
//boolean is one bit for one word. wasting space

//quad formula step by step
// input all of the veriables (a,b,c)
//int a = int b = int c = (need to figure out user input)
//set that a and b != 0
//if a = 0 return;
//square the value b
//put that result into a new veriable d (you can't replace b due to it being needed later)
//multiply -4 by c 
//input result into c (c is never needed again after)
//miltiply c by a.
//input result into c
//add veriable d and c
//input result back into c 
//square root c
//make two outputs. (one for negitive, one for positive)
//multiply a by 2
//have that replace a (not needed after)
//devide c by a

//subject name put 1050
//not on canvas
//don't make assumptions about things 

// 1*x=x or gates x goes through unless there's a one or an x'
//(A+B)(A+C)
//A+A*C+B*A+B*C
//X+X'=1
//(x*y)' -> x' + y' or the other way around
// if there are two high's together just mix em

//double != 1 = 1.0
//Math.random < 0.5;

// read speeds are slow mostly due to how much information can be stored in L2 cache, and other caches lol
// caches are also just a buffer?
// memory mapped IO. Kinda a pain in the ass lol
// IO ports. You can use ports to allow access to various systems. It can have dedicated instructions on 
// what the processors should do
// harvard approach allows 2 separate paths for data buses, and instruction buses
// os manages the data from the IO and the outputs infomation back if needed
// data travels over as 1 and 0. High electrisity and low
// java.io  and java.nio (newio)
// theyre just short cuts on programming things lol. which is obvious
// print writer, working on and converts it to a format, then displays it to your console
// System.in reads the bytes and converts it into data. next() advances that buffer
// a wrapper takes that infomation provided and convert it into something it can use
// scanner (obj) = new Scanner (System.in) <- wrapper
// dataType veriable = new geometry(wrapper); 
// nextInt (method)

// while and for statements
// if (a == 3) sop "v1: 1 is three"
// if ((a == 3) && (b == 4)) (make sure to make a inner set)
// %d is for int while %f is for floating 
//%[flags][width][.precision]conversion
// %20f "20" refers to how many spaces it's allowed to have
//%,20f results in , being placed for places
//int a = 4; int is data, a is veriable and the space is assiengment op, 4 is the value
//iscotre = score/10
//switch(iscore){
// case (number):
// statement (grade = A)
// break; to get out of the switch
//case can also be "default"
// ++ increeases by 1 -- decreases

// logic takes input and gives output based on state
// logic that takes some sort of input and has some sort of logic to do something with the data. It relies on cahnge over time to store data. 
//This can be read and outputed with data
//latch flip flop a sequential circut stores 1 bit of memory, breaking the repeat cycle allows new input
// rs flip flop (rs latch) nor gate criss cross. set gate nutralizes the reset gate, the reset gate nutralizes the set gate
//global control, for any sequantial logic. the singal could be and gated to enable. It will always ensure the output is the data. Otherwise it's Qn-1 (basically whatever d was last)
// D flip flop Q only samples D on the falling edge
//reason we use d flipflops is because it allows you to update q with presise timing 
//arrow up is controlled
//a register is a group of d flipflops. 
//shift registers shoft the data down stream to hold onto more info?

// how to take user input and encrypt it, a method. 
//public is a modifier. void is a return type
//args means arguements
// static is special, it's a class. She's a classy bitch :)
// risc has an easier pipeline
// mips made in stanford 
//pipeline can run more than one computers
// assembly is human readable
// binary isn't lol 


// data menipulation (add, subtract, mult, shift ect)
// data staging, register and memory
// control, conditional branches in program (if, and, or, etc )

//mips add a(desination), b (loc), c (loc)
//physical location of data is called 
// lw $s0 5($t1) (write value $s0 to $t1 offset 5

//public string 
// multcontract(string x, int n){
//string a = "";
// for (int i=0;i<n,i++)
//a=a+x

//Scanner is a class
// java.utiil is a package, many many classes into a blob. A library
// in an object oriented programming langueage you create programs made of objects. In soft ware an object has two capabilities
//an object can store data, or can proform operations.
// object veriables is a adress pointer
// garbage collector once it get the stack is full