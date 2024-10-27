object TestingPureFunctions {
  def increment(x: Int): Int = {
    x + 1
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def wordScore(word: String): Int = {
    word.replaceAll("a", "").length
  }

  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) 20
    else if (names.size > 0) 10
    else 0
  }

  def getFirstCharacter(s: String): Char = {
    if (s.length > 0) s.charAt(0)
    else ' '
  }
}

print("increment\n")
print(TestingPureFunctions.increment(1) == 1)
print("\n")
print(TestingPureFunctions.increment(1) == 2)
print("\n")
print(" \n")

print("add\n")
print(TestingPureFunctions.add(1,2) == 2)
print("\n")
print(TestingPureFunctions.add(1,2) == 3)
print("\n")
print(" \n")

print("wordScore\n")
print(TestingPureFunctions.wordScore("test") == 1)
print("\n")
print(TestingPureFunctions.wordScore("test") == 4)
print("\n")
print(TestingPureFunctions.wordScore("all") == 3)
print("\n")
print(TestingPureFunctions.wordScore("all") == 2)
print("\n")
print(" \n")

print("getTipPercentage\n")
print(TestingPureFunctions.getTipPercentage(List("a", "b", "c", "d", "e", "f")) == 20)
print("\n")
print(TestingPureFunctions.getTipPercentage(List("a")) == 10)
print("\n")
print(TestingPureFunctions.getTipPercentage(List.empty) == 0)
print("\n")
print(" \n")

print("getFirstCharacter\n")
print(TestingPureFunctions.getFirstCharacter("test") == 't')
print("\n")
print(TestingPureFunctions.getFirstCharacter("") == ' ')
print("\n")
print(TestingPureFunctions.getFirstCharacter("a") == 'b')
print("\n")
print(" \n")