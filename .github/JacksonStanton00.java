// Amari Lombel, Arry pratice , v0.1 , 1/24/22

public class JacksonStanton00
{
public static void main(String[] args){


/*
for (current_element = 0 ; current_element < carArr.lentgh(); current_element += 1;) {
    // code to execute
    // statement 1 is executed once before the loop
    // statment 2 is the contional for the loop.
    //statement 3 is executed eac time the loop runs.
}
for( i = 0; i < carArr.lentgh(); i++){
}
*/
String[] carArr ={"BMW M5", "Ferrari 250 GTO", "Porsche 911", "Ford F150 Lighting", "Buick Skylark"};
System.out.println(carArr[3]);
//once created you cannot change the size of an array. IT IS FORRBIDDEN
carArr[0] = "Volkswagen Passat";
for (String eachElement : carArr) {
    //code to execute
    System.out.println(eachElement);
double[] myBankAccount ={0.0, 45.89, 4234.34, 35.35, 0.1} ;
for (double eachElement1 : myBankAccount) {
    //code to execute
    System.out.println(eachElement1);
int[] myGrades = {100, 85 , 70 , -40 ,0};
for (int eachElement2 : myGrades) {
    //code to execute
    System.out.println(eachElement2);


}
    }
}
}