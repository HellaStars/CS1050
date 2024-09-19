
public class csnotes2 {

	public static void main(String[] args) {
		

	}

}
/*
int small = integer.MAX_VALUE; (MIN)

binary search tree - fastest 
	-data ordered 
	-keep track of game objects using key values
	-search solution space
stacks
	-stores states of the game
	- menues and sub-menues
	-current menue always on top of the stack
queues - fifo
	-real time stratagies
	-move to one place
	-when that's finished, move to another
	-command queing 
quicksort and radix for large amounts of data
pathfinding 
	-based on graphs
	-directions
physics
	-sim physics
	-sim colllisions (ray tracing!)
data comp
	-gpus are faster than cpus


buffered reader takes in all the information 

2 types of exceptions- unchecked and checked
try is catched in the cache block
adt is an abstract data type is mathmatical model for a data type

adt
seperate the specification (what it is, what opperations) from the immplimentation 
generalization 
public or external
	view of the object, 
	how users can op on or using the adt
	private
	
adt can int add data access data remove data anything else
this is a "CRUD"
set 
mutator
get
JUST FUCKING OBJECTS JESUS CRIST
	
lists are zero or more of elements of any given type (established)
first(L) return the first value
END(L) last
insert(x,p,L) x value p is pos, L is array 
locate(x,L) find an position 
retriev(p,L) retrieve info
delete(p,L) deletes the element at the pos
next(p,L) and previous(p,l) looks at the next and preciding positions
makenull(L) remove all elements
arrays are objects pog
UML  notation 
graphically starting to design what you're doing so you can see how things fit together

adt bag 
	a finate collection of objects in no order
	can dupe
	an interface
	
<> is an interface abstraction
list is generic

concrete class your everyday database class. 
can be subclass
all its method implemented

sigleton class
only one object at a time 
often used to control access to resources (sockets)

pojo class - plain old java
all var privare
public setter and getter
controctor not required (defult)

inner class aka nested class

stacks can push and pop only to the top of the stack
array or linked list are 2 ways to imp
	clients don't know what's goin gon
	implimintation does not need a lot of detials
	creates a modular libary
an undo

struct stack:
	maxsize : int // max size of stack
	top :int
	items : array of items // 
	
procedure int (stk : stack, size, : int):
	stk.items
	stk.maxsize
	stk.top
	
peak looks at the top
empty asks if the top is zero
size is the amount of elements

java.util.Stack
search(object o);

link list is a data struct where elements are not stored in configured mem locations
elements = node
node consists of 2 datas, one field that has tje data, and one that tracks next
head 1 is a mem lovation that is the mem adress of the node

in arrays you can insert
you have to match the link int, so to instert you need the before to point to the next and the new next to point to the old next
eor xor
bic is "and NOT"
<< is the java form for logical left shift it's how we do 2^x 
lsl is a thing you can add to an instruction 
asr shifts it to the right but keeps the sign

rocket car may be a hybrid. Unknown

linked list

calss node (
int data  as complex
Node next; - mem adress of next int 
copy rear
make a new node read = new node (new object

B label
mov e1,#5
add re,r1,r1
b target
add r3,r2,r1 -- wont do this
target:
sub r3,r2,r1
*/