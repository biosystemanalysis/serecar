Self-referential code testbed
=============================

This repository contains tools and examples to work with
self-referential code.

Concepts
--------

- Code: a bitstring of length n, containing of the ASCII chars zero or one
- Interpreter: a program to interpret code as a program, run it given
    code as input argument and return code as a result
- Arena: a program to orchestrate one or more interpreters to act one code

Content
-------

- TournementArena.java: an example arena
- Interpreter.java: java interface each Interpreter has to follow
- AbstractInterpreter.java: class to derive an interpreter; only eval is missing
- InterpreterStandalone.java: convert a java interpreter class into a standalone program
- XorInterpreter.java: an example interpreter
- ExternalInterpreter.java: a class to call an external interpreter
- BitString.java: helper to concert code into a BitSet for easier parsing
