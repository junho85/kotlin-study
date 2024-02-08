package kr.pe.junho85.generics

interface Command {
    val protocol: String

    fun process()
}

class SendCommand(
    override val protocol: String = "send",
) : Command {
    fun send() {
        println("send!")
    }

    override fun process() {
        println("process SendCommand! protocol is '$protocol'")
    }
}

class ClearCommand(
    override val protocol: String = "clear",
) : Command {
    fun clear() {
        println("clear!")
    }

    override fun process() {
        println("process ClearCommand! protocol is '$protocol'")
    }
}

sealed class CommandType<T : Command>(val command: T) {
    class SendCommandType : CommandType<SendCommand>(SendCommand())
    class ClearCommandType : CommandType<ClearCommand>(ClearCommand())
}

fun <T : Command> getCommand(type: CommandType<T>): T {
    return type.command
}

fun main() {
    val sendCommand = getCommand(CommandType.SendCommandType())
    sendCommand.process()
    sendCommand.send()

    val clearCommand = getCommand(CommandType.ClearCommandType())
    clearCommand.process()
    clearCommand.clear()
}
