import java.math.BigInteger
import java.security.MessageDigest
import java.util.*

class ConsistentHash {
    private val MAX_REPLICA = 100
    private val entries = TreeMap<BigInteger, String>()

    fun put(node: String) {
        val key: BigInteger = hash(node)

    }

    private fun hash(node: String): BigInteger {
        val md5: MessageDigest = MessageDigest.getInstance("MD5")
        val checksum = md5.digest(node.toByteArray())
        return BigInteger(1, checksum)
    }


}

fun main(args: Array<String>) {
}