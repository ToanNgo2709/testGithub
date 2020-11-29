val name1: String = "ngo gia"
var str: String? = null;
const val n: Int = 1;

fun getGreeting(): String {
    return "hello kotlin";
}

//Unit replace for Void in java in kotlin
fun sayHello(name: String): Unit = println(name);

fun saySomething(name: String, age: Int): Unit{
    val greeting: String = "xin chào $name năm nay bạn $age tuổi";
    println(greeting)
}

fun main(args: Array<String>) {

    val map = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c");
    map.forEach { key, value -> println("$key -> $value") }

    //val interestingThing = listOf("Kotlin", "programming");
    //lambda syntax in kotlin
    //interestingThing.forEach{thing -> println(thing)}
    //interestingThing.forEach{b -> println(b);}
//    interestingThing.forEachIndexed{index, thing ->
//        println("$thing is in index $index");
//    }
//    println(interestingThing.size);
//    println(interestingThing[0]);
//    println(interestingThing[1]);

//    for(thing: String in interestingThing){
//        print(thing);
//    }
    //sayHello("toan ngo");
//    saySomething("toan ngo", 12);
//    saySomething("kotlin", 23);
    //replace for switch case in java
//    when(greeting){
//        null -> println("hello");
//        else -> println(greeting);
//    }

    //val greetingToPrint: String = if(greeting != null) greeting else "Hi";
//    val greetingToPrint: String = when(getGreeting()){
//        null -> "hello";
//        else -> "xin chào";
//    }
//    println(greetingToPrint);
}

//Collection data type



