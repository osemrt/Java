Server Programs such as database and web servers repeatedly execute requests from multiple clients and these are oriented around processing a large number of short tasks. An approach for building a server application would be to create a new thread each time a request arrives and service this new request in the newly created thread. While this approach seems simple to implement, it has significant disadvantages. A server that creates a new thread for every request would spend more time and consume more system resources in creating and destroying threads than processing actual requests.

Since active threads consume system resources, a  JVM creating too many threads at the same time can cause the system to run out of memory. This necessitates the need to limit the number of threads being created.

**What is ThreadPool in Java?**

**A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing.**  Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

[More](https://docs.oracle.com/javase/tutorial/essential/concurrency/pools.html)

Thread pools:
• Running a small number of tasks in separate threads is acceptable.
• But do not forget that actual processing units in a typical CPU is rather
low, and creating a thread has also a processing cost.
• Therefore, if you are to execute a large number of tasks, you should use a
thread pool instead.
• Java provides the following interfaces and classes for this purpose:

![enter image description here](https://lh3.googleusercontent.com/e3EgftJFtraZKGu_EhIbrYb4_Venj5cuoDMQGwMzpRHw75pYoj-Q3vk_mjSXoKNIq8jb6W5hevI)

## java.util.concurrent.ExecutorService:
• public void shutdown( ) :
Shuts down the executor, but allows the tasks currently in the pool to
be completed. New threads are not accepted to the pool. We need to use this method for a safe ending.

• public List<Runnable> shutdownNow( ):
Shuts down immediately, stops the unfinished threads and returns
them in a list.

• public boolean isShutdown( ):
Returns true if the executor is shut down.

• public boolean isTerminated( ):
Returns true if all the tasks in the pool are terminated.
Can be used in the main method for waiting the threads to be finished

## java.util.concurrent.Executor:
• public void execute( Runnable object ): 
Executes the given task

## java.util.concurrent.Executors:
• public static ExecutorService newFixedThreadPool( nThreads : int ):
Creates a thread pool that reuses a fixed number of threads

• public static ExecutorService newCachedThreadPool( ):
Creates a thread pool that creates new threads as needed, but will
reuse previously constructed threads when they are available


