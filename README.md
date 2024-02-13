# Remarks to code 

1. Two classes in one Java file
2. humanIMB - not correspond to Java style of naming classes (Must be: HumanImb)
3. HumanImb must be a public class
4. What is imb?
5. Public state of class(W and H vars)? 
6. Why W, H? Why not weight and height? 
7. Why variable in upper case if it is not a constant?
8. Why is imb variable static? Is it a common state for all objects?
9. Why doesn't constructor validate anything? 
10. Why take and put methods named as 'take' and 'put' instead of 'get' and 'set'?
11. File is not a properly formatted
12. putW recalculating imb manually? No validation for input at some cases, for example, dividing by zero, negative numbers, etc.
13. Duplicating code imb = W / (H * H);'
14. Result method called as a result? What means a result? And why it's start from a big letter?
15. Why variable in Result() method called string? I know, that this variable is type of string, but why I need duplication of the name?
16. We check all conditions, even we already have a result (as conditions are excluding each other) 
17. We can use inline values for all if statements instead of string variable
18. Do we need actual class with a state? Why cannot we use a simple util class?
19. I don't understand the purpose of a comment at the beginning of Main class. If there is information about how to run 
a project, why it is not placed in separate README file in the root of the project?
20. Test doesn't cover all cases 
21. In case, if we need to keep this class as not utility, it will be better to override default impls of equals and hashcode methods
22. Project names as untitled11
23. Weight and Height need to be specified in which metric they are stored(meters, kilograms)