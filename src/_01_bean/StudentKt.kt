package _01_bean

public class StudentKt{
    private var name:String
    private var id:Int
    private var department:String


    constructor(n:String,i:Int,dep:String)
    {
        name = n
        id = i
        department = dep
    }
    public fun  getName():String{
        return name
    }

    public fun getId():Int{
        return id
    }


    fun getDepartment():String{
        return department
    }
}