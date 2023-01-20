class College {
    var collegeName: String = "";
    var collegePlace: String = "";
    fun collegeDitail(collegeName: String, collegePlace: String) {
 println(collegeName)
        println(collegePlace)
    }

    inner class Branch{
        var branchName:String="";
        var branchid:String="";
        fun displayBranch(branchName:String,branchId:String){
         println(branchName)
         println(branchId)
        }

    }
    inner class student{
        var name:String="";
     fun  displayStudent(name:String){
         println(name)

        }
    }
}
fun main(){
    var collegeobj=College();
    collegeobj.collegeDitail("Sambhram","Bangalore")
    collegeobj.Branch().displayBranch("cse","1ST18CS741");
    collegeobj.student().displayStudent("ram")

}