package com.kotlin.use

import com.sun.tools.doclets.internal.toolkit.util.DocPath.parent
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other
import java.awt.Color
import java.lang.Exception
import java.lang.NullPointerException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays.asList
import javax.swing.tree.TreeNode

/**
 * @Author: lyd
 * @Date: 2018/12/28 下午5:12
 * @Version 1.0.0
 */


fun main(args: Array<String>) {
//    println(getString())
//    println(oneMillion)

//    var p:Person
//
//    println(p.isAdult)

//    println("The answer is $answer.") // 此时计算出答案
//
//    val port = System.getenv("PORT")?.toIntOrNull() ?: 80
//
//    print(port)
//
//    if (port > 21) print(21)

//    val list = listOf("1","2","12","13")
//    var eachCount = list.groupingBy { it.first() }.eachCount()
//
//    println(eachCount)
//
//    val map = mapOf("key" to 42)
//    val emptyMap = map - "key"
//    val emptyMap2 = map.minus("key")

//    print(emptyMap.entries)

//    val squares = List(10) { index -> index * index }
//
//    println(squares[2])

//    val arr = arrayOf(1, 2, 3, 4)
//    val arr2 = arrayOf(1, 2, 3, 4)
//    println(arr.toString())
//    println(arr.contentToString())
//    println(arr.contentEquals(arr2))
//    println(arr.contentDeepEquals(arr2))
//
//    println(arr === arr2)
//    println(arr == arr2)
//    println(arr.equals(arr2))

//    val str1 = "1"
//    val str2 = "1"
//
//    println(str1 == str2)
//    println(str1 === str2)
//
//    var x: String? = "12123"
//
//    println(x)

//    val items = (1..5).toMutableList()
//    val items2 = listOf(5,3,6,8,1).toMutableList()
//
//    items.shuffle()//随机排序
//    println("Shuffled items: $items")
//
//    items2.shuffled()
//    println("Shuffled items2: $items2")
//
//    items.replaceAll { it * 2 }
//    println("ReplaceAll items: $items")
//
//    items.fill(0)
//    println("Fill items: $items")

//    val items = (1..9).map { it * it }//变换
//
//    var chunked = items.chunked(3)
//
//    var windowed = items.windowed(3){it.average()}
//
//
//    println("items $items")
//    println("chunked $chunked")
//    println("windowed $windowed")
//
//    val defaultStrings = listOf(1, 2, 3).strings()
//    val customStrings = listOf(1, 2, 3).strings { "($it)" }
//
//    println(defaultStrings)
//    println(customStrings)

//    lateinit var third: Node<Int>
//    val second = Node(2, next = { third })
//    val first = Node(1, next = { second })
//    third = Node(3, next = { first })
//    val nodes = generateSequence(first) { it.next() }
//    println("Values in the cycle: ${nodes.take(7).joinToString { it.value.toString() }},...")

//    val list1 = listOf("a", "b")
//    val list2 = listOf("x", "y", "z")
//    val minSize = minOf(list1.size, list2.size)
//    val longestList = maxOf(list1, list2, compareBy { it.size })
//    println("$minSize $longestList")

    //val 不可以重复赋值 只读局部变量 在main函数里
//    val a: Int = 1
//    val b = 1
//
//    val c: Int
//    c = 2
//    println(c)

//    var x = 1
//    x = 2
//    x += 3
//
//    println(x)

//    var a = 1
//
//    val s = "a is $a"
//
//    a = 2
//
//    val s2 = "${s.replace("is", "was")},but now is $a"
//
//    println(s2)

//    judgeNull(1, 1)

//    println(isString(null))
//    println(isNotString(null))

//    //循环
//    val items = listOf("1", "2", "apple", 10)
//    for (item in items) {
//        println(item)
//    }
//    //Or
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }
//    //Or
//    var i = 0
//    while (i < items.size) {
//        println("item at $i is ${items[i]}")
//        i++
//    }

//    println(analysisObj(1))


//    println(isInRange(6))
//    println(isNotInRange(8))

//    val list = listOf("a", "b", "c")
//
//    for (index in 0..list.lastIndex) {
//        println(index)
//    }
//
//    println(list.size !in list.indices)
//
//    for (x in 1..10 step 2) {
//        println(x)
//    }
//
//    //down to
//    for (x in 10 downTo 0 step 3) {
//        println(x)
//    }
//    //until 半开前闭后开 [0,100）
//    for (x in 1 until 100 step 50) {
//        println(x)
//    }

