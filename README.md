Втора лабораториска вежба по Софтверско инженерство

Стефан Живковиќ, бр. на индекс 213205


Control Flow Graph (Бр. се редовите во кодот)

![CFG-Stefan Zivkovic 213205](https://github.com/StefanZivkovikj/SI_2023_lab2_213205/assets/130160432/3e07fbe3-b44a-4b78-aa72-2e96f097b2ed)


Цикломатска комплексност

Секој момент на одлука во кодот ја зголемува цикломатската комплексност за 1.
Во дадениот код цикломатската комплексност е 5.Оваа бројка се добива броејки ги сите моменти на одлука во кодот.
Во кодот има 3 if statements и еден for loop.



Објаснување на напишаните unit tests

За Every Branch 


1.Првиот услов проверува дали корисникот, лозинката на корисникот и е-поштата на корисникот не се нула. Во тест случајот 1, сите три не се null, така што овој услов е задоволен.

2.Вториот услов проверува дали корисничкото име на корисникот е null. Во тест случајот 2, корисничкото име е null, така што овој услов е задоволен.

3.Третиот услов проверува дали е-поштата на корисникот содржи „@“ и „.“. Во тест случај 1, е-поштата „email1@test.com“ го задоволува овој услов.

4.Четвртиот услов проверува дали е-поштата и корисничкото име на корисникот се исти како и некој постоечки корисник. Во тест случај 4, е-поштата и корисничкото име на корисникот се совпаѓаат со корисникот во списокот allUsers, така што овој услов е задоволен.

За Multiple Condition 


1.функцијата правилно ги обработува повеќекратните услови и го враќа очекуваниот резултат, што во овој случај е true.

2.Функцијата испитува ситуација кога корисничкото име на корисникот веќе постои во списокот allUsers и тестира дали функцијата правилно го детектира дупликатното корисничко име и го враќа очекуваниот резултат,во овој случај е false.

3.Функцијата испитува сценарио каде што има повеќе корисници со исто корисничко име во списокот allUsers и проверува дали функцијата може да се справи со оваа состојба и враќа false.

4.Функцијата испитува ситуација каде што нема постоечки корисници во списокот allUsers и проверува дали функцијата може да се справи со овој случај и е false.



