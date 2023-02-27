package elegeneous.interview;

public class SortMergeArray {
	public static void main(String[] args) {
		//Sorry for late
		int[] a = {1, 4, 5, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48}; //18
		int[] b = {2, 3, 4, 8, 20, 100, 101, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126}; //20
		
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		int tempIdx = 0;
		
		while (k < c.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				if ((i == a.length - 1)) {
					if (k == c.length - 1) {
						c[k] = b[j];
					} else {
						tempIdx = c[k] == c[k - 2] ? k - 2 : tempIdx;
						
						if (c[k] == c[tempIdx]) {
							c[k] = b[j];
							j++;
						}
						k++;
						c[k] = b[j];
						j++;
					}
				} else {
					i++;
				}
			} else {
				c[k] = b[j];
				if (j == b.length - 1) {
					if (k == c.length - 1) {
						c[k] = a[i];
					} else {
						k++;
						c[k] = a[i];
						i++;
					}
				} else {
					j++;
				}
			}
			k++;
		}
		
		for (int l = 0; l < c.length; l++) {
			System.out.println(c[l]);
		}
		
	}
}
