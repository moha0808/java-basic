import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
def check_number(num):
    if num > 0:
        return "Positive"
    elif num < 0:
        return "Negative"
    else:
        return "Zero"

number = int(input("Enter a number: "))
result = check_number(number)
print(result)

}
}
