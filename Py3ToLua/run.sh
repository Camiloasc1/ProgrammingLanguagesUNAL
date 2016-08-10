#!/bin/sh
java -cp ../lib/antlr/antlr-4.5-complete.jar:./bin/ org.antlr.v4.runtime.misc.TestRig grammar.Python3 file_input -gui < stdin.py

