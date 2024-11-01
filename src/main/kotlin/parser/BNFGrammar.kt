package parser

import com.github.mpe85.grampa.grammar.AbstractGrammar

open class LetterGrammar : AbstractGrammar<Unit>() {
    override fun start() = oneOrMore(letter()) + eoi()
}
