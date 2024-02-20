fun countVietnameseWords(chuoi: String): Int {
    val mapping = mapOf("aw" to "ă", "aa" to "â", "dd" to "đ", "ee" to "ê", "oo" to "ô", "ow" to "ơ", "w" to "ư")
    var count = 0
    var i = 0
    while (i < chuoi.length) {
        var found = false
        for ((key, value) in mapping) {
            if (chuoi.startsWith(key, i)) {
                found = true
                count++
                i += key.length
                break
            }
        }
        //tăng vị trí hiện tại nếu không khớp
        if (!found) {
            i++
        }
    }
    return count
}
fun main() {
    print("Nhập chuỗi chữ cái: ")
    val chuoiInput = readLine() ?: ""
    val numberOfVnWord = countVietnameseWords(chuoiInput)
    println("Số lượng chữ cái Tiếng Việt có thể tạo thành trong chuỗi là: $numberOfVnWord")
}