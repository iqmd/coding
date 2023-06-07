CC = gcc
CFLAGS = -Wall -Wextra

all: graph

graph: graph.o queue.o
	$(CC) $(CFLAGS) graph.o queue.o -o graph

graph.o: graph.c queue.h
	$(CC) $(CFLAGS) -c graph.c -o graph.o

queue.o: queue.c
	$(CC) $(CFLAGS) -c queue.c -o queue.o

clean:
	rm -f *.o graph
