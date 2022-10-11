fun main(args: Array<String>) {
//1
    val age1=42
    val age2=21
//2
    val avg1=(age1.toDouble()+age2.toDouble())/2
    //Результат должен быть типа Double, а не Int.
//3
    println(avg1)
//4
    val firstName:String="Ангелина"
    val lastName:String="Харченко"
//5
    val fullName:String="$firstName $lastName"
    println(fullName)
//6
    val myDetails:String="Привет, меня зовут $fullName"
    println(myDetails)
//7
    val date=Triple(10,10,2022)
    println(date)
//8
    val month = date.first
    val day = date.second
    val year = date.third
//9
    var(month1, _, year1)=date
//10
    month1=6
    val newDate=Pair(month1, year1)
    println(newDate)
}