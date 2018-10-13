package forcomp
import forcomp.Anagrams.Word
import forcomp.Anagrams.Sentence


object Main extends App {
  val s:Sentence = List("abcd", "e")
  def concat(s:Sentence): Word = {
    s.flatMap(f => f).mkString.asInstanceOf[Word]
  }
  
  println(s.flatMap(f => f).mkString)
  
  val w = concat(s)
  
  println(w)
  print(w.groupBy(_.toLower))
 // print(w.groupBy(c => c.toLower).mapValues(v => v.length()).toList.sortBy(_._1))
  
}