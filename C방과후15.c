#include <stdio.h>
#include <string.h>

struct Person {
	char name[50];
	char phone_num[50];
	int age;
};

int main() {
	
	struct Person p1 = {"", "", 0};

	gets(p1.name);
	gets(p1.phone_num);
	scanf("%d", &p1.age);

	printf("\n�̸�: %s\n��ȭ��ȣ: %s\n����: %d\n", p1.name, p1.phone_num, p1.age);

	return 0;

}