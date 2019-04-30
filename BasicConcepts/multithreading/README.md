
## INTRODUCTION TO MULTITHREADING 
• Multitasking, multiple processes and multithreading: 
• Multitasking is the ability to have more than one program working at the same time. 
• Nowadays, you are likely to have a computer with its CPU having multiple cores. 
• Each core can execute one or more tasks, i.e. processes, depending on the CPU architecture. 
• A process can sometimes be divided into threads that may run in parallel, i.e. concurrently running sub-processes. • If there are enough hardware resources, i.e. cores, the time it takes to complete a process will drop significantly. 
• However, this increase in the performance will not be in the order of the available cores. 
• The concurrently running threads will sooner or later need to synchonize with each other. 
• Moreover, creating a process or a thread takes some execution time as well. 

A state diagram showing the possible states of a thread and transitions between those states:

![enter image description here](https://lh3.googleusercontent.com/t_TXg9aAppLxIv9pyakcNu1SUYlVibwVKQBl00cOz2W_uwkBuGPJIVF6ZYwMl0QPXnbw_-MRUNc)

[Difference between blocked vs waiting states](https://javaconceptoftheday.com/difference-between-blocked-vs-waiting-states-in-java/)

• How should a thread wait? 
• If a thread is unable to continue its task because of an obstacle, that thread should wait until the obstacle has been removed. 
• Obstacle: The needed information has not arrived from: the network, another thread, the user, etc.
 • You should not do “busy waiting”, i.e. executing dummy instructions such as running empty loops for 10.000 times. 
 • Instead, you should put that thread into the blocked state by using the sleep command. 
 • A sleeping thread, unlike a busy waiting one, does not consume system resources. 
 • A sleeping thread is at risk of becoming unable to awake. 
 • You must catch the java.lang.InterruptedException, which is a checked exception.
 
• Procedure for running a task in a separate thread: 
1.Place the code for the task into the run method of a class that implements the Runnable interface. 
2. Create an object of your class 
3. Create a Thread object from the Runnable
4. Start the thread by using Thread.start method (do not call the run method directly) 

• Do not code your own threads by inheriting from the Thread class. 
• Otherwise you will lay your only inheritance right to waste.
