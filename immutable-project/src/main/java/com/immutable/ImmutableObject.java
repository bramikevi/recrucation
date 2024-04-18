package com.immutable;

import java.util.HashMap;

/*final class -
Inheritance Restriction: You cannot extend a final class. If you try to do so, the compiler will raise an error.

Method Overriding: In a final class, methods can still be declared as final, but they cannot be overridden by subclasses. This is because there are no subclasses allowed.

final on methods:
Method Overriding Restriction: Subclasses cannot override the final method. If a subclass attempts to override it, the compiler will raise an error.


 */
final public class ImmutableObject {
    //final and private fields
    final private String name;
    final private int age;
    final private HashMap<String, Character> subjectGrade;

    //Values are assigned in constructor
    public ImmutableObject(String name,int age,HashMap<String, Character> subjectGrade){
        this.name = name;
        this.age = age;

        //deep copy of map
        HashMap<String, Character> temp = new HashMap<String, Character>();
        for(String k : subjectGrade.keySet()){
            temp.put(k, subjectGrade.get(k));
        }
        this.subjectGrade = temp;
    }

    // All getters
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    //return clone in gettter method.

    public HashMap<String, Character> getSubjectGrade(){
        // As clone return object you have to typecast
        return (HashMap<String, Character>)subjectGrade.clone();
    }

//no setter
}
