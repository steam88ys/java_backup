#include <stdio.h>
int main() {

	char str[100] = "good morning";
	int length = 0;
	for (int i = 0; i < sizeof(str); i++) {	// ''\0'���ε� ����
		if (str[i] == 0) break;
		length++;
	}
	printf("%d", length);

	return 0;

}