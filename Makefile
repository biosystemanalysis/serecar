JAVAC=javac

SRC_JAVA=$(wildcard *.java)

all: $(patsubst %.java,%.class,$(SRC_JAVA))

%.class: %.java
	javac $<

clean:
	-rm *.class *~
