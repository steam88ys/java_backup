#include <stdio.h>
int k;
void sub();
int main(int argc, char* argv[]) {
	int a = 8;
	k = 6;
	sub(a);
	printf("\n main %d %d", k, a);

	return 0;
}