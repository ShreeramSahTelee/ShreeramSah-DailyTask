import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement;

class task19 {
    var conn: Connection? = null;
    fun createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "ram@1234")
            if (conn != null) {
                println("connection is done");
            }
            println("connecting to data base");
        } catch (e: SQLException) {
            print(e);
        }

    }
    fun createTable(){
        var prestat:PreparedStatement?=null;
        var sql="create table demo3(id int not null auto_increment,name varchar(255),age int not null,primary key(id));"
        try{
            prestat=conn!!.prepareStatement(sql);
            var status=prestat.executeUpdate();
            print(status);
            if(status==0){
                print("table is created")
            }

        }catch (e:SQLException){
            print(e);
        }
    }
    fun insertIntoTables(){
        var preStat:PreparedStatement?=null;
        var sql="insert into demo3(name,age) values(?,?);"
        try{
            preStat=conn!!.prepareStatement(sql);
            preStat.setString(1, readln());
            preStat.setInt(2, readln()!!.toInt())
            var status=preStat.executeUpdate();
            if(status>0){
                print("data inserted into table")
            }
        }catch (e:SQLException){
            print(e);
        }
    }
    fun search(){
        var stm:Statement?=null;
        var res:ResultSet?=null;
              print("enter the id");
               var id= readln().toInt();

              var sql="select * from demo3 where id="+id+";"

            try{
                stm=conn!!.createStatement();
                res= stm!!.executeQuery(sql);
                //     print(res);
                while(res!!.next()){

                    print("${res.getInt("id")}\t");
                    print("${res.getString("name")}\t");
                    print("${res.getInt("age")}\t");

                }
            }catch(e:SQLException){
                print(e)

            }finally {
                if(res!=null){
                    try{
                        res.close();
                        //       conn!!.close();
                    }catch(e:SQLException){
                        print(e)
                    }
                }
            }
        }
    }



fun main(){
    var obj=task19();
    obj.createConnection();
   loop@ while(true){
        println("1:create table \n 2:insert values \n 3:search \n 4:exit");
       println("Enter choice:")
        var choice:Int= readln()!!.toInt();
        when(choice){
            1 ->obj.createTable();
            2 ->obj.insertIntoTables();
            3 ->obj.search();
            4 ->break@loop;

        }
    }
}