/*class NewThread implements Runnable {
    public void run() {
        System.out.println("JAVA");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);
        thread.start();
        
        System.out.println("OOPS");
    }
}*/

class Quiz
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
1. In Java 8 or later versions, it is possible for an interface method to provide a body rather than being abstract.

2. In Java 8 or later versions, it is possible for an interface to have instance variables.

3. In Java 8 or later versions, it is possible to create an instance of an interface by itself.


Select one:

a. 3 only is correct

O b. 1, 2, and 3 are correct

c. 1 only is correct

d. 1, and 2 only are correct




User
1. If you write a variable which may next be read by another thread or you are reading a vanable which may have been last written
by another thread, synchronization must be used.
 2. notifyAll is a safer option than notify
3.A thread releases the lock after calling the wit method
4.join() method will put the current thread on wait until the thread on which it is called is dead or wait for speed amount of time

Select one

a 1, 2 and 4 are True
b 1, 3 and 4 are True
c 1,2,3, and 4 are true
d 2, 1 and 4 are True