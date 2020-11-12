package judge;

public class judge {
int trust[][] = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
int size; // number of people in the town

public int howManyPpl(int arr[][] ) { // assuming last person is highest number
	size = arr[arr.length-1][0];
	return size;
}

public int findJudge(int arr[][], int s) {
	int count[] = new int[s+1];
	for(int[]t : arr) {
		count[t[0]]--;
		count[t[1]]++;
	}
	for(int i = 1; i <= s; i++) {
		if (count[i] == s-1) {
			return i;
		}
		
	}
	return -1;
}

public static void main ( String args[]) {
	judge j = new judge();
	int s = j.howManyPpl(j.trust);
	int g = j.findJudge(j.trust, j.size);
	System.out.println("number of people in town: "+s);
	System.out.println("found the judge: "+ g);
}
}