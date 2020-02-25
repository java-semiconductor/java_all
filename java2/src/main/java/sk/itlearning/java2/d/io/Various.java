package sk.itlearning.java2.d.io;

public class Various {

	// New file system API (NIO 2.0)
	// Those who worked with Java IO may still remember the headaches that framework
	// caused.
	// It was never easy to work seamlessly across operating systems or multi-file
	// systems.

	// There were methods such as delete or rename that behaved unexpected in most
	// cases. Working with symbolic links was another issue. In an essence, the API
	// needed an overhaul.

	// With the intention of solving the above problems with Java IO, Java 7
	// introduced an overhauled and in many cases new API.

	// The NIO 2.0 has come forward with many enhancements. It’s also introduced new
	// classes to ease the life of a developer when working with multiple file
	// systems.

	// A new java.nio.file package consists of classes and interfaces such as Path,
	// Paths, FileSystem, FileSystems and others.

	// A Path is simply a reference to a file path. It is the equivalent (and with
	// more features) to java.io.File. The following snippet shows how to obtain a
	// path reference to the “temp” folder:

	// public voidpathInfo() {
//
//	            Path path= Paths.get("c:\Temp\temp");
//
//	System.out.println("Number of Nodes:"+ path.getNameCount());
//
//	            System.out.println("File Name:"+ path.getFileName());
//
//	            System.out.println("File Root:"+ path.getRoot());
//
//	            System.out.println("File Parent:"+ path.getParent());
//
//	      }
//	The console output would be:
//
//
//	Number of Nodes:2
//
//	File Name:temp.txt
//
//	File Root:c:
//
//	File Parent:c:Temp
//	Deleting a file or directory is as simple as invoking a delete method on Files (note the plural) class. The Files class exposes two delete methods, one that throws NoSuchFileException and the other that does not.
//
//	The following delete method invocation throws NoSuchFileException, so you have to handle it:
//
//
//	Files.delete(path);
//	Where as Files.deleteIfExists(path) does not throw exception (as expected) if the file/directory does not exist.
//
//	You can use other utility methods such as Files.copy(..) and Files.move(..) to act on a file system efficiently. Similarly, use the createSymbolicLink(..) method to create symbolic links using your code.
//
//	File change notifications
//	One of my favorite improvements in the JDK 7 release is the addition of File Change Notifications. This has been a long-awaited feature that’s finally carved into NIO 2.0. The WatchService API lets you receive notification events upon changes to the subject (directory or file).
//
//	The steps involved in implementing the API are:
//
//	Create a WatchService. This service consists of a queue to hold WatchKeys
//	Register the directory/file you wish to monitor with this WatchService
//	While registering, specify the types of events you wish to receive (create, modify or delete events)
//	You have to start an infinite loop to listen to events
//	When an event occurs, a WatchKey is placed into the queue
//	Consume the WatchKey and invoke queries on it
//	Let’s follow this via an example. We create a DirPolice Java program whose responsibility is to police a particular directory. The steps are provided below:
//
//	1. Creating a WatchService object:
//
//
//	WatchService  watchService = FileSystems.getDefault().newWatchService();
//	2. Obtain a path reference to your watchable directory. I suggest you parameterize this directory so you don’t hard code the file name.
//
//
//	path= Paths.get("C:\Temp\temp\");
//	3. The next step is to register the directory with the WatchService for all types of events:
//
//
//	dirToWatch.register(watchService, ENTRY_CREATE, ENTRY_MODIFY,
//
//	ENTRY_DELETE);
//	These are java.nio.file.StandardWatchEventKinds event types
//
//	4. Initiate the infinite loop and start taking the events:
//
//
//	while(true)
//
//	{
//
//	    WatchKey key = watchService.take(); // this would return you keys
//
//	    ?
//
//	}
//	5. Run through the events on the key:
//
//
//	for(WatchEvent<?> event : key.pollEvents()) {
//
//	            Kind<?> kind = event.kind();
//
//	System.out.println("Event on "+ event.context().toString() + " is "+ kind);
//
//	}
//	For example, if you modify or delete the temp directory, you would see statement as shown below on the console respectively:
//
//
//	Event on temp is ENTRY_MODIFY
//
//	Event on temp is ENTRY_DELETE
//	The relevant methods of the DirPolice source code are posted below (download the full source code):
//
//
//	/**
//
//	 * This initiates the police
//
//	 */
//
//	private voidinit() {
//
//	      path= Paths.get("C:\Temp\temp\");
//
//	      try{
//
//	            watchService= FileSystems.getDefault().newWatchService();
//
//	            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE,
//
//	                        ENTRY_MODIFY);
//
//	      } catch(IOException e) {
//
//	            System.out.println("IOException"+ e.getMessage());
//
//	      }
//
//	}
//
//	/**
//
//	 * The police will start making rounds
//
//	 */
//
//	private voiddoRounds() {
//
//	      WatchKey key = null;
//
//	      while(true) {
//
//	            try{
//
//	                  key = watchService.take();
//
//	                  for(WatchEvent<?> event : key.pollEvents()) {
//
//	                        Kind<?> kind = event.kind();
//
//	System.out.println("Event on "+ event.context().toString() + " is " + kind);
//
//	                  }
//
//	            } catch(InterruptedException e) {
//
//	System.out.println("InterruptedException: "+e.getMessage());
//
//	            }
//
//	            booleanreset = key.reset();
//
//	            if(!reset)
//
//	                  break;
//
//	      }
//
//	}
}
