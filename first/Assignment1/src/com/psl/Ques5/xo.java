package com.psl.Ques5;

public class xo {

	public static void main(String[] args) {
		char mat[][] = { { 'x', 'o', 'x' }, { 'o', 'o', 'x' },
				{ 'o', 'x', 'x' } };
		int j, i, r = 0, l = 0, d1 = 0, m = 3, d2 = 0;
		for (i = 0; i < 3; i++) {
			r = 0;
			l = 0;
			m--;
			for (j = 0; j < 3; j++) {

				if (mat[i][j] == 'x')
					r++;// System.out.println(r);
				else
					r--;

				if (mat[j][i] == 'x')
					l++;
				else
					l--;

			}

			if (mat[i][i] == 'x')
				d1++;
			else
				d1--;
			if (mat[i][m] == 'x')
				d2++;
			else
				d2--;

			if ((r == 3) || (l == 3) || (d1 == 3) || (d2 == 3)) {
				System.out.println("x wins");
				break;
			} else if (r == -3 || l == -3 || d1 == -3 || d2 == -3) {
				System.out.println("o wins");
				break;
			}
		}
		if (i == 3)
			System.out.println("Match draw");

	}
}
