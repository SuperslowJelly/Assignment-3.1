package com.jelly;

public class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder(); // Use StringBuilder as opposed to concatenation as I'm making additions inside a loop.
	    for (int i = 0; i < 1001; i++) {
            if (i % 15 == 0) output.append("\n| "); // Add a new line every 15 loops, since 15 is the common denominator of 3 and 5.
	        if (i % 3 == 0) output.append(String.format("%-" + 4 + "s", i)).append(" | "); // Multiples of 3.
            else if (i % 5 == 0) output.append(String.format("%-" + 4 + "s", i)).append(" | "); // Multiples of 5 (also 15).
            if (i == 1000) output.append(String.format("%-" + 4 + "s", "")).append(" | "); // Add one last cell at the end for evenness.
        }
	    System.out.print(output);
    }
}
