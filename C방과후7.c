#include <stdio.h>
int main() {
	int a[10] = { 0 };
	int sum = 0;

	for (int i = 0; i < 5; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < 10; i++) {
		sum += a[i];
	}

	printf("�հ� : %d", sum);

	return 0;
}