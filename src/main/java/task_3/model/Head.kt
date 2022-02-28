package task_3.model

class Head (
    val branchId: String?=null,
    val customerId: String?=null,
    val result: String?=null,
    val subSys: String?=null,
)
{
    override fun toString(): String {
        return """
branchId: $branchId
customerId: $customerId
result: $result
subSys: $subSys
""".trimMargin()
    }
}