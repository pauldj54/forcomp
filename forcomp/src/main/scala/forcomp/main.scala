package forcomp
import forcomp.Anagrams.Word

object Main extends App {
  val w:Word = "Robert"
  println(w.groupBy(c => c))
  val wr = w.groupBy(c => c.toLower).toList.map(f => (f._1, f._2.length()))
  println(wr)
}