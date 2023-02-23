package objectandclass;
class Exam{//parent class
	int marks () {
		return 0;
	}}
class comp extends Exam{//child class1
	int marks () {
		return 80;
	}}
class math extends Exam{//child class2
	int marks () {
		return 70;
	}}
class science extends Exam{//child class3
	int marks () {
		return 50;
	}}
class eng extends Exam{//child class4
	int marks () {
		return 90;
	}}
public class Overriding1 {//main class
	public static void main(String[] args) {//main method
		Exam exam;
		exam = new science();
		System.out.println(exam.marks());
		exam = new eng();
		System.out.println(exam.marks());
	}}
