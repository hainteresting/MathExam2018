package work1;

import java.util.Random;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数目");
		int n = in.nextInt();
		System.out.println("请输入年级数字");
		int grade = in.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		if (grade == 1) {// 一年级
			for (int p = 0; p < n; p++) {
				Random t = new Random();
				int y = t.nextInt(2);
				Random r = new Random();
				int i = r.nextInt(20) + 1;
				int j = r.nextInt(20) + 1;
				if (y == 0) {
					System.out.println("(" + (p + 1) + ")" + " " + i + " + " + j + " " + "=");
					a[p] = ("(" + String.valueOf(p + 1) + ")" + " " + String.valueOf(i) + " + " + String.valueOf(j)
							+ " = " + String.valueOf(i + j));
				} else {
					int k = 0; // 防止出现负数
					if (j > i) {
						k = j;
						j = i;
						i = k;
					}
					System.out.println("(" + (p + 1) + ")" + " " + i + " - " + j + " " + "=");
					a[p] = ("(" + String.valueOf(p + 1) + ")" + " " + String.valueOf(i) + " - " + String.valueOf(j)
							+ " = " + String.valueOf(i - j));
				}
			}
			System.out.println("--------------标准答案--------------");
			for (int p = 0; p < n; p++) {
				System.out.println(a[p]);
			}
		} else if (grade == 2) {// 二年级
			for (int p = 0; p < n; p++) {
				Random t = new Random();
				int y = t.nextInt(2);
				Random r = new Random();
				int i = r.nextInt(20) + 1;
				int j = r.nextInt(20) + 1;
				if (y == 0) {
					System.out.println("(" + (p + 1) + ")" + " " + i + " × " + j + " " + "=");
					b[p] = ("(" + String.valueOf(p + 1) + ")" + " " + String.valueOf(i) + " × " + String.valueOf(j)
							+ " = " + String.valueOf(i * j));
				} else {
					int k = 0;
					if (j > i) {
						k = j;
						j = i;
						i = k;
					}
					System.out.println("(" + (p + 1) + ")" + " " + i + " ÷ " + j + " " + "=");
					b[p] = ("(" + String.valueOf(p + 1) + ")" + " " + String.valueOf(i) + " ÷ " + String.valueOf(j)
							+ " = " + String.valueOf(i / j) + " ... "+String.valueOf(i % j));
				}
			}
			System.out.println("--------------标准答案--------------");
			for (int p = 0; p < n; p++) {
				System.out.println(b[p]);
			}

		}
	}

}
