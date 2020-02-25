package sk.itlearning.java3.h.threads;

public class T6_ForkJoin {

//	Fork and Join
//	The effective use of parallel cores in a Java program has always been a challenge. 
//	There were few home-grown frameworks that would distribute the work across multiple cores and then join them to return the result set.
//	Java 7 has incorporated this feature as a Fork and Join framework.
//
//	Basically the Fork-Join breaks the task at hand into mini-tasks until the mini-task is simple enough that it can be solved without further breakups. 
//	It’s like a divide-and-conquer algorithm. One important concept to note in this framework is that ideally no worker thread is idle. 
//	They implement a work-stealing algorithm in that idle workers “steal” the work from those workers who are busy.
//
//	The core classes supporting the Fork-Join mechanism are ForkJoinPool and ForkJoinTask. 
//	The ForkJoinPool is basically a specialized implementation of ExecutorService implementing the work-stealing algorithm we talked about above.
//	We create an instance of ForkJoinPool by providing the target parallelism level — the number of processors as shown below:
//
//	ForkJoinPool pool = new ForkJoinPool(numberOfProcessors)
//	Where numberOfProcessors = Runtime.getRunTime().availableProcessors();
//
//	However, the default ForkJoinPool instantiation would set the parallelism level equal to the same number obtained as above.
//	The problem that needs to be solved is coded in a ForkJoinTask. However, there are two implementations of this class out of the box: the RecursiveAction and RecursiveTask. 
//	The only difference between these two classes is that the former one does not return a value while the latter returns an object of specified type.
//
//	Here’s how to create a RecursiveAction or RecursiveTask class that represents your requirement problem (I use the RecursiveAction class):
//
//
//	public class MyBigProblemTask extends RecursiveAction {
//	    @Override
//	    protected void compute() {
//	        . . . // your problem invocation goes here
//	    }
//	}
//
//	You have to override the compute method where in you need to provide the computing functionality.
//	Now, provide this ForkJoinTask to the Executor by calling invoke method on the ForkJoinPool:
//	pool.invoke(task);
}
