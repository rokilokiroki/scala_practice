
//半角文字列を入力し、入力された文字列の中に英大文字と英小文字と数字がそれぞれ何個あるかカウントするプログラムを作成しなさい
//条件:半角文字しか入力されないものとし、最大で80文字までしか入力されないものとする、また、空白は入力されないものとする

object Practice {

  def main(args: Array[String]): Unit = {
    println("なんか入力してください")
    val context: String = io.StdIn.readLine.replace(" ", "")
    val oomozi: List[String] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("").toList
    val komozi: List[String] = "abcdefghijklmnopqrstuvwxyz".split("").toList
    val suuzi: List[String] = "0123456789".split("").toList
    val list: List[String] = context.split("").toList
    if (list.size >= 80 || context.isEmpty) {
      println("ちゃんとやって")
      sys.exit
    }
    val o_check = this->check(list: List[String], oomozi: List[String])
    val k_check = this->check(list: List[String], komozi: List[String])
    val s_check = this->check(list: List[String], suuzi: List[String])
    print(s"大文字: ${o_check}, 小文字: ${k_check}, 数字:${s_check}")
  }

  def check(list: List[String], check: List[String]):String = {
    val check_list = for (value <- list if check.contains(value)) yield value
    val count = check_list.size.toString
    return count
  }

}