//    val list = listOf("apple", "banana", "orange", "juicy")
//    //集合
//    for (item in list) {
//        println(item)
//    }
//
//    println()
//
//    when {
//        "apple" in list -> println("haha")
//        "banana" in list -> println("23333")
//    }
//
//    var findLast = list.findLast { it.contentEquals("orange") }
//    println(findLast)
//     //过滤 排序 转换 循环
//    list.filter { it.contains("a") }.sortedBy { it.length }.map { it.toUpperCase() }.forEach { println(it) }

//    //实例
//    val person = Person("baby", 2)
//
//    val a :Int = 1

//    val map1 = mapOf(1 to "one", 2 to "two")
//    val list = listOf(1, 2)
//
//    for ((k, v) in map1) {
//        println("$k -> $v")
//    }
//
//    println(map1[1])
//    println(map1[2])
//
//    var mutableMap = map1.toMutableMap()
//    mutableMap[1] = "ONE"
//
//    println(mutableMap[1])
//
//    var multableList = list.toMutableList()
//    multableList[1] = 3
//    println(multableList[1])


//    println(result)

//    println(a.selfTime())

    //if not null
//    val str = getString(null)
//
//    println(str?.length)
//
//    //if not null and else  ?. if not null  ?: = else
//    println(str?.length ?: "str is null")

//    println(str?.length ?: throw NullPointerException("str is null"))

//    val array4 = Array(5) { 0 }
//
//    val list = listOf("1", "2", "3", "2")
//    val list2 = emptyList<String>()


//    println(list.first())
    //在可能会空的集合中取第⼀元素
//    val first = list2.firstOrNull() ?: "empty"
//    println(first)

    //let
//    val value = isNull(null)
//    value?.let {
//        println(it.selfTime())
//    }
//
//    value?.let {
//        println(it.selfTime())
//    } ?: println(0)

//    test()

//    maxOf4(1,2)

//    for (a in arrayOfMunusOnes(3)) {
//        println(a)
//    }

//    val turtle = Turtle()
//    //描述人的一天
//    with(turtle) {
//        turtle.getBed()
//        turtle.eat()
//        turtle.work()
//        for (i in 0..12) {
//            println("$i hour")
//            turtle.work()
//        }
//        turtle.sleep()
//    }


//    val stream = Files.newInputStream(Paths.get("/Users/yaodonglv/Desktop/XQS文档/sgftest1.sgf"))
//
//    stream.buffered().reader().use { reader ->
//        reader.forEachLine {
//            println(it)
//        }
//    }

//
//    //可空布尔值
//    val b:Boolean? = null
//
//    if (b == true) {
//
//    } else{
//        // b is null or false
//    }

//    // 解构
//    val jane = Person("Jane", 35)
//    val (name, age) = jane
//    println("$name, $age years of age") // 输出 "Jane, 35 years of age"

    println(stringPlus.invoke("<..", "..>"))
    println(stringPlus("<..", "..>"))
    println(intPlus.invoke(1, 2))
    println(intPlus(1, 2))
    println(3.intPlus(4))

    //*伸展 spread
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)
    var asListTT = asListTT(1, 2, 3)
    println(list)
    println(asListTT)

}


