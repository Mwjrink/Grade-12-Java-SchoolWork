package Unit5.DetectColoniesPart2of3;

/* Max Rink
 * ICS4U
 * February 2 2016
 * Slide.java
 * sorts the colonies
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Slide {
	private char COLONY = '*', NON_COLONY = '-';
	private char[][] slideData;

	/**
	 * constructor pre: Slide file contains valid slide data in the format:
	 * first line: lenght of slide second line: width of slide remaining lines:
	 * slide data post: Slide data has been loaded from slide file.
	 */

	public Slide(String s) {
		try {
			File slideFile = new File(s);
			FileReader in = new FileReader(slideFile);
			BufferedReader readSlide = new BufferedReader(in);
			int length = Integer.parseInt(readSlide.readLine());
			int width = Integer.parseInt(readSlide.readLine());
			slideData = new char[length][width];
			for (int row = 0; row < length; row++) {
				for (int col = 0; col < width; col++) {
					slideData[row][col] = (char) readSlide.read();
				}
				readSlide.readLine(); // read past end-of-line
			}
			readSlide.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

	/**
	 * Determines a colony size pre: none post: All colony cells adjoining and
	 * including cell (Row, Col) have been changed to NON COLONY, and count of
	 * these cells is returned.
	 */

	private int collectCells(int row, int col) {
		if ((row < 0) || (row >= slideData.length) || (col < 0) || (col >= slideData[0].length)
				|| (slideData[row][col] != COLONY)) {
			return (0);
		} else {
			slideData[row][col] = NON_COLONY;
			return (1 + collectCells(row + 1, col) + collectCells(row - 1, col) + collectCells(row, col + 1)
					+ collectCells(row, col - 1));
		}
	}

	/**
	 * Analyzes a slide for colonies and displays colony data pre: none post:
	 * Colony data has been displayed.
	 */
	public void displayColonies() {
		int index = 0;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for (int row = 0; row < slideData.length - 1; row++) {
			for (int col = 0; col < slideData[0].length; col++) {
				if (slideData[row][col] == COLONY) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(collectCells(row, col));
					temp.add(row);
					temp.add(col);
					arr.add(temp);
				}

			}
		}
		Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		for(int i=arr.size()-1;i>=0;i--)
			System.out.println("Colony at (" + arr.get(i).get(1) + "," + arr.get(i).get(2) + ") with size " + arr.get(i).get(0));
	}

	/**
	 * Displays a slide. pre: none post: Slide data has been displayed.
	 */

	public void displaySlide() {
		for (int row = 0; row < slideData.length; row++) {
			for (int col = 0; col < slideData[0].length; col++) {
				System.out.print(slideData[row][col]);
			}
			System.out.println();
		}
	}
}