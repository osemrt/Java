• This example shows how to access a private inner class from any other class: \
&nbsp; &nbsp;  • By using a public method of the outer class \
&nbsp; &nbsp; • Meanwhile, we have to access the inner object from the outer object 

• You can obtain a reference to the outer class instance from the inner class instance by: \
&nbsp; &nbsp;  • OuterClassName.this \
&nbsp; &nbsp;  • In this case, you can use Person.this from the Employee inner class. \
• However, this type of access is rarely needed as the inner class instance can use even the private methods of the outer class instance. 
