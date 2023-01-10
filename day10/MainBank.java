package day10;

public class MainBank {
String bankName;
int bankId;
long bankPhno;
private int bankTotalfound;
private float bankIntrest;
public MainBank(String name, int id, long phno, int bankTotalfound, float bankIntrest) {
    this.bankName = name;
    this.bankId = id;
    this.bankPhno = phno;
    this.bankTotalfound = bankTotalfound;
    this.bankIntrest = bankIntrest;
}
public MainBank(){
    
}
public int getbankTotalfound(){
    return this.bankTotalfound;
}
}