fun <T> asListTT(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun Int.intPlus(i: Int): Int {
    return this.plus(i)
}

//还可以通过使⽤类型别名给函数类型起⼀个别称：
//typealias ClickHandler = (Button, ClickEvent) -> Unit

//如需将函数类型指定为可空，请使⽤圆括号：((Int, Int) -> Int)?。
//函数类型可以使⽤圆括号进⾏接合：(Int) -> ((Int) -> Unit)
//箭头表⽰法是右结合的，(Int) -> (Int) -> Unit 与前述⽰例等价，但不等于 ((Int) ->
//(Int)) -> Unit。

// 区间range  in
fun isInRange(a: Int): Boolean {
    val b = 1
    val c = 5
    return a in b..c + 3
}

// 不在区间range  !in
fun isNotInRange(a: Int): Boolean {
    val b = 1
    val c = 5
    return a !in b..c + 3
}

// when 表达式 返回when
fun analysisObj(obj: Any?): String {
    return when (obj) {
        is Long -> "Long"
        is String -> "String"
        "Hello" -> "Hello"
        1 -> "one"
        else -> "UNKnown"
    }
}

// 空安全
// Type? 返回可以为空 使用的时候要判断非空
fun isNull(a: Int?): Int? {
    return a
}

fun isString(a: Any?): Boolean {
    if (a is String) return true
    return false
}

fun isNotString(a: Any?): Boolean {
    if (a !is String) return true
    return false
}

fun judgeNull(a: Int, b: Int?) {
    var x = isNull(a)
    var y = isNull(b)

    if (x != null && y != null) {
        println(x.times(y))
    }

// println(y?.let { x?.times(it) })

}

// if/else 表达式
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// if
fun maxOf3(a: Int, b: Int) = if (a > b) a else b


fun maxOf4(a: Int, b: Int) {
    val result = if (a > b) a else b
    println(result)
}


// val 不可以重复赋值 只读全局变量 在main函数里 顶层变量
const val a: Int = 3

inline fun <E> Iterable<E>.strings(transform: (E) -> String = { it.toString() }) =
        map { transform(it) }

class Node<T>(val value: T, val next: () -> Node<T>)


fun getString(): String {
    return sum(1, 2).toString()
}

fun getString(a: String?): String? {
    return a
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y

fun printSum(x: Int, y: Int): Unit {
    println(sum(x, y))
}

fun printSum2(x: Int, y: Int) {
    println(sum(x, y))
}

//分隔符
val oneMillion = 1_000_000

//数据类
data class Person(val name: String, val age: Int) {
    val isAdult get() = age >= 20 // 属性类型推断为 “Boolean
}

//对⼀个对象实例调⽤多个⽅法（
class Turtle {

    fun getBed() {
        println("get bed")
    }

    fun eat() {
        println("eat food")
    }

    fun sleep() {
        println("sleep 20 min")
    }

    fun work() {
        println("work all day")
    }

}


// 单例
object Resouce {
    val id = "R.string.kill"
}

// 延迟属性
val answer by lazy {
    println("Calculating the answer...")
    42
}

val result by lazy {
    println("Calculating the answer...")
    42 * 31
}

// 扩展函数
fun Int.selfTime(): Int {
    return this.times(this)
}

// 扩展属性
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

// try/catch
fun test() {
    val result = try {
        println(1 / 0)
    } catch (e: Exception) {
        throw Exception(e)
    }
}

// 返回类型为 Unit 的⽅法的 Builder ⻛格⽤法
fun arrayOfMunusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

// 单表达式函数
fun theAnswer(): Int {
    return 1
}

// 等价于
// 单表达式函数
fun theAnswer2() = 1

// 单表达式函数与其它惯⽤法⼀起使⽤能简化代码，例如和 when 表达式⼀起使⽤：

/**
 * 推荐[color]参数上加连接
 * 少使用下边的@param @return
 * @param color
 * @retrun
 */
fun transform(color: String): Int = when (color) {
    "Red" -> 0
    "Black" -> 1
    "White" -> 2
    else -> -1
}

// 优先使用工厂函替代构造函数
class Point(val x: Double, val y: Double) {
    companion object {
        fun fromPolar(angle: Double, radius: Double) = Point(angle, radius)
    }

}

// 返回平台类型表达式的公有函数/⽅法必须显式声明其 Kotlin 类型
// fun apiCall(): String = MyJavaApi.getProperty("name")
// 任何使⽤平台类型表达式初始化的属性（包级别或类级别）必须显式声明其 Kotlin 类型
// class Person {
//     val name: String = MyJavaApi.getProperty("name")
// }
// 使⽤平台类型表达式初始化的局部值可以有也可以没有类型声明
// fun main() {
//     val name = MyJavaApi.getProperty("name")
//     println(name)
// }


// 使⽤作⽤域函数 apply/with/run/also/let

//密封类
sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// 不再需要 `else` ⼦句，因为我们已经覆盖了所有的情况
}

//泛型
class Box<T>(t: T) {
    var value = t
}

val box: Box<Int> = Box<Int>(1)

val box2 = Box(1)
val box3 = Box("1")

// 匿名类对象
open class A(x: Int) {
    public open val y: Int = x
}

interface B

val ab: A = object : A(1), B {
    override val y = 15
}

fun foo() {
    //匿名对象
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}

class C {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x // 没问题
//        val x2 = publicFoo().x // 错误：未能解析的引⽤“x”
    }
}

class MyClass {
    //伴生对象
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

val instance = MyClass.create()


// 省略伴⽣对象的名称，在这种情况下将使⽤名称
class MyClass2 {
    //伴生对象
    companion object {}

}

// 有名称不能使用companion
class MyClass3 {
    //伴生对象
    companion object Named {}

}

val instance2 = MyClass2.Companion

val instance3 = MyClass2

val instance4 = MyClass3


//在 JVM 平台，如果使⽤ @JvmStatic 注解，你可以将伴⽣对象的成员⽣成为真正的静态⽅法和 字段
//即使伴⽣对象的成员看起来像其他语⾔的静态成员，在运⾏时他们仍然是真实对象的实例成 员，⽽且，例如还可以实现接⼝

interface Factory<T> {
    fun create(): T
}

class MyClass5 {

