# SarahProject
 URI Online Judge | 1021
Banknotes and Coins

By Neilor Tonin, URI Brazil
Timelimit: 1

Read a floating point value with two decimal places. This represents a monetary value. Next, calculate the fewest possible notes and coins in which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.
Input

The input file contain float point number N (0 ≤ N ≤ 1000000.00).
Output

Print the minimum quantity of banknotes and coins necessary to change the initial value, like as the given example.



Sample Input 	Sample Output

576.73		NOTAS:
		5 nota(s) de R$ 100.00
		1 nota(s) de R$ 50.00
		1 nota(s) de R$ 20.00
		0 nota(s) de R$ 10.00
		1 nota(s) de R$ 5.00
		0 nota(s) de R$ 2.00
		MOEDAS:
		1 moeda(s) de R$ 1.00
		1 moeda(s) de R$ 0.50
		0 moeda(s) de R$ 0.25
		2 moeda(s) de R$ 0.10
		0 moeda(s) de R$ 0.05
		3 moeda(s) de R$ 0.01

4.00		NOTAS:
		0 nota(s) de R$ 100.00
		0 nota(s) de R$ 50.00
		0 nota(s) de R$ 20.00
		0 nota(s) de R$ 10.00
		0 nota(s) de R$ 5.00
		2 nota(s) de R$ 2.00
		MOEDAS:
		0 moeda(s) de R$ 1.00
		0 moeda(s) de R$ 0.50
		0 moeda(s) de R$ 0.25
		0 moeda(s) de R$ 0.10
		0 moeda(s) de R$ 0.05
		0 moeda(s) de R$ 0.01

91.01		NOTAS:
		0 nota(s) de R$ 100.00
		1 nota(s) de R$ 50.00
		2 nota(s) de R$ 20.00
		0 nota(s) de R$ 10.00
		0 nota(s) de R$ 5.00
		0 nota(s) de R$ 2.00
		MOEDAS:
		1 moeda(s) de R$ 1.00
		0 moeda(s) de R$ 0.50
		0 moeda(s) de R$ 0.25
		0 moeda(s) de R$ 0.10
		0 moeda(s) de R$ 0.05
		1 moeda(s) de R$ 0.01
