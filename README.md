Starting Spring Development Using Intellij IDE
***********************
Pet Clinic is Best Example for Better understanding of the Spring Framework

*******
All the Development is Done in SpringBoot

**************
Basics of Spring Framework

Dependency Injection is the Primary Concept of Spring Framework
(All the examples in placed in Git hub repo please check the link here for example on DI)
Before getting into Dependency Injection let me have brief talk about spring application context
************** 
ApplicationContext is used to Stored all the spring beans(at start of the application) inside and called later on
In spring application we are not going to create any instance for java class
Application context is used to get the beans that we have created.
 ***********
So now coming back to Dependency Injection 
Example:
when a 5years old kid want something and if he gets to store by self he might endup
by the wrong items.
Here the child should depend on the parents in order to get what he want 

So dependency injection is when an object is injected in to another object.
****************
Below are the ways of dependency Injection

Directly defining new inside another object where it is need
                             or
Using getter and setter 
                            or
By using constructors
**************
Concrete Classes(a class with all methods implemented) or Interfaces(just abstract methods)
Always avoid using Concrete class since interface help u decided the methods at runtime
**************
Inversion of Control(IOC)
This is technique that allow you to inject dependencies during runtime
Dependency are not predetermined.
**********
Difference between Dependency Injection(DI) and Inversion of Control(IOC)                             

Dependecny injection is the design on how to added objects where as IOC is runtime
environment that decided how the DI should be Injected based on DI code.

Attached a Example of Spring DI in my github().

*********************
Annotations Used for DI

1.@AutoWired - Autowired is used to set the DI by default it is constructor (Autowired has name based , Constructor based ,clas based)<br>
byType : Object Type when the Object Types are same <br>
byName : when the variable declared is same as that of pojo class<br>
constructure : consturtor same constrcutre name<br>
no: no type<br>

2.@Qualifier - Qualifier is used to remove redundance like for example in the above Github link i have implements same service in 3
 different classes if we dont put Qualifier then we wil get any error to solve this we use qualifier to which impl it should use<br>
3.@primary - Class which is annotated with primary is used as DI if there are more than one impl as shown in the above github example<br>

*******************

Spring Profiles
@profiles("name") annotation
Profiles are set at runtime. we can use to set different Beans with different profiles so that can pick only the one which are required
for running.
Example : when we are development phase we moght use h2 database but later on we can shift to mysql or sql this can be achieved by using
profiles by adding configuration related information in profile and later on shifting the active profile from h2 to mysql.

These are used when we wanted to run different databases based on requirement or request. u can find the example in above link which 
i have mentioned for DI.

Default profile - when we dont have any active profile we can mention one as default profile as follows
@Profile({"name","default"})
this will only activate when their is profile active mentioned.

*********************

Here to use multi module we need to initially create modules using Intellj and then order the pom.xml
 
*********************

Spring FrameWork Stereotypes <br>

@Component : Indicates that an annotated class is a "component" and it will be created as bean<br>
@Controller : Indicates that an annotated class has role of controller in spring MVC <br>
@RestController  : Indicates it has rest controller <br>
@Repository : Indicates that an annotated class act as repository that send collection of object<br>
@Service : mentions the class as a service model.

*********************





 

