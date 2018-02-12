package com.psl.Ques2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Movies implements Comparable<Movies> {
	String name, language, director;
	int duration;
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);
	static List<Movies> l = new ArrayList<Movies>();

	public Movies(String nam, String lang, int dur, String dir, String date) {
		name = nam;
		language = lang;
		duration = dur;
		director = dir;

		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated constructor stub
	}

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public List<Movies> createMovieList(Movies m) {

		l.add(m);
		return l;

	}

	public void sortByLanguage(List<Movies> movieList) {

		Collections.sort(movieList);

		System.out.println("Sorting by language:");
		display(movieList);
	}

	public void SortByLanguageAndReleaseDate(List<Movies> movieList) {

		Collections.sort(movieList, new Comparator<Movies>() {
			int i = 0;

			@Override
			public int compare(Movies arg0, Movies arg1) {
				if ((arg0.language.compareTo(arg1.language)) >= 1)
					i = 1;
				else if ((arg0.language).compareTo(arg1.language) <= -1)
					i = -1;
				else
					i = 0;

				if (i == 0) {
					if ((arg0.d.compareTo(arg1.d)) == 0)
						i = 0;
					else if ((arg0.d.compareTo(arg1.d)) >= 1)
						i = 1;
					else
						i = -1;
				}
				// TODO Auto-generated method stub
				return i;

			}
		});
		System.out.println("sorted by language and release date ");
		display(movieList);
	}

	public void sortByDuration(List<Movies> movieList) {

		Collections.sort(movieList, new Comparator<Movies>() {

			@Override
			public int compare(Movies arg0, Movies arg1) {
				if (arg0.duration > arg1.duration)
					return 1;
				else if (arg0.duration < arg1.duration)
					return -1;
				else
					return 0;
				// TODO Auto-generated method stub

			}
		});

		System.out.println("Sorting by Duration:");
		display(movieList);

	}

	public void display(List<Movies> list) {
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Movies movies = (Movies) iterator.next();
			System.out.println(movies.name + " " + movies.language + " "
					+ movies.duration + " " + movies.director + " "
					+ sdf.format(movies.d));
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Movies m[] = new Movies[5];

		m[0] = new Movies("it", "English", 160, "xyz", "24/1/2009");
		m[1] = new Movies("run", "English", 200, "abc", "23/1/2009");
		m[2] = new Movies("Bahubali 2 ", "Tamil", 221, "pqr", "22/1/2009");
		m[0].createMovieList(m[0]);
		m[1].createMovieList(m[1]);
		m[2].createMovieList(m[2]);
		m[0].sortByLanguage(l);
		m[0].sortByDuration(l);

		System.out.println("Sorting by Director name:");
		Collections.sort(l, new sortByDirector());
		m[0].display(l);

		m[0].SortByLanguageAndReleaseDate(l);

	}

	@Override
	public int compareTo(Movies mp) {
		// TODO Auto-generated method stub

		return this.language.compareTo(mp.language);

	}

}
