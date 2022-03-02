fun main(){
 var name = "AkiraChix"
 var output = name[0].toString() + name[2] +name[3]
 println(output)
 var result = statement("Happiness", 23)
 println(result)
 var x =Leng("Happy")
 println(x.length)
 printName("James", "ames")
 printName("star", "star")


}
fun statement(name: String, age: Int): String{
 var par = "Hi,my name is $name and I am $age years old"
 return par

}
fun Leng(nam: String): String{
 var str = nam
 return str
}
fun printName(name1: String, name2: String){
 var n1 = name1
var n2 = name2
 if(n1==n2){
println("That's me!")
 }
 else{
  println("I don’t know who that is")
 }
}



