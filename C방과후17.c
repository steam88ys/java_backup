#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS

typedef struct input
{
	char name[100];
	char phone[100];
	int age;
}Input;

Input get(void);
void put(Input*);

int main()
{
	Input p[3];
	char n[2];
	for (int i = 0; i < 3; i++) {
		p[i] = get();
		put(&p[i]);
		gets(n);
		printf("\n");
	}
	return 0;
}

Input get(void)
{
	Input p;
	printf("�̸� : ");
	gets(p.name);
	printf("��ȭ��ȣ : ");
	gets(p.phone);
	printf("���� : ");
	scanf_s("%d", &p.age);
	Input* ptr = &p;
	return *ptr;
}

void put(Input* p)
{
	printf("�̸� : ");
	puts(p->name);
	printf("��ȭ��ȣ : ");
	puts(p->phone);
	printf("���� : %d\n", p->age);
}
