# Working with files

### Related Exceptions

• java.io.IOException: Represents I/O exceptions in general. </br>
• java.io.EOFException extends IOException: Indicates that the end of file or stream has been reached unexpectedly. </br>
• java.io.FileNotFoundException extends IOException: Indicates that the requested file cannot be found in the given path.</br>
• java.lang.SecurityException extends java.lang.RuntimeException: Indicates that the requested operation cannot be executed due to security constraints.</br>

### General Information About File Operations

• File operations are separated into two main groups in Java:</br>
&nbsp; &nbsp; • File management: Opearations such as creating, renaming, deleting files and folders.</br>
&nbsp; &nbsp; • I/O operations.</br>
• I/O operations are not only done with files but also with different sources such as TPC sockets, web pages, console, etc. Therefore I/O operations:</br>
&nbsp; &nbsp; • have been separated from file operations</br>
&nbsp; &nbsp; • coded in the same way for all these different sources.</br>
• This approach is in harmony with the nature of object oriented paradigm. However, the complexity has been increased as a side effect.</br>

### File Management
• Coded by using the java.io.File class which represents both the files and the folders in the hard drive.</br>
• Creating a File object does not mean to create an actual file or folder.</br>
• Creating a File object :</br>
&nbsp; &nbsp; • Done by using the File( String fileName) constructor.</br>
&nbsp; &nbsp; • fileName should contain both the path and the name of the file/folder.</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • Full path vs. relative path.</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • Using full path degrades portability</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • Relativity is tricky as well: IDEs may keep source and class files in different folders.</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • Path separator:</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • Windows uses \ (should be denoted as \\ in Strings), Unix uses /.</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • What about portability?</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • public static String File.separator</br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; • public static char File.separatorChar</br>
• File( String path, String name) and File( File path, String name ) constructors:</br>
&nbsp; &nbsp; &nbsp; &nbsp; • Represents a file/folder with the given name in the folder given by the path parameter.</br>

**• Some methods of the class java.io.File:**</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean exists( ); tells whether the file exists or not.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean isFile( ); returns true if this File object represents a file, false otherwise, i.e. this object represents a folder.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• File getParentFile( ); Returns the directory where this file/folder resides.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• String getCanonicalPath( ) throws IOException; Returns the full path of the file/folder, including the file name.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean canRead( ); Can this application read form this file?</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean canWrite( ); Can this application write to this file?</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean createNewFile( ); Actually creates the file.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean mkdir( ); Actually creates the folder.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean mkdirs( ); Actually creates the folder with all necessary parent folders </br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean renameTo( File newName ); Renames the file. </br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean delete( ); Deletes the file.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• boolean returns: True if the operation is successful.</br>

**• I/O Operations Using Streams:**</br>
• Any I/O source is represented as stream in Java</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; • Files, memory, command prompt, network, etc.</br>
• Binary vs. Text format:</br>
• Binary I/O is fast and efficient, but it is not easily readable by humans.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Text I/O is the opposite.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;**• Random vs. Sequential access:**</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Sequential access: All records are accessed from the beginning to the end</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Random access: A particular record can be accessed directly.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Disk files are random access, but streams of data from a network are not.</br>
• Java chains streams together for different working styles.</br>
• A mechanism which allows makes it possible to write any object
to a stream and read it again later.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• This process is called serialization in the Java terminology.</br>

**• Serialization – Output operations:**</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• We will write entire objects to a file on disk.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• The classes of objects to be serialized should implement the
java.io.Serializable interface.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• You do not need to do anything else as the java.io.Serializable interface
does not have any methods.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• ObjectOutputStream and FileOutputStream objects are chained together
for serialization.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Multiple objects can and should be sent to the same stream.</br>
**• About the transient keyword**</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Mark a member fields of a class as transient if you do not want to
serialize it.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• You will need to do so if the class having that member has to be
serialized but you cannot mark that member’s class as Serializable.</br>

**• About the serialVersionUID member:**.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• private static final long serialVersionUID = 1L;.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• We can give a particular version instead of 1, or we can have the IDE to
generate a unique identifier automatically..</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• If we do not code this member, we can hide the related warning with the
@SuppressWarnings("serial") command..</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• What does this member mean?.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• There will be applications which save and load objects from different
sources..</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• In time, the source code of the classes of these objects may change,
as well as the source code of the aforementioned applications..</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• Different versions of all those classes can exist together. In order to
avoid incompatibilities, we need a versioning mechanism..</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• This mechanism is implemented by giving a different (and possibly
increasing) serial number to classes and by checking this serial in
the applications..</br>

**• Deserialization – Input operations:**</br>
• We will read entire objects form a file on disk.</br>
• ObjectInputStream and FileInputStream objects are chained together for
deserialization.</br>
• Typecasting is required as the objects read from a stream comes as
instances of the class Object.</br>
&nbsp; &nbsp;&nbsp; &nbsp;• The warning “Type safety: Unchecked cast” can be suppressed by
@SuppressWarnings("unchecked")</br>
• If these objects are to be stored in an array, we need to know how many
objects there will be.</br>
&nbsp; &nbsp;&nbsp; &nbsp;• In the data structures that may grow dynamically, we are not faced
with this inconvenience.</br>

![enter image description here](https://lh3.googleusercontent.com/QNlI1z61RQODsvI-4dB3oppXYNMintMWIEa2BkFzpdbv1g0ShUTggLq09NJhVhNCbToQUxRB-Bc)

• There is a method, int ObjectInputStream.available( ), but this is
somewhat buggy</br>
&nbsp; &nbsp;&nbsp; &nbsp;• http://www.coderanch.com/t/378141/java/java/EOF-ObjectInputStream
• Moreover, readObject() doesn't return null at EOF</br>
&nbsp; &nbsp;&nbsp; &nbsp;• http://stackoverflow.com/questions/2626163/java-fileinputstream-
objectinputstream-reaches-end-of-file-eof</br>
• You can code a solution by letting the exception to happen, and terminate the
loop in the catch block.</br>
&nbsp; &nbsp;&nbsp; &nbsp;• However, exception handling is not invented for altering the program
flow.</br>
• A better alternative to writing the data object count beforehand is to use only
one container object which stores references all the data objects.</br>
&nbsp; &nbsp;&nbsp; &nbsp;• This container object will be a data structure, such as a list or a map.</br>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;• However, the objects in the container must implement the
java.io.Serializable interface.</br>
&nbsp; &nbsp;&nbsp; &nbsp; • If there is a relation A→B, both A and B must implement the
java.io.Serializable interface.</br>

....

• What about working with text files or working in other modes?</br>
• Hint: PrintWriter and InputStreamReader streams are available for text
output and input.
