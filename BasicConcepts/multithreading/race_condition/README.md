
## Race condition
• In most practical multithreaded applications, two or more threads need to
share access to the same data.
• What happens if two threads have access to the same object and each
calls a method that modifies the state of the object?
• As you might imagine, the threads can step on each other’s toes!
• Depending on the order in which the data were accessed, corrupted
objects can result.
• Such a situation is often called a race condition.

**Thread synchronization is needed to avoid race conditions.**
• Consider the following example:

![enter image description here](https://lh3.googleusercontent.com/HNVBQh741YBoMnOR0CXDKPHBgYXsNazNKqk7h2Za28B48jFB-hi5UrIlFGMXpr9n2aBPJWv5i88)

Look-> [Bank Simulation v1
](https://github.com/osemrt/Java/tree/master/BasicConcepts/multithreading/race_condition/bank_simulation_v1)

![enter image description here](https://lh3.googleusercontent.com/PXpaR3gVPfDJW3UlgdIogJCfdazrbivmfgScolfJIhNFUXSEa-j5xk6QNjW9LCy6QagQ7dRvTl4)

Look-> [Bank Simulation v2
](https://github.com/osemrt/Java/tree/master/BasicConcepts/multithreading/race_condition/bank_simulation_v2)

**• How can we prevent such a race?
• We determine the methods which can lead to a race and label them with the
keyword synchronized.
• Only one thread can execute a synchronized mehod, others wait.**

**About the data structures and multithreading:
• Remember the data structures section: Some data structures are thread-
safe, i.e. synchronized
• Vector<E> and Hashtable<K,V>
• Use those data structures when multithreading is to be used.**
