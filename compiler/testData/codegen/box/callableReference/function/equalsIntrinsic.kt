// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS_IR
class A

fun box() = if ((A::equals)(A(), A())) "Fail" else "OK"
