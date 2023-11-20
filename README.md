# AggregationExampleRepo
Provides an example of aggregation in the context of object-oriented programming. In this example an Employee class will have an aggregation type relationship with an Address class. The Address instance has a lifecycle that is independent of the Employee instance lifecycle.  The Address instance will be provided to the Employee instance via constructor injection.

UML: 
[Employee] <>------ [Address]

The console application will print the following:

Printing the address before creating an employee instance:
1234 Sample Street
Arlington, TX 75104

Printing the employee's details:
Employee{
	name='Peter Gibbons',
	jobRole=Senior Software Engineer,
	address=1234 Sample Street
			Arlington, TX 75104
}

Printing the address again after the demo method has finished:
1234 Sample Street
Arlington, TX 75104
