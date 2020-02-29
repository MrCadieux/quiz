fun main() {
        var userAnswer = ""
        var numCorrect = 0
        var result: Int

    // Directions
        println("Math Quiz!")
        println("Please answer the following 5 math questions")

    // All questions and the check for correctness all the same set up
        print("1. What is the name of the longest side of a triangle? ")
        userAnswer = readLine()!!.toString()
        if (userAnswer.equals("hypotenuse", ignoreCase = true)) {
            println("CORRECT")
            numCorrect++
        }
        else
            println("WRONG")
        print("2. Two radii make up what part of a circle? ")
        userAnswer = readLine()!!.toString()
        if (userAnswer.equals("diameter", ignoreCase = true)) {
            println("CORRECT")
            numCorrect++
        }
        else
            println("WRONG")
        print("3. A line that intersects a circle at only one point is called what type of line? ")
        userAnswer = readLine()!!.toString()
        if (userAnswer.equals("tangent", ignoreCase = true)) {
            println("CORRECT")
            numCorrect++
        }
        else
            println("WRONG")
        print("4. What line intersects a circle in two places? ")
        userAnswer = readLine()!!.toString()
        if (userAnswer.equals("secant", ignoreCase = true)) {
            println("CORRECT")
            numCorrect++
        }
        else
            println("WRONG")
        print("5. The integers that satisfy Pythagorean's Theorem is called a what? ")
        userAnswer = readLine()!!.toString()
        if (userAnswer.equals("triple", ignoreCase = true)) {
            println("CORRECT")
            numCorrect++
        }
        else
            println("WRONG")


        // A check to see how well the user does, Good, Better, Best

        if (numCorrect < 3)
            println("\nNot the greatest...you only got $numCorrect correct")
        else if (numCorrect < 5)
            println("\nNot bad...you got $numCorrect correct")
        else
            println("\nPERFECT SCORE...you got $numCorrect correct")

}