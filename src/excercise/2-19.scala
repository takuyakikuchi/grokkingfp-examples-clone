// Java code to convert to Scala
// static class TipCalculator {
//         public static int getTipPercentage(List<String> names) {
//             if(names.size() > 5) {
//                 return 20;
//             } else if(names.size() > 0) {
//                 return 10;
//             }
//             return 0;
//         }
//     }

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) 20
    else if (names.size > 0) 10
    else 0
  }
}
