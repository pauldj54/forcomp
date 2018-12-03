package forcomp
import forcomp.Anagrams.Word
import forcomp.Anagrams.Sentence
import forcomp.Anagrams.{ wordOccurrences, dictionaryByOccurrences, dictionary, combinations }

object Main extends App {
  def concat(s: Sentence): Word = s.flatMap(f => f).mkString.asInstanceOf[Word]

  val s: Sentence = List("married")
  val w = concat(s)

  val s1: Sentence = List("pat")
  val w1 = concat(s1)

  val s2: Sentence = List("tap")
  val w2 = concat(s2)

  val dict: List[Word] = Seq(w, w1, w2).toList
  
    val abba = List(('a', 2), ('b', 2))

  val abba2 = List(('a', 3), ('b', 1),('c', 2))
  val abbacomb = List(
    List(),
    List(('a', 1)),
    List(('a', 2)),
    List(('b', 1)),
    List(('a', 1), ('b', 1)),
    List(('a', 2), ('b', 1)),
    List(('b', 2)),
    List(('a', 1), ('b', 2)),
    List(('a', 2), ('b', 2)))

      println(combinations(Nil))
 //     println(abba)

  

}