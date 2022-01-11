#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS

typedef struct _Person {
	char name[50];
	char phone_num[50];
	int age;
}Person;

int main() {

	Person p[3];  
	char n[2];

	for (int i = 0; i < 3; i++) {
		gets(p[i].name);
		gets(p[i].phone_num);
		scanf("%d", &p[i].age);
		gets(n);
		printf("\n");
	}

	for (int i = 0; i < 3; i++) {
		printf("\n이름: %s\n전화번호: %s\n나이: %d\n", p[i].name, p[i].phone_num, p[i].age);
	}

	return 0;

}