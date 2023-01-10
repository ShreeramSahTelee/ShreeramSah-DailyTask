package day10;

public class BranchBank extends MainBank {
String branchName;
int branchId;
long branchPhno;
private int branchTotalfound;
private float branchIntrest;
public BranchBank(String branchName, int branchId, long branchPhno, int branchTotalfound, float branchIntrest,String bankName, int bankId, long bankPhno, int bankTotalfound, float bankIntrest) {
    super(bankName, bankTotalfound, bankPhno, bankTotalfound, bankIntrest);
    super.bankName=bankName;
    super.bankId=bankId;
    super.bankPhno=bankPhno;
    this.branchName = branchName;
    this.branchId = branchId;
    this.branchPhno = branchPhno;
    this.branchTotalfound = branchTotalfound;
    this.branchIntrest = branchIntrest;
}
public int getbranchTotalfound(){
return this.branchTotalfound;
}
    
}