    companion object : Factory<MyClass5> {
        override fun create(): MyClass5 = MyClass5()
    }

}

val f: Factory<MyClass5> = MyClass5

//对象表达式和对象声明之间有⼀个重要的语义差别：
//对象表达式是在使⽤他们的地⽅⽴即执⾏（及初始化）的；
//对象声明是在第⼀次被访问到时延迟初始化的；
//伴⽣对象的初始化是在相应的类被加载（解析）时，与 Java 静态初始化器的语义相匹配。

//内联类解决：
//有时候，业务逻辑需要围绕某种类型创建包装器。然⽽，由于额外的堆内存分配问题，它会引⼊运⾏时的
//性能开销。此外，如果被包装的类型是原⽣类型，性能的损失是很糟糕的，因为原⽣类型通常在运⾏时就
//进⾏了⼤量优化，然⽽他们的包装器却没有得到任何特殊的处理。

//内联类 内联类必须含有唯⼀的⼀个属性在主构造函数中初始化。在运⾏时，将使⽤这个唯⼀属性来表⽰内联类 的实例
inline class PassWord(val passWord: String)

// 不存在 'Password' 类的真实实例对象
// 在运⾏时，'securePassword' 仅仅包含 'String' 只是一个内连类中的属性  PassWord("ddddd") 等价于 "ddddd"
val password = PassWord("ddddd")

// 内联类⽀持普通类中的⼀些功能。特别是，内联类可以声明属性与函数：
inline class Name(val s: String) {
    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}
//fun main() {
//    val name = Name("Kotlin")
//    name.greet() // `greet` ⽅法会作为⼀个静态⽅法被调⽤
//    println(name.length) // 属性的 get ⽅法会作为⼀个静态⽅法被调⽤
//}

//然⽽，内联类的成员也有⼀些限制：
//内联类不能含有 init 代码块
//内联类不能含有 inner 类
//内联类不能含有幕后字段
//因此，内联类只能含有简单的计算属性（不能含有延迟初始化/委托属性）

//内联类允许去继承接⼝
interface Printable {
    fun prettyPrint(): String
}

inline class Name2(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

//fun main() {
//    val name = Name("Kotlin")
//    println(name.prettyPrint()) // 仍然会作为⼀个静态⽅法被调⽤
//}

//禁⽌内联类参与到类的继承关系结构中。这就意味着内联类不能继承其他的类⽽且必须是 final。


//函数 函数可以有默认值以减少重载

open class D {
    open fun foo(i: Int = 10) {

    }
}

class E : D() {
    override fun foo(i: Int) {
        super.foo(i)
    } //覆盖方法 i 不能有默认值
}

//局部函数 即⼀个函数在另⼀个函数内部 局部函数可以访问外部函数（即闭包）的局部变量

//泛型函数
fun <T> singletonList(item: T): List<T> {
    return emptyList()
}

//尾递归函数

const val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

//同下

private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}

//要符合 tailrec 修饰符的条件的话，函数必须将其⾃⾝调⽤作为它执⾏的最后⼀个操作。在递归调⽤
//后有更多代码时，不能使⽤尾递归，并且不能⽤在 try/catch/finally 块中。⽬前尾部递归只在 JVM 后端
//中⽀持。

//高阶函数 lambda

//lambda 完整表达式

val lambda = { a: Int, b: Int -> a + b }

val lambdasimple: (Int, Int) -> Int = { x, y -> x + y }

//带有接受者的函数字面值 A.(B) -> C 与扩展函数类似
val sum: Int.(Int) -> Int = { other -> this.plus(other) }

val sum2: Int.(Int) -> Int = { other -> plus(other) }

val sum3 = fun Int.(other: Int): Int = this + other

//在 Kotlin 中有⼀个约定：如果函数的最后⼀个参数接受函数，那么作为相应参数传⼊的 lambda 表达式
//可以放在圆括号之外

//如果该 lambda 表达式是调⽤时唯⼀的参数，那么圆括号可以完全省略  如果 lambda 表达式的参数未使⽤，那么可以⽤下划线取代其名称

//匿名函数
//fun(x: Int, y: Int): Int = x + y

//fun(x: Int, y: Int): Int {
//    return x + y
//}

fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

// reified 具体化泛型
inline fun <reified T> TreeNode.findParentOfType(): T? {

    var p = parent
    while (p != null && p is T) {
        p = p.parent
    }
    return p as T?
}

inline fun <reified T> membersOf() = T::class.members

//函数类型 实例调用
val stringPlus: (String, String) -> String = String::plus

val intPlus: (Int, Int) -> Int = Int::plus
