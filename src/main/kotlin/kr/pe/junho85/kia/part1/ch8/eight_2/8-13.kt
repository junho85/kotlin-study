//package kr.pe.junho85.kia.part1.ch8.eight_2
//
//inline fun <T> synchronized(lock: Lock, action: () -> T) : T (
//    lock.loc()
//    try {
//        return action()
//    }
//    finally {
//        lock.unlock()
//    }
//}
//
//val l = Lock()
//synchronized(1) {
//    // ...
//}